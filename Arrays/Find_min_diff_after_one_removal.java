public class Find_min_diff_after_one_removal {
    public static int func(int[] arr)
    {
        int mindiff=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
            {
                int max=0;
                int min=Integer.MAX_VALUE;
                for(int j=0;j<arr.length;j++)
                    {
                        if(i==j)
                            continue;
                        if(arr[j]>max)
                            max=arr[j]; 
                        if(arr[j]<min)    
                            min=arr[j];
                    
                    }
                int diff=max-min; 
                if(diff<mindiff)
                    mindiff=diff;
            }
        return mindiff;
    }
    public static int func2(int[] arr){
        int max1=0,max2=0,min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max2=max1;                 
                max1=arr[i];
            }
            else if(arr[i]>max2){
                max2=arr[i];
            }
            if(arr[i]<min1){
                min2=min1;
                min1=arr[i];
            }
            else if(arr[i]<min2)
                min2=arr[i];
            
        }
        int diff1=max1-min2;
        int diff2=max2-min1;
        return Math.min(diff1,diff2);
    }
    public static void main(String[] args) {
        int arr[]={5,3,2,1,4};
        
        int res=func(arr);
        int res1=func2(arr);
        System.out.println(res);
        System.out.println(res1);
    }
}
