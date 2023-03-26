package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;
import java.util.Map;

public class ThomasQuit7 extends TileFrame {
    
    public ThomasQuit7() {
        super(UserType.THOMAS_H, "37",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("D'autres serpents géants sont là et ils vous attaquent", null); //TODO:END
    }
}
