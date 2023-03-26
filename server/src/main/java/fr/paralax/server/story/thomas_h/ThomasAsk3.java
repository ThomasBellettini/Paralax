package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;
import java.util.Map;

public class ThomasAsk3 extends TileFrame {

    public ThomasAsk3() {

        super(UserType.THOMAS_H, "13",
                TileResponseType.RESPONSE, new HashMap<>(),
                "", "",
                "", () -> "");
            redirectMap.put("Un effet de nausé vous prend", null);
            redirectMap.put("Retourner chez vous pour vous soigner", new ThomasAsk1());
            redirectMap.put("S'assoir", new ThomasAsk5());
            redirectMap.put("Aller aux toilettes", new ThomasAsk6());
    }
}
