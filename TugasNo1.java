import java.util.Scanner;

public class TugasNo1 {

    static int Iteratif(int n) {
        for(int i = n;i >= 0;i--) {
            System.out.println(i);
        }
        return(n);
    }
    static int Rekursif(int n) {
        if (n < 0) {
            return(n-n);
        } else {
            return(n * Rekursif(n- 1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Berapa banyak n? : ");
        int bnykN = sc.nextInt();
        Rekursif(bnykN);
        Iteratif(bnykN);
    }
}