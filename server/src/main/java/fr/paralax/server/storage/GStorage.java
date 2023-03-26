package fr.paralax.server.storage;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import jakarta.annotation.PreDestroy;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GStorage<T extends StorageClass> {
    protected final Gson gson = new GsonBuilder().serializeNulls().disableHtmlEscaping().setPrettyPrinting().create();
    protected File _storageDir;
    protected final List<T> _entityList = new ArrayList<>();
    protected Class<T> _class;

    public void init(String dir, Class<T> classOrigin) {
        this._class = classOrigin;
        _storageDir = new File(dir);
        if (!_storageDir.exists()) _storageDir.mkdir();
        loadAllData();
    }

    protected void loadAllData() {
        for (File f : Objects.requireNonNull(_storageDir.listFiles())) {
            if (!f.getName().endsWith(".json")) continue;
            this._entityList.add(gson.fromJson(readFile(f), _class));
        }
    }

    protected String readFile(final File file) {
        try {
            final BufferedReader r = new BufferedReader(new FileReader(file));
            final StringBuilder t = new StringBuilder();
            String l;
            while((l = r.readLine()) != null)
                t.append(l);
            r.close();
            return t.toString();
        }  catch (IOException e) { return null; }
    }

    protected void writeFile(final String content, final String fileID) {
        final FileWriter fileWriter;
        File file = new File(this._storageDir, fileID + ".json");
        try {
            if (!file.exists()) if (!file.createNewFile()) return;
            fileWriter = new FileWriter(file);
            fileWriter.write(content);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) { e.printStackTrace(); }
    }

    public void saveEntity(final T entity) {
        this._entityList.add(entity);
        writeFile(gson.toJson(entity), entity.getFileID());
    }

    public T makeEntity(final String string) {
        T entity = gson.fromJson(string, _class);
        if (entity == null) return null;
        saveEntity(entity);
        return entity;
    }

    public void deleteEntity(final T entity) {
        File file = new File(_storageDir, entity.getFileID() + ".json");
        if (file.exists()) {
            if (file.delete()) {
                this._entityList.remove(entity);
            }
        }
    }

    public List<T> getEntityList() {
        return this._entityList;
    }

    @PreDestroy
    public void destroy() {
        for (T entity : this._entityList) writeFile(gson.toJson(entity), entity.getFileID());
    }

}