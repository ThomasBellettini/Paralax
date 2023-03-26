package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;

public class ThomasAsk2 extends TileFrame {

    public ThomasAsk2() {

        super(UserType.THOMAS_H, "12",
                TileResponseType.RESPONSE, new HashMap<>(),
                "wumpa.gif", "",
                "", () -> "");
            redirectMap.put("Vous entrez en salle asso, il y a un fruit Wumpa", null);
            redirectMap.put("Chercher autre part", new ThomasAsk1());
            redirectMap.put("Le manger", new ThomasAsk3());
            redirectMap.put("Le prendre dans son sac et partir", new ThomasAsk3());
    }
}
