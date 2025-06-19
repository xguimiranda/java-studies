package votacaoContagemMap.application;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> votes = new LinkedHashMap<>();

        System.out.println("Enter file full path: ");
        String path = sc.next();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();

}
