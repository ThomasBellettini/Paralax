package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;

public class TomAllucination extends TileFrame {
    public TomAllucination() {
        super(UserType.TOM, "7",
                TileResponseType.DISCUSSION, null,
                "", "",
                "", () -> "");
    }
}
