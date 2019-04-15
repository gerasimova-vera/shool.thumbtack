package net.thumbtack.school.introduction;

public class FirstSteps {


    public int sum(int x, int y) {
        int a = (x + y);
        return (a);
    }

    public int mul(int x, int y) {
        int a = (x * y);
        return (a);
    }

    public int div(int x, int y) {
        int a = (x / y);
        return (a);
    }

    public int mod(int x, int y) {
        int a = (x % y);
        return (a);
    }

    public boolean isEqual(int x, int y) {
        return x == y;
    }

    public boolean isGreater(int x, int y) {
        return x > y;
    }

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y) {
        return xLeft <= x && x <= xRight && yTop <= y && y <= yBottom;
    }

    public int sum(int[] array) {
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            a = a + array[i];
        }
        return a;
    }

    public int mul(int[] array) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < array.length; i++) {
            b *= array[i];
            a = b;
        }
        return a;
    }

    public int min(int[] array) {
        int a = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int b = array[0];
            if (b > array[i]) {
                b = array[i];
            }
            a = b;
        }
        return a;
    }

    public int max(int[] array) {
        int a = Integer.MIN_VALUE;
        int b = 0;
        for (int i = 0; i < array.length; i++) {
            if (b < array[i]) {
                b = array[i];
            }
            a = b;
        }
        return a;
    }

    public double average(int[] array) {

        double sr = 0;
        if (array.length > 0) {
            double sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            sr = sum / array.length;

        }
        return sr;
    }


    public boolean isSortedDescendant(int[] array) {
        boolean a = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                a = false;
            } else {
                a = true;
            }
        }
        return a;

    }

    public void cube(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i] * array[i];
        }
    }

    public boolean find(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public void reverse(int[] array) {
        int a = array.length;
        for (int i = 0; i < array.length / 2; i++) {
            int b = array[i];
            array[i] = array[a - i - 1];
            array[a - i - 1] = b;
        }
    }

    public boolean isPalindrome(int[] array) {
        boolean b = true;
        int len = array.length;
        for (int i = 0; i < len / 2; i++) {
            if (array[i] != array[len - i - 1]) {
                b = false;
                break;
            }
        }
        return b;
    }

    public int sum(int[][] matrix) {
        int s = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                s += matrix[i][j];
            }
        }
        return s;
    }

    public int max(int[][] matrix) {
        int m = 0;
        int length = matrix.length;
        int a[] = matrix[0];
        int lengthA = a.length;
        if (lengthA == 0) {
            m = Integer.MIN_VALUE;
            return m;
        } else {

            for (int i = 0; i < length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (m < matrix[i][j]) {
                        m = matrix[i][j];
                    }
                }
            }
        }

        return m;
    }

    public int diagonalMax(int[][] matrix) {
        int m = 0;
        int length = matrix.length;
        int a[] = matrix[0];
        int lengthA = a.length;
        if (lengthA == 0) {
            m = Integer.MIN_VALUE;
            return m;
        } else {
            for (int i = 0; i < matrix.length; i++) {
                for (int k = 0; k < matrix.length; k++) {
                    if ((i == k) && (m < matrix[i][k])) {
                        m = matrix[i][k];
                    }
                }
            }
        }
        return m;
    }

    public boolean isSortedDescendant(int[][] matrix) {
        boolean m = true;
        int length = matrix.length;
        int a[] = matrix[0];
        int lengthA = a.length;
        if (lengthA == 0) {
            m = true;
            return m;
        } else {
            for (int i = 0; i < matrix.length - 1; i++) {
                for (int j = 0; j < matrix[i].length-1; j++) {
                    if ((matrix[i][j]<=matrix[i][j+1])&&(matrix[i][j]<=matrix[i+1][j])){
                        m = false;
                    }
                }
            }

        }
        return m;
    }
}
