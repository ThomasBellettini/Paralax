package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;
import fr.paralax.server.story.thomas_b.EndGame;

import java.util.HashMap;
import java.util.Map;

public class ThomasQuit5 extends TileFrame {
    
    public ThomasQuit5() {
        super(UserType.THOMAS_H, "35",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("Avec la vitesse, la torche s'est éteinte. Les chauves souris se dirigent vers vous et vous mordent", new EndGame());
    }
}
