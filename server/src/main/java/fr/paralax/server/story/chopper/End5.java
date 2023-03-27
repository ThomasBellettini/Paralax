package fr.paralax.server.story.chopper;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;
import java.util.HashMap;
public class End5 extends TileFrame {
    public End5() {
        super(UserType.CHOPPER, "29",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "kame2.png", "",
                "", () -> "");
        redirectMap.put("*je faiblis*", new End6());
    }
    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;
        return ButtonState.UPDATE;
    }
}
