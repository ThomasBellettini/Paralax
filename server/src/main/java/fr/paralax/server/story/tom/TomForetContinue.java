package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;

public class TomForetContinue extends TileFrame {
    public TomForetContinue() {
        super(UserType.TOM, "8",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
    }
}
