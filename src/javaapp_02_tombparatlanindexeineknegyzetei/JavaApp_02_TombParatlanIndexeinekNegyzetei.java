package javaapp_02_tombparatlanindexeineknegyzetei;

import java.util.Random;

public class JavaApp_02_TombParatlanIndexeinekNegyzetei {

    public static void main(String[] args) {
        double[] tomb= veletlenValosTomb(25, -10, 25);

        for (int i = 1; i < tomb.length; i+=2) {
            System.out.println(Math.pow(tomb[i], 2));
        }
    }
    
    public static double[] veletlenValosTomb(int db, int min, int max){
        Random rnd = new Random();
        
        double[] t= new double[db];
        for (int i = 0; i < db; i++) {
            t[i] = (double)(rnd.nextDouble()*(max-min)+min);
        }
        
        return t;
    }
    
}