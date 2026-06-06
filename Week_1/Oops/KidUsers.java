public class KidUsers implements libraryuser {
    int age;
    String booktype;
    public void registerAccount(){
        if(age > 12){
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        } else {
            System.out.println("You have successfully registered under a Kids Account");
        }
    }
    public void requestBook(){
        if(booktype == "Kids"){
            System.out.println("Book Issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}
