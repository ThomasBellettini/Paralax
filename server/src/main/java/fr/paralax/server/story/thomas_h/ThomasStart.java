package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;

public class ThomasStart extends TileFrame {

    public ThomasStart() {
        super(UserType.THOMAS_H, "1",
                TileResponseType.RESPONSE, new HashMap<>(),
                "resize_begin.jpg", "",
                "", () -> "");
        redirectMap.put("...", null);
        redirectMap.put("Rentrer chez soi", new ThomasAsk1());
        redirectMap.put("Chercher d'où vient la source", new ThomasAsk1());
    }
}
