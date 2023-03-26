package fr.paralax.server.entity.story;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.manager.TileManager;
import fr.paralax.server.storage.StorageClass;

import java.util.HashMap;
import java.util.Map;

public class Story extends StorageClass {

    public static class Container {
        private Class containerClass;
        private Object object;

        public Container(Class containerClass, Object object) {
            this.containerClass = containerClass;
            this.object = object;
        }

        public Class getContainerClass() {
            return containerClass;
        }

        public Object getObject() {
            return object;
        }
    }

    private String storyName;
    private String password;
    private String tileSaved;

    private Map<String, Container> storedValue;

    public Story(String storyName, String password, String tileSaved) {
        this.storyName = storyName;
        this.password = password;
        this.tileSaved = tileSaved;
        this.storedValue = new HashMap<>();
    }

    public String getStoryName() {
        return storyName;
    }

    public String getPassword() {
        return password;
    }

    public TileFrame getTile() {
        for (TileFrame tileFrame : TileManager.tileManagerList) {
            if (tileFrame.getUuid().equalsIgnoreCase(this.tileSaved)) return tileFrame;
        }
        return null;
    }

    public Map<String, Container> getStoredValue() {
        return storedValue;
    }

    public void setTileSaved(String tileSaved) {
        this.tileSaved = tileSaved;
    }
}
