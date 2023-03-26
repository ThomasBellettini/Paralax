package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.story.thomas_b.EndGame;

import java.util.HashMap;

public class ThomasQuit8 extends TileFrame {
    
    public ThomasQuit8() {
        super(UserType.THOMAS_H, "38",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "blood.gif", "",
                "", () -> "");
        redirectMap.put("C'était un piège, vous vous faites tirer dessus par un dispositif", new EndGame());
    }
}
