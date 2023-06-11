public class Avarage {
    public static void main(String[] args) {
        int[] list={1,2,3,4,5};
        double avarage=0.0;
        for(int i=0;i<list.length;i++){
            avarage+=list[i];
        }
        avarage/=list.length;
        System.out.println(avarage);
    }
}
