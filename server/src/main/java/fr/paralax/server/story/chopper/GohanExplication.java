package fr.paralax.server.story.chopper;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class GohanExplication extends TileFrame {

    public GohanExplication() {
        super(UserType.CHOPPER, "130",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("Ok cool, mon père s'est fait capturé par Yamcha, il est devenu super puissant depuis qu'il a fait <nline> voeu de devenir Dieu de la destruction. Tu as une semaine pour te préparer avant son éxécution. Plusieurs choix s'offrent a toi pour te préparer.", new GohanExplication2());
    }

    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        return ButtonState.UPDATE;
    }
}
