public class boxtest {
    public static void main(String args[]){
        box obj = new box(5 , 7);
        System.out.println("area :" + obj.area());
        box3d obj1 = new box3d(5, 7, 9);
        System.out.println("volume :" + obj1.volume());
    }
}
