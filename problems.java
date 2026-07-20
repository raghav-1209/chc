public class problems {
    public static void main(String[] args) {
        int []arr={120,293,9018,10};
        int k=10;
        int []freq=new int[k];
        int c=0;
        for(int it:arr){
            int rem=(it)%k;
            int need=(k-rem)%k;
            c+=freq[need];
            freq[rem]++;
        }
        System.out.print(c);
    }
}
