package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;

public class TomEndormi extends TileFrame {
    public TomEndormi() {
        super(UserType.TOM, "20",
                TileResponseType.DISCUSSION, null,
                "", "",
                "", () -> "");
        redirectMap.put("toutes ces histoires m'ont fatigué", new TomFin());
    }
}
