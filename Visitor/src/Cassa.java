public class Cassa  extends Device{

    float battery;

    public Cassa(String nome){
        this.nome = nome;
        peso = 1.0f;
        marca = "Aukey";
        battery = 90f;
        azione();
    }

    public float getBattery() {
        return battery;
    }

    @Override
    public void azione() {
        System.out.println("Cassa accesa, lol");
    }

    @Override
    public void accept(Visitor v) {
        v.visitCassa(this);
    }
}
