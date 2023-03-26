package fr.paralax.server.story.antoine;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class AntoineInconnuMechant extends TileFrame {
    public AntoineInconnuMechant() {
        super(UserType.ANTOINE, "18",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("L'inconnu réagi très mal et me tue d'un coup avec son poison et son odeur.", new AntoineMort());
    }

    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        return ButtonState.UPDATE;
    }
}
