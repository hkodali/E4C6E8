/*
    Harshita Kodali, hkodali
    Amala Chirayil, achirayi
 
    Step4, version 1.0: Register File
 */

public class RegFile {
    private static int reg = 0;
    public static String getCurrent(){
        return "$T" + String.valueOf(reg);
    }
    public static String getNext(){
        return "$T" + String.valueOf(++reg);
    }
}