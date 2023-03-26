package fr.paralax.server.story.thomas_b;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;

public class EndThird extends TileFrame {

    public EndThird () {
        super(UserType.THOMAS_B, "5",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
        redirectMap.put("au final ... ce rêve était plus que réel mais n'était ce qu'un rêve ou une experience vécue par 6 personnes ... après tout les rêves sont un parallele à la vie ...", new StartGame());
    }


}
