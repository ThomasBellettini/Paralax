package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;
import java.util.Map;

public class ThomasAsk11 extends TileFrame {

    public ThomasAsk11() {

        super(UserType.THOMAS_H, "111",
                TileResponseType.RESPONSE, new HashMap<>(),
                "", "",
                "", () -> "");
            redirectMap.put("Vous percutez une caisse et un masque de sorcier Aku Aku en sort.", null);
            redirectMap.put("L'ignorer et continuer à fuir", new ThomasAsk12());
            redirectMap.put("Le ramasser", new ThomasAsk13());
            redirectMap.put("Le remettre dans la caisse", new ThomasAsk13());
    }
}
