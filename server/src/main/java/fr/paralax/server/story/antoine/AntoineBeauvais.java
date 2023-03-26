package fr.paralax.server.story.antoine;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class AntoineBeauvais extends TileFrame {
    public AntoineBeauvais() {
        super(UserType.ANTOINE, "2",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("J'arrive apres 2h de marche dans la ville de Beauvais qui a comme maire Nagzorm et qui sur une " +
                "grande place annonce que le plaisir IL EST JUSTE A DROITE -> ->", null);
    }

    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        return ButtonState.UPDATE;
    }
}
