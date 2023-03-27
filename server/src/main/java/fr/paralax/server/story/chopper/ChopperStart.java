package fr.paralax.server.story.chopper;

import fr.paralax.server.entity.TileFrame;

import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class ChopperStart extends TileFrame {

    public ChopperStart() {
        super(UserType.CHOPPER, "1",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "capsule.png", "",
                "", () -> "");
        redirectMap.put("Ou suis-je, une capsule ?", new ChopperBeggin());
    }


    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        return ButtonState.UPDATE;
    }
}
