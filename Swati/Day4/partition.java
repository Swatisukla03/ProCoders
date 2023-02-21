public class partition {



    public static void partition(int[]arr,int pivot){
        int i=0;
        int j=0;

        while(j<arr.length){
            if(arr[j]>pivot){
                j++;
            }

            else{
                swap(arr,j,i);
                i++;
                j++;
            }
        }
    }




    public static void swap(int arr[],int i,int j){
        System.out.println(" Swapping in "+i+" into "+i);

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }



    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {

        int arr[]={-1,3,4,2,6,8,34,12,7,5};
        partition(arr, 5);
        print(arr);
        
        
    }
    
}
