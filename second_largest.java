public class second_largest {
    public static void main(String[] args) {
        int[] arr = {4,7,13,9};
        int first_max=0;
        int second_max=0;
        for(int i=0;i<4;i++){
            if(arr[i]>first_max){
                second_max=first_max;
                first_max=arr[i];
            }
            else if(arr[i]>second_max){
                second_max=arr[i];
            }
        }
        System.out.println("The Second Largets Elemwnt is : " + second_max);
}
}
