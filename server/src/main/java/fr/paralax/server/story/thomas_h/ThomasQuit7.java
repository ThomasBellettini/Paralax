package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.story.thomas_b.EndGame;

import java.util.HashMap;

public class ThomasQuit7 extends TileFrame {
    
    public ThomasQuit7() {
        super(UserType.THOMAS_H, "37",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "serpents.jpg", "",
                "", () -> "");
        redirectMap.put("D'autres serpents géants sont là et ils vous attaquent", new EndGame());
    }
}
