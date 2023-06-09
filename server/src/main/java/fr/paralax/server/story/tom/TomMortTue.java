package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class TomMortTue extends TileFrame {
    public TomMortTue() {
        super(UserType.TOM, "18",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("quel est ce bruit", new TomFin());
    }

    @Override
    public ButtonState onClickOnButton(Story story, String button) {
        ButtonState state = super.onClickOnButton(story, button);
        if (state == ButtonState.ERROR) return state;

        if (button.equalsIgnoreCase("quel est ce bruit")) {
            story.getStoredValue().put("alive", false);
            return ButtonState.REDIRECTION;
        }
        return ButtonState.UPDATE;
    }
}
