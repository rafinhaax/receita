import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ponto= 0;

        System.out.printf("Vamos ver se você é um bom(a) Namorado(a), responda com s ou n .");

        System.out.printf("Vocês costumam sair sozinhos?");
        String resp1 = scanner.next();
        if (resp1.equals("s")){
            ponto ++;
        }

        System.out.printf("Vocês costumam ter um momentinho para fazer coisas que gostam?");
        String resp2 = scanner.next();
        if (resp2.equals("s")){
            ponto ++;
        }

        System.out.printf("Há reciprocidade nas ações e esforços para manter o relacionamento?");
        String resp3 = scanner.next();
        if (resp3.equals("s")){
            ponto ++;
        }

        System.out.printf("Vocês costumam falar os sentimentos que sentem um para o outro?");
        String resp4 = scanner.next();
        if (resp4.equals("s")){
            ponto ++;
        }

        System.out.printf("Vocês saem juntos?");
        String resp5 = scanner.next();
        if (resp5.equals("s")){
            ponto ++;
        }

        System.out.printf("Você se sente amado e valorizado nesta relação?");
        String resp6 = scanner.next();
        if (resp6.equals("s")){
            ponto ++;
        }

        System.out.printf("Seu parceiro(a) respeita suas opiniões e ouve o que você tem a dizer?");
        String resp7 = scanner.next();
        if (resp7.equals("s")){
            ponto ++;
        }

        System.out.printf("Vocês têm objetivos e valores semelhantes?");
        String resp8 = scanner.next();
        if (resp8.equals("s")){
            ponto ++;
        }

        System.out.printf("Há confiança e comunicação aberta entre vocês? ");
        String resp9 = scanner.next();
        if (resp9.equals("s")){
            ponto ++;
        }

        System.out.printf("Vocês conseguem resolver conflitos de maneira saudável?");
        String resp10 = scanner.next();
        if (resp10.equals("s")){
            ponto ++;
        }

        System.out.printf("Seu parceiro(a) respeita seus limites e espaço pessoal?");
        String resp11 = scanner.next();
        if (resp11.equals("s")){
            ponto ++;
        }

        System.out.printf("Seu parceiro(a) demonstra interesse em seu bem-estar e felicidade?");
        String resp12 = scanner.next();
        if (resp12.equals("s")){
            ponto ++;
        }

        if (ponto >=10 ){
            System.out.println("Você parece ser meu homem");
        }
        else {
            System.out.println("Vamos responder mais algumas perguntinhas");
        }
        int p = 0;
        if (ponto >=10 ){
        System.out.println("Você é o meu namorado?");}
        String res = scanner.next();
        if (res.equals("s")){
            p ++;
        }
        if (p<=1){
        System.out.println("Você sabia que tem a melhor namorada do mundo?");}
        String ress = scanner.next();
        if (ress.equals("s")){
            p ++;
        }
        System.out.println("Vamos casar?");
        String ress1 = scanner.next();
        if (ress1.equals("s")){
            p ++;
        }
        if (p >=3 ){
            System.out.println("Muito bom, sua namorada é ótima ");
        }else {
            System.out.println("Desculpa pelo engno");
        }

        int pont = 0;
        System.out.println("Você precisa de ajuda?");
        String res1 = scanner.next();
        if (res1.equals("s")){
            pont ++;
        }
        System.out.println("Você corre algum risco?");
        String res2 = scanner.next();
        if (res2.equals("s")){
            pont ++;
        }
        System.out.println("Você já sofreu algum tipo de agressão dele(a)?");
        String res3 = scanner.next();
        if (res3.equals("s")){
            pont ++;
        }
        System.out.println("Ele(a) já levanatou o tom de voz para você");
        String res4 = scanner.next();
        if (res4.equals("s")){
            pont ++;
        }

        if (pont >=3 ){
            System.out.println("Muito preocupante seu caso, ligue 190");
        }
        else {
            System.out.println("Ta tranquilo, foi só um mal entendido");
        }
        scanner.close();
        }
    }
