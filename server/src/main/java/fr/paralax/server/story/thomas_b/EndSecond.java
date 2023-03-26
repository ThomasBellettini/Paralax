package fr.paralax.server.story.thomas_b;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;

public class EndSecond extends TileFrame {

    public EndSecond () {
        super(UserType.THOMAS_B, "dzf5",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("Notre protagoniste émmerge de sa perte de connaissance, les 6 personnes n'ont jamais bougé, on peut d'ailleurs entendre quelqu'un frapper la porte de manière violente, il était 6h c'était l'équipe de maintenance ... tous cela n'était qu'un rêve?", new EndThird());
    }

}
