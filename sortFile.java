class SortFile{
    public static void main(String[] args) {
        System.out.println("dhiwuhiw");
        int []arr={9,8,123,5,2,3,90,1};
        //bubbleSort
        int  n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int it:arr)
            System.out.print(it+" ");
    }
}