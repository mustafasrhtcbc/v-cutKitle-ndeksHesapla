import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        double boy,sonuc,kilo;
        Scanner oku=new Scanner(System.in);
        System.out.print("Boyunuzu metre cinsinden giriniz:");
        boy=oku.nextDouble();
        System.out.print("Kilonuzu giriniz:");
        kilo=oku.nextDouble();
        sonuc=kilo/(boy*boy);
        System.out.print("sonuç:"+sonuc);
        oku.close();




        
    }
}
