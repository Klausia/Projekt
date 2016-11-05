import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            for (int k=1;k<6;k++){
                System.out.println("Podaj liczbe: " + k);
                int i = Integer.parseInt(br.readLine());
            }
        }catch(NumberFormatException nfe){
            System.err.println("Invalid Format!");
        }
    }


        }
