public class maxMin {
    public static void main(String[] args) {
        int[] list={56,34,1,8,101,-2,-33};
        int max,min;
        min=list[0];
        max=list[0];
        for(int i:list){
            if(i<min){
                min=i;
            }
            if(i>max){
                max=i;
            }
        }
        System.out.println("Minimum Değer: "+min);
        System.out.println("Maximum Değer: "+max);
    }
}
