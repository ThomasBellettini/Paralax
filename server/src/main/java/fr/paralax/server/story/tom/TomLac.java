package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;

public class TomLac extends TileFrame {

        public TomLac() {
            super(UserType.TOM, "3",
                    TileResponseType.DISCUSSION, new HashMap<>(),
                    "", "",
                    "", () -> "");
            redirectMap.put("", new TomFin());
        }
}
