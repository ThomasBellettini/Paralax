package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;
import java.util.Map;

public class ThomasAsk28 extends TileFrame {

    public ThomasAsk28() {

        super(UserType.THOMAS_H, "128",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
            redirectMap.put("Vous les tuez et entrez dans le temple où un boss crocodile vous attend<nline>Vous le tuez lors d'une bataille épique et vous finissez le niveau", null); //TODO:END
    }
}
