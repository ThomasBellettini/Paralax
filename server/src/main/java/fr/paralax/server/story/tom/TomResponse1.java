package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;
import java.util.Map;

public class TomResponse1 extends TileFrame {

    public TomResponse1() {
        super(UserType.TOM, "15",
                TileResponseType.RESPONSE, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("Aller au toilettes", new TomToilette());
    }

    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

//        if (string.equalsIgnoreCase("Aller au toilettes")) {
//
//        }

//        story.getStoredValue().put("magical_beans", new Story.Container(String.class, "Mdr"));
//        if (story.getStoredValue().containsKey("magical_beans")) {
//            String size = (String) story.getStoredValue().get("magical_beans").getObject();
//        }

        return ButtonState.UPDATE;
    }
}
