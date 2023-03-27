package fr.paralax.server.story.chopper;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class Beggin2 extends TileFrame {

    public Beggin2() {
        super(UserType.CHOPPER, "3",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "monde_chopper.jpeg", "",
                "", () -> "");
        redirectMap.put("Ou suis-je arrivé ?", new Beggin3());
    }

    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        return ButtonState.UPDATE;
    }
}
