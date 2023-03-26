package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

public class TomDefonce2 extends TileFrame {
    public TomDefonce2() {
        super(UserType.TOM, "10",
                TileResponseType.DISCUSSION, null,
                "", "",
                "", () -> "");
        redirectMap.put("oh problem", null);
    }

    @Override
    public ButtonState onClickOnButton(Story story, String button) {
        ButtonState state = super.onClickOnButton(story, button);
        if (state == ButtonState.ERROR) return state;

        if (button.equalsIgnoreCase("oh problem")) {
            int random = (int) (Math.random() * 2);

            if (random == 0) {
                story.setTileSaved(new TomMortOverdose().getUuid());
            } else if (random == 1) {
                story.setTileSaved(new TomEndormi().getUuid());
            }
            return ButtonState.REDIRECTION;
        }
        return ButtonState.UPDATE;
    }
}
