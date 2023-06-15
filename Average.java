public class Avarage {
    public static void main(String[] args) {
        int[] list={1,2,3,4,5};
        double average=0.0;
        for(int i=0;i<list.length;i++){
            average+=list[i];
        }
        average/=list.length;
        System.out.println(average);
    }
}
