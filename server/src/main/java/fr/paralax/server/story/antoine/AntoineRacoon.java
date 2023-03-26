package fr.paralax.server.story.antoine;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class AntoineRacoon extends TileFrame {
    public AntoineRacoon() {
        super(UserType.ANTOINE, "24",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "yasuo_alistar.jpg", "",
                "", () -> "");
        redirectMap.put("Je commence a me battre contre la vache de mon Adversaire le président du BDE : LE RACOON" +
                " le combat et rapide et je gagne mais au moment de perdre il me dit : Je porte plus que toi à la salle.", new AntoineChopper());
    }

    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        return ButtonState.UPDATE;
    }
}
