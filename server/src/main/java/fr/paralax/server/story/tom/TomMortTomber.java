package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

public class TomMortTomber extends TileFrame {
    public TomMortTomber() {
        super(UserType.TOM, "19",
                TileResponseType.DISCUSSION, null,
                "", "",
                "", () -> "");
        redirectMap.put("aaaaaaaaaaaaaaaaaaaah", new TomFin());
    }

    @Override
    public ButtonState onClickOnButton(Story story, String button) {
        ButtonState state = super.onClickOnButton(story, button);
        if (state == ButtonState.ERROR) return state;

        if (button.equalsIgnoreCase("aaaaaaaaaaaaaaaaaaaah")) {
            story.getStoredValue().put("alive", new Story.Container(Boolean.class, false));
            return ButtonState.REDIRECTION;
        }
        return ButtonState.UPDATE;
    }
}
