public class Phone extends Device {

    String numero;
    public Phone(String nome) {
        this.nome = nome;
        peso = 1.0f;
        marca = "Aukey";
        numero = "389599313";
        azione();
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public void azione() {
        System.out.println("Telefono acceso. Compra da aukey");
    }

    @Override
    public void accept(Visitor v) {
        v.visitTelefono(this);
    }
}
