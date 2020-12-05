import java.util.ArrayList;
import java.util.Stack;

public class Canale {


    ArrayList<Iscritto> iscritti;
    StackAlex listaVideo;


    public Canale() {
        this.iscritti = new ArrayList<>();
        this.listaVideo = new StackAlex(this);
    }

    public void addIscritto(Iscritto iscritto){
        iscritti.add(iscritto);
    }

    public void removeIscritto(Iscritto iscritto){
        iscritti.remove(iscritto);
    }

    public void addVideo(String nome){
        listaVideo.push(nome);
    }

    public void removeVideo(){
        listaVideo.pop();
    }

    public void update(String accaduto) {
        for (Iscritto iscritto : iscritti) {
            iscritto.update(accaduto);
        }
    }
}
