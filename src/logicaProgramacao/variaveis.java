package logicaProgramacao;

public class variaveis {
    public static void main(String[] args) {

        /*
                Variáveis e Tipos Primitivos

                Variáveis são espaços na memória do computador onde podemos
                armazenar dados. Pense nelas como caixas onde podemos guardar
                valores.

                Declarações e Inicialização de variáveis

                Para declarar uma variável, especificamos seu tipo e seu nome.

                Por exemplo:
                int idade;
                Para inicializar uma variável, atribuímos um valor a ela:
                idade = 25;

                Convenções de Nomenclatura

                Nomes de variáveis devem começar com uma letra minúscula e
                seguir o padrão carmelCase.

                Por exemplo:
                idade, salarioMensal, primeiroNome




                 Tipos Primitivos

                 Existem 8 tipos primitivos em Java:

                 Inteiros: byte, short, int, long
                 Ponto Flutuante: float, double
                 Caractere: char (um único caractere unicode)
                 Booleano: boolean (Representa verdadeiro ou falso)


                 Long
                 Tamanho: 64bits (8bytes)
                 Faixa de valores entre:
                 - 9.223.372.036.854.775.8080
                 a
                 9.223.372.036.854.775.807

                 Para diferenciar um literal long de um int, adicionamos o sufixo
                 L ao final do número.

                 Por exemplo:
                 long num = 100L;
                 A declaração do long pode ser o L maiúsculo ou o l minusculo,
                 por convenção, recomenda-se a utilização do da letra maiúsculo
                 para evitar que a letra minuscula seja confundida com o número
                 1, já que dependendo da fonte, são bem similares.

                 Obs: Letra l e número 1, (long num = 100l / long num = 1001)1


                 Int
                 Tamanho: 32bits (4bytes)
                 Faixa de valores:
                 - 2.147.483.648
                 a
                 2.147.483.647

                 Por exemplo:
                 int num = 100;

         */


        int idade = 25;
        double salarioMensal = 3800.00;
        char genero = 'M';
        boolean empregadoJava = true;

        System.out.println("Idade: " + idade);
        System.out.println("Salário: R$ " + salarioMensal);
        System.out.println("Gênero: " + genero);
        System.out.println("Empregado: " + empregadoJava);


    }
}
