package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;
import java.util.Map;

public class ThomasAsk10 extends TileFrame {

    public ThomasAsk10() {

        super(UserType.THOMAS_H, "110",
                TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
            redirectMap.put("En vous retournant vous voyez trois jetons par terre, vous les ramassez et une voix vous chuchotte \"téléportation dans une zone bonus\"", new ThomasGame());
    }
}
