public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        while (i <= 1000){
            boolean divisible3 = i % 3 == 0;
            boolean divisible5 = i % 5 == 0;
            if (divisible5 || divisible3){
                count ++;
            }
        i ++;
        }
        System.out.println(count);
    }
}
