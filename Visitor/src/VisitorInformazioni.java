public class VisitorInformazioni implements Visitor {
    @Override
    public void visitTelefono(Phone p) {
        System.out.println(p.getMarca() + " " + p.getNome() + " " + p.getPeso() + p.getNumero() + " Phone");
    }

    @Override
    public void visitCassa(Cassa c) {
        System.out.println(c.getMarca() + " " + c.getNome() + " " + c.getPeso() + c.getBattery() + "C assa");
    }

    @Override
    public void visitPBAukey(PBAukey pb) {
        System.out.println(pb.getMarca() + " " + pb.getNome() + " " + pb.getPeso() + pb.getSponsor() + " PB AUKEY");
    }


}
