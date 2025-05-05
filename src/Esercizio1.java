import java.util.Scanner;

public class Esercizio1 {
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

        String[] array = {"primo","secondo","terzo","quarto","quinto"};
        String nuova = "sesto";

        String[] risultato = inseriamoTerzoPosto(array,nuova);

        for (String s : risultato){
            System.out.println(s + " ");
        }


    }

    public static String[] inseriamoTerzoPosto(String[]arrayOriginal,String nuovaStringa ){
        String[] nuovoArray = new String[6];

        nuovoArray[0] = arrayOriginal[0];
        nuovoArray[1] = arrayOriginal[1];
        nuovoArray[2] = nuovaStringa;
        nuovoArray[3] = arrayOriginal[2];
        nuovoArray[4] = arrayOriginal[3];
        nuovoArray[5] = arrayOriginal[4];

        return nuovoArray;

    }



    public static void stringa(String t, String c){
        System.out.println(t+c);
    }

    public static void moltiplica(int a, int b){
        System.out.println(a*b);
    }
}
