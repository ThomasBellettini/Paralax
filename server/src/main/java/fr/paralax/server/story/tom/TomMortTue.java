package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;

public class TomMortTue extends TileFrame {
    public TomMortTue() {
        super(UserType.TOM, "10",
                TileResponseType.DISCUSSION, null,
                "", "",
                "", () -> "");
    }
}
