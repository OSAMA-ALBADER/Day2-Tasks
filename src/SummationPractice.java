import java.util.ArrayList;

public class SummationPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(15);
        numbers.add(20);
        numbers.add(10);
        int sumofNumber = sum(numbers);
        System.out.println(sumofNumber);


    }
    public static int sum(ArrayList<Integer> numbers ){
        int sum = 0;
        for (int number: numbers){
            sum+= number;
        }
        return sum;
    }
}
