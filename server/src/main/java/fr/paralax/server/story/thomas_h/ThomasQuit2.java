package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.story.thomas_b.EndGame;

import java.util.HashMap;
public class ThomasQuit2 extends TileFrame {
    
    public ThomasQuit2() {
        super(UserType.THOMAS_H, "32",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "blood.gif", "",
                "", () -> "");
        redirectMap.put("Des cochons sauvages derrière vous vous ont écrasé", new EndGame());
    }
}
