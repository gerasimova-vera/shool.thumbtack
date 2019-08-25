package net.thumbtack.school.base;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NumberOperations {


    public static Integer find(int[] array, int value){
        for (int i = 0; i< array.length; i++){
            if (array[i]==value) {
                int index = i;
                return i;
            }
        }
        return null;
    }

    public static Integer find(double[] array, double value, double eps){
        for (int i = 0; i< array.length; i++){
            if (array[i]<=(value + eps)&& array[i]>=(value-eps)) {
                int index = i;
                return i;
            }
        }
        return null;
    }

    public static Double calculateDensity(double weight, double volume, double min, double max){
        double p = weight/volume;
        if (p<=max && p>= min)return p;
        else return null;
    }

    public static Integer find(BigInteger[] array, BigInteger value){
        Integer index=null;
        for (int i = 0; i<array.length; i++){
            if (array[i].equals(value)){
                index = i;
            }
        }
        return index;
    }

    public static BigDecimal calculateDensity(BigDecimal weight, BigDecimal volume, BigDecimal min, BigDecimal max){
        BigDecimal p = weight.divide(volume);
        if(p.compareTo(max)<=0 && p.compareTo(min)>=0)return p;
        else return  null;
    }
}
