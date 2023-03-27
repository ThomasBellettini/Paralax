package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;

public class ThomasGame extends TileFrame {

    public ThomasGame() {

        super(UserType.THOMAS_H, "2",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "<div style=\"text-align: center;\"> <img src=\"server/src/main/resources/static/crash.gif\" width=\"129\" /> </div>");
            redirectMap.put("...", new ThomasAsk14());
    }
}
