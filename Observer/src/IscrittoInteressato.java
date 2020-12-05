public class IscrittoInteressato implements Iscritto {


    @Override
    public void update(String accaduto) {
        System.out.println("Interessato: ");
        if (accaduto.contains("rimosso"))
            System.out.println("AH CHE PALLE");
        else if (accaduto.contains("aggiunto"))
            System.out.println("AH CHE BELLO ME LO VADO A VEDERE");
    }
}
