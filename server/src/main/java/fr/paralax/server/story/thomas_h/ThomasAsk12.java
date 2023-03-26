package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;
import java.util.Map;

public class ThomasAsk12 extends TileFrame {

    public ThomasAsk12() {

        super(UserType.THOMAS_H, "112",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
            redirectMap.put("Vous percutez une autre caisse. Cette fois-ci c'est une caisse TNT et elle explose.", new ThomasGame());
    }
}
