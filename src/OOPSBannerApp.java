import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {
        renderWord("OOPS");
    }

    // Renders any word using character patterns stored in a Map
    static void renderWord(String word) {
        Map<Character, String[]> patterns = getPatterns();

        for (int row = 0; row < 5; row++) {
            for (char ch : word.toCharArray()) {
                System.out.print(patterns.get(ch)[row] + "   ");
            }
            System.out.println();
        }
    }

    // Stores patterns for each character
    static Map<Character, String[]> getPatterns() {
        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                "OOOOO",
                "O   O",
                "O   O",
                "O   O",
                "OOOOO"
        });

        map.put('P', new String[]{
                "PPPPP",
                "P   P",
                "PPPPP",
                "P",
                "P"
        });

        map.put('S', new String[]{
                "SSSSS",
                "S",
                "SSSSS",
                "    S",
                "SSSSS"
        });

        return map;
    }
}
