package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;

public class ThomasAsk27 extends TileFrame {

    public ThomasAsk27() {

        super(UserType.THOMAS_H, "127",
                TileResponseType.RESPONSE, new HashMap<>(),
                "chauvessouris.jpg", "",
                "", () -> "");
            redirectMap.put("Les chauves souris s'éloigent et vous sortez de la grotte. Vous arrivez devant un temple antique avec deux serpents géants", null);
            redirectMap.put("Aller dans une petite fissure qui semble être une entrée secrète", new ThomasQuit8());
            redirectMap.put("Attaquer avec vos compétences", new ThomasAsk28());
            redirectMap.put("Contourner", new ThomasQuit7());
    }
}
