package fr.paralax.server.story.thomas_b;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.story.antoine.AntoineStart;
import fr.paralax.server.story.thomas_h.ThomasStart;
import fr.paralax.server.story.tom.TomStart;

import java.util.HashMap;

public class EndGame extends TileFrame {

    public EndGame () {
        super(UserType.THOMAS_B, "5",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("Ce bruit? c'est quoi encore? on dirait le même bruit que j'ai entendu toute à l'heure ...", new EndSecond());
    }


}
