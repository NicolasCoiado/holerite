import java.util.Scanner;

public class Holerite {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("EXERCÍCIO 15");
        System.out.println("Digite o valor de seu salário:");
        double salario = Double.parseDouble(scanner.next());
        double impostoDeRenda = (salario*11)/100;
        double inss = (salario*8)/100;
        double sindicato = (salario*5)/100;
        double bruto = salario - impostoDeRenda - inss - sindicato;
        System.out.println("+ Salário Bruto : R$" + salario);
        System.out.println("- IR (11%): R$" + impostoDeRenda);
        System.out.println("- INSS (8%) : R$" + inss);
        System.out.println("- Sindicato (5%) : R$" + sindicato);
        System.out.println("= Salário Líquido : R$"+ bruto);
        System.out.println("=====================================");
    }
}
