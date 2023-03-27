package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;
import fr.paralax.server.story.thomas_b.EndGame;

import java.util.HashMap;

public class TomFin extends TileFrame {

        public TomFin() {
            super(UserType.TOM, "30",
                    TileResponseType.DISCUSSION, new HashMap<>(),
                    "surprised.gif", "",
                    "", () -> "");
            redirectMap.put("mais que s'est il passé..", new EndGame());
        }

        @Override
        public ButtonState onClickOnButton(Story story, String button) {
            ButtonState state = super.onClickOnButton(story, button);
            if (state == ButtonState.ERROR) return state;

            if (button.equalsIgnoreCase("mais que s'est il passé")) {
                if (story.getStoredValue().containsKey("alive")) {
                    boolean is_alive = (boolean) story.getStoredValue().get("alive");

                    if (is_alive) {
                        story.setTileSaved(new TomFinVivant().getUuid());
                    } else {
                        story.setTileSaved(new TomFinMort().getUuid());
                    }
                    return ButtonState.REDIRECTION;
                }
            }
            return ButtonState.UPDATE;
        }
}
