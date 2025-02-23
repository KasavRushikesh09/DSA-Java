import java.util.*; 
import java.io.*;

class Main {

  public static int MovingMedian(int[] arr) {
    int windowSize = arr[0];
    int[] data = Arrays.copyOfRange(arr,1,arr.length);
    List<String>medians = new ArrayList<>();

    for(int i=0;i<data.length;i++){
      int start = Math.max(0,i - (windowSize -1));
      List<Integer>window = new ArrayList<>();
      for(int j = start; j<=i; j++){
        window.add(data[j]);
      }
      Collections.sort(window);
      medians.add(computeMedian(window));
    }
    return String.join((", ") , medians); 
  }

  private static String computeMedian(List<Integer>window){
    int size = window.size();
    if(size % 2 ==1){
      return Integer.toString(window.get(size / 2));
    }else{
      int mid1 = window.get(size / 2-1);
      int mid2 = window.get(size / 2);
      int sum = mid1 + mid2;
      if(sum % 2 == 0){
        return Integer.toString(sum / 2);
      }else{
        return String.format("%.1f",sum /2.0);
      }
    }
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    String input = s.nextLine();
    String[] inputArray = input.split(",");
    int[] arr = new int[inputArray.length];
    for(int i = 0; i<inputArray.length; i++){
      arr[i] = Integer.parseInt(inputArray[i].trim());
    }

    System.out.print(MovingMedian(arr)); 
  }

}



