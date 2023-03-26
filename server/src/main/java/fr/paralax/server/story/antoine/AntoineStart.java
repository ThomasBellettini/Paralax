package fr.paralax.server.story.antoine;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class AntoineStart extends TileFrame {
    public AntoineStart() {
        super(UserType.ANTOINE, "25",
                TileResponseType.RESPONSE, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("On est fatigué, es qu'on prend une monster.", null);
        redirectMap.put("Oui, on prend une monster.", new AntoineMonster());
        redirectMap.put("Non, on s'endort", new AntoineDodo());
    }

    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        return ButtonState.UPDATE;
    }
}
