package Giris;
import java.util.Scanner;
public class OdevHesapmak {
    public static void main(String[] args) {
     int n1,n2,secim;
     Scanner input= new Scanner(System.in);
     System.out.print("birinci sayiyiyi giriniz: ");
     n1=input.nextInt();
     System.out.print("ikinci sayiyiyi giriniz: ");
     n2=input.nextInt();

     System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme  ");
     System.out.print("islem seciniz: ");
     secim=input.nextInt();

     switch(secim){
         case 1:
             System.out.print("Toplama Islemi Sonucunuz : " + (n1+n2));
             break;
         case 2:
             System.out.print("Cıkarma Islemi Sonucunuz : " + (n1-n2));
             break;
         case 3:
             System.out.print("Carpma Islemi Sonucunuz : " + (n1*n2));
             break;
         case 4:
             if(n2!=0) {
                 System.out.print("Bolme Islemi Sonucunuz : " + (n1 / n2));
             }else{
                     System.out.println("Bir sayi 0'a bolunemez : ") ;
                 }
                 break;
         default:
                     System.out.println("Yanlis secim yaptiniz.Tekrar deneyiniz.") ;



             }

     }





    }




