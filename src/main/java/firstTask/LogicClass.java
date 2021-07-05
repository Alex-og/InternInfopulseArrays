package firstTask;

public class LogicClass {
    private static final double C = -1.49;
    private static final double D = 23.4;

    public double maxElemOfArray() {
        double[][] twoDimensionalArray = createAndFillArray();
        return this.getMaxValue(twoDimensionalArray);
    }

    public double getMaxValue(double[][] twoDimensionalArray) {
        if(twoDimensionalArray == null) {
            throw new NullPointerException("The array cannot be empty.");
        }
        double max = twoDimensionalArray[0][0];
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length;j++) {
                if (twoDimensionalArray[i][j] > max) {
                    max = twoDimensionalArray[i][j];
                }
            }
        }
        return max;
    }

    private static double[][] createAndFillArray() {
        double[][] arr = new double[10][10];
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length;j++) {
                arr[i][j] = calculateElementValue(i, j);
            }
        }
        return arr;
    }

    /**
     * since division by zero gives infinity, if @param i or @param j is equal to zero,
     * assign it the value 1
     * @param i - the index of outer array
     * @param j - the index of inner array
     * @return  - returns the computed value double
     */
    private static double calculateElementValue(double i, double j) {
        double newI = i;
        double newJ = j;
        if (newI == 0) newI = 1;
        if (newJ == 0) newJ = 1;
        double sinSqrtC = (1 - Math.cos(2 * C)) / 2;
        double fractionExpr = (4 * Math.sqrt (Math.log(D))) / Math.pow(newI, newJ);
        return Math.sqrt(Math.abs(sinSqrtC - fractionExpr));
    }
}
