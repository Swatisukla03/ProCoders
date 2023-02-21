public class Sort012 {

    public  static void sort01(int arr[]){
        int i=0;
        int j=0;
        int k=arr.length-1;




        while(j<=k){
            if(arr[j]==1){
                j++;
            }


            else if(arr[j]==0){
                swap(arr, j, i);
                i++;
                j++;
            }

            else{
                swap(arr, j, k);
                k--;
            }
        }
    }







    public static void swap(int arr[],int i,int j){
        System.out.println("Swapping is "+i+" into "+j);
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }




    public  static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }



    public static void main(String[] args) {
        int n=5;
        int arr[]={0,2,1,1,2,2,0,1};
         sort01(arr);
         print(arr);
        
    }
    
}
