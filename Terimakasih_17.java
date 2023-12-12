/**
 * Terimakasih_17
 */
public class Terimakasih_17 {

    public static void UcapanTerimakasih(){
        System.out.println("Thank you for being the best theacer in the world.\n" +
        "You inspired in me a love for learning and made me feel like i could ask you anything.");
    }

    public static void UcapanTambahan(String ucapan){
        System.out.println(ucapan);
    }

    public static void main(String[] args) {
        UcapanTerimakasih();
        String ucapan = "Terimakasih Pak.. BU.. Semoga Sehat Selalu";
        UcapanTambahan(ucapan);
    }

}