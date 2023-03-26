package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;

public class TomAffameLake extends TileFrame {

        public TomAffameLake() {
            super(UserType.TOM, "2452",
                    TileResponseType.RESPONSE, new HashMap<>(),
                    "", "",
                    "", () -> "");
            redirectMap.put("il faut que je truve quelque chose à manger", null);
        }
}
