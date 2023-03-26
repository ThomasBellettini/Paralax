package fr.paralax.server.story.chopper;

import fr.paralax.server.entity.TileFrame;

import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class Start extends TileFrame {

    public Start() {
        super(UserType.CHOPPER, "1",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("Suite", new Beggin());
    }


    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        return ButtonState.UPDATE;
    }
}
