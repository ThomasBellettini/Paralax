package fr.paralax.server.entity;

import fr.paralax.server.entity.manager.TileManager;
import fr.paralax.server.entity.story.Story;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

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
    protected Map<String, String> _secret;

    public TileFrame(UserType userType, String uuid, TileResponseType responseType, Map<String, TileFrame> redirectMap, String pictureBackground, String pictureProtagonist, String pictureAntagonist, ResponseGenerator htmlContent) {
        this.uuid = userType.prefix + uuid;
        this.responseType = responseType;
        this.redirectMap = redirectMap;
        this.pictureBackground = pictureBackground;
        this.pictureProtagonist = pictureProtagonist;
        this.pictureAntagonist = pictureAntagonist;
        this.htmlContent = htmlContent.htmlContent();
        this._secret = new HashMap<>();
    }

    public String getHtmlContent() {
        return (this.htmlContent.isEmpty() ? "" : htmlContent);
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

    public String generateButton() {

        if (this.responseType == TileResponseType.DISCUSSION) {
            if (!redirectMap.isEmpty())
                return String.format("<p class=\"text-center\">%s</p>" +
                        "<button onclick=\"updateThisPageUwU(\'%s\');\" class=\"btn btn-primary\" style=\"margin: 5px;\" button_text=\"Continuer\">Continuer</button>", redirectMap.keySet().toArray()[0], getFromButtonString(redirectMap.keySet().toArray()[0].toString()));
            else return "";
        } else {
            StringBuilder descriptor = new StringBuilder();
            StringBuilder stringBuilder = new StringBuilder();
            for (final String content : redirectMap.keySet()) {
                final TileFrame frame = redirectMap.get(content);
                if (frame == null) descriptor.append(String.format("<p class=\"text-center\">%s</p>", content));
                else stringBuilder.append("<button onclick=\"updateThisPageUwU(\'"+ getFromButtonString(content) +"\');\" class=\"btn btn-danger\" style=\"margin: 5px;\" button_text=\"" + content + "\">" + content + "</button>");
            }
            return descriptor.append(stringBuilder).toString();
        }
    }

    public String getFromButtonString(String str) {
        for (final String find : _secret.keySet()) {
            if (_secret.get(find).equals(str))
                return find;
        }
        return null;
    }

    public String getFromButtonUUID(String uuid) {
        if(_secret.containsKey(uuid)) return _secret.get(uuid);
        return "";
    }

    public void init() {
        for (final String convert : redirectMap.keySet())
            _secret.put(UUID.randomUUID().toString(), convert);
        TileManager.tileManagerList.add(this);
    }
}
