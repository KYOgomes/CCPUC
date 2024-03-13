//arquivo em java demonstração 
//criar um arquivo escrever no mesmo e ler o mesmo
import java.io.*;
import java.nio.charset.*;
import java.util.Scanner;

class arquivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        do {
            a = sc.nextLine();
            if (a.equals("FIM")) {
                return;
            }
            try {
                FileWriter fw = new FileWriter("arquivo.txt");
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(a);
                bw.close();
                fw.close();
            } catch (IOException e) {
                System.out.println("Erro: " + e.getMessage());
            }
            try {
                FileReader fr = new FileReader("arquivo.txt");
                BufferedReader br = new BufferedReader(fr);
                String linha = br.readLine();
                while (linha != null) {
                    System.out.println(linha);
                    linha = br.readLine();
                }
                br.close();
                fr.close();
            } catch (IOException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (!a.equals("FIM"));
        sc.close();
    }
}