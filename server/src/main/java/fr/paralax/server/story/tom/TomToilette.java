package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;
import java.util.Map;

public class TomToilette extends TileFrame {

    public TomToilette() {

        super(UserType.TOM, "8",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
    }
}
