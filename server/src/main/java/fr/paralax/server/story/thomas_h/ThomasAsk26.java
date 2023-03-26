package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;
import java.util.Map;

public class ThomasAsk26 extends TileFrame {

    public ThomasAsk26() {

        super(UserType.THOMAS_H, "126",
                TileResponseType.RESPONSE, new HashMap<>(),
                "", "",
                "", () -> "");
            redirectMap.put("En allant sur la plateforme, vous vous rendez compte que les autres plateformes vous auraient tué. Vous continuez donc de prendre les bonnes plateformes<nline>Une fois le pont traversé, vous arrivez dans une grotte sombre et humide. Une torche apparaît dans votre main", null);
            redirectMap.put("Aller vers les chauves souris en agitant votre torche", new ThomasAsk27());
            redirectMap.put("Aller tout droit", new ThomasQuit6());
            redirectMap.put("Courir dans la direction la plus sûre", new ThomasQuit5());
    }
}
