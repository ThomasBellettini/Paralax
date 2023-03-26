package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;

public class ThomasAsk19 extends TileFrame {

    public ThomasAsk19() {

        super(UserType.THOMAS_H, "119",
                TileResponseType.RESPONSE, new HashMap<>(),
                "crash.gif", "",
                "", () -> "");
            redirectMap.put("...<nline>Vous vous apercevez que ce n'est un endroit où vous êtes déjà allé<nline>!!!<nline>Vous vous rappelez que cet endroit ressemble comme deux gouttes d'eau à la jungle de Crash Bandicoot<nline>Vous essayez de faire comme dans le jeu", null);
            redirectMap.put("Regarder votre inventaire", new ThomasAsk20());
            redirectMap.put("Explorer les alentours", new ThomasAsk21());
            redirectMap.put("Essayer de réaliser des capacités", new ThomasAsk22());
        }
}
