package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;

public class ThomasAsk13 extends TileFrame {

    public ThomasAsk13() {

        super(UserType.THOMAS_H, "112",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "neo.gif", "",
                "", () -> "");
            redirectMap.put("Derriére vous, un dénommé Neo Periwinkle Cortex vous assome", new ThomasGame());
    }
}
