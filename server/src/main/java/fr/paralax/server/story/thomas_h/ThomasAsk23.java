package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;

public class ThomasAsk23 extends TileFrame {

    public ThomasAsk23() {

        super(UserType.THOMAS_H, "123",
                TileResponseType.RESPONSE, new HashMap<>(),
                "jungle.jpg", "",
                "", () -> "");
            redirectMap.put("Vous pensez que vous êtes dans une map et vous vous mettez en tête de la finir<nline>.?!?!.!?..<nline>Le monde autour de vous change, vous vous voyez à la troisième personne et vous avez une ligne droite devant vous.", null);
            redirectMap.put("Se retourner", new ThomasAsk24());
            redirectMap.put("Avancer doucement en explorant", new ThomasQuit2());
    }
}
