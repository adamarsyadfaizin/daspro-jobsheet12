import java.util.Scanner;

public class TugasNo2 {
    static int Hitung(int f,int[]bilangan) {
        if (f >= 0) {
            for(int i = 0;i <= f;i++) {
                bilangan[i] = i;
            }
            for(int i = 0;i <= f;i++) {
                f += bilangan[i];
            }
        } else {
            return(f * Hitung(f-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan(f) : ");
        int banyak = sc.nextInt();
        Hitung(banyak);
        System.out.println(f);
    }
}