
package projcarro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Carro objCarro1 = new Carro();
        Carro objCarro2 = new Carro();
        
        System.out.println("infome os dados do carro 1");
        objCarro1.setFabricante(leia.next());
        
        
    }
    
}
