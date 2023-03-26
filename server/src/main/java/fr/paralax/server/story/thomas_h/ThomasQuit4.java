package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;
import java.util.Map;

public class ThomasQuit4 extends TileFrame {
    
    public ThomasQuit4() {
        super(UserType.THOMAS_H, "34",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("C'était un piège, la plateforme disparaît et vous tombez", null); //TODO:END
    }
}
