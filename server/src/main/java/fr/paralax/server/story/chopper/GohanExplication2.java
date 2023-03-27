package fr.paralax.server.story.chopper;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class GohanExplication2 extends TileFrame {

    public GohanExplication2() {
        super(UserType.CHOPPER, "5",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "prez_nagzorm.png", "",
                "", () -> "");
        redirectMap.put("Option 1 : Nagzorm, plus grand combattant terrien depuis qu'il a battu Satan sur le ring", new GohanExplication3());
    }

    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        return ButtonState.UPDATE;
    }
}
