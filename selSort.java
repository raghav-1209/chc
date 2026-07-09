public class selSort {
    public static void main(String[] args) {
        System.out.print(args);
        int []arr={10,98,7,12,3,3,2,1,0};
        int n=arr.length;
        for(int i=0;i<n;i++){
            int min_index=i;
            for(int j=i;j<n;j++){
                if(arr[min_index]>arr[j]){
                    min_index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
            for(int it:arr)
                System.out.print(it+" ");
        }
    }
}
