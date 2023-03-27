package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;

public class ThomasGame extends TileFrame {

    public ThomasGame() {

        super(UserType.THOMAS_H, "2",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "crash.gif", "",
                "", () -> "");
            redirectMap.put("...", new ThomasAsk14());
    }
}
