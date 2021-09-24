import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DomingoDeManha {
    public static void main(String[] args) throws IOException {
       // Scanner leitor = new Scanner(System.in);
        File test = new File("./src/Teste_domingo.txt");
        Scanner leitor = new Scanner(test);
        while ( leitor.hasNext() ) {
            String relogio = leitor.nextLine();
            LocalTime encontro = LocalTime.parse("08:00");
            LocalTime inicio = LocalTime.parse(relogio,DateTimeFormatter.ofPattern("H:mm"));
            Duration duracao = Duration.between(encontro,inicio);
            long t = duracao.toMinutes();
            t = t + 60;
            if ( t < 0 ){
                t = 0;
            }
            System.out.println("Atraso maximo: " + t);
        }
        leitor.close();
    }
}
/*
---->TEXTO ORIGINAL
Public Class Desafio{
public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        while (                  ) {
            String[] relogio = leitor.nextLine().split(":");
            int hora = Integer.parseInt(relogio[0]);
            int min = Integer.parseInt(relogio[1]);
            switch (      ) {
                case(7): System.out.println("Atraso maximo: " + min); break;
                case(8): System.out.println("Atraso maximo: " + (          ); break;
                case(9): System.out.println("Atraso maximo: " + (          ); break;
                default: System.out.println("Atraso maximo: 0");
            }
        } //
    }
}
 */