package fr.paralax.server.story.antoine;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class AntoineAideVillage extends TileFrame {
    public AntoineAideVillage() {
        super(UserType.ANTOINE, "1",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "yasuo_village.png", "",
                "", () -> "");
        redirectMap.put("Je remarque qu'à ma ceinture je possede un katana et que mes vêtements sont différent." +
                " Quand je m'approche des bandits je me pose une question cruciale :", new AntoineEpee());
    }

    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        return ButtonState.UPDATE;
    }
}
