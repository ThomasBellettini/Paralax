package fr.paralax.server.story.antoine;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class AntoineInconnu extends TileFrame {
    public AntoineInconnu() {
        super(UserType.ANTOINE, "16",
                TileResponseType.RESPONSE, new HashMap<>(),
                "inconnu.jpg", "",
                "", () -> "");
        redirectMap.put("Que dois-je faire ?", null);
        redirectMap.put("Je décide de faire un têtes à têtes avec la personne qui me fixe.", new AntoineInconnuMechant());
        redirectMap.put("Je décide d'aller le tuer.", new AntoineInconnuMechant());
        redirectMap.put("Je décide de lui parler.", new AntoineInconnuGentil());
    }

    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        return ButtonState.UPDATE;
    }
}
