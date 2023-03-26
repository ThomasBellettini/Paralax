package fr.paralax.server.story.antoine;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class AntoineInconnuGentil extends TileFrame {
    public AntoineInconnuGentil() {
        super(UserType.ANTOINE, "17",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "inconnu.jpg", "",
                "", () -> "");
        redirectMap.put("L'inconnu me raconte sa vie et m'apprend que des grosses pointures d'Epitech Nancy vont s'affronter dans un tournoi" +
                " dans la ville de beauvais. Il me propose de m'accopagner jusque la ville et j'accepte.", new AntoineBeauvais());
    }

    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        return ButtonState.UPDATE;
    }
}
