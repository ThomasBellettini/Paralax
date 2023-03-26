package fr.paralax.server.story.antoine;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class AntoineEpee extends TileFrame {
    public AntoineEpee() {
        super(UserType.ANTOINE, "9",
                TileResponseType.RESPONSE, new HashMap<>(),
                "yasuo_livai.jpg", "",
                "", () -> "");
        redirectMap.put("Que dois-je faire ?", null);
        redirectMap.put("Je décide de reproduire des techniques de combat à épée d'anime pour vaincre les bandits.", new AntoineEpeeAnime());
        redirectMap.put("La force inconnu me donne envie de dasher sur les bandits pour les vaincre.", new AntoineEpeeDash());
    }

    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        return ButtonState.UPDATE;
    }
}
