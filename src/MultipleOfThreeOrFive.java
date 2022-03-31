
//This code takes any number one wishes to input and prints Fizz if it is a multiple of 3
/// Prints FizzBuzz if it is a multiple of 5 and 3
// Prints buzz if only a multiple of 3

public class MultipleOfThreeOrFive {
    public static void main(String[] args) {
        isFactorOrNo(15);


    }

    public static void isFactorOrNo(int n) {
        for (int i = 0; i < n+1; i++) {
            int multipleOfThree= i%3;
            int multipleOfFive= i%5;
            if(multipleOfThree ==0){
                if(multipleOfFive==0){
                    System.out.println("FizzBuzz");
                }
                if(multipleOfFive != 0){
                    System.out.println("Fizz");
                }}
            if(multipleOfThree != 0){
                if(multipleOfFive == 0){
                    System.out.println("Buzz");
                }
                if(multipleOfFive != 0){
                    System.out.println(i);
                }
            }
        }
    }
}
