import java.util.Scanner;

public class Variabili {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("dammi un numero");
        int a = scanner.nextInt();
        System.out.println("dammi un secondo numero");
        int b = scanner.nextInt();
        moltiplica(a,b);

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("scrivi un nome");

        String t = scanner1.nextLine();
        System.out.println("scrivi un altro nome");
        String c = scanner1.nextLine();

        stringa("benvenuto " + t , c);
    }

    public static void stringa(String t, String c){
        System.out.println(t+c);
    }

    public static void moltiplica(int a, int b){
        System.out.println(a*b);
    }
}
