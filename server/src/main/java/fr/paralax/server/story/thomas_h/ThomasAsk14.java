package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;
import java.util.Map;

public class ThomasAsk14 extends TileFrame {

    public ThomasAsk14() {

        super(UserType.THOMAS_H, "114",
                TileResponseType.RESPONSE, new HashMap<>(),
                "", "",
                "", () -> "");
            redirectMap.put("Un Wumpa vous tombe sur la tête et vous réveil", null);
//            redirectMap.put("Se rendormir", new ThomasAsk14());
            redirectMap.put("Se frotter la bosse que le fruit a provoqué", new ThomasAsk18());
            redirectMap.put("Le manger", new ThomasAsk15());
    }
}
