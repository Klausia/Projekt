/**
 * Created by Klausiaczek on 2016-11-01.
 */
public class Main {

    public int dodawanie(int a, int b){
        return a+b;
    }
    public int odejmowanie(int a, int b){
        return a-b;
    }
    public int mnozenie(int a, int b){
        return a*b;
    }
    public double dzielenie(double a, double b){
        return a/b;
    }
    public static void main(String[] args){
        boolean prawda=5>3;
        if (prawda) {
            System.out.println(prawda);
        }
        Integer b=100;
        System.out.println("Dana liczba to " + b);
        int suma=0;
        int[] array={1,5,6,9,10};
        System.out.println(array[4]);
        for(int i=0; i<array.length; i++){
            suma=suma+array[i];
            System.out.println(suma);
        }

    }
}
