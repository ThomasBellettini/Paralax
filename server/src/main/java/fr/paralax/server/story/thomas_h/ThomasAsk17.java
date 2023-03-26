package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;

public class ThomasAsk17 extends TileFrame {

    public ThomasAsk17() {

        super(UserType.THOMAS_H, "117",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "crash.gif", "",
                "", () -> "");
            redirectMap.put("En hurlant vous observez le ciel. Vous voyez qu'il a changé<nline>...<nline>Vous baissez la tête et regardez le paysage", new ThomasAsk19());
    }
}
