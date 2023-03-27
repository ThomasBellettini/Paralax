package fr.paralax.server.story.chopper;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;
import java.util.HashMap;
public class ChopperEnd2 extends TileFrame {
    public ChopperEnd2() {
        super(UserType.CHOPPER, "26",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "yamcha_goku.png", "",
                "", () -> "");
        redirectMap.put("Alors tu es venu, je t'attendais...", new ChopperEnd3());
    }
    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;
        return ButtonState.UPDATE;
    }
}
