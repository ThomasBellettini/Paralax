package fr.paralax.server.story.antoine;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class AntoineEpeeDash extends TileFrame {
    public AntoineEpeeDash() {
        super(UserType.ANTOINE, "11",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("Je dash sur l'ennemi et grace à mon épée ca me permet de tuer trois bandits en un seul coup.", new AntoineEpeeDash2());
    }

    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        return ButtonState.UPDATE;
    }
}
