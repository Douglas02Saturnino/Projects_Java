/*

Criar uma solução para Gerenciar um Supermercado:

Controle de produto (Entrada, Saida, Estoque)

RH

Vendas

Relatorio

*/

package Supermarket ;

import java.util.Scanner;
/*import test.Supermarket.ProcessSupermarket;*/

public class Commerc{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ProcessSupermarket product = new ProcessSupermarket();

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        product.name = sc.nextLine();
        System.out.println("Price: ");
        product.price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        product.quantity = sc.nextInt();
        
        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Update data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Update data: " + product);

        sc.close();
    }
}
