package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;

public class ThomasAsk7 extends TileFrame {

    public ThomasAsk7() {

        super(UserType.THOMAS_H, "17",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "evanoui.gif", "",
                "", () -> "");
            redirectMap.put("Le miroir vous aspire", new ThomasGame());;
    }
}
