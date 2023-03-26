package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;

public class TomMortOverdose extends TileFrame {

        public TomMortOverdose() {
            super(UserType.TOM, "17",
                    TileResponseType.DISCUSSION, new HashMap<>(),
                    "", "",
                    "", () -> "");
        }
}
