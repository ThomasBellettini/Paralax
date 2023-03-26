package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;

public class TomForetChampignon extends TileFrame {
    public TomForetChampignon() {
        super(UserType.TOM, "7",
                TileResponseType.DISCUSSION, null,
                "", "",
                "", () -> "");
    }
}
