package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;
import java.util.Map;

public class ThomasAsk15 extends TileFrame {

    public ThomasAsk15() {

        super(UserType.THOMAS_H, "115",
                TileResponseType.RESPONSE, new HashMap<>(),
                "", "",
                "", () -> "");
            redirectMap.put("En mangeant le fruit<nline>...<nline>Vous vous rendez compte que vos mains sont poilus mais ce n'est pas tout, TOUT votre corps l'est aussi", null);
            redirectMap.put("Observer le paysage", new ThomasAsk19());
            redirectMap.put("Hurler", new ThomasAsk17());
    }
}
