import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TahminOyunu {
    public static void main(String[] args) {
        //int number=(int)(Math.random()*100); 2. yöntem
        Random rand=new Random();
        int number=rand.nextInt(100);
        Scanner input=new Scanner(System.in);
        int right=0;
        int selected;
        int[] wrong=new int[5];
        boolean isWin=false;
        boolean isWrong=false;
        System.out.println(number);
        while (right<5){
            System.out.println("Lütfen tahmin ettiğiniz sayıyı giriniz: ");
            selected=input.nextInt();
            if(selected<0||selected>100){
                System.out.println("Lütfen 0-100 arasında değer giriniz.");
                if(isWrong){
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak: "+(5-right));
                }
                else {
                    isWrong=true;
                    System.out.println("Bir daha hatalı girişinizde tahmin hakkınızdan düşülecektir.");
                }
                continue;
            }

            if (selected == number) {
                    System.out.println("Tebrikler doğru tahmin " +number);
                    isWin=true;
                    break;
                } else{
                    System.out.println("Hatalı bir sayı girdiniz.");
                    if(selected>number){
                        System.out.println(selected+ " sayısı gizli sayıdan büyüktür.");
                    }
                    else
                        System.out.println(selected+ " sayısı gizli sayıdan küçüktür.");
                    wrong[right++]=selected;
                    System.out.println("Kalan hakkı: "+(5-right));
                }

            }
        if(!isWin){
            System.out.println("Kaybettiniz");
            if(!isWrong){
                System.out.println("Tahminleriniz: "+ Arrays.toString(wrong));
            }
        }
    }
}
