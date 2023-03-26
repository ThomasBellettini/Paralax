package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;

public class TomDefonce1 extends TileFrame {
    public TomDefonce1() {
        super(UserType.TOM, "9",
                TileResponseType.DISCUSSION, null,
                "", "",
                "", () -> "");
    }
}
