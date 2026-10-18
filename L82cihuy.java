import java.util.Scanner;

public class L82cihuy {
    public static void main(String[] args) {
        // buat ngambil input dari user
        Scanner skenner = new Scanner(System.in);
        System.out.print("Input: N = ");
        int N_nya = skenner.nextInt();
        
        int total_jumlah = 0;
        
        int i = 1;
        while(i <= N_nya){
            if(i % 2 == 0) {
                  // ini genap, ditambahin ke total
                total_jumlah = total_jumlah + i;
            }
            else {
                // ganjil, biarin aja
            }
         i = i + 1; // jangan lupa tambah 1 biar jalan loopingnya
        }
        
        System.out.println("Output: Sum of even numbers = " + total_jumlah);
    }
}