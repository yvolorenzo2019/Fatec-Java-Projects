/* ILP506 – Turma Manhã – Nome: Yvo Lourenzo de Castro */
import java.util.Scanner;

public class Ex1 {
    public static void main(String[]args){
    
      Scanner entrada = new Scanner(System.in);
      System.out.println("Digite um numero: ");
      int num = entrada.nextInt();
      
      int qtdiv = 0;
      System.out.println(" O numero " + num + "possui os seguintes divisores:");
      for(int cont = 1;cont <= num; cont++){
        if(num % cont == 0) {
           qtdiv++;
           System.out.println(cont);
        }
      }
    
    if(qtdiv == 2){
      System.out.println("\n O numero "+num+" eh primo !");
    }else{
      System.out.println("\n O numero "+num+" nao eh primo !");
    }
    
    }
}