package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;

public class TomEndormi extends TileFrame {
    public TomEndormi() {
        super(UserType.TOM, "10",
                TileResponseType.DISCUSSION, null,
                "", "",
                "", () -> "");
    }
}
