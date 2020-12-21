public class Sorts{
    /**Bubble sort of an int array. 
    *Upon completion, the elements of the array will be in increasing order.
    *@param data  the elements to be sorted.
    */

    public static void bubbleSort(int[] data){
        boolean keepGoing = true;
        while (keepGoing){
            keepGoing = false;
            for (int i = 0; i < data.length - 1; i++){
                if (data[i] > data[i + 1]){
                    int hold = data[i+ 1];
                    data[i + 1] = data[i];
                    data[i] = hold;
                    keepGoing = true;
                }
            }
        }
      }
      public static void selectionSort(int[] data){
        
        for (int i = 0 ; i < data.length; i++){
            int minIndex = i;

            for (int x = i+1; x < data.length; x++){
                if (data[x] < data[minIndex]){
                    minIndex = x;
                }
            }
            int hold = data[i];
            data[i] = data[minIndex];
            data[minIndex] = hold;
            

        }


    }
    /**insertion sort of an int array. 
     *@postcondition The array will be modified such that the elements will be in increasing order.
    *@param data - the elements to be sorted.
    */
    public static void insertionSort(int[] data){
        for (int i = 0; i < data.length; i ++){
            int hold = data[i];
            int x = i;
            if (x > 0){
                while(x > 0 && hold < data[x - 1]){
                    data[x] = data[x - 1]; // shifting right
                    x -= 1;
                }
            
                data[x] = hold;
            }
            

        }
    }
}
