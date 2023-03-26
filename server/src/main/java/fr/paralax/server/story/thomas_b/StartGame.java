package fr.paralax.server.story.thomas_b;

import fr.paralax.server.entity.TileFrame;

import java.util.HashMap;

public class StartGame extends TileFrame {

    public StartGame () {
        super(UserType.THOMAS_B, "start",
        TileResponseType.DISCUSSION, new HashMap<>(),
                "", "",
                "", () -> "");
            redirectMap.put("Il est deux heures du matin et notre histoire débute en salle association à <color=\"blue\">Epitech</color>," +
                    "les 6 personnes présentes, ont du retard sur leur projet que ce soit l'arcade pour certain, le teams pour d'autres ou encore le rattrapage pour l'un d'eu, ils vont bientôt devoir faire un choix car l'heure n'est plus au travail...", new SecondStart());
    }

}
