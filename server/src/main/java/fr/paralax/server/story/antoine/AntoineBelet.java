package fr.paralax.server.story.antoine;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class AntoineBelet extends TileFrame {
    public AntoineBelet() {
        super(UserType.ANTOINE, "3",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("Je me bat contre le DRUNKED OLAF de belet avec son fameux set Kraken, Canon Ultrarapide et " +
                "Malmortius et je me fais défoncer, au moment de m'achever il me demandera de lui redonner un vers " +
                "d'OLD NICK.", new AntoineMort());
    }

    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;
        return ButtonState.UPDATE;
    }
}
