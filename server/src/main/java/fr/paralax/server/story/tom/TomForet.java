package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;

public class TomForet extends TileFrame {

        public TomForet() {
            super(UserType.TOM, "4",
                    TileResponseType.DISCUSSION, null,
                    "", "",
                    "", () -> "");
        }
}
