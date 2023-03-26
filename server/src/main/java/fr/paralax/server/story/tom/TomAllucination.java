package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;

public class TomAllucination extends TileFrame {
    public TomAllucination() {
        super(UserType.TOM, "7",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
    }
}
