package fr.paralax.server.story.thomas_b;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.story.antoine.AntoineStart;
import fr.paralax.server.story.chopper.ChopperStart;
import fr.paralax.server.story.thomas_h.ThomasStart;
import fr.paralax.server.story.tom.TomStart;

import java.util.HashMap;

public class SelectGame extends TileFrame {

    public SelectGame () {
        super(UserType.THOMAS_B, "3",
                TileResponseType.RESPONSE, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("4 d'entre eux vont vivre une aventure spéciale, choississez qui vous voudriez incarner...", null);
        redirectMap.put("Thomas H alias le bandeur de raccoon", new ThomasStart());
        redirectMap.put("Arthur P alias Choppax l'inutile", new ChopperStart());
        redirectMap.put("Tom D alias le raciste originel", new TomStart());
        redirectMap.put("Antoine K alias l'infiltré", new AntoineStart());
    }

}
