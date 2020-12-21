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

            for (int x = 0; i < data.length; x++){
                if (data[x] < data[minIndex]){
                    minIndex = x;
                }
            }
            int hold = data[i];
            data[i] = data[minIndex];
            data[minIndex] = hold;
            

        }


    }

    
  }