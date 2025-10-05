import java.lang.Math;
import java.util.Random;

public class Lab1 {
    public static void main(String[] args) {

        short[] W = new short[11];
        for (int i = 0; i < W.length; i++) {
            W[i] = (short) (i + 5);
        }

        float[] X = new float[12];
        Random random = new Random();
        for (int i = 0; i < X.length; i++) {
            X[i] = random.nextFloat(-15.0f, 4.0f);
        }

        float[][] W1 = new float[11][12];
        for (int i = 0; i < W.length; i++) {
            for (int j = 0; j < X.length; j++) {
                W1[i][j] = CalcEl(W[i],X[j]);
            }
        }
        Print(W1);
    }

    public static float CalcEl(short W , float X) {

                if (W == 11) {
                    return (float)Math.exp(Math.pow((1 - Math.exp(X)) / Math.log(Math.abs(X)), 2));}

                if (W == 5 || W == 10 || W == 12 || W == 14 || W == 15) {
                    return (float)Math.log(Math.pow(((Math.acos((X - 5.5) / 19) + 1) / 5), 2));}

                else return(float)Math.asin(Math.pow(Math.sin(Math.cos(X)), 2));
    }

    public static void Print(float[][] W1) {
        for (int i = 0; i < W1.length; i++) {
            for (int j = 0; j < W1[i].length; j++) {
                System.out.printf("%8.2f", W1[i][j]);}
            System.out.println();
        }
    }
}