package fr.paralax.server.story.antoine;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class AntoineEpeeAnime extends TileFrame {
    public AntoineEpeeAnime() {
        super(UserType.ANTOINE, "10",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("Je me crois dans l'Attaque des Titans et je me jette sur l'ennemi telle Livaï et je me fais tuer.", new AntoineMort());
    }

    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        return ButtonState.UPDATE;
    }
}
