package fr.paralax.server.story.chopper;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;
import java.util.HashMap;
public class NagzormQuizz extends TileFrame {
    public NagzormQuizz() {
        super(UserType.CHOPPER, "15",
                TileResponseType.RESPONSE, new HashMap<>(),
                "nagzorm_salle.png", "",
                "", () -> "");
        redirectMap.put("Ok mon bestiau, je te donnerai la force que tu souhaites seulement <nline> si tu réponds correctement a 3 questions.", null);
        redirectMap.put("OK coach!", new NagzormQuestion1());
        redirectMap.put("*lui mettre une droite*", new NagzormPatate());
    }
    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;
        return ButtonState.UPDATE;
    }
}
