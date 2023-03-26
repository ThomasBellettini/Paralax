package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;
import java.util.Map;

public class ThomasAsk24 extends TileFrame {

    public ThomasAsk24() {

        super(UserType.THOMAS_H, "124",
                TileResponseType.RESPONSE, new HashMap<>(),
                "", "",
                "", () -> "");
            redirectMap.put("Vous voyez une horde de cochons sauvages qui se dirigent à toute vitesse vers vous", null);
            redirectMap.put("COURIR", new ThomasAsk25());
            redirectMap.put("Se cacher", new ThomasQuit2());
            redirectMap.put("Utilisez vos compétences sur eux", new ThomasQuit2());
    }
}
