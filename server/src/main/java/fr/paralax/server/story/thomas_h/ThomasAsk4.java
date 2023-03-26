package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;
import java.util.Map;

public class ThomasAsk4 extends TileFrame {

    public ThomasAsk4() {

        super(UserType.THOMAS_H, "14",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
            redirectMap.put("Soudainement, en marchant, le fruit explose et cela vous assome", new ThomasGame());
    }
}
