package fr.paralax.server.story.antoine;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;
import fr.paralax.server.story.thomas_b.EndGame;

import java.util.HashMap;

public class AntoineVictoire extends TileFrame {
    public AntoineVictoire() {
        super(UserType.ANTOINE, "27",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "blue", "",
                "", () -> "");
        redirectMap.put("Je me réveille dans mon lit et je me dis que c'était qu'un rêve et je décide de prendre une " +
                "douche. Cependant en passant devant mon miroir je remarque que mes cheveux sont devenu bleu.", new EndGame());
    }
    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        return ButtonState.UPDATE;
    }
}
