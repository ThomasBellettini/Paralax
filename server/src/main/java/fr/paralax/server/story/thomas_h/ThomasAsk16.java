package fr.paralax.server.story.thomas_h;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;
import java.util.Map;

public class ThomasAsk16 extends TileFrame {

    public ThomasAsk16() {

        super(UserType.THOMAS_H, "116",
                TileResponseType.RESPONSE, new HashMap<>(),
                "", "",
                "", () -> "");
            redirectMap.put("Vous vous rendez compte que vos cheveux sont differents, vous vous touchez les joues.<nline>Des poils, vous avez les joues poilues.<nline>En palpant tout votre corps, vous vous rendez compte que vous avez des poils partout et un grand nez.", null);
            redirectMap.put("Hurler", new ThomasAsk17());
            redirectMap.put("Observer le paysage", new ThomasAsk19());
    }
}
