package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.story.thomas_b.EndGame;

import java.util.HashMap;

public class ThomasQuit6 extends TileFrame {
    
    public ThomasQuit6() {
        super(UserType.THOMAS_H, "36",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "blood.gif", "",
                "", () -> "");
        redirectMap.put("Un stalactite vous tombe dessus", new EndGame());
    }
}
