package com.alex;

public class Main {

    public static void main(String[] args) {
numberToWords(1000);
    }

    public static void numberToWords(int number){
    if(number < 0) {
        System.out.println("Invalid Value");}
        else {
           int rev = reverse(number);

//            String ansver = "";

        for (int i = rev; i != 0; i /= 10) {
            int x = i % 10;
            switch (x) {
//                case 0:
//                   ansver += "Zero ";
//                    break;
//                case 1:
//                    ansver += "One ";
//                    break;
//                case 2:
//                    ansver += "Two ";
//                    break;
//                case 3:
//                    ansver += "Three ";
//                    break;
//                case 4:
//                    ansver += "Four ";
//                    break;
//                case 5:
//                    ansver += "Five ";
//                    break;
//                case 6:
//                    ansver += "Six ";
//                    break;
//                case 7:
//                    ansver += "Seven ";
//                    break;
//                case 8:
//                    ansver += "Eight ";
//                    break;
//                case 9:
//                    ansver += "Nine ";
//                    break;
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
//                default:
//                    System.out.println("Invalid Value");
//                    break;
            }
        }
        if (getDigitCount(reverse(number))!=getDigitCount(number)){
            for(int i = getDigitCount(number)-getDigitCount(reverse(number)); i != 0; i--){
//            ansver += "Zero ";
                System.out.println("Zero");
            }


        }

//        System.out.println(ansver);
    }
    }
    public static int reverse(int one){
int reverse = 0;
        for(int i = one; i != 0; i /= 10){
           reverse = reverse * 10 + i % 10;
        }
//        System.out.println(reverse);
        return reverse;
    }
    public static int getDigitCount(int number){
            if(number < 0) {return -1;}
            int count = 0;
if (number == 0){count = 1;}
            for (int i = number; i != 0; i /= 10){
                count++;
            }
    return count;
    }
}
