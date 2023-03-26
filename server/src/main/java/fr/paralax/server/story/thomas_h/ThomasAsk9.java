package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;
import java.util.Map;

public class ThomasAsk9 extends TileFrame {

    public ThomasAsk9() {

        super(UserType.THOMAS_H, "19",
                TileResponseType.RESPONSE, new HashMap<>(),
                "", "",
                "", () -> "");
            redirectMap.put("Vous vous rendez compte que vos mains sont poilus mais ce n'est pas tout, TOUT votre corps l'est aussi", null);
            redirectMap.put("Hurler", new ThomasAsk17());
            redirectMap.put("Observer le paysage", new ThomasAsk19());
    }
}
