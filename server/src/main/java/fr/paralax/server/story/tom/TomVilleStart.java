package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class TomVilleStart extends TileFrame {

    public TomVilleStart() {
        super(UserType.TOM, "4",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("Il se dirige vers la ville", new TomVille());
    }
}
