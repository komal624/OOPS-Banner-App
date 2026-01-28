public class OOPSBannerApp {

    public static void main(String[] args) {
        renderBanner();
    }

    static void renderBanner() {
        for (String line : new String[]{
                "OOOOO   OOOOO   PPPPP   SSSSS",
                "O   O   O   O   P   P   S",
                "O   O   O   O   PPPPP   SSSSS",
                "O   O   O   O   P       S",
                "OOOOO   OOOOO   P       SSSSS"
        }) {
            printLine(line);
        }
    }

    static void printLine(String line) {
        System.out.println(line);
    }
}


