
import java.util.Arrays;

public class averageSalaryNoMaxOrMin {
    public static void main(String[] args){
        int[] salary= {300, 200, 400, 500,450};
        average(salary);

    }
    public static double average(int[] salary) {
        //make it return double at end
        double finalAverage= 0;
        int middleTotal= 0;
        int maxLength= salary.length-2;
        int[] noMaxOrMinArray= new int[maxLength];
        Arrays.sort(salary);
        for(int i= 1; i< salary.length-1; i++){
         //   System.out.println(salary[i]);
            noMaxOrMinArray[i-1]= salary[i];

        }
        for(int m= 0; m< noMaxOrMinArray.length; m++){
            middleTotal= noMaxOrMinArray[m] + middleTotal;
        }
        finalAverage= middleTotal/noMaxOrMinArray.length;
        return finalAverage;

    }
}

