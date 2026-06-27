public class point {
    private int x;
    private int y;
    public point(){
        x = 0;
        y = 0;
    }
    public point(int x , int y){
        this.x = x;
        this.y = y;
    }
    public void setx(int x){
        this.x = x;
    }
    public void sety(int y){
        this.y = y;
    }
    public void setxy(int x , int y){
        this.x = x;
        this.y = y;
    }
    public void disp(){
        System.out.println("x :" + x);
        System.out.println("y :" + y);
    }
    public static void main(String args[]){
        point obj = new point();
        obj.disp();
        obj.setx(10);
        obj.sety(90);
        obj.disp();
        point obj1 = new point(50 , 50);
        obj1.disp();
        obj1.setxy(40 , 60);
        obj1.disp();
    }
}
