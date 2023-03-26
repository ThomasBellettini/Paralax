package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;
import java.util.Map;

public class ThomasAsk5 extends TileFrame {

    public ThomasAsk5() {

        super(UserType.THOMAS_H, "15",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
            redirectMap.put("Vous êtes assis et vos yeux se ferment tout seul", new ThomasGame());
    }
}
