package menu_laela;
import java.util.Scanner;
public class Menu_laela {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int menu, porsi, harga = 0;
        System.out.println("Menu Makanan Sederhana");
        System.out.println("1. Nasi goreng\n2. Rendang\n3. Mie ayam\n");
        System.out.println("Pilihan makanan : ");
        menu = masuk.nextInt();
        switch(menu) {
          case 1:
              System.out.print("Porsi : ");
              porsi = masuk.nextInt();
              System.out.println("Nasi goreng(12k/porsi)");
              harga = 12000 * porsi;
              System.out.println("Total : Rp. "+harga);
              break;
          case 2:
              System.out.print("Porsi : ");
              porsi = masuk.nextInt();
              System.out.println("Rendang(13k/porsi)");
              harga = 13000 * porsi;
              System.out.println("Total : Rp. "+harga);
              break;
        case 3:
             System.out.print("Porsi : ");
             porsi = masuk.nextInt();
             System.out.println("Mie ayam(11k/porsi)");
             harga = 11000 * porsi;
             System.out.println("Total : Rp. "+harga);
             break;
        default:
              System.out.println("Pilihan kamu salah:)");
            
            
    }
          
    }
    
}

 
