package fr.paralax.server.story.chopper;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class GohanQuestion extends TileFrame {

    public GohanQuestion() {
        super(UserType.CHOPPER, "3",
                TileResponseType.RESPONSE, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("Qui-es-tu ? Tu es le saiyan légendaire ?", null);
        redirectMap.put("le quoi ?", new GohanExplication());
        redirectMap.put("C'est moi wesh", new GohanExplication());
        redirectMap.put("Nan nan j'suis juste perdu", new GohanExplication());
    }

    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        return ButtonState.UPDATE;
    }
}
