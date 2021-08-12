package programas;

import java.util.Scanner;
import classes.Pessoas;

public class Programa01 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcao = 0, c = 0;

    Pessoas[] p = new Pessoas[3];

    do {
      System.out.println("Escolha uma opção:");
      System.out.println("1 - Incluir pessoa");
      System.out.println("2 - Listar todos os cadastrados");
      System.out.println("0 - Finalizar o programa");
      System.out.println("");
      System.out.print("Opção: ");

        opcao = sc.nextInt();
      
      switch (opcao) {
        case 0:
          System.out.println("Fim do programa!");
          break;
        case 1:
        try {
          System.out.println("");
          p[c] = new Pessoas();
          Scanner n = new Scanner(System.in);
          System.out.printf("Nome da %d Pessoa: ", c + 1);
          String nome = n.nextLine();
          p[c].setNome(nome);

          Scanner sobren = new Scanner(System.in);
          System.out.printf("Sobrenome da %d Pessoa: ", c + 1);
          String sobreNome = sobren.nextLine();
          p[c].setSobreNome(sobreNome);

          Scanner tel = new Scanner(System.in);
          System.out.printf("Telefone da %d Pessoa: 21", c + 1);
          long telefone = tel.nextLong();
          p[c].setTelefone(telefone);   
          System.out.println("");

          System.out.println("=====================================================");
          System.out.println(p[c].getNome() + " cadastrado(a) com sucesso!");
          System.out.println("=====================================================");
          c++;
        }
        catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("=====================================================");
          System.out.println("Número máximo de cadastrados!");
          System.out.println("=====================================================");
        }
          break;
        case 2:
        if(p[0] == null) {
          System.out.println("=====================================================");
          System.out.println("Nenhuma pessoa cadastrada até o momento!");
          System.out.println("=====================================================");
        }
        else {
          try {
            System.out.println("=====================================================");
            System.out.println("Pessoas Cadastradas: ");
            System.out.println("");
            for(Pessoas i : p) {
            System.out.println("Nome: " + i.getNome());
            System.out.println("Sobrenome: " + i.getSobreNome());
            System.out.println("Telefone: " + i.getTelefone());
            System.out.println("=====================================================");
            }
          }
          catch(NullPointerException e) {
            System.out.println("");
          }
        }
          break;
        default:
          System.out.println("Opção inválida!");
          break;
      }
    } while (opcao != 0);

    sc.close();
  }
}