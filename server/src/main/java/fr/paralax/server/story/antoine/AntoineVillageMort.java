package fr.paralax.server.story.antoine;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class AntoineVillageMort extends TileFrame {
    public AntoineVillageMort() {
        super(UserType.ANTOINE, "28",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("Une Akali surgit d'un buisson et malgré mes efforts je me fais tuer puisqu'elle est diamant.", new AntoineMort());
    }
    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        return ButtonState.UPDATE;
    }
}
