package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class TomMortExploser extends TileFrame {

    public TomMortExploser() {
        super(UserType.TOM, "358778",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "boom.gif", "",
                "", () -> "");
        redirectMap.put("Boom!!!!", new TomFin());
    }

    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        return ButtonState.UPDATE;
    }
}
