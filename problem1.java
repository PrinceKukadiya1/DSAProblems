// sum of two number.
public class problem1 {

    public static void method(int numbers[]){
        int target = 6;
  
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
               int sum = numbers[i] + numbers[j];
                if(target == sum){
                    System.out.println("[" + i + "," + j + "]");
                }
            }
        }
        

    }
    public static void main(String[] args) {
        int numbers[] = {3,2,4};
        method(numbers);   
    }
}
