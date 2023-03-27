package fr.paralax.server.story.chopper;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class Beggin3 extends TileFrame {

    public Beggin3() {
        super(UserType.CHOPPER, "4",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "rencontre_gohan1.jpg", "",
                "", () -> "");
        redirectMap.put("Tiens, qui est-ce ?", new GohanQuestion());
    }

    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        return ButtonState.UPDATE;
    }
}
