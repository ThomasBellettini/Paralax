package fr.paralax.server.story.chopper;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;
import java.util.HashMap;
public class NagzormQuizzSuccess extends TileFrame {
    public NagzormQuizzSuccess() {
        super(UserType.CHOPPER, "23",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("Bien joué, tu as reussi toutes les épreuves, je te fais don de ma force, <nline> ma bénédiction est tienne", new TrainingEnded());
}
    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;
        return ButtonState.UPDATE;
    }
}
