package fr.paralax.server.story.thomas_b;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;

public class SecondStart extends TileFrame {

    public SecondStart () {
        super(UserType.THOMAS_B, "2",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("Le sol se mit à trembler, un bruit sourd vient de résonner, et d'un coup plus rien, le noir total.", new SelectGame());
    }
}
