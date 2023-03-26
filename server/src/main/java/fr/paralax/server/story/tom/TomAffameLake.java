package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;

public class TomAffameLake extends TileFrame {

        public TomAffameLake() {
            super(UserType.TOM, "2",
                    TileResponseType.RESPONSE, null,
                    "", "",
                    "", () -> "");
            redirectMap.put("il faut que je truve quelque chose à manger", null);
        }
}
