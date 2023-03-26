package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class TomChuteLibre extends TileFrame {

        public TomChuteLibre() {
            super(UserType.TOM, "2524",
                    TileResponseType.RESPONSE, new HashMap<>(),
                    "", "",
                    "", () -> "");
            redirectMap.put("Que pourrions nous faire?", null);
            redirectMap.put("psartek jsuis dans un rêve je referme les yeux et c'est finit", new TomMortExploser());
            redirectMap.put("atten dmais je suis dans un rêve je peux voler", new TomSuperHero());
        }

        @Override
        public ButtonState onClickOnButton(Story story, String string) {
            ButtonState state = super.onClickOnButton(story, string);
            if (state == ButtonState.ERROR) return state;

            return ButtonState.UPDATE;
        }
}
