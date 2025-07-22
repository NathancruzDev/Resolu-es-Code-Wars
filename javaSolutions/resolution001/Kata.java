public class Kata{
  public static int[] countBy(int x, int n){
    if(x != 0 && n != 0){
      int[] varNumbers = new int[n];
      int[] numbers = varNumbers;
      for(int i=0; i < n ;i++){
        int mult=i+1;
        numbers[i]= x * mult;
      }
      return numbers;
    }
    return new int[0];
  }
}