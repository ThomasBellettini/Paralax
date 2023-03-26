package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class TomFinMort extends TileFrame {

        public TomFinMort() {
            super(UserType.TOM, "31",
                    TileResponseType.DISCUSSION, new HashMap<>(),
                    "", "",
                    "", () -> "");
            redirectMap.put("il sent du sang couler sur son visage..", null); //TODO: End
        }
}
