package live;
import music.Playable;
import music.Veena;
import music.wind.Saxophone;
public class VeenaTest {
    public static void main(String[] args) {
        Veena veena = new Veena();
        Saxophone saxophone = new Saxophone();
        veena.play();
        saxophone.play();

    }
}
