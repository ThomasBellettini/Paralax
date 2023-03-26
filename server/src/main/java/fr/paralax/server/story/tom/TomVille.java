package fr.paralax.server.story.tom;

import fr.paralax.server.entity.TileFrame;

public class TomVille extends TileFrame {

        public TomVille() {
            super(UserType.TOM, "5",
                    TileResponseType.DISCUSSION, null,
                    "", "",
                    "", () -> "");
        }
}
