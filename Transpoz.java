import java.util.Scanner;

public class Transpoz {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Matrisin boyutlarını giriniz: ");
        int n1=inp.nextInt();
        int n2=inp.nextInt();

        int[][] matris=new int[n1][n2];
        int[][] transpoz=new int[n2][n1];
        System.out.print("Matrisin elemanlarını sırayla giriniz: ");
        for (int i=0;i<n1;i++){
            for (int j=0;j<n2;j++){
                matris[i][j]=inp.nextInt();
            }
        }
        System.out.println("Matris: ");
        for (int i=0;i<n1;i++){
            for (int j=0;j<n2;j++){
                System.out.print(matris[i][j]+" ");
            }
            System.out.println();
        }
        for (int i=0;i<n1;i++){
            for (int j=0;j<n2;j++){
                transpoz[j][i]=matris[i][j];
            }
        }
        System.out.println("Transpozu:");
        for (int i=0;i<n2;i++){
            for (int j=0;j<n1;j++){
                System.out.print(transpoz[i][j]+" ");
            }
            System.out.println();
        }
    }
}
