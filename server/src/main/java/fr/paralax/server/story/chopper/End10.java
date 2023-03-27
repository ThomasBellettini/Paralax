package fr.paralax.server.story.chopper;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;
import fr.paralax.server.story.thomas_b.EndGame;

import java.util.HashMap;
public class End10 extends TileFrame {
    public End10() {
        super(UserType.CHOPPER, "34",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "cestlafin.png", "",
                "", () -> "");
        redirectMap.put("Merci, jeune saiyan", new EndGame());
    }
    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;
        return ButtonState.UPDATE;
    }
}
