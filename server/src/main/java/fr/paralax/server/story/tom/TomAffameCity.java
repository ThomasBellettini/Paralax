package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;

public class TomAffameCity extends TileFrame {

        public TomAffameCity() {
            super(UserType.TOM, "50",
                    TileResponseType.RESPONSE, new HashMap<>(),
                    "", "",
                    "", () -> "");
            redirectMap.put("il faut que je truve quelque chose à manger", null);
        }
}
