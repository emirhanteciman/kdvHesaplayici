import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double alis,satis,satis2,KDVmiktari = 0.18, KDVmiktari2 = 0.08;

        Scanner fiyat = new Scanner(System.in);
        System.out.println("Ürün fiyatını giriniz: ");
        alis = fiyat.nextInt();
        System.out.println("Ürünün Fiyatı: " + alis);
        satis = alis+(alis * KDVmiktari);
        KDVmiktari = alis * KDVmiktari;
        System.out.println("Kdv Miktari: " + KDVmiktari);
        satis2 = alis + (alis * KDVmiktari2);
        if (alis<=1000){
            System.out.println("Ürünün toplam fiyati: " + satis);
        }
        else {
            System.out.println("Ürünün Toplam Fiyatı: " + satis2);
        }
    }
}