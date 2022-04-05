/*Desafio

Em um país chamado SimCity existe o calculo de imposto onde todos os habitantes devem paga-lo
em dia, porém ainda não existe um sistema disponível em SimCity para ajuda-los a calcular os 
impostos de seus habitantes. No sistema o usuário deverá adicionar primeiramente seu nome, seguido 
de sua profissão(nome e profissão são variáveis diferentes). O usuário deverá inserir umm valor 
com duas casas decimais, equivalente ao salário de um habitante em SimCity para cada mês do ano. 
Calcule e mostre o valor que este habitante deve pagar de imposto referente a cada mês do seu 
salário, segundo a tabela abaixo.

RENDA TAXA DE IMPOSTO
de 0.00 a 2000.00       Isento
de 2001.00 a 3000.00    8%
de 3001.00 a 4500.00    18%
acima de 4500.00        28%

Exercícios - Aula 09
Lembre-se: seu sistema deverá disponibilizar um menu para o usuário com as opções de:
● cadastrar o nome do habitante e sua profissão.
● mostrar informações cadastradas(nome e profissão) de um habitante.
● mostrar salários cadastrados(12 salários respectivos de cada mês).
● calcular o imposto de cada mês.
● fornecer a opção de sair do sistema, (usar o comando System.exit(0) do Java). */

// pedir pro usuário inserir o nome
// inserir profissão
// inserir um valor de 2 casa equivalente ao salário PARA CADA MÊS
// criar um vetor para armazenar os valores do salário para cada mês
// criar um loop para rodar o vetor e inserir os valores
// o imposto pago é referente ao mês   --- dependendo do salário paga um imposto
// CRIAR UM MENU  --- menu vai rodar dentro do main
// cada tópico do menu é um método
// usar um IF para rodar os métodos

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[] usuario = new String[2];
        double salarios[] = new double[12];
        
        // FAZER UM MENU

        for(int a=0; a<100; a++){
        System.out.println("------------------------------------");
        System.out.println("Bem Vindo ao novo sistema de SimCity");
        System.out.println("------------------------------------");
        System.out.println("Escolha um número para ter acesso as opções:");
        System.out.println("1 - Cadastrar nome do habitante e sua profissão ");
        System.out.println("2 - Mostrar informações cadastradas de um habitante");
        System.out.println("3 - Cadastrar salários");
        System.out.println("4 - Imposto devido de cada mês");
        System.out.println("5 - Sair do sistema");

        int opcaoMenu = leitor.nextInt();

            if (opcaoMenu == 1){
                // rodar
                System.out.println("1 - Cadastrar nome do habitante e sua profissão ");
                System.out.println("Insira o seu nome: ");
                usuario[0] = leitor.next();
                System.out.println("Insira a sua profissão: ");
                usuario[1] = leitor.next();
                System.out.println("Usuário cadastrado");
                
            } else if (opcaoMenu == 2){
                System.out.println("2 - Mostrar informações cadastradas de um habitante");
                System.out.println(opcao2(usuario));

            } else if(opcaoMenu == 3){
                System.out.println("3 - Cadastrar salários");
                for(int i=0; i < salarios.length; i++){
                    System.out.println("Insira o valor de salário recebido no mês "+(i+1)+"º: ");
                    salarios[i] = leitor.nextDouble();
                }
                System.out.println("Salários cadastrados");

            } else if (opcaoMenu == 4){
                System.out.println("4 - Imposto devido de cada mês");
                for(int i=0; i < salarios.length; i++){
                    System.out.println("No "+(i+1)+"º mês o valor devido é de R$: ");

                    if(salarios[i] <= 2000.00){
                        System.out.println("Isento do pagamento de imposto.");

                    } else if (salarios[i] >= 2001.00 & salarios[i] <= 3000.00){
                        double imposto = salarios[i] * 8/100;
                        System.out.println(imposto);
                        
                    } else if (salarios[i] >= 3001.00 & salarios[i] <= 4500.00){
                        double imposto = salarios[i] * 18/100;
                        System.out.println(imposto);

                    } else if (salarios[i] > 4500.00){
                        double imposto = salarios[i] * 28/100;
                        System.out.println(imposto);

                    } else {
                        System.out.println("Informação inválida");
                    }
                }

            } else if(opcaoMenu == 5){
                System.out.println("5 - Sair do sistema");
                opcao5();

            } else {
                System.out.println("Número não reconhecido");
            }
            }
    }
    
    private static String opcao2(String[] usuario) {
        String cadastro = "Nome cadastrado: "+usuario[0]+"\nProfissão cadastrada: "+usuario[1];
        return cadastro;
    }

    private static void opcao5(){
        System.exit(0);
    }
}
