package fr.paralax.server.story.chopper;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class ChopperBeggin extends TileFrame {

    public ChopperBeggin() {
        super(UserType.CHOPPER, "2",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("Suite", new Beggin2());
    }

    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        return ButtonState.UPDATE;
    }
}
