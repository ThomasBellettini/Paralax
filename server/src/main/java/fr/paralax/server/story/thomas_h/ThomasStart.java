package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;
import fr.paralax.server.story.thomas_b.EndGame;
import fr.paralax.server.story.thomas_b.SelectGame;
import fr.paralax.server.story.thomas_b.StartGame;

import java.util.HashMap;
import java.util.Map;

public class ThomasStart extends TileFrame {

    public ThomasStart() {
        super(UserType.THOMAS_H, "1",
                TileResponseType.RESPONSE, new HashMap<>(),
                "crash.gif", "",
                "", () -> "");
        redirectMap.put("...", null);
        redirectMap.put("Rentrer chez soi", new ThomasAsk1());
        redirectMap.put("Chercher d'où vient la source", new ThomasAsk1());
    }
}
