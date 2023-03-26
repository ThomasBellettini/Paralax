package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;
import fr.paralax.server.story.thomas_b.EndGame;

import java.util.HashMap;

public class TomFinMort extends TileFrame {

        public TomFinMort() {
            super(UserType.TOM, "37861",
                    TileResponseType.DISCUSSION, new HashMap<>(),
                    "", "",
                    "", () -> "");
            redirectMap.put("il sent du sang couler sur son visage..", new EndGame());
        }
}
