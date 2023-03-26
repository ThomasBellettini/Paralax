package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;
import java.util.Map;

public class ThomasStart extends TileFrame {

    public ThomasStart() {
        super(UserType.THOMAS_H, "1",
                TileResponseType.RESPONSE, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("...", null);
        redirectMap.put("Rentrer chez soi", new ThomasAsk1());
        redirectMap.put("Chercher d'où vient la source", new ThomasAsk1());
        redirectMap.put("Ignorer", new ThomasQuit1()); //TODO:CHANGE_GAME
    }
}
