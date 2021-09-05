/* ILP506 – Turma Manhã – Nome: Yvo Lourenzo de Castro */
import java.util.Scanner;
import java.util.ArrayList;

public class Ex2{
  
    private static boolean ePrimo(int n) {
     int qtdiv = 0;
     boolean primo;
      for(int cont = 1;cont <= n; cont++){
        if(n % cont == 0) {
           qtdiv++;
        }
      }
    
    if(qtdiv == 2){
      return true;
    }else{
      return false;
    }
} 

public static void main(String[] args){
    Scanner lerTeclado = new Scanner(System.in);
    int n, n2, qtdiv = 0,conta;
    ArrayList<Integer> v = new ArrayList<Integer>();
    System.out.print("Digite o numero Min: ");
    // Variavel Min
    n = lerTeclado.nextInt();
    // Variavel Max
    System.out.print("Digite o número Max:");
    n2 = lerTeclado.nextInt();
     

    for (int cont = n; cont <= n2; cont++){
      if(ePrimo(cont) == true  ) {
           v.add(cont);           
        }
  }
    // ePrimo executa a variavel n
    ePrimo(n);
    System.out.print(ePrimo(n));
    if (ePrimo(n) == true ){
     System.out.print(" , o numero e primo ");
    }
    else {
     System.out.print(" , o numero nao e primo ");
    }
    System.out.print(v);
    
 }
}
