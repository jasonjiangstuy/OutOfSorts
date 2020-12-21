import java.util.Arrays;
public class Driver{

  public static void main(String[]args){
    //args 0 must be size of the Array
    //args 1 must be "bubble" or "test" (unless you add more)
    int[] randData = new int[Integer.parseInt(args[0])];

    for(int i = 0 ; i < randData.length; i++){
      randData[i] =(int)(Math.random()*10000);
    }

    if(args[1].equals("bubble")){
      Sorts.bubbleSort(randData);
    }
    if(args[1].equals("testBubble")){
      int[] randDataBubble = Arrays.copyOf(randData,randData.length);
      Arrays.sort(randData);
      Sorts.bubbleSort(randDataBubble);


      if( Arrays.equals(randData,randDataBubble)){
        System.out.println("Bubble Correct!");
      }else{
       System.out.println("Bubble Not Correct!!!!!!!!!");
      }
    }
    if(args[1].equals("testSelection")){
      int[] randDataBubble = Arrays.copyOf(randData,randData.length);
      Arrays.sort(randData);
      Sorts.bubbleSort(randDataBubble);


      if( Arrays.equals(randData,randDataBubble)){
        System.out.println("Selection Correct!");
      }else{
       System.out.println("Selection Not Correct!!!!!!!!!");
      }
    }

    if(args[1].equals("testInsert")){
      int[] randDataBubble = Arrays.copyOf(randData,randData.length);
      Arrays.sort(randData);
      Sorts.bubbleSort(randDataBubble);

      if( Arrays.equals(randData,randDataBubble)){
        System.out.println("Insert Correct!");
      }else{
       System.out.println("Insert Not Correct!!!!!!!!!");
      }
    }

  }
}