package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;

public class TomDefonce1 extends TileFrame {
    public TomDefonce1() {
        super(UserType.TOM, "14523",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("je vais aller voir ce qu'il se passe", new TomDefonce2());
    }
}
