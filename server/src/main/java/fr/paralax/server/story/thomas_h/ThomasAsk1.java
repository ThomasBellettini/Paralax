package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;
import java.util.Map;

public class ThomasAsk1 extends TileFrame {

    public ThomasAsk1() {

        super(UserType.THOMAS_H, "11",
                TileResponseType.RESPONSE, new HashMap<>(),
                "", "",
                "", () -> "");
            redirectMap.put("Vous sortez d'EPITECH, un trou noir s'y trouve", null);
            redirectMap.put("Rentrer dedans", new ThomasGame());
            redirectMap.put("S'enfuir", new ThomasAsk11());
            redirectMap.put("Retourner à EPITECH", new ThomasAsk10());
    }
}
