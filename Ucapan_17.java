import java.util.Scanner;

public class Ucapan_17 {
    
    static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin anda beri uccpan: ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }
    static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " +nama+ "\n May the force be with you.");
    }
}
