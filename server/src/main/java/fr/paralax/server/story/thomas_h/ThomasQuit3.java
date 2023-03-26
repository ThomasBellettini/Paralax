package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;
import java.util.Map;

public class ThomasQuit3 extends TileFrame {
    
    public ThomasQuit3() {
        super(UserType.THOMAS_H, "33",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("Le cri des toucans vous a perturbé et vous êtes tombés", null); //TODO:END
    }
}
