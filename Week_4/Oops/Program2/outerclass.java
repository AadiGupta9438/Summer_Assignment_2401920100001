public class outerclass {
    void display(){
        System.out.println("outer class");
    }
    class inner{
        void display(){
            System.out.println("inner class");
        }
    }
    public static void main(String args[]){
        outerclass obj = new outerclass();
        obj.display();
        outerclass.inner obj1 = obj.new inner();
        obj1.display();
    }
}