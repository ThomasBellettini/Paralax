package fr.paralax.server.story.chopper;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;
import java.util.HashMap;
public class StartNagzorm extends TileFrame {
    public StartNagzorm() {
        super(UserType.CHOPPER, "13",
                TileResponseType.RESPONSE, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("Salut mon gourmand, quesqu'y t'amènes", null);
        redirectMap.put("*expliquer la situation*", new NagzormQuizz());
        redirectMap.put("Je viens d'affronter", new NagzormPatate());
    }
    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;
        return ButtonState.UPDATE;
    }
}
