/*
package test;

import java.util.Scanner;

public class Test_01 {

     public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int minutos = sc.nextInt();

        double conta = 50.0;
        if (minutos > 100) {
            conta = conta + (minutos - 100) * 2.0;
        }

        System.out.printf("Valor da conta = R$ %.2f%n", conta);

        sc.close();
    }

}

    
#GEROU ERRO E NÃO FOI EFETUADO -- TERMINAR DEPOIS




package test;

import java.util.Scanner;

public class Test_01 {
    
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantas parcelas foram divididas para calcular o valor: ");
        int parcelas = sc.nextInt(); 
        int total = 0;
        
        for (int i = 0; i < parcelas; i = i + 1) {
            System.out.print("Parcela número " + i + " " );
            total = total + 1000;
            System.out.println(total);
        }
        System.out.println("Total a pagar: " + total + "Reais.");
        sc.close();


    }

}

package test;

import java.util.Scanner;

public class Test_01 {
    
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Quem é você: ");
        String x = sc.nextLine();
        String neto;
        
        
        if (x == "Miguel") {
            neto = "Filho de Flavia e neto mais velho";
        } else if(x == "Douglas") {
            neto = "Filho de Simone e segundo neto mais velho";
        } else if(x == "Diogo") {
            neto = "Filho de Simone e terceiro neto mais velho";
        } else if(x == "Vinicius") {
            neto = "Filho de Fabiano e terceiro neto mais velho";
        } else if(x == "Rafaela") {
            neto = "Filho de Flavia e quarta neto mais velho";
        } else if(x == "Heitor") {
            neto = "Filho de Fabiano e segundo neto mais velho";
        } else if(x == "Gabriela") {
            neto = "Filho de Rubia e segundo neto mais velho";
        } else if(x == "Alice") {
            neto = "Filho de Fabiola e segundo neto mais velho";
        } else {
            neto = "Não é neto de Solange";
        }
        System.out.println(neto);
        
        sc.close();
    }


}

package test;

import java.util.Scanner;
import test.AreaRetangulo;

public class Test_01 {
    
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        AreaRetangulo area = new AreaRetangulo();
        System.out.println("Vamos calular a base do retangulo");
        System.out.print("Digite o valor da Base: ");
        area.b = sc.nextDouble();
        System.out.print("Digite o valor da Altura: ");
        area.h = sc.nextDouble();

        System.out.println();
        System.out.println("Resultados: " + area);
        

        sc.close();
    }
}



package test;

import java.util.Scanner;

public class Test_01{

    public static void main (String [] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de alturas que tera: ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++){
            System.out.println("Digite as alturas: ");
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;

        for (int i = 0; i < n; i++){
            sum += vect[i];

        }

        double avg = sum / n;

        System.out.printf("Media das alturas: %.2f%n  ", avg);

        sc.close();
    }
}

package test;

import java.util.Scanner;

public class Test_01 {

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double [] alturas = new double[n];

        for (int i = 0; i < n; i++){
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i=0; i<n; i++){
            soma = soma + alturas[i];
        }
        double mediaAlturas = soma / n;
        
        System.out.println();
        System.out.printf("Altura média: %.2f%n", mediaAlturas);

        int cont = 0;
        for (int i=0; i<n; i++){
            if (idades[i] < 25){
                cont = cont + 1;
            }
        }
    

    double percent = cont * 100.0 / n;

    System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);

    for (int i=0; i<n; i++){
        if (idades[i] < 25){
            System.out.println(nomes[i]);
        }
    
    }
        
    sc.close();    
  }

}

*/


package Triangulo;

//import java.util.Scanner;

public class Test_01 {

     public static void main (String[] args) {

     }
}