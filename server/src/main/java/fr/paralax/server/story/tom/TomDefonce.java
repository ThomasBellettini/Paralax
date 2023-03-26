package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

public class TomDefonce extends TileFrame {
    public TomDefonce() {
        super(UserType.TOM, "8",
                TileResponseType.DISCUSSION, null,
                "", "",
                "", () -> "");
        redirectMap.put("mais qu'est ce qu'il se passe ?", null);
    }

    @Override
    public ButtonState onClickOnButton(Story story, String button) {
        ButtonState state = super.onClickOnButton(story, button);
        if (state == ButtonState.ERROR) return state;

        if (button.equalsIgnoreCase("mais qu'est ce qu'il se passe")) {
            int random = (int) (Math.random() * 4);

            if (random == 0) {
                story.setTileSaved(new TomDefonce1().getUuid());
            } else if (random == 1) {
                story.setTileSaved(new TomDefonce2().getUuid());
            } else if (random == 2) {
                story.setTileSaved(new TomDefonce3().getUuid());
            } else if (random == 3) {
                story.setTileSaved(new TomDefonce4().getUuid());
            }
            return ButtonState.REDIRECTION;
        }
        return ButtonState.UPDATE;
    }
}
