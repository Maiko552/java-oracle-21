package br.com.maikonspo.oracle.semana1.calculadora;

public class Calc {

    public static int soma(int a, int b){
        int s = a + b;
        return s;
    }
    public static long multiplica(long a, long b){
        long s = a * b;
        return s;
    }
    public static double divide(double a, double b) {
        assert b != 0: "b não deverá ser zero.";
        double s = a / b;
        return s;
    }

    public static void main(String[] args) {
        var a = 1;
        var b = 0;
        System.out.println(divide(a, b));

    }
}
