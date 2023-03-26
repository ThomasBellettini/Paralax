package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;

public class TomEnForet extends TileFrame {

        public TomEnForet() {
            super(UserType.TOM, "12",
                    TileResponseType.DISCUSSION, null,
                    "", "",
                    "", () -> "");
            redirectMap.put("Il se dirige vers la forêt", new TomForet());
        }
}
