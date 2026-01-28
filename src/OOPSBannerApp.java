public class OOPSBannerApp {

    public static void main(String[] args) {
        renderBanner();
    }

    static void renderBanner() {
        for (String line : BannerPattern.PATTERN) {
            printLine(line);
        }
    }

    static void printLine(String line) {
        System.out.println(line);
    }

    // Nested static class to store banner pattern
    static class BannerPattern {
        static final String[] PATTERN = {
                "OOOOO   OOOOO   PPPPP   SSSSS",
                "O   O   O   O   P   P   S",
                "O   O   O   O   PPPPP   SSSSS",
                "O   O   O   O   P       S",
                "OOOOO   OOOOO   P       SSSSS"
        };
    }
}


