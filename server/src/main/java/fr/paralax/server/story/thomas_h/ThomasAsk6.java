package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;

public class ThomasAsk6 extends TileFrame {

    public ThomasAsk6() {

        super(UserType.THOMAS_H, "16",
                TileResponseType.RESPONSE, new HashMap<>(),
                "crash_choquer", "",
                "", () -> "");
            redirectMap.put("Dans le miroir, un personnage orange apparaît", null);
            redirectMap.put("Regarder ses mains", new ThomasAsk9());
            redirectMap.put("S'approcher du miroir", new ThomasAsk7());
            redirectMap.put("Fuir", new ThomasAsk8());
    }
}
