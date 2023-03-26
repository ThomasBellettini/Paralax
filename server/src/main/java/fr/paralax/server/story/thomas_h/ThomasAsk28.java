package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.story.thomas_b.EndGame;

import java.util.HashMap;

public class ThomasAsk28 extends TileFrame {

    public ThomasAsk28() {

        super(UserType.THOMAS_H, "128",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "croco.jpg", "",
                "", () -> "");
            redirectMap.put("Vous les tuez et entrez dans le temple où un boss crocodile vous attend<nline>Vous le tuez lors d'une bataille épique et vous finissez le niveau", new EndGame());
    }
}
