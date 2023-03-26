package fr.paralax.server.story.chopper;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class GohanExplication3 extends TileFrame {

    public GohanExplication3() {
        super(UserType.CHOPPER, "10",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("Hasagi, plus grand manieur de katana du monde, actuellement en train de former Zakyprod pour etre son successeur", new GohanExplication4());
    }

    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        return ButtonState.UPDATE;
    }
}
