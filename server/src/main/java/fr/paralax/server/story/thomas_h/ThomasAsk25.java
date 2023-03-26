package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;
public class ThomasAsk25 extends TileFrame {

    public ThomasAsk25() {

        super(UserType.THOMAS_H, "125",
                TileResponseType.RESPONSE, new HashMap<>(),
                "pont.jpg", "",
                "", () -> "");
            redirectMap.put("Au bout de quelques minutes, vous arrivez à un pont suspendu au-dessus d'une gorge profonde<nline>Vous voyez des plateformes et vous savez que vous devez sauter dessus pour rester en vie", null);
            redirectMap.put("Aller sur la plateforme droite où il n'y a rien de spécial", new ThomasAsk26());
            redirectMap.put("Aller sur la plateforme gauche où il y a des toucans", new ThomasQuit3());
            redirectMap.put("Aller sur la plateforme devant avec une espèce de lueur jaune \"CHECKPOINT\"", new ThomasQuit4());
    }
}
