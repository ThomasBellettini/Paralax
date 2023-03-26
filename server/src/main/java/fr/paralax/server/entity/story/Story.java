package fr.paralax.server.entity.story;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.manager.TileManager;
import fr.paralax.server.storage.StorageClass;
import org.apache.commons.codec.digest.DigestUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Story extends StorageClass {
    private String storyName;
    private String password;
    private String tileSaved;

    private Map<String, Object> storedValue;

    public Story(String storyName, String password, String tileSaved) {
        this.storyName = storyName;
        this.password = DigestUtils.sha256Hex(password);;
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
        return TileManager.getFrameFromUUID(this.tileSaved);
    }

    public Map<String, Object> getStoredValue() {
        return storedValue;
    }

    public void setTileSaved(String tileSaved) {
        this.tileSaved = tileSaved;
    }

    public boolean isSamePass(String str) {
        return (DigestUtils.sha256Hex(str).equals(password));
    }
}
