package fr.paralax.server.story.chopper;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;
import java.util.HashMap;
public class TrainingEnded extends TileFrame {
    public TrainingEnded() {
        super(UserType.CHOPPER, "21",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "calimero_city.png", "",
                "", () -> "");
        redirectMap.put("Apres avoir suivi votre entrainement, vous vous rendez à CalimeroCity,<nline> lieu de l'éxécution...", new ChopperEnd1());
    }
    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;
        return ButtonState.UPDATE;
    }
}
