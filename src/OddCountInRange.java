public class OddCountInRange {
    public static void main(String[] args){
        countOdd(8,10);
    }
    public static int countOdd(int low, int high){
        int oddcount= 0;
        for(int i = low; i< high+1; i++){
            if(i % 2 != 0){
                oddcount= oddcount +1;
            }
        }
        System.out.println(oddcount);
        return oddcount;
    }
}
