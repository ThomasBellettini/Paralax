package fr.paralax.server.story.antoine;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class AntoineInscription extends TileFrame {
    public AntoineInscription() {
        super(UserType.ANTOINE, "19",
                TileResponseType.RESPONSE, new HashMap<>(),
                "yasuo_stadium.png", "",
                "", () -> "");
        redirectMap.put("Je m'inscris au tournoi et je tire au sort mon adversaire :", null);
        redirectMap.put("Je tire au sort Chopper.", new AntoineChopper());
        redirectMap.put("Je tire au sort Racoon.", new AntoineRacoon());
        redirectMap.put("Je tire au sort Tom.", new AntoineTom());
        redirectMap.put("Je tire au sort Belet.", new AntoineBelet());
        redirectMap.put("Yolo", null);
    }

    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        if (string.equalsIgnoreCase("Yolo")) {
            int random = (int) (Math.random() * 4) + 1;
            if (random == 1) {
                story.setTileSaved(new AntoineChopper().getUuid());
            } else if (random == 2) {
                story.setTileSaved(new AntoineRacoon().getUuid());
            } else if (random == 3) {
                story.setTileSaved(new AntoineTom().getUuid());
            } else if (random == 4) {
                story.setTileSaved(new AntoineBelet().getUuid());
            }
            return ButtonState.REDIRECTION;
        }
        return ButtonState.UPDATE;
    }
}
