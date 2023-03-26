package fr.paralax.server.langage;

import java.util.HashMap;
import java.util.Map;

public class LanguageUtils {

    private static Map<String, String> dictionary = new HashMap<>() {{
        put("<nline>", "</br>");
        put("<color:\"", "<span style=\"color: ");
        put("</color>", "</span>");
    }};

    public static String translate(final String original) {
        String translated = original;
        for (final String key : dictionary.keySet())
            translated = translated.replace(key, dictionary.get(key));
        return translated;
    }

}
