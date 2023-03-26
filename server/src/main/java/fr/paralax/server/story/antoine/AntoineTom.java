package fr.paralax.server.story.antoine;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class AntoineTom extends TileFrame {
    public AntoineTom() {
        super(UserType.ANTOINE, "26",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "yasuo_vs_sett.jpg", "",
                "", () -> "");
        redirectMap.put("Je commence a me battre contre Tom et je le bat en moins d'une minute mais au moment de perdre " +
                "il me traite de Gold II alors que je suis Bronze III.", new AntoineChopper());
    }

    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        return ButtonState.UPDATE;
    }
}
