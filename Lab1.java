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
                w1[i][j] = calculateelements(w[i],x[j]);
            }
        }
        printmatrix(w1);
    }

    public static float calculateelements(short w, float x) {

        if (w == 11) {
            return (float)Math.exp(Math.pow((1 - Math.exp(x)) / Math.log(Math.abs(X)), 2));}

        if (w == 5 || w == 10 || w == 12 || w == 14 || w == 15) {
            return (float)Math.log(Math.pow(((Math.acos((x - 5.5) / 19) + 1) / 5), 2));}

        else return (float)Math.asin(Math.pow(Math.sin(Math.cos(X)), 2));
    }

    public static void printmatrix(float[][] w1) {
        for (int i = 0; i < w1.length; i++) {
            for (int j = 0; j < w1[i].length; j++) {
                System.out.printf("%9.2f", w1[i][j]);}
            System.out.println();
        }
    }

}


