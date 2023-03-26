package fr.paralax.server.story.antoine;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class AntoineForetFin extends TileFrame {
    public AntoineForetFin() {
        super(UserType.ANTOINE, "14",
                TileResponseType.RESPONSE, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("Au bout de 10 min de course intense, j'arrive au village, un villageois me demande de l'aide." +
                "Est-ce que je les aides ?", null);
        redirectMap.put("Non car je ne sais pas me battre.", new AntoineVillageMort());
        redirectMap.put("Oui car je crois que sous l'adrénaline je pourrais les aiders.", new AntoineVillageMort());
        redirectMap.put("Oui car pour une raison étrange je ressens une force inconnu.", new AntoineAideVillage());
    }

    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        return ButtonState.UPDATE;
    }
}
