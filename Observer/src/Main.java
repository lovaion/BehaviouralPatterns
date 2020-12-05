public class Main {
    public static void main(String[] args) {

        Canale sabaku = new Canale();
        Iscritto simone = new IscrittoInteressato();
        Iscritto alex = new Hater();

        sabaku.addIscritto(simone);
        sabaku.addIscritto(alex);

        sabaku.addVideo("L'anima di dio: aia");
        sabaku.removeVideo();
    }
}
