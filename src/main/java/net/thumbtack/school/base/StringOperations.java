package net.thumbtack.school.base;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class StringOperations {


    public static int getSummaryLength(String[] strings){
        StringBuilder sb = new StringBuilder();
        for(String elem : strings){
            sb.append(elem);
        }
        String fullString = sb.toString();
        return fullString.length();
    }

    public static String getFirstAndLastLetterString(String string){
      String result = string.substring(0, 1);
      int length = string.length();
      return result.concat(string.substring(length-1));
    }

    public static boolean isSameCharAtPosition(String string1, String string2, int index){
        char result1 = string1.charAt(index);
        char result2 = string2.charAt(index);
        return (result1 == result2);
    }

    public static boolean isSameFirstCharPosition(String string1, String string2, char character){
        int i1 = string1.indexOf(character);
        int i2 = string2.indexOf(character);
        return (i2 == i1);
    }

    public static boolean isSameLastCharPosition(String string1, String string2, char character){
        int i1 = string1.lastIndexOf(character);
        int i2 = string2.lastIndexOf(character);
        return (i2 == i1);
    }

    public static boolean isSameFirstStringPosition(String string1, String string2, String str){
        int i1 = string1.indexOf(str);
        int i2 = string2.indexOf(str);
        return (i2 == i1);
    }

    public static boolean isSameLastStringPosition(String string1, String string2, String str){
        int i1 = string1.lastIndexOf(str);
        int i2 = string2.lastIndexOf(str);
        return (i2 == i1);
    }

    public static boolean isEqual(String string1, String string2){
        return string1.equals(string2);
    }

    public static boolean isEqualIgnoreCase(String string1, String string2){
        return string1.equalsIgnoreCase(string2);
    }
    public static boolean isLess(String string1, String string2){
        if(string1.compareTo(string2)<0)return true;
        else return false;
    }

    public static boolean isLessIgnoreCase(String string1, String string2){
        if(string1.compareToIgnoreCase(string2)<0) return  true;
        else return false;
    }

    public static String concat(String string1, String string2){
        return string1.concat(string2);
    }

    public static boolean isSamePrefix(String string1, String string2, String prefix){
        if(string1.startsWith(prefix) && string2.startsWith(prefix))return true;
        else return false;
    }

    public static boolean isSameSuffix(String string1, String string2, String suffix){
       if(string1.endsWith(suffix) && string2.endsWith(suffix)) return true;
       else return  false;
    }

    public static String getCommonPrefix(String string1, String string2) {
        String s = "";
        StringBuilder str = new StringBuilder();
        char[] array = string1.toCharArray();
        for (int i = 0; i<string1.length(); i++){
            if ( string1.regionMatches(0,string2,0,i+1)){
                str.append(array[i]);
            }
            s=str.toString();
        }
        return s;
    }

    public static String reverse(String string){
        StringBuilder reverse = new StringBuilder();
        char[]array = string.toCharArray();
        for(int i = array.length-1; i >= 0; i--){
            reverse.append(array[i]);
        }
        String result = reverse.toString();
        return result;
    }

    public static boolean isPalindrome(String string){
        char[]array = string.toCharArray();
        boolean b = true;
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - i - 1]) {
                b = false;
                break;
            }
        }
        return b;
    }

    public static boolean isPalindromeIgnoreCase(String string){
        String str = string.toLowerCase();
        boolean b = true;
        for (int i = 0; i < string.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                b = false;
                break;
            }
        }
        return b;
    }

    public static String getLongestPalindromeIgnoreCase(String[] strings){
        ArrayList<String> polindrom = new ArrayList<String>();
        boolean b = true;
        for (String elem : strings) {
            String str = elem.toLowerCase();
            for (int i = 0; i < elem.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                    b = false;
                    break;
                }
                if (b = true) polindrom.add(elem);
            }
        }
            int lenght = 0;
            String result = new String();
            for (int i = 0; i < polindrom.size(); i++) {
                if (lenght < polindrom.get(i).length()) {
                    lenght = polindrom.get(i).length();
                    result = polindrom.get(i);
                }
            }
        return  result;
    }

        public static boolean hasSameSubstring(String string1, String string2, int index, int length){
        return  string1.regionMatches(index,string2,index,length);
    }

    public static boolean isEqualAfterReplaceCharacters(String string1, char replaceInStr1, char replaceByInStr1, String string2, char replaceInStr2, char replaceByInStr2){
        String str1 = string1.replace(replaceInStr1, replaceByInStr1);
        String str2 = string2.replace(replaceInStr2,replaceByInStr2);
        return str1.equalsIgnoreCase(str2);
    }

    public static boolean isEqualAfterReplaceStrings(String string1, String replaceInStr1, String replaceByInStr1, String string2, String replaceInStr2, String replaceByInStr2){
        String str1 = string1.replaceAll(replaceInStr1, replaceByInStr1);
        String str2 = string2.replaceAll(replaceInStr2, replaceByInStr2);
        return str1.equalsIgnoreCase(str2);
    }

    public static boolean isPalindromeAfterRemovingSpacesIgnoreCase(String string){
        String newString = string.replaceAll("\\s", "");
        String palindrom = newString.toLowerCase();
        char[] array = palindrom.toCharArray();
        boolean b = true;
        for (int i = 0; i<array.length; i++){
            if (array[i]!=array[array.length-i-1])b = false;
        }
        return  b;
    }
    public static boolean isEqualAfterTrimming(String string1, String string2){
        String newString1 = string1.trim();
        String newString2 = string2.trim();
        if (newString1.compareTo(newString2)== 0) return true;
        else return  false;
    }

    public static String makeCsvStringFromInts(int[] array){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i<array.length; i++){
            String s = Integer.toString(array[i]);
            str.append(s);
            if (i<array.length-1) str.append(',');
        }
        String result = str.toString();
        return result;
    }

    public static String makeCsvStringFromDoubles(double[] array){
        StringBuilder str = new StringBuilder();
        for(int i = 0; i<array.length; i++){
            double d = array[i];
            BigDecimal bd = new BigDecimal(Double.toString(d));
            bd = bd.setScale(2, RoundingMode.HALF_UP);
            str.append(bd);
            if (i<array.length-1) str.append(',');
        }
        String result = str.toString();
        return  result;
    }

    public static StringBuilder makeCsvStringBuilderFromInts(int[] array) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i<array.length; i++){
            String s = Integer.toString(array[i]);
            str.append(s);
            if (i<array.length-1) str.append(',');
        }

        return str;
    }

    public static StringBuilder makeCsvStringBuilderFromDoubles(double[] array){
        StringBuilder str = new StringBuilder();
        for(int i = 0; i<array.length; i++){
            double d = array[i];
            BigDecimal bd = new BigDecimal(Double.toString(d));
            bd = bd.setScale(2, RoundingMode.HALF_UP);
            str.append(bd);
            if (i<array.length-1) str.append(',');
        }
        return  str;
    }

    public static StringBuilder removeCharacters(String string, int[] positions){
        StringBuilder str = new StringBuilder(string);
        int count = 0;

        for (int i = 0; i<positions.length;i++){
            str.deleteCharAt(positions[i]-count);
            count++;

        }
        return str;
    }

    public static StringBuilder insertCharacters(String string, int[] positions, char[] characters){
        StringBuilder str = new StringBuilder(string);
        int count =0;
        for(int i = 0; i<positions.length; i ++){
                str.insert(positions[i]+count, characters[i]);
                count++;
        }
        return str;
    }
}
