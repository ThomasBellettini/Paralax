package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class TomAffameForet extends TileFrame {

        public TomAffameForet() {
            super(UserType.TOM, "14520",
                    TileResponseType.RESPONSE, new HashMap<>(),
                    "", "",
                    "", () -> "");
            redirectMap.put("ces champignons on l'air plutôt bon", new TomForetChampignon());
            redirectMap.put("mmmmmmh mauvais baille je ferais mieux de continuer ma route", new TomEnForet());
        }

    @Override
    public ButtonState onClickOnButton(Story story, String button) {
        ButtonState state = super.onClickOnButton(story, button);
        if (state == ButtonState.ERROR) return state;

        return ButtonState.UPDATE;
    }
}
