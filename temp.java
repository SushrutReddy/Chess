import java.util.Arrays;

public class temp {
    public static void main (String args[]){
        // int n[]={1,2,3,4,5,6};
        // for (int i=0 ; i<n.length ; i++){
        //     for (int j=i+1 ; j<n.length ; j++){
        //         System.out.println("("+n[i]+","+n[j]+")");
        //     }
        // }


        // for (int i=0 ; i<n.length ; i++){
        //     for (int j=i ; j<n.length ; j++){
        //         for (int k=i ; k<=j ; k++){
        //             System.out.print(n[k] + " ");
        //         }
        //         System.out.println();
        //     }
        // }


        // int ma = Integer.MIN_VALUE;
        // int mi = Integer.MAX_VALUE;
        // for (int i=0 ; i<n.length ; i++){
        //     for (int j=i ; j<n.length ; j++){
        //         int sum =0 ;
        //         for (int k=i ; k<=j ; k++){
        //             sum+=n[k];
        //         }
        //         if (sum>ma){
        //             ma=sum;
        //         }

        //         if (sum<mi){
        //             mi=sum;
        //         }
        //     }
        // }
        // System.out.println(ma);
        // System.out.println(mi);



        // int n[]={1,-2,3,4,-5,-6};
        // int prefix[] = new int[n.length];
        // prefix[0]=n[0];
        // for (int i=1 ; i<n.length ; i++){
        //     prefix[i]=n[i]+prefix[i-1];
        // }
        // System.out.println(Arrays.toString(prefix));
        // for (int i=0 ; i<n.length ; i++){
        //     int sum=0;
        //     for (int j=i ; j<n.length ; j++){
        //         sum = (i==0)? prefix[j]:prefix[j]-prefix[i-1];
        //         if (sum>ma){
        //             ma=sum;
        //         }
    
        //         if (sum<mi){
        //             mi=sum;
        //         }
        //     }
            
        // }
        // System.out.println(ma);
        // System.out.println(mi);


/////////// KaDaN's Algo
        // int[] n={-3, -2, -4, 10, 14, -7, 13, -12 , 16};
        // int sum1=0;
        // int maxsum = Integer.MIN_VALUE;
        // for (int i=0 ; i<n.length ;i++){
        //     sum1+=n[i];
        //     if (sum1<=0){
        //         sum1=0;
        //     }else if (sum1>maxsum){
        //         maxsum=sum1;
        //     }
        // }
        // if (maxsum<0){
        //     Arrays.sort(n);
        //     System.out.println(n[n.length-1]);
        // }else{
        //     System.out.println(maxsum);
        // }

        // int minsum =Integer.MAX_VALUE;
        // int sum2=0;
        // for (int i=0 ; i<n.length ; i++){
        //     sum2+=n[i];
        //     if (sum2>=0){
        //         sum2=0;
        //     }else if (sum2<minsum){
        //         minsum=sum2;
        //     }
        // }
        // if (minsum>0){
        //     Arrays.sort(n);
        //     System.out.println(n[n.length-1]);
        // }else{
        //     System.out.println(minsum);
        // }

        int x
        =10;
        System.out.println(x);
    }
}