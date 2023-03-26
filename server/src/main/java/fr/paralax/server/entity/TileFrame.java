package fr.paralax.server.entity;

import fr.paralax.server.entity.manager.TileManager;
import fr.paralax.server.entity.story.Story;

import java.util.Map;

public class TileFrame {

    public enum ButtonState {
        REDIRECTION,
        ERROR,
        UPDATE
    }

    public interface ResponseGenerator {
        String htmlContent();
    }

    public enum TileResponseType {
        DISCUSSION,
        RESPONSE
    }

    public enum UserType {
        TOM("tom"),
        CHOPPER("chopper"),
        ANTOINE("antoine"),
        THOMAS_H("thomash"),
        THOMAS_B("thomasb");

        protected String prefix;

        UserType(String prefix) {
            this.prefix = prefix;
        }
    }

    protected String uuid;
    protected TileResponseType responseType;
    protected Map<String, TileFrame> redirectMap;
    protected String pictureBackground;
    protected String pictureProtagonist;
    protected String pictureAntagonist;
    protected String htmlContent;

    public TileFrame(UserType userType, String uuid, TileResponseType responseType, Map<String, TileFrame> redirectMap, String pictureBackground, String pictureProtagonist, String pictureAntagonist, ResponseGenerator htmlContent) {
        this.uuid = userType.prefix + uuid;
        this.responseType = responseType;
        this.redirectMap = redirectMap;
        this.pictureBackground = pictureBackground;
        this.pictureProtagonist = pictureProtagonist;
        this.pictureAntagonist = pictureAntagonist;
        this.htmlContent = htmlContent.htmlContent();
    }

    public String getHtmlContent() {

        if (this.htmlContent.isEmpty()) {

            return String.format(
                    "<p>%s</p>", this.uuid
            );

        } else return this.htmlContent;
    }

    public String generateButton() {
        return ""; //TODO: Need
    }

    public String getUuid() {
        return uuid;
    }

    public TileResponseType getResponseType() {
        return responseType;
    }

    public Map<String, TileFrame> getRedirectMap() {
        return redirectMap;
    }

    public String getPictureBackground() {
        return pictureBackground;
    }

    public String getPictureProtagonist() {
        return pictureProtagonist;
    }

    public String getPictureAntagonist() {
        return pictureAntagonist;
    }

    public ButtonState onClickOnButton(Story story, String button) {
        if (story == null) return ButtonState.ERROR;
        return ButtonState.UPDATE;
    }

    public void updateRedirection(Story story, String button) {
        if (redirectMap.containsKey(button)) {
            story.setTileSaved(redirectMap.get(button).uuid);
        }
    }

    public void init() {
        TileManager.tileManagerList.add(this);
    }
}
