package fr.paralax.server.story.chopper;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;
import java.util.HashMap;
public class NagzomQuestion3 extends TileFrame {
    public NagzomQuestion3() {
        super(UserType.CHOPPER, "18",
                TileResponseType.RESPONSE, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("Evidemment ! Deuxieme question, quel est le meilleur combattant MMA ?", null);
        redirectMap.put("Cyril Gane, le 'Bon Gamin'", new NagzormQuestion4());
        redirectMap.put("Guillaume 'Archi'", new NagzormBadResponse());
}

    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;
        return ButtonState.UPDATE;
    }
}
