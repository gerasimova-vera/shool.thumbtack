package net.thumbtack.school.introduction;

public class FirstSteps {
    public int sum (int x, int y){
    int a=(x+y);
    return (a);
    }
    public int mul (int x, int y){
        int a=(x*y);
        return (a);
    }
    public int div (int x, int y){
        int a=(x/y);
        return (a);
    }
    public int mod (int x, int y){
        int a=(x%y);
        return (a);
    }
    public boolean isEqual (int x, int y){
       return x==y;
    }
    public boolean isGreater (int x, int y){
        return x>y;
    }
    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y) {
        return xLeft <= x && x <= xRight && yTop <= y && y <= yBottom;
    }
    public int sum(int[] array){
        int a=0;
        for(int i=0; i<array.length; i++){
           a=a+array[i];
        }
        return a;
    }
    public int mul(int[] array){
        int a=1;
        for(int i=0; i<array.length; i++){
            a=a*array[i];
        }
        return a;
    }
    public int min(int[] array){
        int a=array[0];
        for(int i=0; i<array.length; i++){
          if(a<array[i]){
              a=array[i];
          }
        }
        return a;
    }
    public int max(int[] array){
        int a=array[0];
        for(int i=0; i<array.length; i++){
            if(a>array[i]){
                a=array[i];
            }
        }
        return a;
    }
    public double average(int[] array){
        int a=0;
        for(int i=0; i<array.length; i++){
            a=a+array[i];
        }
        return a/array.length;
    }
    public boolean isSortedDescendant(int[] array){
        for(int i=0; i<array.length; i++){
            if (array[i]>array[i+1]);{
                    return true;
            }
        }
        return false;
    }
    public void cube(int[]array){
        for (int i=0; i<array.length; i++){
            array[i]=array[i]*array[i];
        }
    }
    public boolean find(int[]array, int value){
        for (int i=0; i<array.length; i++){
            if (array[i]==value){
                return true;
            }
        }
        return false;
    }
    public void reverse(int[]array){
        int a=array.length;
        for (int i=0; i<array.length/2; i++){
            int b=array[i];
            array[i]=array[a-i-1];
            array[a-i-1]=b;
        }
    }
    public boolean isPalindrome(int[]array){
        int a=array.length;
        for (int i=0; i<a/2; i++){
            if (array[i]==array[a-i-1]); {
              return true;
            }
        }
        return false;
    }
    public int sum(int[][] matrix){
        int a=0;
        for(int i=0; i<matrix.length; i++) {
            for (int k = 0; i < matrix.length; k++) {
                a+= matrix[i][k];
            }
        }
        return a;
    }
    public int max(int[][] matrix){
        int a=matrix[0][0];
        for(int i=0; i<matrix.length; i++) {
            for (int k = 0; k < matrix.length; k++) {
                if (a>matrix[i][k+1]){
                        a=matrix[i][k+1];
                }
            }
        }
        return a;
    }
    public int diagonalMax(int[][] matrix){
        int a=matrix[0][0];
        for(int i=0; i<matrix.length; i++) {
            for (int k = 0; k < matrix.length; k++) {
                if ((i==k)&&(a<matrix[i][k])){
                    a=matrix[i][k];
                }
            }
        }
        return a;
    }
    public boolean isSortedDescendant(int[][] matrix){
        for (int i=0; i<matrix.length; i++){
            for (int k=0; k<matrix.length; k++){
                if (matrix[i][k]>matrix[i][k+1]);
                    return true;
            }
        }
        return false;
    }
}