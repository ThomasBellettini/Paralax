package fr.paralax.server.story.antoine;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class AntoineChopper extends TileFrame {
    public AntoineChopper() {
        super(UserType.ANTOINE, "4",
                TileResponseType.RESPONSE, new HashMap<>(),
                "blue", "",
                "", () -> "");
        redirectMap.put("Chopper commence a s'avancer a toute vitesse avec son Poney, le combat est rapide et il se finit par : ", null);
    }

    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        if (string.equals("Chopper commence a s'avancer a toute vitesse avec son Poney, le combat est rapide et il se finit par : ")) {
            int random = (int) (Math.random() * 100) + 1;
            if (random <= 90) {
                story.setTileSaved(new AntoineChopperWin().getUuid());
            } else {
                story.setTileSaved(new AntoineChopperLose().getUuid());
            }
            return ButtonState.REDIRECTION;
        }
        return ButtonState.UPDATE;
    }
}
