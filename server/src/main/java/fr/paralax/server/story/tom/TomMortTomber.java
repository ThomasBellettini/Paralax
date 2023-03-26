package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;

public class TomMortTomber extends TileFrame {
    public TomMortTomber() {
        super(UserType.TOM, "11",
                TileResponseType.DISCUSSION, null,
                "", "",
                "", () -> "");
    }
}
