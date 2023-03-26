package fr.paralax.server.story.antoine;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class AntoineMiroir2 extends TileFrame {
    public AntoineMiroir2() {
        super(UserType.ANTOINE, "21",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("De plus je remarque que derrière moi se trouve une personne qui me fixe tout en s'approchant de moi.", new AntoineInconnu());
    }

    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        return ButtonState.UPDATE;
    }
}
