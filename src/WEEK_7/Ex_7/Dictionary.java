package WEEK_7.Ex_7;
import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> translations;

    public Dictionary() {
        this.translations = new HashMap<>();
    }

    public void add(String word, String translation) {
        translations.put(word, translation);
    }

    public String translate(String word) {
        return translations.get(word);
    }

    public int amountOfWords(){
        return translations.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> list = new ArrayList<>();
        for (String word : translations.keySet()) {
            String translation = translations.get(word);
            list.add(word + " = " + translation);
        }
        return list;
    }
}

