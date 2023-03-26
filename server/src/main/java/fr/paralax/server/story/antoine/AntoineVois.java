package fr.paralax.server.story.antoine;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class AntoineVois extends TileFrame {
    public AntoineVois() {
        super(UserType.ANTOINE, "29",
                TileResponseType.RESPONSE, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("Je regarde autour de moi, que vois-je ?.", null);
        redirectMap.put("Un miroir ?", new AntoineMiroir());
        redirectMap.put("Une foret resplendissante ?", new AntoineForetEntree());
    }

    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        return ButtonState.UPDATE;
    }
}