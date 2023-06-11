import java.util.Arrays;
import java.util.Scanner;
public class Siralama {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Dizinin Boyutu: ");
        int boyut=inp.nextInt();
        int[] list=new int[boyut];
        System.out.println("Dizinin elemanlarını giriniz: ");
        int eleman;
        for (int i=0;i< list.length;i++){
            eleman=inp.nextInt();
            list[i]=eleman;
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

    }
}
