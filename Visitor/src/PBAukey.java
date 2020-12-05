public class PBAukey extends Device{


    String sponsor;
    public PBAukey(String nome){
        this.nome = nome;
        peso = 1.0f;
        marca = "Aukey";
        sponsor = "Daniele";
        azione();
    }

    public String getSponsor() {
        return sponsor;
    }

    @Override
    public void azione() {
        System.out.println("E che ti devo dire");
    }

    @Override
    public void accept(Visitor v) {
        v.visitPBAukey(this);
    }
}
