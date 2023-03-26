package fr.paralax.server.story.antoine;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class AntoineForetMiddle extends TileFrame {
    public AntoineForetMiddle() {
        super(UserType.ANTOINE, "15",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "yasuo_village.png", "",
                "", () -> "");
        redirectMap.put("Au bout d'une heure d'exploration, je vois au loin un village en feu de plus je vois des " +
                "villageois fuir de bandits.", new AntoineForetFin());
    }

    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        return ButtonState.UPDATE;
    }
}
