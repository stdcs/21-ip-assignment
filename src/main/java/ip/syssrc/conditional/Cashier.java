package ip.syssrc.conditional;

/**
 * Cashier
 *
 * Assignment 1.1
 *
 * @author H071211066 - Syifa Ur Rahmi <sifasisi3@gmail.com>
 *
 */
public class Cashier {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalHarga = 0;
        int uangYangdiBayarkan = 0;

        try {
            System.out.println("Berapa total harga belanja Anda?");
            totalHarga = in.nextInt();
            System.out.println("Berapa total uang yang Anda bayarkan?");
            uangYangdiBayarkan = in.nextInt();   
        } catch (InputMismatchException ime) {
            System.out.println("Maaf pastikan inputan Anda adalah angka");
            System.out.println(ime.toString());
        } finally {
            in.close();
        }
}
