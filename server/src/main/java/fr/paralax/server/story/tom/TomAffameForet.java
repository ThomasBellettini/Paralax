package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;

public class TomAffameForet extends TileFrame {

        public TomAffameForet() {
            super(UserType.TOM, "6",
                    TileResponseType.DISCUSSION, null,
                    "", "",
                    "", () -> "");
        }
}
