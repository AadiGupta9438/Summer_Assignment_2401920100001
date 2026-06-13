package live;
import music.playable;
import music.string.veena;
import music.wind.saxophone;
public class test{
    public static void main(String args[]){
        veena obj = new veena();
        obj.play();
        saxophone obj1 = new saxophone();
        obj1.play();
        playable p;
        p = obj;
        p.play();
        p = obj1;
        p.play();
    }
}