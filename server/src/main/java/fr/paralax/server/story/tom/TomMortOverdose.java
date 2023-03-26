package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;

public class TomMortOverdose extends TileFrame {

        public TomMortOverdose() {
            super(UserType.TOM, "17",
                    TileResponseType.DISCUSSION, null,
                    "", "",
                    "", () -> "");
        }
}
