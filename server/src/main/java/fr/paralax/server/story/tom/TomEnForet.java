package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;

public class TomEnForet extends TileFrame {

        public TomEnForet() {
            super(UserType.TOM, "17852",
                    TileResponseType.DISCUSSION, new HashMap<>(),
                    "", "",
                    "", () -> "");
            redirectMap.put("Il se dirige vers la forêt et disparait", new TomFin());
        }
}
