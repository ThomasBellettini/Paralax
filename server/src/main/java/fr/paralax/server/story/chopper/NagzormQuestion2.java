package fr.paralax.server.story.chopper;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;
import java.util.HashMap;
public class NagzormQuestion2 extends TileFrame {
    public NagzormQuestion2() {
        super(UserType.CHOPPER, "17",
                TileResponseType.RESPONSE, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("Qui est le meilleur joueur de foot actuel?", null);
        redirectMap.put("Mbappté, pas content, triplé", new NagzomQuestion3());
        redirectMap.put("Mitroglou.", new NagzormBadResponse());
}

    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;
        return ButtonState.UPDATE;
    }
}
