package fr.paralax.server.entity.manager;

import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.story.antoine.*;
import fr.paralax.server.story.thomas_b.*;
import fr.paralax.server.story.tom.*;
import fr.paralax.server.story.thomas_h.*;

import java.util.ArrayList;
import java.util.List;

public class TileManager {

    public static List<TileFrame> tileManagerList = new ArrayList<>();

    public static void init() {
        new TomResponse1().init();
        new TomToilette().init();

        new ThomasAsk1().init();
        new ThomasAsk2().init();
        new ThomasAsk3().init();
        new ThomasAsk4().init();
        new ThomasAsk5().init();
        new ThomasAsk6().init();
        new ThomasAsk7().init();
        new ThomasAsk8().init();
        new ThomasAsk9().init();
        new ThomasAsk10().init();
        new ThomasAsk11().init();
        new ThomasAsk12().init();
        new ThomasAsk13().init();
        new ThomasAsk14().init();
        new ThomasAsk14demi().init();
        new ThomasAsk15().init();
        new ThomasAsk16().init();
        new ThomasAsk17().init();
        new ThomasAsk18().init();
        new ThomasAsk19().init();
        new ThomasAsk20().init();
        new ThomasAsk21().init();
        new ThomasAsk22().init();
        new ThomasAsk23().init();
        new ThomasAsk24().init();
        new ThomasAsk25().init();
        new ThomasAsk26().init();
        new ThomasAsk27().init();
        new ThomasAsk28().init();
        new ThomasQuit1().init();
        new ThomasQuit2().init();
        new ThomasQuit3().init();
        new ThomasQuit4().init();
        new ThomasQuit5().init();
        new ThomasQuit6().init();
        new ThomasQuit7().init();
        new ThomasQuit8().init();
        new ThomasStart().init();
        new ThomasGame().init();

        //Antoine
        new AntoineAideVillage().init();
        new AntoineBeauvais().init();
        new AntoineBelet().init();
        new AntoineChopper().init();
        new AntoineChopperLose().init();
        new AntoineChopperWin().init();
        new AntoineDodo().init();
        new AntoineDrunkedOlaf().init();
        new AntoineEpee().init();
        new AntoineEpeeAnime().init();
        new AntoineEpeeDash().init();
        new AntoineEpeeDash2().init();
        new AntoineForetEntree().init();
        new AntoineForetFin().init();
        new AntoineForetMiddle().init();
        new AntoineInconnu().init();
        new AntoineInconnuGentil().init();
        new AntoineInconnuMechant().init();
        new AntoineInscription().init();
        new AntoineMiroir().init();
        new AntoineMiroir2().init();
        new AntoineMonster().init();
        new AntoineMort().init();
        new AntoineRacoon().init();
        new AntoineStart().init();
        new AntoineTom().init();
        new AntoineVictoire().init();
        new AntoineVillageMort().init();
        new AntoineVois().init();
        new AntoineYone().init();
        new AntoineYoneMort().init();
        new AntoineYoneTuer().init();

        //Tom
        new TomAffameCity().init();
        new TomAffameForet().init();
        new TomAffameLake().init();
        new TomAllucination().init();
        new TomChuteLibre().init();
        new TomDefonce().init();
        new TomDefonce1().init();
        new TomDefonce2().init();
        new TomDefonce3().init();
        new TomDefonce4().init();
        new TomEndormi().init();
        new TomEnForet().init();
        new TomFin().init();
        new TomFinMort().init();
        new TomFinVivant().init();
        new TomForet().init();
        new TomForetChampignon().init();
        new TomForetContinue().init();
        new TomForetStart().init();
        new TomLac().init();
        new TomLacStart().init();
        new TomMortExploser().init();
        new TomMortOverdose().init();
        new TomMortTomber().init();
        new TomMortTue().init();
        new TomParachute().init();
        new TomStart().init();
        new TomSuperHero().init();
        new TomVille().init();
        new TomVilleStart().init();

        //Start
        new EndGame().init();
        new EndSecond().init();
        new EndThird().init();
        new SecondStart().init();
        new SelectGame().init();
        new StartGame().init();
    }

    public static TileFrame getFrameFromUUID(String uuid) {
        for (TileFrame tmp : tileManagerList) {
            if (tmp.getUuid().equalsIgnoreCase(uuid)) return tmp;
        }
        return null;
    }

}
