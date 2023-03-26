package fr.paralax.server.story.chopper;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;
import java.util.HashMap;

public class GohanExplication4 extends TileFrame {

    public GohanExplication4() {
        super(UserType.CHOPPER, "11",
                TileResponseType.RESPONSE, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("Vegeta, Prince Sayen qui t'apprendra la maitrise de ton Ki (et la souffrance). Fais ton choix", null);
        redirectMap.put("Nagzorm", new StartNagzorm());
        redirectMap.put("Vegeta", new StartNagzorm());
        redirectMap.put("Hasagi", new StartNagzorm());
    }

    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        return ButtonState.UPDATE;
    }
}
