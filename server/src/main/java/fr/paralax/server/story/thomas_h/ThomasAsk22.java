package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;

public class ThomasAsk22 extends TileFrame {

    public ThomasAsk22() {

        super(UserType.THOMAS_H, "122",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "crash.gif", "",
                "", () -> "");
            redirectMap.put("Vous arrivez à réalisez toutes les compétences (Body Slam, death tornado spin etc...)", new ThomasAsk23());
    }
}
