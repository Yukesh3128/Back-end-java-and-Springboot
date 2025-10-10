import java.util.Scanner;
class scanner{
    public static void main(String[] args) {
        Scanner uks = new Scanner(System.in);
        System.out.println("Enter the A value");
        int a=uks.nextInt();
         System.out.println("Enter the B value");
        int b=uks.nextInt();
        System.out.println("Largest: " +(a>b?"A is biggest number":"B is biggest number"));
    }
}