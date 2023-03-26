package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;

public class TomForet extends TileFrame {

        public TomForet() {
            super(UserType.TOM, "9",
                    TileResponseType.DISCUSSION, null,
                    "", "",
                    "", () -> "");
            redirectMap.put("le stresse m'a donné faim, mais qu'est ce que c'est que ca ?", new TomAffameForet());
        }
}
