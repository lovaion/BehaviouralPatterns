import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Device> cose = new ArrayList<>();
        Device d = new Phone("A");
        Device c = new Cassa("B");
        Device pb = new PBAukey("Buonissimo");
        Visitor v = new VisitorInformazioni();
        VisitorFile vFile = new VisitorFile();
        cose.add(d);
        cose.add(c);
        cose.add(pb);

        for (Device device : cose) {
            device.accept(v);
        }

        for (Device device : cose) {
            device.accept(vFile);
        }

        vFile.closeBR();




    }
}
