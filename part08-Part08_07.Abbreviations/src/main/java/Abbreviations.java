import java.util.HashMap;

public class Abbreviations {

    HashMap<String, String> abbreviations;
    
    public Abbreviations() {
        abbreviations = new HashMap<String, String>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        if (abbreviation == null) {
            return;
        }

        abbreviation = abbreviation.toLowerCase();
        abbreviation = abbreviation.trim();

        if (abbreviations.containsKey(abbreviation)) {
            System.out.println("Key already exists!");
        } else {
            abbreviations.put(abbreviation, explanation);
        }
    }

    public boolean hasAbbreviation(String abbreviation) {
        if (abbreviations.containsKey(abbreviation)) {
            return true;
        } else {
            return false;
        }
    }

    public String findExplanationFor(String abbreviation) {
        return abbreviations.get(abbreviation);
    }
}
