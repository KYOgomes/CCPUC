import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arquivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //numero de valores a serem lidos
        int n = sc.nextInt();

        //cria um arquivo chamado "arquivo.txt"
        File arq = new File("arquivo.txt");

        try {
            if (arq.createNewFile()) {
                //se o arquivo foi criado com sucesso, escreve os valores no arquivo
                FileWriter fw = new FileWriter(arq);
                for (int i = 0; i < n; i++) {
                    double num = sc.nextDouble();
                    fw.write(Double.toString(num));
                    fw.write(System.lineSeparator());
                }
                fw.close();
            } else {
                System.out.println("Arquivo já existe.");
            }

            // lê os valores do arquivo e armazena em uma lista
            Scanner fr = new Scanner(arq);

            //cria uma lista para armazenar os valores
            List<Double> numeros = new ArrayList<>();

            //lê os valores do arquivo enquando houver linhas
            while (fr.hasNextLine()) 
            {
                numeros.add(Double.parseDouble(fr.nextLine()));
            }
            fr.close();

            // imprime os valores de trás para frente
            for (int i = numeros.size() - 1; i >= 0; i--) {
                System.out.println(numeros.get(i));
            }

        } catch (IOException e) {
            System.out.println("Ocorreu um erro.");
            e.printStackTrace();
        }
        sc.close();
    }
}