package fr.paralax.server.story.antoine;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class AntoineYoneMort extends TileFrame {
    public AntoineYoneMort() {
        super(UserType.ANTOINE, "31",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "yasuo_vs_yone.jpg", "",
                "", () -> "");
        redirectMap.put("Le Yone me dit : Mon chère frère, tu es devenu bon.", new AntoineVictoire());
    }

    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        return ButtonState.UPDATE;
    }
}
