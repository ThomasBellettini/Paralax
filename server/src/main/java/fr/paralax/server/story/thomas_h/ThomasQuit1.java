package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;
import java.util.Map;

public class ThomasQuit1 extends TileFrame {
    
    public ThomasQuit1() {
        super(UserType.THOMAS_H, "31",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("", null);
    }
}
