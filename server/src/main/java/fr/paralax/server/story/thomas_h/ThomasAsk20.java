package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;
import java.util.Map;

public class ThomasAsk20 extends TileFrame {

    public ThomasAsk20() {

        super(UserType.THOMAS_H, "120",
                TileResponseType.RESPONSE, new HashMap<>(),
                "", "",
                "", () -> "");
            redirectMap.put("Vous ne pouvez pas accéder à l'inventaire", null);
            redirectMap.put("Explorer les alentours", new ThomasAsk21());
            redirectMap.put("Essayer de réaliser des capacités", new ThomasAsk22());
    }
}
