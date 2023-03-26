package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;

public class TomEndormi extends TileFrame {
    public TomEndormi() {
        super(UserType.TOM, "20758",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("toutes ces histoires m'ont fatigué", new TomFin());
    }
}
