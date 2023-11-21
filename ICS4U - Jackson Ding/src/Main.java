import java.util.Scanner;

import java.io.FileWriter;
import java.io.IOException;
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;

public class Main {
    public static void main(String[] args) {
        double i, j, sum;
        for(sum = 0, i = 1, j = 2; i<20&&j<21; i++, j++){
            sum+=(double)i/j;
        }

        System.out.println(sum);
    }
}