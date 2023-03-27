package fr.paralax.server.story.chopper;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;
import java.util.HashMap;
public class ChopperEnd1 extends TileFrame {
    public ChopperEnd1() {
        super(UserType.CHOPPER, "25",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "yamcha_goku.png", "",
                "", () -> "");
        redirectMap.put("Vous appercevez Goku, se faisant marcher dessus par Yamcha", new ChopperEnd2());
    }
    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;
        return ButtonState.UPDATE;
    }
}