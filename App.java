import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
      // Scanner read = new Scanner(System.in);

      try {
        String pathFile = "/home/marcelo/Documents/interpretador/SOURCE";

        FileReader file = new FileReader(pathFile);
        BufferedReader readFile = new BufferedReader(file);
   
        String line = readFile.readLine(); 
        System.out.println("Teste 2");
        while (line != null) {

          line = readFile.readLine(); 
          System.out.println("line " + line );
        }     
        
        file.close();
      } catch (IOException e) {
          System.err.printf("Erro na abertura do arquivo: %s.\n",
            e.getMessage());
      }    
    }
  }