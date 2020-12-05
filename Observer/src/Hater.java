public class Hater implements Iscritto{
    @Override
    public void update(String accaduto) {
        System.out.println("Hater: ");
        if (accaduto.contains("rimosso"))
            System.out.println("BENBATA GODO");
        else if (accaduto.contains("aggiunto"))
            System.out.println("BASTARDO");
    }
}
