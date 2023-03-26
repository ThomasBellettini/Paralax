package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;
import java.util.Map;

public class ThomasAsk8 extends TileFrame {

    public ThomasAsk8() {

        super(UserType.THOMAS_H, "18",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
            redirectMap.put("Le stress vous envahit et vous vous évanouissez en pleine course", new ThomasGame());
    }
}
