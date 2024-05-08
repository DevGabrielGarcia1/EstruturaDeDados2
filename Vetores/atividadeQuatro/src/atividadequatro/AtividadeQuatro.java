/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadequatro;

import java.util.Scanner;

/**
 *
 * @author aborg
 */
public class AtividadeQuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        Scanner scanner = new Scanner(System.in);
        
        String[] nome = new String[10];
        
        
        System.out.println("Digite 10 nomes: ");
        for(int i = 0; i <10 ; i++){
            nome[i] = scanner.nextLine();
        }
        
        //aqui pedimos para digitar um nome e depois faremos a verificaçao se existe
        
        System.out.println("Digite um nome: ");
        String nomeBuscar = scanner.nextLine();
        
        boolean encontrado  = false;
        for(int i = 0; i < 10; i++){
            if (nome[i].equalsIgnoreCase(nomeBuscar)){
                encontrado = true;
                break;
            }
        }
        
        if (!encontrado){
            System.out.println("NAO ACHEI!");
            return;
        }
        System.out.println("ACHEI!");
        
        scanner.close();
    }
   
}
