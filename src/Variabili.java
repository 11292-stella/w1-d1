import java.util.Scanner;

public class Variabili {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("dammi un numero");
        int a = scanner.nextInt();
        System.out.println("dammi un secondo numero");
        int b = scanner.nextInt();
        moltiplica(a,b);

        String t = "benvenuto";
        t = t + " Topo Gigio";
        System.out.println(t);
    }

    public static void moltiplica(int a, int b){
        System.out.println(a*b);
    }
}
