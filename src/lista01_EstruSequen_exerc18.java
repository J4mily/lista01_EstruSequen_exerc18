import java.util.Scanner;
/* Nome do Aluno: Franciely Jamily Queiroz Pereira
* RA: 13523113789
* Nome do Programa: Tempo aproximado de download do arquivo
* Descrição: 18.Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de 
    //Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).
* Data: 07/04/2023 */

public class lista01_EstruSequen_exerc18 {
    public static void main(String[] args) throws Exception {

		Scanner s = new Scanner(System.in);

		System.out.print("Informe o tamanho do arquivo para download em MB:");
        double tamanho = s.nextDouble();

        System.out.print("Informe a velocidade do link em Mbps:");
        double velocidade = s.nextDouble();

        double tempo = tamanho / velocidade;
        double min = tempo/60;

        System.out.printf("O tempo aproximado de download do arquivo em minutos será de %.2f minutos.",min);

        s.close();


    }
}
