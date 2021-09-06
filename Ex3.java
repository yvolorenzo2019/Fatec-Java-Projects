/* ILP506 – Turma Manhã – Nome: Yvo Lourenzo de Castro */
import java.util.Scanner;
import java.util.ArrayList;

public class Ex3 {
    private static int modulo7(int num) {
     int unidade,dezena,centena,unidMilhar,dezMilhar,somaRes,verificador;
        dezMilhar = num/10000 * 2;
        unidMilhar = (num%10000)/1000 * 3;
        centena = (num%1000)/100 * 4;
        dezena = (num%100)/10 * 5;
        unidade = num%10 * 6;
        somaRes = dezMilhar + unidMilhar + centena + dezena + unidade;
        verificador = somaRes % 7;
        return verificador;
    }
    public static void main(String[] args){
    Scanner lerTeclado = new Scanner(System.in);
    int num;
    System.out.print("Digite o numero: ");
    num = lerTeclado.nextInt();
    
    if ( num > 99999){
     System.out.print("O numero e maior que 5 digitos");
    }
    else {
     System.out.print("O digito verificador eh "+modulo7(num));
    }
   }
}
