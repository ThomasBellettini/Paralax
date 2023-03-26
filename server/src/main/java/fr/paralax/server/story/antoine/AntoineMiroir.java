package fr.paralax.server.story.antoine;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;

public class AntoineMiroir extends TileFrame {
    public AntoineMiroir() {
        super(UserType.ANTOINE, "20",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "yasuo_mirroir.png", "",
                "", () -> "");
    redirectMap.put("Je remarque m'être transformé en tant que Yasuo, personnage de LoL" +
            "et que je porte un katana à ma ceinture.", new AntoineMiroir2());
    }

    @Override
    public ButtonState onClickOnButton(Story story, String string) {
        ButtonState state = super.onClickOnButton(story, string);
        if (state == ButtonState.ERROR) return state;

        return ButtonState.UPDATE;
    }
}
