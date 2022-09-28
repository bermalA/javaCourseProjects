public class Main {
    public static void main(String[] args) {
        int number1 = 26;
        int number2 = 25;
        int number3 = 28;
        int result;

        if(number2 > number1){
            if(number2 > number3){
                result = number2;
            }else result = number3;
        } else if (number1 > number3) {
            result = number1;
        } else result = number3;

        System.out.println("En büyük sayı:" + result);
    }
}