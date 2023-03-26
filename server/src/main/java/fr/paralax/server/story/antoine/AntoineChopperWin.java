package fr.paralax.server.story.antoine;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class AntoineChopperWin extends TileFrame {
    public AntoineChopperWin() {
        super(UserType.ANTOINE, "6",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "blue", "",
                "", () -> "");
        redirectMap.put("ma victoire a un poil de cul car chopper a flash un mur", new AntoineVictoire());
    }

    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        return ButtonState.UPDATE;
    }
}
