package fr.paralax.server.story.chopper;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;
import java.util.HashMap;
public class NagzormQuestion4 extends TileFrame {
    public NagzormQuestion4() {
        super(UserType.CHOPPER, "19",
                TileResponseType.RESPONSE, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("(déso Archi), parfait, dernière question. Il est ou le plaisir ?", null);
        redirectMap.put("Le plaisir c'est juste ici", new NagzormQuizzSuccess());
        redirectMap.put("Juste la", new NagzormBadResponse());
}

    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;
        return ButtonState.UPDATE;
    }
}
