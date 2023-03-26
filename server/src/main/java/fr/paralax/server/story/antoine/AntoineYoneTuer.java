package fr.paralax.server.story.antoine;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class AntoineYoneTuer extends TileFrame {
    public AntoineYoneTuer() {
        super(UserType.ANTOINE, "32",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("Je me fais mettre à terre par le Yone et juste avant de me faire tuer le Yone me dit :" +
                " mon frère si tu n'avais pas été si faible tu aurais pu me tuer.", new AntoineMort());
    }

    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        return ButtonState.UPDATE;
    }
}
