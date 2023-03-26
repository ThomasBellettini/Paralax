package fr.paralax.server.entity.manager;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.story.tom.TomResponse1;
import fr.paralax.server.story.tom.TomToilette;

import java.util.ArrayList;
import java.util.List;

public class TileManager {

    public static List<TileFrame> tileManagerList = new ArrayList<>();

    public static void init() {
        new TomResponse1().init();
        new TomToilette().init();
    }

/*    public static TileFrame getFrameFromUUID(String uuid) {
        for (TileFrame tmp : tileManagerList) {
            if (tmp.getUuid().equalsIgnoreCase(uuid)) return tmp;
        }
        return null;
    }*/

}
