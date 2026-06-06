public class AdultUser implements libraryuser {
    int age;
    String booktype;
    public void registerAccount(){
        if(age > 12){
            System.out.println("You have successfully registered under an Adult Account");
        } else {
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
    }
    public void requestBook(){
        if(booktype == "Fiction"){
            System.out.println("Book Issued successfully, please return the book within 7 days");
        } else {
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    }
}
