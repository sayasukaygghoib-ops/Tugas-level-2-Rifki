import java.util.Scanner;

public class L8rifkislebew {
    public static void main(String[] args) {
        Scanner skenner = new Scanner(System.in);
        System.out.print("Input: N = ");
        int angka_input = skenner.nextInt();
        
        boolean status_prima = true; // defaultnya dianggep prima dulu
        
        if (angka_input < 2) {
             status_prima = false;
        }
        
        // mulai ngecek pake loop
        int pembagi = 2;
        while(pembagi < angka_input) {
              if (angka_input % pembagi == 0) {
                 status_prima = false; // ternyata bisa dibagi, berarti bukan prima
              }
           pembagi = pembagi + 1;
        }
        
        // bagian print hasil
        if (status_prima == true) {
         System.out.println("Output: " + angka_input + " is a prime number");
        }
        if (status_prima == false) {
             System.out.println("Output: " + angka_input + " is not a prime number");
        }
    }
}