import java.io.*;

public class VisitorFile implements Visitor{

    BufferedWriter br;
    public VisitorFile() {
        try {
            br = new BufferedWriter(new FileWriter("testino.txt", true));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void closeBR(){
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void visitTelefono(Phone p) {
        try {
            br.append(p.getMarca()).append(" ").append(p.getNome()).append(" ").append(String.valueOf(p.getPeso())).append(p.getNumero()).append(" Phone");
            br.append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void visitCassa(Cassa c) {
        try {
            br.append(c.getMarca()).append(" ").append(c.getNome()).append(" ").append(String.valueOf(c.getPeso())).append((char) c.getBattery()).append(" Cassa");
            br.append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void visitPBAukey(PBAukey pb) {
        try {
            br.append(pb.getMarca()).append(" ").append(pb.getNome()).append(" ").append(String.valueOf(pb.getPeso())).append(pb.getSponsor()).append(" Phone");
            br.append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
