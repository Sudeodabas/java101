import java.util.Arrays;

public class Frekans {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Dizi : " + Arrays.toString(array));
        System.out.println("Tekrar Sayıları");
        int[] temp = new int[array.length];
        int tempIndex = 0;

        for (int i = 0; i < array.length; i++) {

            if (!isFind(temp, array[i])) {
                temp[tempIndex++] = array[i];
            }
            continue;


        }

        for (int value : temp) {
            int sayac = 0;
            if (value != 0) {
                for (int i : array) {
                    if (i == value)
                        sayac++;

                }
                System.out.println(value + " sayısı " + sayac + " kere tekrar edildi");
            }

        }

    }
}


