import java.util.ArrayList;
import java.util.Scanner;

public class maindata_warga {
    public static void maindata_warga (String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer pilihan = 0;
        
        System.out.println("====================================");
        System.out.println("Pendataan dan Pembayaran Iuran Warga");
        System.out.println("====================================");
        System.out.println("1. Input Data Warga");
        System.out.println("2. Input Iuran Warga");
        System.out.println();
        System.out.print("PILIHAN MENU : ");
        pilihan = sc.nextInt();
        System.out.println();
        
        datawargacipedak n = new datawargacipedak();
        
        if (pilihan == 1){
            n.warga1();
            //}else if(pilihan == 2){
            n.warga2();
            }
        }
    } 
