public class  selectionSort {



    public static boolean isSmaller(int[]arr,int i,int j){

        System.out.println("Comparing "+arr[i]+"and "+arr[j]);

        if(arr[i]<arr[j]){
            return true;
        }

        else{
            return false;
        }

    }


    public static void  SelectionSort(int arr[]){


        for(int i=0;i<arr.length-1;i++){
            int min=i;

            for(int j=i+1;j<arr.length;j++){
                if(isSmaller(arr,j,min)==true){
                    min=j;
                }
            }
            swap(arr,i,min);
        }
    }



    
    public static void swap(int arr[],int i,int j){
        System.out.println("Swapping "+arr[i]+" and"+arr[j]);
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }






    public static void print(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }




    public static void main(String[] args) {
        int arr[]={8,7,-1,4,10,-8};
        SelectionSort(arr);
        print(arr);
    }
    
}
