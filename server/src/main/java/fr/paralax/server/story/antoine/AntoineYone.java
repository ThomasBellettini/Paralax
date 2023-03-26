package fr.paralax.server.story.antoine;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class AntoineYone extends TileFrame {
    public AntoineYone() {
        super(UserType.ANTOINE, "30",
                TileResponseType.RESPONSE, new HashMap<>(),
                "yasuo_vs_yone.jpg", "",
                "", () -> "");
        redirectMap.put("Je décide d'attendre et je remarque que la légende du DRUNKED OLAF est vraie et qu'il se trouve 10 mètre derrière moi.", null);
        redirectMap.put("Je l'attend pour marave le Yone.", new AntoineDrunkedOlaf());
        redirectMap.put("Je décide d'y aller seul.", new AntoineYoneTuer());
    }
    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        return ButtonState.UPDATE;
    }
}
