package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;

public class TomForetChampignon extends TileFrame {
    public TomForetChampignon() {
        super(UserType.TOM, "40",
                TileResponseType.DISCUSSION, null,
                "", "",
                "", () -> "");
        redirectMap.put("mmmh miam miam une vrai régalade", new TomDefonce());
    }
}
