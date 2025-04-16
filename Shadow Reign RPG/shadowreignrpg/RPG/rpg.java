import java.util.Scanner;
public class RPG {
     public static void main(String[] args) {

        
        // Começo da Criação

        Scanner entrada = new Scanner(System.in);

        Utils.mostrarTexto("Bem vindo a Shadow Reign RPG" , entrada);
        Utils.mostrarTexto("Para comecar, digite o nome do seu personagem:", entrada);

        // Nome do Personagem

        String nome = entrada.nextLine();

        System.out.println("MENU DO PERSONAGEM: " + nome);

        // Mostrar Classes 

        System.out.println("Escolha sua classe:");
        System.out.println("[1] Ronin - Possui 35 pontos de 'Defesa' maximo");
        System.out.println("[2] Samurai - Possui 50 pontos de 'Vida' maxima");
        System.out.println("[3] Shogun - Possui 40 pontos de 'Ataque' maximos");

        Personagem personagem = null;
        int escolhaClasse = 0;

        // Escolha de Classe

        while (personagem == null) {
            System.out.print("Digite o numero da classe: ");
            escolhaClasse = entrada.nextInt();
            entrada.nextLine();

            switch (escolhaClasse) {
            case 1 -> personagem = new Ronin (nome);
            case 2 -> personagem = new Samurai (nome);
            case 3 -> personagem = new Shogun (nome);
        default -> System.out.println("Opcao invalida, escolha a opcao [1] , [2] ou [3]");
}
        }

        // Mostrar os dados do personagem criado

        System.out.println();
        System.out.println("Parabens, " + personagem.getNome() + "!");
        System.out.println("Classe escolhida: " + personagem.getClasse());
        System.out.println("Vida: " + personagem.getVida());
        System.out.println("Ataque: " + personagem.getAtaque());
        System.out.println("Defesa: " + personagem.getDefesa());
        System.out.println("Aperte ENTER para continuar");
        entrada.nextLine();

        // História do Jogo

        Utils.mostrarTexto("CAPITULO 1 - Campo de Treinamento", entrada);
        Utils.mostrarTexto("MISSAO 1 - Dojo de BetimGakure", entrada);
        System.out.println();
        Utils.mostrarTexto(nome +" acaba de completar idade o suficiente para comecar a seguir o sonho de dominar a arte das laminas.", entrada);
        Utils.mostrarTexto("Ele vai para o dojo mais renomado de BetimGakure para iniciar seu teste para conseguir treinar com os melhores mestres da vila.", entrada);
        System.out.println("Aperta 'Enter' para continuar");
        entrada.nextLine();
        Utils.mostrarTexto("Ao chegar no dojo, ele se depara com um salao lotado de pessoas aguardando o exame.", entrada);
        System.out.println("*SOM DE TAMBOR*");
        Utils.mostrarTexto("No fim do dojo ele se nota que 3 mestres apareceram misteriosamente", entrada);
        Utils.mostrarTexto("Mestre Raiden: Bem vindos ao exame de admissao de soldados de BetimKagure, para comecar formem duplas", entrada);
        System.out.println("Aperte ENTER para continuar");
        entrada.nextLine();
        Utils.mostrarTexto("Todos estao conseguindo duplas, menos voce, que esta sozinho no meio do dojo", entrada);
        Utils.mostrarTexto("Voce reparou que sobrou uma unica pessoa sentada no canto do dojo, com a cabeca abaixada", entrada);
        System.out.println("Aperte ENTER para pedir para formar dupla com 'desconhecido'");
        entrada.nextLine();
        Utils.mostrarTexto(nome + ": Ei cara, voce quer ser minh...", entrada);
        Utils.mostrarTexto("O desconhecido levanta a cabeca e voce se assusta com o olhar intimidador dele", entrada);
        Utils.mostrarTexto("Desconhecido: Sua dupla? Claro *sorriso misterioso*", entrada);
        Utils.mostrarTexto("Voce se apresenta e ele se chama 'Daiki'", entrada);
        Utils.mostrarTexto("Mestre Kirishima: Agora que todos tem duplas, vamos comecar o exame", entrada);
        Utils.mostrarTexto("Mestre Kirishima: para comecar o aquecimento, cada dupla devera me mostrar resistencia ao golpe um do outro", entrada);
        Utils.mostrarTexto("Com o passar do tempo, chega a vez de voce e Daiki fazerem o teste...", entrada);
        Utils.mostrarTexto("Mestre Kirishima se aproxima...", entrada);
        Utils.mostrarTexto("Mestre Kirishima: quem vai primeiro?", entrada);
        Utils.mostrarTexto("Daiki: Pode ir, eu te espero", entrada);
        Utils.mostrarTexto(nome + ": Ok, me perdoe por isso", entrada);
        System.out.println("Aperte 'ENTER' para carregar o soco");
        entrada.nextLine();
        Utils.mostrarTexto("Voce soca o peito de Daiki com toda a sua forca, mas ele apenas olhou para seus olhos de cima pra baixo", entrada);
        Utils.mostrarTexto("Mestre Kirishima: Muito bom, sua vez agora garoto", entrada);
        System.out.println("Aperte 'ENTER' para carregar defesa");
        entrada.nextLine();
        Utils.mostrarTexto("Daiki soca seu peito no mesmo local que voce socou ele, voce quase nao viu a velocidade de seu punho, sua visao ficou tremula e quase vomita pela dor sentida", entrada);
        Utils.mostrarTexto(nome + ": Grunhidos de dor", entrada);
        System.out.println("O mestre Kirishima vai embora");
        Utils.mostrarTexto("Daiki: Ei " +nome + ", voce esta bem?", entrada);
        Utils.mostrarTexto(nome + ": Sim, so estou um pouco tonto", entrada);
        System.out.println();
// Escolha de Ação Cap (1) Mis (1)
       int escolha1 = 0;
    while (escolha1 == 0) {
    Utils.mostrarTexto("Escolha o que fazer:", entrada);
    Utils.mostrarTexto("[1] Fazer uma pergunta para Daiki", entrada);
    Utils.mostrarTexto("[2] Ir descansar no canto do dojo", entrada);
    escolha1 = entrada.nextInt();
    entrada.nextLine(); 

    switch (escolha1) {
        case 1 -> {
            Utils.mostrarTexto(nome + ": Posso te fazer uma pergunta?", entrada);
            Utils.mostrarTexto("Daiki: Claro, o que voce quer saber?", entrada);
            Utils.mostrarTexto(nome + ": Porque voce estava sentado sozinho no dojo?", entrada);
            Utils.mostrarTexto("Daiki: Acontece que nao sou daqui, vim apenas para testar a forca de outras pessoas da minha idade", entrada);
            Utils.mostrarTexto(nome + ": Entendi, boa sorte entao... eu acho, preciso descansar um pouco no canto do dojo, depois nos vemos", entrada);
            Utils.mostrarTexto("Daiki: Ok, ate mais", entrada);
        }
        case 2 -> {
            Utils.mostrarTexto(nome + ": Vou descansar um pouco no canto do dojo, depois nos vemos", entrada);
            Utils.mostrarTexto("Daiki: Ok, ate mais", entrada);
        }
        default -> {
            System.out.println("Opcao invalida, escolha a opcao [1] ou [2]");
            escolha1 = 0; 
        }
    }
}
 // Retornando a História
        Utils.mostrarTexto("Voce descansa ate escutar novamente uma batida de tambor! E sinal que os testes voltaram!", entrada);
        Utils.mostrarTexto("Mestre Enma: Muito bem, agora faremos um teste com espadas, sigam me por favor", entrada);
        Utils.mostrarTexto("O Mestre Enma leva voces a uma sala onde tem varios dummys de madeira e espadas de bambu", entrada);
        Utils.mostrarTexto("Mestre Enma: o teste consiste em quebrar o dummy, quem conseguir quebrar vai para proxima fase", entrada);
        Utils.mostrarTexto("O teste comeca com Daiki, ele com extrema facilidade parte o dummy ao meio", entrada);
        Utils.mostrarTexto("Voce fica surpreso com tamanha forca de Daiki, mas ao olhar pro lado percebe um garoto com medo tremendo", entrada);
        Utils.mostrarTexto("Ao analisar o dummy dele voce percebe que tem uma rachadura bem no comeco da cabeca", entrada);
        Utils.mostrarTexto("*Sussuros* eu nao vou conseguir, eu nao vou conseguir...", entrada);
        Utils.mostrarTexto("Voce se aproxima do garoto e pergunta se ele esta bem", entrada);
        Utils.mostrarTexto("Garoto: Eu nao consigo quebrar o dummy, eu sou muito fraco", entrada);
        Utils.mostrarTexto(nome + ": Calma, escuta so, bate bem naquela rachadura da cabeca dele", entrada);
        Utils.mostrarTexto("Garoto: Ta, ta bom! eu vou tentar", entrada);
        Utils.mostrarTexto("Garoto: Muito obrigado senhor", entrada);
        Utils.mostrarTexto("Por nada, me chama de " +nome + "!", entrada);
        Utils.mostrarTexto("Garoto: ok, alias, meu nome e Angyuu", entrada);
        Utils.mostrarTexto("Chega a vez de Angyuu quebrar o dummy, e no primeiro golpe nada acontece...", entrada);
        Utils.mostrarTexto("O que voce decide fazer?", entrada);
        Utils.mostrarTexto("[1] Incentivar Angyuu", entrada);
        Utils.mostrarTexto("[2] Ficar em silencio e apenas observas", entrada);
 // Escolha de Ação Cap (1) Mis (1)
        int escolha2 = 0;
        while(escolha2 == 0) {
            escolha2 = entrada.nextInt();
            entrada.nextLine();

            switch (escolha2) {

            case 1-> {
                Utils.mostrarTexto(nome + ": Vamo la Angyuu, voce consegue! se concentra", entrada);
            }
            case 2-> {
                Utils.mostrarTexto(nome + " *observa*", entrada);
            }
            default -> {
                System.out.println("Opcao invalida, escolha a opcao [1] ou [2]");
                escolha2 = 0; 
            }
         }
    }
        Utils.mostrarTexto("De repente Angyuu parece se concentrar e dar um golpe certeiro que quebra o dummy", entrada);
        Utils.mostrarTexto("Angyuu: Eu consegui! Muito obrigado " +nome + "!", entrada);
        Utils.mostrarTexto(nome + ": Que nada Angyuu, voce que fez tudo isso", entrada);
        Utils.mostrarTexto("Mestre Enma: Muito bem, sua vez agora, garoto!", entrada);
// Escolha de Ação Cap (1) Mis (1)
        int escolha3 = 0;
        while (escolha3 == 0) {
        Utils.mostrarTexto("O que voce decide fazer?", entrada);
        Utils.mostrarTexto("[1] Respirar fundo e tentar quebrar o dummy", entrada);
        Utils.mostrarTexto("[2] Usar toda sua forca para quebrar o dummy", entrada);
        Utils.mostrarTexto("[3] Focar em um ataque concentrado no meio do dummy", entrada);
        escolha3= entrada.nextInt();
        entrada.nextLine();

        switch(escolha3) {
            case 1-> {
                 Utils.mostrarTexto(nome + ": *Respira fundo e da um ataque que quebra o dummy*", entrada);
            }
            case 2->  {
                Utils.mostrarTexto(nome + ": *Usa toda sua forca e quebra o dummy*", entrada);
            }
            case 3-> { 
                Utils.mostrarTexto(nome + ": *Foca em um ataque concentrado e quebra o dummy com um ataque poderoso*", entrada);
            }
            default -> {
                System.out.println("Opcao invalida, escolha a opcao [1], [2] ou [3]");
                escolha3 = 0;
            }
        }
        }
        Utils.mostrarTexto("Mestre Enma: Muito bom garoto, voce passou!", entrada);
        Utils.mostrarTexto("Mestre Enma: Todos os que passaram sigam por favor o Mestre Raiden", entrada);
        Utils.mostrarTexto(nome + " e Angyuu seguem o Mestre Raiden para um salao de combate", entrada);
        Utils.mostrarTexto("Mestre Raiden: Chegamos no exame final, para ser aprovado sera necessario batalhar e vencer seu oponente", entrada);
        Utils.mostrarTexto("Mestre Raiden: Cada um pegue um papel proximo a porta", entrada);
        Utils.mostrarTexto("Voce pega um papel e abre, e nele esta escrito o numero 12", entrada);
        Utils.mostrarTexto(nome + ": Ei Angyuu, qual numero voce tirou?", entrada);
        Utils.mostrarTexto("Angyuu: Eu tirei o numero 3", entrada);
        Utils.mostrarTexto("Mestre Raiden: Os numeros vao de 1 a 12, o numero 1 batalhara contra o 2, o 3 contra o 4 e assim consecutivamente...", entrada);
        Utils.mostrarTexto("O tempo vai passando ate chegar a hora de Angyuu, e voce percebe que Daiki se levantou para batalhar tambem", entrada);
        Utils.mostrarTexto("Mestre Raiden: O numero 3 e 4, por favor se apresentem", entrada);
        Utils.mostrarTexto(nome + ": Boa sorte Angyuu", entrada);
        System.out.println();
        System.out.println("A batalha comeca");
        Utils.mostrarTexto("Angyuu tenta avancar usando taticas, porem Daiki e muito mais forte e rapido, em poucos segundos ele domina a luta", entrada);
        Utils.mostrarTexto("Todos percebem que Angyuu nao tem chances, Daiki continua dominando a batalha sem esforco",entrada);
        Utils.mostrarTexto("Daiki: Ok, eu desisto", entrada);
        Utils.mostrarTexto("Mestre Raiden: Tem certeza?", entrada);
        Utils.mostrarTexto("Daiki: Sim, eu desisto", entrada);
        Utils.mostrarTexto("Mestre Raiden: Ok, o vencedor e o numero 3", entrada);
        Utils.mostrarTexto("Todos do dojo acham esquisito e comecam a comentar, enquanto isso voce percebe Daiki indo embora", entrada);
        Utils.mostrarTexto(nome + ": Ei Angyuu, esse cara e um monstro natural, ele e muito forte", entrada);
        Utils.mostrarTexto("Angyuu: Sim, eu nao fui com a cara dele", entrada);
        System.out.println();
        System.out.println("Aperte 'ENTER' para continuar");
        entrada.nextLine();
        Utils.mostrarTexto("O exame prossegue...", entrada);
        Utils.mostrarTexto("Chegou sua vez, logo voce ve seu oponente se levantando e se prepara para batalha", entrada);
        Utils.mostrarTexto("Mestre Raiden: O numero 11 contra o numero 12, por favor se apresentem", entrada);
        System.out.println();
        System.out.println("Aperte 'Enter' para batalhar");
        entrada.nextLine();
        
        
        entrada.close();
    }
}