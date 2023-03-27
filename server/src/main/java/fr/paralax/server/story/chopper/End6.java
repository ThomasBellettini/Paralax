package fr.paralax.server.story.chopper;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;
import java.util.HashMap;
public class End6 extends TileFrame {
    public End6() {
        super(UserType.CHOPPER, "30",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "nag.png", "",
                "", () -> "");
        redirectMap.put("Quel conseil Nagzorm m'a t-il donné ? <nline> 3 mineurs, c'est mieux qu'une majeur", new End7());
    }
    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;
        return ButtonState.UPDATE;
    }
}
