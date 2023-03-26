package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;

public class ThomasAsk1 extends TileFrame {

    public ThomasAsk1() {

        super(UserType.THOMAS_H, "11",
                TileResponseType.RESPONSE, new HashMap<>(),
                "trou_noir.jpg", "",
                "", () -> "");
            redirectMap.put("Vous sortez <color:\"blue\">d'EPITECH</color>, un trou noir s'y trouve", null);
            redirectMap.put("Rentrer dedans", new ThomasGame());
            redirectMap.put("S'enfuir", new ThomasAsk11());
            redirectMap.put("Retourner à EPITECH", new ThomasAsk10());
    }
}
