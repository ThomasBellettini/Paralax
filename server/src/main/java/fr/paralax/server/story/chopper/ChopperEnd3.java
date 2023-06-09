package fr.paralax.server.story.chopper;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;
import java.util.HashMap;
public class ChopperEnd3 extends TileFrame {
    public ChopperEnd3() {
        super(UserType.CHOPPER, "27",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "kamge.png", "",
                "", () -> "");
        redirectMap.put("TU, TU, LE LACHES, AAAAAAAAAAAAAAAAAAAH", new End4());
    }
    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;
        return ButtonState.UPDATE;
    }
}
