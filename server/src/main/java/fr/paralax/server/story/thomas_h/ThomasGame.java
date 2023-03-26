package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;
import java.util.Map;

public class ThomasGame extends TileFrame {

    public ThomasGame() {

        super(UserType.THOMAS_H, "2",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
            redirectMap.put("...", new ThomasAsk14());
    }
}
