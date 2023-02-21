public class bubbleSort {



    public static void bubbleSort(int arr[]){
        int n=arr.length;

        for(int it=1;it<n;it++){
            for(int j=0;j<n-it;j++){
                if(isSmaller(arr,j+1,j)==true){
                    swap(arr,j+1,j);
                }
            }
        }
    }




    public static void swap(int arr[],int i,int j){
        System.out.println("Swapping "+arr[i]+" and"+arr[j]);
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    



    public static boolean isSmaller(int[]arr,int i,int j){

        System.out.println("Comparing "+arr[i]+"and "+arr[j]);

        if(arr[i]<arr[j]){
            return true;
        }

        else{
            return false;
        }

    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        int arr[]={5,9,8,-2,1};
        bubbleSort(arr);
        print(arr);
    }
}
