import java.util.Scanner;
import java.util.Locale;


public class AboutMe {

    //Criando um objeto Scanner
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();


        System.out.println("Olá, meu nome é " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " cm.");

    }

   /* public static void main(String[] args){
        //Os argumentos começam com indice 0
        String nome = args [0];
        String sobreNome = args [1];
        int idade = Integer.valueOf(args [2]);
        double altura = Double.valueOf(args [3]);
        
    System.out.println("Olá, meu nome é " + nome + " " + sobreNome);
    System.out.println("Tenho " + idade + " anos");
    System.out.println("Minha altura é " + altura + " cm.");*/

        /*Abrindo no PowerShell
         * 
         * É possivel inserir as informações do usuário
         * 
         */

}