package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;

public class TomForetStart extends TileFrame {

        public TomForetStart() {
            super(UserType.TOM, "6",
                    TileResponseType.DISCUSSION, new HashMap<>(),
                    "", "",
                    "", () -> "");
            redirectMap.put("Il se dirige vers la forêt", new TomForet());
        }
}
