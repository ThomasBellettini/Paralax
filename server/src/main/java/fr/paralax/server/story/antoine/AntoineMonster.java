package fr.paralax.server.story.antoine;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class AntoineMonster extends TileFrame {
    public AntoineMonster() {
        super(UserType.ANTOINE, "22",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "yasuo_monster.png", "",
                "", () -> "");
        redirectMap.put("On prend une monster et on continue de coder jusque 3h du matin.", null);
    }
    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        return ButtonState.UPDATE;
    }
}

