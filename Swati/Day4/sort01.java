public class sort01 {



    public static void sort01(int[]arr){
        int i=0;
        int j=0;
    

        while(j<arr.length){
            if(arr[j]==1){
                j++;
            }

            else{
                swap(arr, j, i);
                i++;
                j++;
            }
        }
    }


    public static void swap(int arr[],int i,int j){


        System.out.println("Swapping  in "+i +" to "+j);
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }


    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }



    public static void main(String[] args) {



        int arr[]={0,1,1,0,0,1,1};
        sort01(arr);
        print(arr);
        
    }
    
}
