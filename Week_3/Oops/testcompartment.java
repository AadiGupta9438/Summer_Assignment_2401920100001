import java.util.*;
public class testcompartment {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        compartment arr[] = new compartment[10];
        for(int i = 0 ; i < 10 ; i++){
            System.out.println("Enter no.(1-4) for compartment");
            int n = sc.nextInt();
            switch(n){
                case 1:
                    arr[i] = new firstclass();
                    break;
                case 2:
                    arr[i] = new ladies();
                    break;
                case 3:
                    arr[i] = new general();
                    break;
                case 4:
                    arr[i] = new luggage();
                    break;
            }
        }
        System.out.println("Compartments");
        for(int i = 0 ; i < 10 ; i++){
            System.out.println(arr[i].notice());
        }
    }
}