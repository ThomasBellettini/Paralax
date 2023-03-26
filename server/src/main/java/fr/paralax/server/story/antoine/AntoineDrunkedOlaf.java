package fr.paralax.server.story.antoine;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class AntoineDrunkedOlaf extends TileFrame {
    public AntoineDrunkedOlaf() {
        super(UserType.ANTOINE, "8",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "yasuo_vs_olaf.jpeg", "",
                "", () -> "");
        redirectMap.put("Le DRUNKED OLAF m'aide à tuer le Yone et juste avant de mourir le Yone me dit :", new AntoineYoneMort());
    }

    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        return ButtonState.UPDATE;
    }
}
