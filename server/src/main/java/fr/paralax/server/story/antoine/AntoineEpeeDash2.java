package fr.paralax.server.story.antoine;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class AntoineEpeeDash2 extends TileFrame {
    public AntoineEpeeDash2() {
        super(UserType.ANTOINE, "12",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("Cependant je tombe façe à un Yone personnage de LoL avec un ratio de 27/4/0 feed par un Sett sauvage.", new AntoineYone());
    }

    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        return ButtonState.UPDATE;
    }
}
