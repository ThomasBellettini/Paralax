package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;

public class TomDefonce1 extends TileFrame {
    public TomDefonce1() {
        super(UserType.TOM, "13",
                TileResponseType.DISCUSSION, null,
                "", "",
                "", () -> "");
        redirectMap.put("je vais aller voir ce qu'il se passe", new TomDefonce2());
    }
}
