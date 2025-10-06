import java.lang.Math;

public class Lab1 {
    public static void main(String[] args) {

        short[] w = new short[11];
        for (int i = 0; i < w.length; i++) {
            w[i] = (short) (i + 5);
        }

        float[] x = new float[12];
        for (int i = 0; i < x.length; i++) {
            x[i] = (float) (Math.random() * 19 - 15);
        }

        float[][] w1 = new float[11][12];
        for (int i = 0; i < w.length; i++) {
            for (int j = 0; j < x.length; j++) {
                w1[i][j] = calculateelements(W[i],X[j]);
            }
        }
        printmatrix(W1);
    }

    public static float calculateelements(short W, float X) {

        if (W == 11) {
            return (float)Math.exp(Math.pow((1 - Math.exp(X)) / Math.log(Math.abs(X)), 2));}

        if (W == 5 || W == 10 || W == 12 || W == 14 || W == 15) {
            return (float)Math.log(Math.pow(((Math.acos((X - 5.5) / 19) + 1) / 5), 2));}

        else return (float)Math.asin(Math.pow(Math.sin(Math.cos(X)), 2));
    }

    public static void printmatrix(float[][] W1) {
        for (int i = 0; i < w1.length; i++) {
            for (int j = 0; j < w1[i].length; j++) {
                System.out.printf("%9.2f", W1[i][j]);}
            System.out.println();
        }
    }

}
