public class Main {
    public static void main(String[] args) {
        
    }
    public static void numberToWords(int number){
        int digit = 0;
        int count = 0;
        int reverse = reverse(number);
        if (number < 0){
            System.out.println("Invalid Value");
        }
        else {
            while (count < getDigitCount(number)){
                digit = reverse % 10;
                switch (digit){
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                count++;
                reverse /= 10;
            }
        }
    }
    public static int reverse(int number){
        int reverse = 0;

        while (number != 0){
            int digit = number % 10;
            reverse = (reverse * 10) + digit;
            number /= 10;
        }
        return reverse;
    }
    public static int getDigitCount(int number){
        int count = 0;
        if (number < 0){
            return -1;
        }
        while (number != 0){
            number /= 10;
            count++;
        }
        if (count == 0){
            return 1;
        }
        return count;
    }
}
