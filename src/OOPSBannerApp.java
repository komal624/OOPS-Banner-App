public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] bannerLines = {
                "OOOOO   OOOOO   PPPPP   SSSSS",
                "O   O   O   O   P   P   S",
                "O   O   O   O   PPPPP   SSSSS",
                "O   O   O   O   P       S",
                "OOOOO   OOOOO   P       SSSSS"
        };

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
