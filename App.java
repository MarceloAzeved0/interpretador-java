import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class App {
    private static byte[] memory = new byte[1000];
    private static ArrayList<Character> source = new ArrayList<>();
    private static ArrayList<Integer> ife = new ArrayList<>();
    private static int data_pointer = 0;// memoria
    private static int program_counter = 0;// source
    private static final char[] op = {'<', '>', '[', ']', '$', '+', '-', '.', ','};
    public static void main(String[] args) {
      try {
        readFile(source, ife);
        //while(caractere != '$')
        for(var caractere : source) {
          switch(caractere) {
            case '<':
              data_pointer--;
              break;
            case '>':
              data_pointer++;
              break;
            case '[':
              break;
            case ']':
              break;
            case '$':
              break;
            case '+':
              memory[data_pointer]++;
              break;
            case '-':
              memory[data_pointer]--;
              break;
            case ',':
              memory[data_pointer] = ife.remove(0).byteValue();
              break;
            case '.':
              escreve_no_of(memory[data_pointer]);
              break;
            default:
              break;
          }
        }
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        
      }
     
    }

    public static void readFile(ArrayList<Character> source, ArrayList<Integer> ife) throws IOException {
      final String source_path = "/home/marcelo/Documents/interpretador/SOURCE";
      final String if_path = "/home/marcelo/Documents/interpretador/IF";
      try {
        
        //read source
        FileReader file = new FileReader(source_path);
        BufferedReader readFile = new BufferedReader(file);
        int c = 0;

        while((c = readFile.read()) != -1) {
          source.add((char) c);
        }

        file.close();

        //read ife
        file =  new FileReader(if_path);
        readFile = new BufferedReader(file);
        String line = readFile.readLine();
        while(line != null) {
          ife.add(Integer.parseInt(line));
        }

        file.close();

      } catch (IOException e) {
        System.err.printf("Erro na abertura do arquivo: %s.\n",
        e.getMessage());
      }    
      
    }

    public static void escreve_no_of(byte a) {

    }
  }