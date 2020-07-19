package com.mba;

public class Main {

    public static void main(String[] args) {
	    int myValue = 10000;
	    int myMinIntValue = Integer.MIN_VALUE;
	    int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value =  " + myMaxIntValue);
        System.out.println("Integer Maximum Value + 1 = " + (myMaxIntValue + 1));
        System.out.println("Integer Minimum Value - 1 =  " + (myMinIntValue -1));
        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value =  " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value =  " + myMaxShortValue);


        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value =  " + myMaxLongValue);

        long myLongValue = 9_223_372_036_854_775_807L;

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte)(myMinByteValue / 2);
        short myNewShortValue = (short)(myMinShortValue / 2);

        byte mybyte = 125;
        short myshort = 5000;
        int myint = 5000000;
        long mylong =  50000 + 10 * (mybyte + myshort + myint);
        System.out.println("myLong = " + mylong);
    }
}
