public class box3d extends box {
    double h;
    public box3d(double l , double b , double h){
        super(l , b);
        this.h = h;
    }
    public double volume(){
        return l * b * h;
    }
}