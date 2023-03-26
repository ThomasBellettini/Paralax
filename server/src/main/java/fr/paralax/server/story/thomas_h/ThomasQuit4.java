package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.story.thomas_b.EndGame;

import java.util.HashMap;

public class ThomasQuit4 extends TileFrame {
    
    public ThomasQuit4() {
        super(UserType.THOMAS_H, "34",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "blood.gif", "",
                "", () -> "");
        redirectMap.put("C'était un piège, la plateforme disparaît et vous tombez", new EndGame());
    }
}
