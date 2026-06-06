public class LibraryInterfaceDemo {
    public static void main(String args[]){
        System.out.println("Test Case 1");
        KidUsers obj = new KidUsers();
        obj.age = 10;
        obj.registerAccount();
        obj.age = 18;
        obj.registerAccount();
        obj.booktype = "Kids";
        obj.requestBook();
        obj.booktype = "Fiction";
        obj.requestBook();
        System.out.println("Test Case 2");
        AdultUser obj1 = new AdultUser();
        obj1.age = 5;
        obj1.registerAccount();
        obj1.age = 23;
        obj1.registerAccount();
        obj1.booktype = "Kids";
        obj1.requestBook();
        obj1.booktype = "Fiction";
        obj1.requestBook();
    }
}
