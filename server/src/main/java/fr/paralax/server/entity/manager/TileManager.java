package fr.paralax.server.entity.manager;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.story.thomas_h.ThomasAsk1;
import fr.paralax.server.story.thomas_h.ThomasAsk2;
import fr.paralax.server.story.thomas_h.ThomasAsk3;
import fr.paralax.server.story.thomas_h.ThomasAsk4;
import fr.paralax.server.story.thomas_h.ThomasAsk5;
import fr.paralax.server.story.thomas_h.ThomasAsk6;
import fr.paralax.server.story.thomas_h.ThomasAsk7;
import fr.paralax.server.story.thomas_h.ThomasAsk8;
import fr.paralax.server.story.thomas_h.ThomasAsk9;
import fr.paralax.server.story.thomas_h.ThomasAsk10;
import fr.paralax.server.story.thomas_h.ThomasAsk11;
import fr.paralax.server.story.thomas_h.ThomasAsk12;
import fr.paralax.server.story.thomas_h.ThomasAsk13;
import fr.paralax.server.story.thomas_h.ThomasAsk14;
import fr.paralax.server.story.thomas_h.ThomasAsk15;
import fr.paralax.server.story.thomas_h.ThomasAsk16;
import fr.paralax.server.story.thomas_h.ThomasAsk17;
import fr.paralax.server.story.thomas_h.ThomasAsk18;
import fr.paralax.server.story.thomas_h.ThomasAsk19;
import fr.paralax.server.story.thomas_h.ThomasAsk20;
import fr.paralax.server.story.thomas_h.ThomasAsk21;
import fr.paralax.server.story.thomas_h.ThomasAsk22;
import fr.paralax.server.story.thomas_h.ThomasAsk23;
import fr.paralax.server.story.thomas_h.ThomasAsk24;
import fr.paralax.server.story.thomas_h.ThomasAsk25;
import fr.paralax.server.story.thomas_h.ThomasAsk26;
import fr.paralax.server.story.thomas_h.ThomasAsk27;
import fr.paralax.server.story.thomas_h.ThomasAsk28;
import fr.paralax.server.story.thomas_h.ThomasQuit1;
import fr.paralax.server.story.thomas_h.ThomasQuit2;
import fr.paralax.server.story.thomas_h.ThomasQuit3;
import fr.paralax.server.story.thomas_h.ThomasQuit4;
import fr.paralax.server.story.thomas_h.ThomasQuit5;
import fr.paralax.server.story.thomas_h.ThomasQuit6;
import fr.paralax.server.story.thomas_h.ThomasQuit7;
import fr.paralax.server.story.thomas_h.ThomasQuit8;
import fr.paralax.server.story.thomas_h.ThomasStart;
import fr.paralax.server.story.thomas_h.ThomasGame;
import fr.paralax.server.story.tom.TomResponse1;
import fr.paralax.server.story.tom.TomToilette;

import java.util.ArrayList;
import java.util.List;

public class TileManager {

    public static List<TileFrame> tileManagerList = new ArrayList<>();

    public static void init() {
        new TomResponse1().init();
        new TomToilette().init();

        new ThomasAsk1().init();
        new ThomasAsk2().init();
        new ThomasAsk3().init();
        new ThomasAsk4().init();
        new ThomasAsk5().init();
        new ThomasAsk6().init();
        new ThomasAsk7().init();
        new ThomasAsk8().init();
        new ThomasAsk9().init();
        new ThomasAsk10().init();
        new ThomasAsk11().init();
        new ThomasAsk12().init();
        new ThomasAsk13().init();
        new ThomasAsk14().init();
        new ThomasAsk15().init();
        new ThomasAsk16().init();
        new ThomasAsk17().init();
        new ThomasAsk18().init();
        new ThomasAsk19().init();
        new ThomasAsk20().init();
        new ThomasAsk21().init();
        new ThomasAsk22().init();
        new ThomasAsk23().init();
        new ThomasAsk24().init();
        new ThomasAsk25().init();
        new ThomasAsk26().init();
        new ThomasAsk27().init();
        new ThomasAsk28().init();
        new ThomasQuit1().init();
        new ThomasQuit2().init();
        new ThomasQuit3().init();
        new ThomasQuit4().init();
        new ThomasQuit5().init();
        new ThomasQuit6().init();
        new ThomasQuit7().init();
        new ThomasQuit8().init();
        new ThomasStart().init();
        new ThomasGame().init();
    }

/*    public static TileFrame getFrameFromUUID(String uuid) {
        for (TileFrame tmp : tileManagerList) {
            if (tmp.getUuid().equalsIgnoreCase(uuid)) return tmp;
        }
        return null;
    }*/

}
