import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
class receita{}
        Scanner scanner = new Scanner(System.in);
       System.out.println("Vamos transformar xícaras em gramas para nossa receita?");
        System.out.println(" Digite quantas xícaras precisa ");
        float xic = scanner.nextInt();
        float tots = xic * 150;
//       System.out.println("Vamos precisar de "+tots+ " gramas para fazer nossa receita");
if (tots >= 1000){
    System.out.println("Vamos usar " + tots/1000 + " KG");
}
else {
    System.out.println("Vamos usar " + tots+ " gramas");
}
System.out.println("Vamos ver quantos ovos vamos usar de acordo com a quantidade de farinha,");
      int ovo = (int) (xic * 2);
        System.out.println("Vamos usar " + ovo + " ovos");


        System.out.println("vamos ver quantos litros de leite: ");
        int leite = (int) (tots/150);
        System.out.println("Vamos precisar de " +leite+" de leite");


        System.out.println("vamos ver quantas gramas de fermento você precisa: ");
        int fer = (int) (xic*10);
        System.out.println("Você vai precisar de " +fer+" gramas de fermento");

        System.out.println("Vamos ver alguns detalhes do bolo,qual seria o sabor? ");
        System.out.println("Se for chocolate vote 1 ");
        System.out.println("Se for morango vote 2 ");
        System.out.println("Se for baunilha vote 3 ");
        System.out.println("Se for leite ninho vote 4 ");
        int sab = scanner.nextInt();
        if (sab == 1 || sab == 2 ){
            System.out.println("O seu bolo  "+  "Precisa de chocolates ou frutas");
        }
        else { System.out.println("Vamos precisar de baunilha ou leite ninho");
        }
        scanner.close();

    }
    }
