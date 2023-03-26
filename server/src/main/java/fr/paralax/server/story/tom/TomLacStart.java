package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;

public class TomLacStart  extends TileFrame{

        public TomLacStart() {
            super(UserType.TOM, "2",
                    TileResponseType.DISCUSSION, new HashMap<>(),
                    "", "",
                    "", () -> "");
            redirectMap.put("Il se dirige vers le lac", new TomLac());
        }
}
