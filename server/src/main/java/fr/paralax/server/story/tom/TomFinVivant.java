package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;

public class TomFinVivant extends TileFrame {
    public TomFinVivant() {
        super(UserType.TOM, "32",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("il s'approche d'un mirroir et voit son reflet..", null); //TODO: End
    }
}
