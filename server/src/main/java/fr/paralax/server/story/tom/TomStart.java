package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class TomStart extends TileFrame {

    public TomStart() {
        super(UserType.TOM, "1",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "black_background.png", "",
                "", () -> "");
        redirectMap.put("continue", new TomChuteLibre()); //TODO: Start

    }

    @Override
    public ButtonState onClickOnButton(Story story, String button) {
        ButtonState state = super.onClickOnButton(story, button);
        if (state == ButtonState.ERROR) return state;

        story.getStoredValue().put("alive", new Story.Container(Boolean.class, true));

        return ButtonState.UPDATE;
    }
}
