package fr.paralax.server.story.antoine;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class AntoineMort extends TileFrame {
    public AntoineMort() {
        super(UserType.ANTOINE, "23",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("Je me réveil d'un cauchemar dans le canapé du BDE en sueur et je me rend compte que tout le monde" +
                " c'est endormi et que tout nos cheveux sont d'une couleur différente et dans mon cas ils sont bleu.", null);
    }
    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        return ButtonState.UPDATE;
    }
}
