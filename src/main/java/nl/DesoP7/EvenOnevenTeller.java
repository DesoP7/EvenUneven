package nl.DesoP7;

import java.util.HashMap;

public class EvenOnevenTeller {
    public static void main(String[] args) {
        int[] getallen = {42, 67, 35, 89, 24, 76, 58, 93, 7, 30, 83, 46, 13, 25, 98, 53, 17, 79, 57, 8};

        // HashMap om de telling op te slaan
        HashMap<String, Integer> telling = new HashMap<>();

        // Initialiseer de tellingen voor "even" en "oneven"
        telling.put("even", 0);
        telling.put("oneven", 0);

        // Itereer door de array van getallen
        for (int getal : getallen) {
            if (getal % 2 == 0) {
                telling.put("even", telling.get("even") + 1);
            } else {
                telling.put("oneven", telling.get("oneven") + 1);
            }
        }

        System.out.println("Aantal even getallen: " + telling.get("even"));
        System.out.println("Aantal oneven getallen: " + telling.get("oneven"));
    }
}
