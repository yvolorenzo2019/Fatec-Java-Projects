/* ILP506 – Turma Manhã – Nome: Yvo Lourenzo de Castro */
import java.util.Scanner;
import java.util.ArrayList;

public class Ex4 {
  public static void main(String[] args){
  int n,number1 = 1,number2 = 0,auxiliar;
  Scanner lerTeclado = new Scanner(System.in);
  System.out.print("Digite um inteiro ");
  n = lerTeclado.nextInt();
  for (int cont = 0; cont < n; cont++){
      System.out.print(number1+","); 
      auxiliar = number1;
      number1 = number1 + number2;
      number2 = auxiliar;
  }
}
}