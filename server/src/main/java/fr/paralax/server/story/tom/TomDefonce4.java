package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

public class TomDefonce4 extends TileFrame {
    public TomDefonce4() {
        super(UserType.TOM, "7",
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
                story.setTileSaved(new TomMortTue().getUuid());
            }
            return ButtonState.REDIRECTION;
        }
        return ButtonState.UPDATE;
    }
}
