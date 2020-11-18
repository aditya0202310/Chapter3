package com.company;

public class conditionals {
    private boolean aSmile;
    private boolean bSmile;

    public conditionals(boolean a, boolean b) {
        b = false;
        a = false;
    }

    //First method
    public static boolean chimpTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile == bSmile) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
//            System.out.println(chimpTrouble(true, true));
//            System.out.println(chimpTrouble(false, false));
//            System.out.println(chimpTrouble(true, false));
//            System.out.println(chimpTrouble(false, true));
//        System.out.println(negPos(1, -1, false));
//        System.out.println(negPos(-1, 1, false));
//        System.out.println(negPos(1, 1, false));
//        System.out.println(negPos(-1, -1, false));
//        System.out.println(negPos(-4, -5, true));
//        System.out.println(negPos(-4, 5, true));
//        System.out.println(negPos(4, 5, true));
//        System.out.println(negPos(4, -5, true));
//        System.out.println(pickUpPhone(false, false, true));
//        System.out.println(pickUpPhone(true, true, true));
//        System.out.println(pickUpPhone(true, true, false));
//        System.out.println(pickUpPhone(false, true, false));
//        System.out.println(pickUpPhone(true, false, false));
//        System.out.println(pickUpPhone(false, false, false));
//        System.out.println(setAlarm(1, false));
//        System.out.println(setAlarm(5, false));
//        System.out.println(setAlarm (0, false));
//        System.out.println(setAlarm (2, true));
//        System.out.println(setAlarm (4, true));
//        System.out.println(setAlarm (6, true));
//        System.out.println(onesDigitSame(23, 19, 13));
//        System.out.println(onesDigitSame(23, 19, 12));
//        System.out.println(onesDigitSame(23, 19, 3));
//        System.out.println(onesDigitSame(423, 13, 3));
//        System.out.println(onesDigitSame(23, 29, 25));
        System.out.println(blackjack(19, 21));
        System.out.println(blackjack(21, 19));
        System.out.println(blackjack(19, 22));
        System.out.println(blackjack(8, 8));
        System.out.println(blackjack(25, 24));
    }
    //Second method

    public static boolean negPos(int a, int b, boolean negative) {
        if (a > 0 && b < 0 && negative == false) {
            return true;
        }
        if (a < 0 && b < 0 && negative == true) {
            return true;
        } else if (a < 0 && b > 0 && !negative) {
            return (a < 0 && b > 0 && !negative);
        } else {
            return false;
        }
    }

    //Third method
    public static boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep == true) {
            return false;
        }
        if (isMorning && isMom) {
            return true;
        }
        if (isMorning && !isMom) {
            return false;
        } else if (!isMorning && isMom) {
            return true;
        } else
            return true;
    }

    //Fourth Method
    public static String setAlarm(int dayOfWeek, boolean onVacation) {
        if (onVacation == false) {

            if ((dayOfWeek >= 1 && dayOfWeek <= 5)) {
                return "7:00";

            } else {
                return "10:00";
            }

        } else {
            if (onVacation == true) {

                if (dayOfWeek >= 1 && dayOfWeek <= 5) {
                    return "10:00";
                } else {

                }
            }
            return "off";
        }
    }

    // fifth  method
    public static boolean onesDigitSame(int a, int b, int c) {
        if (a % 10 == c % 10 || a % 10 == b % 10) {
            return true;
        } else
            return false;

    }

    // Sixth method

    public static int blackjack(int x, int y) {
        if ((x >= 0 && x <= 21) && (y >= 0 && y <= 21)) {
            if (21 - x > 21 - y) {
                return y;
            } else {
                return x;
            }
        }else if (y > 21) {
            if(x <= 21){
                return x;
            }else
                return 0;

        } else
            return 0;
    }
}



