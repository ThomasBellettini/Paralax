package fr.paralax.server.story.antoine;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class AntoineDodo extends TileFrame {
    public AntoineDodo() {
        super(UserType.ANTOINE, "7",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "yasuo_village.png", "",
                "", () -> "");
        redirectMap.put("On s'endort et on se réveille dans un endroit inconnu", new AntoineVois());
    }
    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        return ButtonState.UPDATE;
    }
}
