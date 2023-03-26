package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;

public class ThomasAsk21 extends TileFrame {

    public ThomasAsk21() {

        super(UserType.THOMAS_H, "121",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "crash.gif", "",
                "", () -> "");
            redirectMap.put("Vous vous rendez compte qu'un mur invisible vous bloque dans une certaine zone", new ThomasAsk23());
    }
}
