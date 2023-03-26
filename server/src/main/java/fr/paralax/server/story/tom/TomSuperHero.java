package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;
import java.util.HashMap;

public class TomSuperHero extends TileFrame{

        public TomSuperHero() {
            super(UserType.TOM, "4",
                    TileResponseType.RESPONSE, new HashMap<>(),
                    "", "",
                    "", () -> "");
            redirectMap.put("en vrai j'abuse un peux j'ai un parachute je devrais m'en servir", new TomParachute());
            redirectMap.put("attends mais je vole !!", new TomMortExploser());
        }
}
