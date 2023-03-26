package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class TomAffameForet extends TileFrame {

        public TomAffameForet() {
            super(UserType.TOM, "10",
                    TileResponseType.RESPONSE, new HashMap<>(),
                    "", "",
                    "", () -> "");
            redirectMap.put("ces champignons on l'air plutôt bon", null);
            redirectMap.put("mmmmmmh mauvais baille je ferais mieux de continuer ma route", null);
        }

    @Override
    public ButtonState onClickOnButton(Story story, String button) {
        ButtonState state = super.onClickOnButton(story, button);
        if (state == ButtonState.ERROR) return state;

        if (button.equalsIgnoreCase("ces champignons on l'air plutôt bon")) {
            story.setTileSaved(new TomForetChampignon().getUuid());
            return ButtonState.REDIRECTION;
        } else if (button.equalsIgnoreCase("mmmmmmh mauvais baille je ferais mieux de continuer ma route")) {
            story.setTileSaved(new TomEnForet().getUuid());
            return ButtonState.REDIRECTION;
        }

        return ButtonState.UPDATE;
    }
}
