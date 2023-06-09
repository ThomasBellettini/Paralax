package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class TomParachute extends TileFrame {

        public TomParachute() {
            super(UserType.TOM, "557857857",
                    TileResponseType.RESPONSE, new HashMap<>(),
                    "", "",
                    "", () -> "");
            redirectMap.put("le lac là-bas a l'air plutôt sympas", new TomForetStart());
            redirectMap.put("je penses qu'il serait plus judicieux d'aller me poser dans la forêt à côté", new TomForetStart());
            redirectMap.put(("la ville au fond m'attire pas mal"), new  TomForetStart());

        }
}
