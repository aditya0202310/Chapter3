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
        System.out.println(pickUpPhone(false, false, true));
        System.out.println(pickUpPhone(true, true, true));
        System.out.println(pickUpPhone(true, true, false));
        System.out.println(pickUpPhone(false, true, false));
        System.out.println(pickUpPhone(true, false, false));
        System.out.println(pickUpPhone(false, false, false));
        System.out.println(setAlarm(1, false));
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
        if (isMorning && isMom || isAsleep) {
            return true;
        }
        if (isMorning || isMom && isAsleep) {
            return false;
        } else if (isMorning || isMom && isAsleep) {
            return true;
        } else
            return true;
    }

    //Fourth Method
    public static String setAlarm(int dayOfWeek, boolean onVacation) {
        if(dayOfWeek == 1 && dayOfWeek == 1  && onVacation == false){
            String result = "7:00";
            return result;
        }
        else
            return "10:00";
    }
}