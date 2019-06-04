import java.util.*;

import java.awt.Desktop;
import java.io.File;
import java.net.URL;

public class mainTeste2 {

  public static String[] corpoPersonagem = new String[8];
  public static String nomeHeroi;
  public static int HP = 300, eHP = 40;
  public static int respect = 15;

  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);
    int start, escolha;

    System.out.println("\n__          ________          __   _____                            _\n"
        + "\\ \\        / / __ \\ \\        / /  / ____|                          (_)            \n"
        + " \\ \\  /\\  / / |  | \\ \\  /\\  / /  | |     __ _ _ __ ___  _ __   __ _ _ _ __   __ _ \n"
        + "  \\ \\/  \\/ /| |  | |\\ \\/  \\/ /   | |    / _` | '_ ` _ \\| '_ \\ / _` | | '_ \\ / _` |\n"
        + "   \\  /\\  / | |__| | \\  /\\  /    | |___| (_| | | | | | | |_) | (_| | | | | | (_| |\n"
        + "    \\/  \\/   \\____/   \\/  \\/      \\_____\\__,_|_| |_| |_| .__/ \\__,_|_|_| |_|\\__, |\n"
        + "                                                       | |                   __/ |\n"
        + "                                                       |_|                  |___/ ");
    System.out.println(
        "Seja bem-vindo a uma pequena experiência em uma fantastica narrativa dentro no universo de Warcraft (A Queda de Ventobravo)");
    System.out.println("(1) - Começar (2) - Sair");
    System.out.print("Escolha uma Opção: ");
    start = ler.nextInt();

    if (start == 1) {

      Inicio();
      escolha = escolhaPersonagem();

      if (escolha == 1) {// Atribui os equipamentos da Aliança, Linha de historia da Aliança
        escolha = 0;
        escolha = historiaAliança01();

        if (escolha == 1) {// Historia Karazan

        } else { // Hitoria Queda de Vento-Bravo
          historiaQuedaDeVentoBravo();
          finalHistoriaAlinaca();
        }

      } else {// Atribui os equipamentos da Horda, Linha de historia da Horda
        escolha = 0;
        escolha = historiaHorda01();
        if (escolha == 1) {// Historia Missão Especial

        } else { // Hitoria Queda de Vento-Bravo
          historiaConquistaVentoBravo();
          finalHistoriaHorda();

        }
      }

    }

    System.out.println("Obrigado por jogar :)\nFelipe Oliveira\nGuilherme Correia");

  }

  static void Inicio() { // Inicio da Historia (100%)
    Scanner er = new Scanner(System.in);
    String vazio;
    int respeito = 15;

    // Introdução de entrada da Historia.
    System.out.println(
        "Enquanto Kil'jaeden preparava a Horda para a invasão de Azeroth, Medivh continuava a lutar por sua alma contra Sargeras. O rei Llane, o nobre monarca de Ventobravo, ficou cauteloso com a escuridão que parecia manchar o espírito de seu ex-amigo.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println(
        "O rei Llane compartilhou suas preocupações com Anduin Lothar, o último descendente da linhagem Arathi, a quem ele nomeou seu tenente de armas. Mesmo assim, nenhum homem poderia imaginar que a lenta descida de Medivh à loucura provocaria os horrores que estavam por vir.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println(
        "Como um incentivo final, Sargeras prometeu conceder grande poder a Gul'dan se ele concordasse em liderar a Horda para Azeroth. Através de Medivh, Sargeras disse ao bruxo que ele poderia se tornar um deus vivo se ele encontrasse a tumba submarina onde o Guardiã Aegwynn havia colocado o corpo aleijado de Sargeras quase mil anos antes.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println(
        "Gul'dan concordou e decidiu que uma vez que os habitantes de Azeroth fossem espancados, ele encontraria a lendária tumba e reivindicaria sua recompensa. Assegurando que a Horda serviria a seus propósitos, Sargeras ordenou que a invasão começasse.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println(
        "Este portal fazia a ponte entre Azeroth e Draenor, e era grande o suficiente para que exércitos passassem por ele. Gul'dan despachou orcs pelo portal para inspecionar as terras que eles conquistariam. Os batedores de retorno asseguraram ao Conselonselho das Sombras que o mundo de Azeroth estava maduro para a tomada.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println(
        "Ainda convencido de que a corrupção de Gul'dan iria destruir o seu povo, Durotan falou contra os warlocks mais uma vez. O bravo guerreiro alegou que os bruxos estavam destruindo a pureza do espírito dos orcs e que essa invasão imprudente seria o destino deles. Gul'dan, incapaz de se arriscar a matar um herói tão popular, foi forçado a exilar Durotan e seu Frostwolf Clan nos confins deste novo mundo.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println(
        "Depois que os Frostwolves exilados invadiram o portal, apenas alguns clãs orcs seguiram. Esses orcs rapidamente montaram uma base de operações dentro do Black Morass, uma área escura e pantanosa distante ao leste do reino de Stormwind. Quando os orcs começaram a se ramificar e explorar as novas terras, eles entraram em conflito imediato com os defensores humanos de Ventobravo.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println(
        "Embora essas escaramuças terminassem rapidamente, eles fizeram muito para ilustrar as fraquezas e forças de ambas as espécies rivais. Llane e Lothar nunca foram capazes de coletar dados precisos dos números dos orcs e só podiam adivinhar a força que teriam que enfrentar.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println(
        "Depois de alguns anos, a maioria da Horda dos orcs havia entrado em Azeroth, e Gul'dan considerou que chegara a hora do primeiro ataque contra a humanidade. A Horda lançou toda a sua força contra o reino desavisado de Ventobravo. ");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

  }

  static int escolhaPersonagem() {// Escolha o lado da batalha (100%)
    Scanner sc = new Scanner(System.in);
    Scanner cs = new Scanner(System.in);
    String vazio;
    int escolha;

    System.out.println("Escolha o seu lado da batalha");
    System.out.println(
        "Aliança: VocÊ vai ser um jovem soldado humano e vai  defender a cidade  das forças poderoça que marcham en direção a Vento Bravo");
    System.out.println("OU");
    System.out.println(
        "Horda: Você vai assumir um Orc conrrompido pelo Sangue Vil do Clã Lobos de Gelo e ajudara a nova Horda a conquistar com o sangeu e furia o seu novo lar ");
    System.out.println("(1) - Alinça (2) - Horda");
    System.out.print("Faça a sua escolha: ");
    escolha = sc.nextInt();

    if (escolha == 1) {// Escolheu Aliança
      System.out.println("VOCÊ ESCOLHEU ALIANÇA");
      String equipamentoAlianca[] = { "Elmo-Ventobraviano", "Peitoral-Ventobraviano", "Mão Esquerda ", "Mão Direita",
          "Constas", "Cintura", "Perneiras-Ventobravo", "Botas-Ventobravianas" };

      for (int i = 0; i < equipamentoAlianca.length; i++) {
        corpoPersonagem[i] = equipamentoAlianca[i];
      }
      try {
        URL url = mainTeste2.class.getResource("imagens/allianceSoldier.jpg");
        Desktop desktop = Desktop.getDesktop();

        File file = new File(url.getFile());

        desktop.open(file);

      } catch (Exception e) {
        System.out.println("Erro");
        e.printStackTrace();
      }
      System.out.print("Escolha o nome do seu personagem: ");
      nomeHeroi = cs.nextLine();
      System.out.println("Seja bem-vindo ao Jogo, " + nomeHeroi);
      System.out.print("Aperte ENTER para continuar");
      vazio = cs.nextLine();

      return 1;
    } else {// Escolheu Horda
      System.out.println("VOCÊ ESCOLHEU HORDA");
      String equipamentoHorda[] = { "Cabeça:", "Peitoral do Sentinela", "Mão Esquerda ", "Mão Direita", "Constas",
          "Cintura", "Perneiras do Sentinela", "Botas do Sentinela" };

      for (int i = 0; i < equipamentoHorda.length; i++) {
        corpoPersonagem[i] = equipamentoHorda[i];
      }

      try {
        URL url = mainTeste2.class.getResource("imagens/orcSoldier.png");
        Desktop desktop = Desktop.getDesktop();

        File file = new File(url.getFile());

        desktop.open(file);

      } catch (Exception e) {
        System.out.println("Erro");
        e.printStackTrace();
      }
      System.out.print("Escolha o nome do seu personagem: ");
      nomeHeroi = cs.nextLine();
      System.out.println("Seja bem-vindo ao Jogo " + nomeHeroi);
      System.out.print("Aperte ENTER para continuar");
      vazio = cs.nextLine();

      return 2;
    }
  }

  static void InventarioAliançaparte1() { // Mostra os equipamentos e mapa parte1 (100%)
    Scanner ler = new Scanner(System.in);
    int i, escolha, sair = 0;

    do {
      System.out.println("Escolha uma Opção");
      System.out.print("[1] - Mapa [2] - Inventario: ");
      escolha = ler.nextInt();

      if (escolha == 1) {
        System.out.println("MAPA");
        try {
          URL url = mainTeste2.class.getResource("imagens/mapaAliancepart1.png");
          Desktop desktop = Desktop.getDesktop();

          File file = new File(url.getFile());

          desktop.open(file);

        } catch (Exception e) {
          System.out.println("Erro");
          e.printStackTrace();
        }
        escolha = 0;
      }
      if (escolha == 2) {
        System.out.println("INVENTARIO");
        for (i = 0; i < corpoPersonagem.length; i++) {
          System.out.print(corpoPersonagem[i] + " ");

        }

        System.out.println("\n     .-.\n" + "    _|=|_ - " + corpoPersonagem[0] + "\n" + "   (/`-`\\) - "
            + corpoPersonagem[1] + "\n" + "  //\\___/\\\\ - " + corpoPersonagem[4] + "\n" + "  <>/   \\<> - "
            + corpoPersonagem[2] + " - " + corpoPersonagem[3] + "\n" + "    \\|.|/  - " + corpoPersonagem[5] + "\n"
            + "     <I> - " + corpoPersonagem[6] + "\n" + "     |||\n" + "     /|\\ - " + corpoPersonagem[7]);
        System.out.println();

        escolha = 0;
      }

      System.out.println("Deseja Sair? ");
      System.out.print("[1] Voltar Inventario [2] - Sair: ");
      escolha = ler.nextInt();

      if (escolha == 2) {
        sair = 1;
      }

    } while (sair == 0);

  }

  static void InventarioHordaparte1() { // Mostra os equipamentos e mapa parte1 (100%)
    Scanner ler = new Scanner(System.in);
    int i, escolha, sair = 0;

    do {
      System.out.println("Escolha uma Opção");
      System.out.print("[1] - Mapa [2] - Inventario: ");
      escolha = ler.nextInt();

      if (escolha == 1) {
        System.out.println("MAPA");
        try {
          URL url = mainTeste2.class.getResource("imagens/mapaHordepart1.png");
          Desktop desktop = Desktop.getDesktop();

          File file = new File(url.getFile());

          desktop.open(file);

        } catch (Exception e) {
          System.out.println("Erro");
          e.printStackTrace();
        }
        escolha = 0;
      }
      if (escolha == 2) {
        System.out.println("INVENTARIO");
        for (i = 0; i < corpoPersonagem.length; i++) {
          System.out.print(corpoPersonagem[i] + " ");

        }

        System.out.println("\n     .-.\n" + "    _|=|_ - " + corpoPersonagem[0] + "\n" + "   (/`-`\\) - "
            + corpoPersonagem[1] + "\n" + "  //\\___/\\\\ - " + corpoPersonagem[4] + "\n" + "  <>/   \\<> - "
            + corpoPersonagem[2] + " - " + corpoPersonagem[3] + "\n" + "    \\|.|/  - " + corpoPersonagem[5] + "\n"
            + "     <I> - " + corpoPersonagem[6] + "\n" + "     |||\n" + "     /|\\ - " + corpoPersonagem[7]);
        System.out.println();

        escolha = 0;
      }

      System.out.println("Deseja Sair? ");
      System.out.println("[1] Voltar Inventario [2] - Sair: ");
      escolha = ler.nextInt();

      if (escolha == 2) {
        sair = 1;
      }

    } while (sair == 0);

  }

  static int historiaAliança01() {// Historia introdução Aliança Etapa 1 (100%)
    Scanner er = new Scanner(System.in);
    Scanner re = new Scanner(System.in);
    String vazio;
    int escolha;

    // Introdução de entrada da Historia.
    System.out.println("HP - " + HP);
    System.out.println(
        "Quando as forças de Azeroth e da Horda se enfrentaram no reino, os conflitos internos começaram a pesar nos dois exércitos. O rei Llane, que acreditava que os orcs bestiais eram incapazes de conquistar Azeroth, detestava sua posição em sua capital, Ventobravo. No entanto, Sir Lothar convenceu-se de que a batalha deveria ser levada diretamente ao inimigo, e ele foi forçado a escolher entre suas convicções e sua lealdade ao rei.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        nomeHeroi + " é um renomado Sargento e um fiel subordinado do 1 tenente Vladimir do 25 batalhão de infantaria");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "Vocês dois se encontra na sala de guerra dentro da bastilha de Vento Bravo onde se encontra o Rei Llane  e seu comandantes.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "Entre eles o Sir Lothar um dos maiores comandante da Aliança e o único da mês que tinha enfrentados as novas ameças e saiu vivo e o Arch Mago Hadigar um iniciante de mago arcano e aluno da faculdade de Dalaran.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "Entre eles o Sir.Lothar um dos maiores comandante da Aliança e o único que tinha enfrentado a nova ameça e saiu vivo para contar a historia e o Arch Mago Haddigar um iniciante de mago arcano e aluno da faculdade de Dalaran.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    int numeroAleatorio = (int) (Math.random() * 10);
    if (numeroAleatorio > 8) {
      System.out.println("Você nota que há um livro jogado no chão \nDeseja ler o livro? \n Sim - 1 \n Não - 2");
      escolha = re.nextInt();
      if (escolha == 1) {
        System.out.println("VOcê acha um livro chamado Chuvas de Castamere que conta uma história fictícia");
        System.out.println(
            "As Chuvas de Castamere é uma canção, que descreve a esmagadora vitória de Lorde Tywin Lannister sobre a rebelde Casa Reyne de Castamere, e a destruição da Casa no final de sua rebelião. A canção é, normalmente, cantada como uma lembrança do destino que espera aqueles que enfrentam Tywin Lannister, ou qualquer Lannister de Rochedo Casterly.");
        System.out.println(
            "E quem é você, disse o altivo senhor,\npra que a vênia seja profunda?\nSó um gato com um manto diferente,\nessa é a verdade fecunda.\nNum manto de ouro ou num manto vermelho,\nsuas garras um leão mantém,\ne as minhas são longas e afiadas, senhor,\ncomo o senhor as tem também.\nE assim falou, e assim falou,\no senhor de Castamere,\nmas agora a chuva chora no seu salão,\ne ninguém está lá para a ver.\nSim, agora a chuva chora no seu salão,\ne ninguém está lá para a ver.");
      }
    }

    System.out.println("HP - " + HP);
    System.out.println(
        "Depois de ver tantas notícias ruim de batalhões caindo, vilas queimadas, e morte.\nVladimir percebendo isso e foi  em sua direção.\ndireciona a palavra a você.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("Vladimir - Com medo Nome do jogador?");
    System.out.println("Qual a sua Resposta ?");
    System.out.print("(1) - Sim (2) - não");
    escolha = re.nextInt();

    if (escolha == 1) {
      System.out.println("HP - " + HP);
      System.out.println("Sim. Mas isso me faz pensar melhor pelo que está por vir !");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }
      System.out.println();
      escolha = 0;

    } else {

      System.out.println("HP - " + HP);
      System.out.println(
          "Vladimr olha para você com o olhar sério e fala\nPois deveria não sabemos como nosso inimigo luta, eles estão conquistando província após província logo logo estaram aqui");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }
      System.out.println();
      escolha = 0;
    }

    System.out.println("HP - " + HP);
    System.out.println(
        "Em Seguida entra um soldado correndo levando em sua mão uma mensagem sobre o forte Mirante de Pedra em Montanhas Cristarrubra e entrega o pergaminho ao Capital de Portões Leonidas.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("Você quer escutar Leonidas lendo o relatório ?");
    System.out.println("Qual a sua Resposta ?");
    System.out.print("(1) - Sim (2) - Não");
    escolha = re.nextInt();

    if (escolha == 1) {
      System.out.println("HP - " + HP);
      System.out.println("Você se levanta e se aproxima da mesa de guerra");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Leônidas lê para todos proximos a mesa:");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("Relátorio:");
      System.out.print("\n    _______________________________________________________\n"
          + "    /\\                                                      \\\n"
          + "(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n"
          + "    \\/''''''''''''''''''''''''''''''''''''''''''''''''''''''/\n"
          + "    (                                                      (\n"
          + "     )                                                      )\n"
          + "    (                                                      (\n"
          + "     ) As forças dos Peles Verdes  atacaram as terras de   )\n"
          + "    ( Montanhas Cristarrubra,                              (\n"
          + "     ) queimando a Vila Placida e raptando os seus moradores.) \n"
          + "    (  As torres de magos de Ilgalar  estão  em chamas,     (\n"
          + "     ) estão utilizando o Mirante de Pedra como forte sem    )\n"
          + "    (  nenhuma noticias de sobreviventes, e o suposto       (\n"
          + "     )  comandante                                           )\n"
          + "    ( Blackhand está morto, os Clãs de Orcs estão seguindo  (\n"
          + "     ) um novo Orc chamado Orgrim Doomhammer considerado     )\n"
          + "    (  o novo                                               (\n"
          + "     ) Warchief e marcham em direção a Vento Bravo com Armas )\n"
          + "    ( de cerco                                              (\n"
          + "     ) PS: Os líderes Gul'dan e Durotan e seu              )\n"
          + "    (  clã não foram localizados                            )\n"
          + "     (                                                     (\n"
          + "     )                                                      )\n"
          + "    (                                                      (\n"
          + "    /\\''''''''''''''''''''''''''''''''''''''''''''''''''''''\\    \n"
          + "(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n"
          + "    \\/______________________________________________________/");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();
      System.out.println("HP - " + HP);
      System.out.println(
          "-Haddgar fala\nHaddgar: As minhas fontes afirmam que através de um esforço conjunto, Medivh e os Warlocks do conselho das Sombras abriram o portal dimensional.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("-Rei Llane argumenta\nRei Llane: Hadgar Lothar, Vão para Karazan deter Mediv!");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }
      System.out.println();

      escolha = 0;
      System.out.println("Você quer escutar Leonidas lendo o relatório ?");
      System.out.println("Qual a sua Resposta ?");
      System.out.print("(1) - Sim (2) - Não");
      escolha = re.nextInt();

      if (escolha == 1) {
        System.out.println("HP - " + HP);
        System.out.println("Senhor! \nAntes mesmo de voce fala com o Comandante Lothar");
        System.out.println("Vladimir não confia nas suas habilidades");
        System.out.println("Vladimir: Não! " + nomeHeroi + " Preciso de você nas Muralhas!");
        System.out.print("Aperte ENTER para continuar");
        System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
        vazio = er.nextLine();
        if (vazio.equals("i")) {
          InventarioAliançaparte1();
          vazio = null;
        }
      }

    }

    System.out.println(
        "(Todos na sala escutam as trombetas na cidade)\n -Rei Llane dá as Ordens\nRei Llane: TODOS NA SUA POSIÇÃO!\n Rei Llane:PELA ALIANÇA!!!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    corpoPersonagem[2] = "Arco Longo";
    corpoPersonagem[3] = "Arco Longo";
    corpoPersonagem[5] = "Espada Curta";

    return 2; // Chama Main Quest historiaQuedaDeVentoBravo();

  }

  static int historiaHorda01() {// Historia introdução Horda Etapa 1
    Scanner er = new Scanner(System.in);
    Scanner re = new Scanner(System.in);
    String vazio;
    int escolha;

    System.out.println("HP - " + HP);
    System.out.println("Depois de conquistarem terras após terras, a horda desce em direção ao Sul.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "Você consegui escapar da traição do Conselho das Sombras após ver seu lider Durotan e sua mulher Greta serem assassinados pelo clã da Lua Negras, comandados por Gul’Dan...");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "Você e seus amigos  Sion, Yorick e a meia Orc Garona fogem em direção ao Sul para se encontrar com os outros Clãs Orc para informar o acontecimento.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "Voces chegam em uma região de campinas, onde tem grandes campos de plantio mas com rastros de destruição...");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out
        .println("Ao leste, uma grande fumaça preta cobre o ceú. \nVocês resolvem verificar oque está acontecendo...");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("(Alguns minutos de caminhada)");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "Ao meio dia vocês passam ao lado de torres em chamas, logo mais acima da montanha, conseguem ver a bandeira da Horda tribulando em cima de um castelo de pedra");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "Em seu portão conseguem ver BlackHand segurando um jovem soldado humano pelo pescoço e a outra sua Garra Longa atravessando a sua barriga.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    // int numeroAleatorio = (int) (Math.random() * 10);
    // if(numeroAleatorio>5){
    // System.out.print("Você acabou demonstrando empatia pelo humano...");
    // respect--;
    // }
    // else{
    // System.out.print("Você não demonstra empatia pelo humano...");
    // respect++;
    // }

    System.out.println("HP - " + HP);
    System.out.println(
        "Ao se aproximarem Ogrim fica feliz que o clã de seu melhor amigo veio se juntar a eles\n Mas logo percebe o pior apenas vendo vocês três\nBlackHand direciona um olhar de satisfeito e com um sorriso sarcastico.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Você sabe que Ogrim DoonHammer é o melhor amigo de Durotan");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Você quer passar as noticias para Ogrim ou BlackHand ?");
    System.out.println("Qual a sua Resposta ?");
    System.out.print("(1) - BlackHand (2) - Ogrim");
    escolha = re.nextInt();

    if (escolha == 1) {// Fala com o BlackHand
      System.out.println("HP - " + HP);
      System.out.println(
          "Warchief BlackHand tivemos uma traição entre nos.\nFomos atacado pelo clã Lua Negra a uma noite Durotan e Greta foram mortos!");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioHordaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("BlackHand olha com um olhar de satisfeitos e diz!");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioHordaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("E a Criança ?");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioHordaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Acredito que tambem está morta !");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioHordaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Os fracos nunca terão vez no novo mundo");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioHordaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out
          .println("Você fica assuntado com a resposta\nMas não pode fazer nada por que você é apenas um Soldado");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioHordaparte1();
        vazio = null;
      }
      System.out.println();

      escolha = 0;
    } else {

      escolha = 0;
      System.out.println("HP - " + HP);
      System.out.println("Você quer passar as noticia  para Ogrim?");
      System.out.println("Qual a sua Resposta ?");
      System.out.print("(1) - Sim (2) - Não");
      escolha = re.nextInt();

      if (escolha == 1) {
        System.out.println("HP - " + HP);
        System.out.println(
            "Ogrim! Ogrim DoonHammer! fomos traido o Clã Lua Negra nos atacou durante a noite não tivemos chance de nos defender\n Durotan e Greta estão mortos");
        System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
        vazio = er.nextLine();
        if (vazio.equals("i")) {
          InventarioHordaparte1();
          vazio = null;
        }
        System.out.println();

        System.out.println("HP - " + HP);
        System.out.println("Isso não é possível\n Durotan, Greta meu amigo!,");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

        System.out.println("HP - " + HP);
        System.out.println("E o filho deles ?");
        System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
        vazio = er.nextLine();
        if (vazio.equals("i")) {
          InventarioHordaparte1();
          vazio = null;
        }
        System.out.println();

        System.out.println("HP - " + HP);
        System.out.println("Não Sabemos!");
        System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
        vazio = er.nextLine();
        if (vazio.equals("i")) {
          InventarioHordaparte1();
          vazio = null;
        }
        System.out.println();

        System.out.println("HP - " + HP);
        System.out.println("Ogrim direciona o olhar com muita raiva para BlacHand");
        System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
        vazio = er.nextLine();
        if (vazio.equals("i")) {
          InventarioHordaparte1();
          vazio = null;
        }
        System.out.println();

      } else {
        System.out.println("HP - " + HP);
        System.out.println("Garona olha para com olhar de raiva e diz");
        System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
        vazio = er.nextLine();
        if (vazio.equals("i")) {
          InventarioHordaparte1();
          vazio = null;
        }
        System.out.println();

        System.out.println("HP - " + HP);
        System.out.println("Quem é o Traidor ?!");
        System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
        vazio = er.nextLine();
        if (vazio.equals("i")) {
          InventarioHordaparte1();
          vazio = null;
        }
        System.out.println();

      }
    }
    System.out.println("HP - " + HP);
    System.out.println(
        "Ao anoitecer o você se encontra sentado em um banco em um corredor de pedra dentro da fortaleza recém-conquistada perto de uma das salas que os lideres dos clãs estão discutindo os próximos passos.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Ao seu lado o seu amigo Sion");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Você quer fala com Sion?");
    System.out.print("(1) - Sim (2) - Não");
    escolha = re.nextInt();

    if (escolha == 1) {
      System.out.println("HP - " + HP);
      System.out.println("você vira para o seu amigo e fala");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioHordaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Oque você acha que vai acontecer com o nosso clã logo que o nosso lider esta morto?");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioHordaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Antes mesmo de Sion começar a falar, você olha para o lado...");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioHordaparte1();
        vazio = null;
      }
      System.out.println();
      escolha = 0;

    }
    System.out.println("HP - " + HP);
    System.out
        .println("Você vê Ogrim e Garona em passos rapidos em direção a porta onde estão os lideres dos Clãs Orcs");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "Ogrim entra na porta com e chama BlackHand para um Mak’Gora um ritual de duelo para revindicar alguma a liderança da horda e vingar a morte do seu amigo.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "Ambos vão para o pátio da fortaleza onde Ogrim derrota BlackHand o boneco de Gul’Dan e assumi a liderança da horda.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out
        .println("Ogrim após a vitória se levanta com a feição de cansaço olhando para todos no  pátio  e grita.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("VAMOS ACABAR COM ESSA GUERRA DE UMA VEZ POR TODAS\nOcta’Rogar!!!!!!!!!!!! ");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "Na manha seguinte todos os clãs marcham para Oeste em direção a umas das maiores cidade dos humanos. Conhecida como Vento-Bravo.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Em marchar você escuta a voz de Garona \n" + nomeHeroi + "!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Fui designada a uma missão especial");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Você olha para Garona com um olhar reprido");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        " Eu já fui capturada por eles e sei algumas passagens que cortam a cidade e gostaria que você fosse comigo.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("Você quer ir com a Garona ?");
    System.out.println("Qual a sua Resposta ?");
    System.out.print("(1) - Sim (2) - Não");
    escolha = re.nextInt();

    if (escolha == 1) {
      System.out.println("HP - " + HP);
      System.out.println("Garona fica feliz com a sua escolha ");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioHordaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Eu sabia que você não ia falar não");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioHordaparte1();
        vazio = null;
      }
      System.out.println();

      // return 1;

    } else {
      System.out.println("HP - " + HP);
      System.out.println("Garona fica com o olhar de pesado\n Tudo bem ! ");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioHordaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Eu entendo !");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioHordaparte1();
        vazio = null;
      }
      System.out.println();

    }

    System.out.println("HP - " + HP);
    System.out.println("VocÊ continua com a marcha e responde a garona");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Vou honrar os ultimos membros do meu clã em batalha.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Octa’Rogar");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    return 2;

  }

  static void historiaQuedaDeVentoBravo() {
    Scanner er = new Scanner(System.in);
    Scanner re = new Scanner(System.in);
    String vazio;
    int escolha, batalha;

    System.out.println("HP - " + HP);
    System.out.println(
        "Após escultar as trombetas soarem você rapidamente pega seu arco, e sua espada e corre em direção ao portão principal da cidade. No caminho até o portão você observa muitas famílias desesperadas correndo em direção  ao Porto de Vento-Bravo onde a 7 e a 9 legião e outros  pescadores voluntários estão levando as a população para um lugar seguro. Em direção ao reino de Lorderom.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "Chegando na muralha você observa  soldados  correndo para todos os lados assumindo as suas posições. ");
        System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Você desce do cavalo e começa a subir as escadas para o topo da muralha.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "O silêncio consome  o topo da muralha, e ao observar além dela só se consegue ver a fumaça das pequenas casas ao redor de Vento Bravo e uma vasta mancha verde de Orcs com armas de cerco e tochas.");
        System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "Por toda dimensão da muralha, Soldados com arcos e armaduras pesadas estão ao seu lado com o olhar fixo para o horizonte e aguardam os próximos passos da batalha.");
        System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Morgan o 1 tenente da muralha sobe as escadas com as duas mão para trás e fica ao seu lado.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(nomeHeroi + ": Oficial presente!! ");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Você fica em posição de sentido.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Morgam: A vontade!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "Ao observar o horizonte você consegue ver um Orc subindo em uma pedra, e pronunciado em um idioma no qual você não consegue entender. E antes mesmo que ele esse mesmo Orc consiga  terminar sua frase um tiro de flecha não autorizado voa em direção as tropas atingindo em cheio um Orc na cabeça.");
        System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "O orc cai no chão e em seguida as armas de cerco começão a disparar e as tropas de orcs a correr em direção ao portão.");
        System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Morgan saca sua espada e começa a gritar.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Morgan: É CHEGADA  A HORA  HOMEM PREPAREM-SE!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Após o a ordem de Morgan, você e todos os soldados preparam seus arcos.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Morgan: ESPEREM!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Os orcs começam a chegar mas perto!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Morgan: ESPEREM!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Os orcs começam a chegar mas perto!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("Morgan: ESPEREM!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Os orcs começam a chegar mas perto!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Morgan: DISPAREM TODAS AS NOSSO FORÇAS NESSES MALDITOS! PELA ALIANÇA!!!!!!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("E as flechas ganham os fazendo uma grande sobra abaixo delas.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("As flechas cai e abatendo uma grande quantidade de orcs.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Mas não é o suficiente");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Os orcs começam a chegar mas perto!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "Você observar uma grande bola em chamas atingir as muralhas perto de onde você estava, e vê  um pedaço da muralha cair levando alguns soldados pegando fogo e morrendo quase que instantaneamente  ao serem atingido pelos os destroços.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out
        .println("O caos é instaurado entres os soldados  quando eles observam os orcs colocando escadas na muralha.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Uma bola de fogo está preste a atingir alguns soldados na sua frente!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("Você percebe que consegue  ajudar os soldados que estão  preste a ser atingido");
    System.out.println("Quer ajuda-los?");
    System.out.println("Qual a sua Resposta ?");
    System.out.print("(1) - Sim (2) - Não");
    escolha = re.nextInt();

    corpoPersonagem[2] = "Mão Esquerda";
    corpoPersonagem[3] = "Mão Direita";

    if (escolha == 1) {
      HP -= 15;

      System.out.println("HP - " + HP);
      System.out.println(
          "A bola de fogo atingi a muralha arremessando para fora dela e caindo no rios dos Vales dos Herois.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Por conta da explosão está você afundado e um pouco desnortiado.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(
          "Você consegue observar do outro lado do rio um grupo pequeno de orcs entrando pelos os dutos  de esgoto de vento bravo.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Mas antes mesmo de apagar você consegue ver uma mão te pegando e tirando você da água.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("E grita!.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Soldado 1: Acorda Sargento, Acord……");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(
          "Uma explosão forte acontece perto de vocês e um pedaço de madeira acaba atingido o soldado pelas costas que morre na hora olhando para você");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Ao olhar para cima você já consegue ver as muralhas tomadas pelos o peles verdes.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(
          "Na ponte você consegue ver Vladimir com uma tropa de soldados com grandes escudos e lanças  ajudando os soldados remanescentes a recuarem.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out
          .println("A unica reação é correr para ponte que leva para o segundo portão seguindo as ordens de Morgan!");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

    } else {

      corpoPersonagem[3] = "Espada Curta";

      System.out.println("HP - " + HP);
      System.out.println(
          "Você vê a bola de fogo atingindo em cheio a muralha arremessando os soldados na quela posição para trás fazendo eles caírem.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(
          "E você é arremessando para o lado, você fica com a visão turva, e sua audição fica  baixa com se você estivesse com as mãos  tampando seus ouvidos.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(
          "Em sua frente aprese um dos orcs subindo a escada um soldado consegue  pega-lo com uma espadada. Mas com o segundo Orc ele não tem tanta sorte e o Orcs acaba matando o soldado.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(
          "Um terceiro aparece rapidamente e vai na sua direção. Com rapidez você consegue pegar a sua espada e consegue se defender do primeiro ataque.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();
      // Batalha:

      batalha = sistemaCombate();
      if (batalha == 0) {

        System.out.println("O Orc acerta você na costela.");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

        System.out.println("Você cai de joelho perto da berada da muralha.");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

        System.out.println("Orc: Groaaaaaaaaaarrrrrrrrrr!!! ");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

        System.out.println(
            "E lhe dar um ponta pé pelas costas fazendo você cair do alto da muralha no  rio do Vale dos Heróis.");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

        System.out.println(
            "Um terceiro aparece rapidamente e vai na sua direção. Com rapidez você consegue pegar a sua espada e consegue se defender do primeiro ataque.");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

        return;

      } else if (batalha == 2) {
        HP -= 20;

        System.out
            .println("Você consegue esquivar porém um ele consegue lhe acertar fazendo um pequeno corte na sua perna!");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

      } else if (batalha == 1) {

        System.out.println(
            "Você esquiva e o acerta com um único golpe na barriga e outro no pescoço separando a cabeça do corpo.");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

      }

      System.out.println("HP - " + HP);
      System.out.println(
          "E meios o caos e os orcs aos montes dominado a muralha Morgan dá as ordens para o recuar dos soldados remanescentes.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Morgan: RECUAR SOLDADOS!!! PARA  O SEGUNDO PORTÃO VAMOOOOOSSSSSSSSSS!!!!");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Ao descer as escadas em meio ao caos e explosões e orcs dominando a muralha.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(
          "Você passa em frente  ao primeiro portão que já está quase caindo e  a sua frente um pequeno batalhão de soldados com lanças e escudos.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out
          .println("Você observa Morgan atrás das tropas de Vladimir auxiliando os restantes dos soldados a recuarem.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Vladimir Olha para você.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Vladimir: Que bom que você está vivo.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(
          "No exato momento que você passa  pelos batalhões. O primeiro portão cai em fogo e destroços, e atrás dele orcs montados em lobos gigantes. Matando os soldados que passam a frentes deles. Aquilo é realmente uma carnificina mediante aos seus olhos. Era algum que você nunca já mais viu.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("E investe para cima das tropas de contenção de escudo e lanças.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Eles não vão conseguir aguentar por muito tempo.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(
          "Você chega ao segundo portão que é entrada que dá acesso ao centro da cidade o Distrito Comercial.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Mas todos sabem que as grades de aço não vão  aguentar por muito tempo.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(
          "Você continua vendo as bolas de fogo, batendo na segunda muralha, soldados ofegantes, Sacerdotes curando os feridos em quanto eles recuam. ");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Morgan: Nem todos os solados recuaram, perdi quase todos os meus homens");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(
          "Apos a fala de Morgan observa Vladimir aprece com poucos soldados e atrás deles os portões de grades reforçadas fechando.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(
          "Vladimir: eles tomaram a ponte dos Vale dos Herois, devemos ajudar na evacuação do povo, eles estão em grande número e avançado em grandes quantidades, eu vou para Cidade Velha em direção a Bastilha Ventobravo.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Morgan: Vou leva minhas tropas para o Distrito dos Mag……");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Uma grande de explosão acontece na muralha fazendo  os portões cairem.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(
          "Os orcs passam pelos portões gritando com raiva e com sede de sangue indo a direção  de vocês na Vladimir lança a sua lança acetando em cheio o peitos de um deles, Morgan pega o seu arco consegue acertar dois  antes mesmo ele consiga chegar nele.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      batalha = sistemaCombate();
      if (batalha == 0) {

        System.out
            .println("O orc consegue te desarmar e impala você com a sua própria espada,  o jogando você no chão.");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

        return;

      } else if (batalha == 2) {
        HP -= 20;

        System.out.println(
            "Você consegue se esquivar do ataque  mas a toma uma cotovelada e com medo acaba correndo em direção a Praça da  Catedral. Porem devido uma explosão faz você  recuar e correr em direção a Cidade Velha.");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

      } else if (batalha == 1) {

        System.out.println(
            "Você consegue defender um ataque certeiro em você e contra ataca com um golpe na barriga fazendo um grande corte.");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

      }

      System.out.println("HP - " + HP);
      System.out.println(
          "Com o caos instaurado em toda a cidade, você apenas consegue observar morte por todo lado com, orcs, humanos, o cheiro de sangue misturado com cinzas das casas queimando, gritos e pessoas chorando, aquilo tudo te deixa com muito medo.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(
          "Vladimir  posiciona alguns soldados na ponte onde liga  o Disrtrito Comercial com a Cidade Velha. Você mantêm a sua posição em quanto os orcs avançam.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      batalha = sistemaCombate();
      if (batalha == 0) {

        System.out.println("O orce acerta um golpe na sua barriga fazendo você sangra e você cai da ponte.");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

        return;

      } else if (batalha == 2) {
        HP -= 20;

        System.out.println("você recua para atrás das tropas");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

      } else if (batalha == 1) {

        System.out.println("Você consegue pegar  investir com um contra ataque acertando o pescoço do inimigo");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

      }

      System.out.println();
      System.out.println("Você quer Armar a Bomba?");
      System.out.println("Qual a sua Resposta ?");
      System.out.print("(1) - Sim (2) - não");
      escolha = re.nextInt();

      if (escolha == 1) {
        System.out.println("HP - " + HP);
        System.out.println(nomeHeroi + ": Eu faço isso!");
        System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
        vazio = er.nextLine();
        if (vazio.equals("i")) {
          InventarioAliançaparte1();
          vazio = null;
        }
        System.out.println();

        sideQuest();
        escolha = 0;

      }
    } // eeeee

    System.out.println("HP - " + HP);
    System.out.println("Você consegue  dar mais tempo para os cidadãos recuarem.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Vladimir da ordem para vocês recuarem.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Vladimir: Homens agora!!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "O soldado acende o pavio das bombas que estão armada de baixo da ponte fazendo a explodir levando alguns orcs juntos.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Sua armadura está agora com manchas de sangue após a explosão.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Mesmo ao caos espalhado pela cidade, vocês consegue esvaziarem  a Cidade Velha.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Vladimir direciona para você.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Vladimir: Vou para a Bastilha. Você vem comigo?");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println();
    System.out.println("Você quer acompanhar Vladimir?");
    System.out.println("Qual a sua Resposta ?");
    System.out.print("(1) - Sim (2) - não");
    escolha = re.nextInt();

    if (escolha == 1) {

      System.out.println("HP - " + HP);
      System.out.println("Vocês chegam na Bastilha-Vento Bravo.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(
          "E ao chegar nas escadarias vocês observam caindo a frente da faxada uma grande bandeira de cor vermelha com  um símbolo estranho e um Grifo com a Príncipe Varian e o General Lothar voando para bem longe. ");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Os sinos da catedral soam anunciando a morte do Rei.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(
          "Ao entrarem dentro da bastilha você apenas consegue observar o General Leônidas morto e outro Orc erguendo o corpo do Rei Llane como se fosse um trofel e ao seu lado com mais dois orcs comemorando a sua vitória.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Vladimir fica em pânico e como se o mundo dele estivesse acabado, e com o olhar triste.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Vladimir: Estamos perdido!");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out
          .println(nomeHeroi + ": É tarde de mais Vladimir devemos ir embora agora, podemos vencer em outro momento.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Nesse momento aparecem dois  Orcs todos com grandes machadados que vão para cima de vocês.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }
      System.out.println();

      batalha = sistemaCombate();
      if (batalha == 0) {

        System.out.println("O orc acerta um golpe na sua barriga fazendo você sangrar até a morte.");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

        return;

      } else if (batalha == 2) {
        HP -= 20;

        System.out.println("Você  sai correndo deixando Vladimir para trás");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

      } else if (batalha == 1) {

        System.out.println("Voce consegue golpeá-lo na garganta e com um gemido a criatura cai no chão.");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

        System.out.println("Você olha para o lado e vê mais orcs chegando.");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

        System.out.println("Vladimir olha com os olhos cheios de lágrimas.");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

        System.out.println("Vladimir: Vá " + nomeHeroi + " darei mais tempo para vocês");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

      }

      System.out.println("HP - " + HP);
      System.out.println(
          "Chegando no Dsitrito dos Anões  você  e vendo tudo ao seu redor  pegando  fogo, muito corpos no chão,  e os sinos da Catedral  não paravam de tocar anunciando a mote do rei.  E a queda da cidade fazendo todo os seus cidadãos abandonarem a cidade.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(
          "Logo atrás de vocês vem vindo uma manada de Orcs sedentos por sangue, você se vê ao meio alguns soldados.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }
      System.out.println();

      sideQuest();
      escolha = 0;

    }

    System.out.println("HP - " + HP);
    System.out.println(nomeHeroi + ": ATENÇÃO HOMENS!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(nomeHeroi + ":Nós somos os últimos homens que protege os civis.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "Os Orcs conseguem passar pelos portões que ligam a Cidade Velha e a Bastilha com o Distrito dos Anões.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(nomeHeroi + ": HOMENS POSIÇÃO DE DEFESAS.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Os Orcs correm com fúria para a direção de vocês.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "Você observando o rostos dos soldados em desesperos começa a pronunciar o juramento do quartel em voz alta.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(nomeHeroi
        + "A NOITE CHEGA, E AGORA COMEÇA A MINHA VIGIA. NÃO TERMINARÁ ATÉ A MINHA MORTE VIVEREI E MORREREI NO MEU POSTO. SOU A ESPADA NA ESCURIDÃO.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Todos: SOU A ESPADA NA ESCURIDÃO");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "Todos: SOU O FOGO QUE ARDE CONTRA O FRIO, A LUZ QUE TRAZ CONSIGO A ALVORADA, A TROMBETA QUE ACORDA OS QUE DORMEM, O ESCUDO QUE DEFENDE OS REINOS DOS HOMENS.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "Todos:  Dou a minha vida e a minha honra à Aliança, por esta noite e por todas as noites que estão para vir.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Todos: AAAAAAAAAAAAAAAAAAAAHHHHHHHHHHHHHHHHHH!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    batalha = sistemaCombate();
    if (batalha == 0) {

      System.out.println("O Orc o golpeia quebrando sua armadura e o jogando no chão.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      return;

    } else if (batalha == 2) {
      HP -= 20;

      System.out.println("Um dos soldados entra na sua frente e acaba sendo morto em seu lugar");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

    } else if (batalha == 1) {

      System.out.println("você consegue uma investida contra o inimigo o atingindo pelas costas");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

    }

    batalha = sistemaCombate();// 1
    if (batalha == 0) {

      System.out.println(
          "Após  se levantar  o Orcs pega você pelo vão da armadura erguendo você o chão  e o apunhalando com uma faca em sua barriga!");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      return;

    } else if (batalha == 2) {
      HP -= 20;

      System.out.println("Com medo da investida foras do Orc você vai para trás dos homens que estão  atrás de você.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

    } else if (batalha == 1) {

      System.out.println(
          "Voce consegue desviar de uma lança que voava em sua direção e coloca o corpo do Orcs em sua direção a lança atravessa o mostro o fazendo gemer bem alto.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

    }

    System.out.println("HP - " + HP);
    System.out.println("Uma explosão acontece perto de você.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out
        .println("Nesse momentos seus ouvidos são  tapados e você apenas consegue escutar a sua própria respiração.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out
        .println("Mas antes mesmo que receber o golpe de misericórdia você consegue defender ao o ataque do Orc.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    batalha = sistemaCombate();// 1
    if (batalha == 0) {

      System.out.println("Você é atingido por uma lança na nuca fazendo atravessar seu rosto.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      return;

    } else if (batalha == 2) {
      HP -= 20;

      System.out.println("Você recua para as rampas em direção ao Porto.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

    } else if (batalha == 1) {

      System.out.println(
          "Você o acerta com toda a sua força na região da barriga. Fazendo  a sua arma atravessar para o outro lado.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

    }

    System.out.println("HP - " + HP);
    System.out.println(
        "Vocês conseguem ver o sinal de fumaça emitido pelos magos anunciando que os últimos civis embarcaram.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Voce da  ordem para os últimos soldados a recuarem");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Nome do jogador: Recuar….. Recuar…. !!!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAliançaparte1();
      vazio = null;
    }
    System.out.println();

  }

  public static void finalHistoriaAlinaca() {
    Scanner er = new Scanner(System.in);
    Scanner re = new Scanner(System.in);
    String vazio;

    if (respect > 8) {
      System.out.println("HP - " + HP);
      System.out.println(
          "Vocês e os restantes dos homens conseguem embarca e, mas no fundo só existe tristeza pois a umas das maiores cidades do reino dos humanos acaba de cair nas mão do inimigo. Vocês apenas conseguem ver fumaça destruição. Eu e os meus companheiros fizeram um juramento implacável para recuperar sua terra natal a qualquer custo fugindo para as terras de Lortheron o maior reino dos humanos.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }
    } else {

      System.out.println("HP - " + HP);
      System.out.println(
          "Voce está descendo as rampas e por um momento você para e ajuda o resto  dos homens a irem na frente ao passar do último homem você sente uma flecha  arrevesando seu ombro.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }

      System.out.println("HP - " + HP);
      System.out.println("Com a respiração baixa você se ajoelha já sem forças para continuar.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }

      System.out.println("HP - " + HP);
      System.out.println(
          "E do ponto onde você está  avistando o por do sol e vendo os Galeões  se afastarem uma lagrima de alegria cai do seu olho esquerdo com uma sensação  de paz e dever comprido.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }

      System.out.println("HP - " + HP);
      System.out.println("Você sente alguém pegando você pela armadura e erguendo você.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }

      System.out.println("HP - " + HP);
      System.out.println(
          "O grande Orc fala algumas palavras não qual você não consegue entender nada e com uma espada atravessa ela na sua barriga e deixando você cair no chão.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }

      System.out.println("HP - " + HP);
      System.out.println(
          "Seus olhos de apagam com a última visão da bandeira da aliança tremulando no mastro de uns dos navios destruídos no Porto.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }

    }
  }

  static void historiaConquistaVentoBravo() {
    Scanner er = new Scanner(System.in);
    Scanner re = new Scanner(System.in);
    String vazio;
    int escolha, batalha;

    System.out.println("HP - " + HP);
    System.out.println("Após um dia de marcha e de queimarem tudo ao redor da grande cidade de pedra");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("você se encontra logo atrás da linha das armas de cerco. A sua frente uma grande muralha com um portão de madeira e no topo dessa muralha muitos humanos com arcos olhando para vocês. Os Orcs ficam agitados com a euforia de começarem logo a matança.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Todos se calam!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Ogrim fica de pé em uma pedra e começa a pronunciar algumas palavras.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Ogrim fica de pé em uma pedra e começa a pronunciar algumas palavras.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Ogrim: Hoje é o dia que vamos ficar nesse mundo definitivamente, hoje é o dia que mostraremos nossas forças para a nossa PAZ…….");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Ogrim: Gul’…..");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Antes mesmo de terminar a frase uma flecha atingi a linha de frente acertando um dos seus irmão na cabeça o fazendo morrer instantaneamente.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Ogrim assuntado dar a ordem de avançar.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Ogrim: PELA A HORDA !!!!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Você e seus irmão partem para a batalha aos gritos, com frenesi de sangue no corpo.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Após chegar bem perto da muralha vocês observam uma chuva  de flechas voando em direção a vocês. Ofuscando até mesmo a passagem de luz.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Muitos do seu lado caem com as flechas os atingidos em cheio em várias partes do corpo.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Ao seu lado está seu amigo Sion ele grita para vocês.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Morgan: ESPEREM!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Sion: Nome do jogador venha comigo vamos pegar essa escada vamos juntos com os outros por cima das muralhas.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("Quer ajuda-los? (1) - Sim (2) - Não");
    System.out.print("Qual a sua Resposta: ");
    escolha = re.nextInt();

    if (escolha == 1) {
      HP -= 15;

      System.out.println("HP - " + HP);
      System.out.println("Você pega a escada com Sion e outros Orcs e corre em direção ao lado direto da muralha.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Você consegue colocar a escada em posição. Em quanto sobem uma flecha acaba acertando você no ombro");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Dois Orcs sobem na frente de vocês.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Um deles e atingido e cai do alto da escada.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("O segundo consegue passar.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Sion era o próximo uma espada acaba passando bem perto dele. Mas ele consegue desviar e arremessando o soldado para fora da muralha.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Você chega ao topo  da muralha e vê um soldado ajoelhado no chão. Você vai na direção  dele para o acerta.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      batalha = sistemaCombate();
      if (batalha == 0) {

        System.out.println("O humana sai correndo e desliza por baixo de você o cortando da barriga a virilha fazendo você sangrar até a morte.");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

        return;

      } else if (batalha == 2) {
        HP -= 20;

        System.out
            .println("você consegue desviar do ataque dele, mesmo assim ele arremessa uma faca que acaba o acertando da batata da perna");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

      } else if (batalha == 1) {

        System.out.println("Você o acerta com um golpe na barriga.");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

        System.out.println("Ele se ajoelha e você dá um ponta pé na costa dele fazendo ele cair da muralha em um rio logo.");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();
      }

      System.out.println("HP - " + HP);
      System.out.println("Você consegue ver as portas de arrebentando e a cavalaria de Orcs montados em Lobos.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Seus irmãos avançam contra um punhado de soldados humanos com escudos e lanças e alguns desses humanos recuando para uma segunda muralha com um portão de ferro.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Você desce as escadas da muralha em meios ao monte de corpos mutilados tantos humanos com dos seus irmãos.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

    } else{

      corpoPersonagem[3] = "Machado";

      System.out.println("HP - " + HP);
      System.out.println("você nega a em ir e avisa ao Sion que pode ser perigoso e fala que vai na segunda leva.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

    }

    System.out.println("HP - " + HP);
    System.out.println("Após as conquistas das muralhas um soldado humano se levanta e corre na sua direção");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();
    

    batalha = sistemaCombate();
    if (batalha == 0) {

    System.out.println("você pega ele pelo pescoço. Mas por azar ele saca um punhal e o acerta direto no coração.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    return;

    } else if (batalha == 2) {
      HP -= 20;

    System.out.println("você consegue desviar do ataque, mas ele lhe acerta com a coronha da armar na sua sobrancelha. Um outro Orc acaba matando o humano com facilidade.");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

      } else if (batalha == 1) {

        System.out.println("Após uma segunda investida do humano você o consegue desarma-lo com facilidade Com a própria espada do soldado você o acerta na barriga atravessando-a.");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();
      }

    
    

    System.out.println("HP - " + HP);
    System.out.println("Após muitas baixas Orgim chega na ponte que liga a entrada principal e ao portal da cidade.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Ogrim: os humanos foram muitos imprudentes em mandar todas suas tropas de arqueiros para  frente.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Ogrim da as ordens para derrubar o segundo portão.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Ogrim:  devemos nos apresar. nossa vitória está próxima logo a montanha do rei será nossa.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Orgim: Homens derrubem esse portão.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("As armas de certo abrem fogo contra o portão fazendo a segunda muralha cair os pedaços fazando os humanos acima dela cairem em chamas.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println();
    System.out.println("Planta a Bomba?");
    System.out.println("Qual a sua Resposta ?");
    System.out.print("(1) - Sim (2) - não");
    escolha = re.nextInt();

    if (escolha == 1) {

      System.out.println("HP - " + HP);
      System.out.println("Você Se aproxima do Portão de Ferro!");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioHordaparte1();
        vazio = null;
      }
      System.out.println();

      sideQuest();
      escolha = 0;

    }

    System.out.println("HP - " + HP);
    System.out.println("Com uma grande explosão fazendo o segundo portão cair em pedaços.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Observa a primeira linha e a cavalaria irem na frente.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Após a primeiro leva de soldados vocês entra na cidade. Com susto e com muita tristeza você observa humanos pequenos mortos, humanos fêmeas mortos, casas queimando, demolidas, outros soldados sendo abatidos por misericórdia ou por maldade.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Sion está ao seu lado e pede para acompanhar ele que fala que a primeira linha foi quase dizimada depois de uma explosão perto da ponte que leva para a montanha do rei.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Você estão bem perto da onde aconteceu a explosão outros Orcs já improvisaram uma ponte com as escada de madeira que usaram para subir na primeira muralha.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Vocês escutam um barulho agudo vindo do centro da cidade em uma montanha de cor branca que não parava.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Ogrim para ao lado de vocês");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Orgrim: Finalmente !!!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Sion: VAMOS PARA A MONTANHA DO REI.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Chegando em frente da montanha você consegue alguns soldados correndo para direção oposta de vocês.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("A bandeira da Horda em cima da montanha do rei.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Sion grita!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Sion: Olhe "+nomeHeroi+" no portão da montanha");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Ao observar no portão você vê Garona saindo do castelo com a bandeira de um grande leão dourado no fundo azul em mãos e seu amigo Yorick  com o corpo do rei humano nas mão.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Um dos soldados fica de pé e corre na direção  de vocês contra vocês com duas espadas e com ma armadura totalmente diferente dos outros soldados");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Sion vai em direção desse soldado mas  sem muito esforço seu amigo é abatido com um corte horizontal na barriga e antes mesmo que ele caia no chão o humano arranca a cabeça dele.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(nomeHeroi+": NÃOOOOOOOO!!!!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(nomeHeroi+": SIONNNNNN");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(" E com o frenesi do momento você parte para cima dele !");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(nomeHeroi+": NÃOOOOOOOO!!!!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    batalha = sistemaCombate();
    if (batalha == 0) {

      System.out.println("O soldado consegue te desarmar e com as duas lâminas das espadas corta a sua garganta decepando a sua cabeça.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      return;

    } else if (batalha == 2) {
      HP -= 20;

      System.out.println("você pega a cabeça do seu amigo nas mãos. E por um momento de distração o humano investe contra você.Antes dele atingir você. Garona lança uma adaga em direção humano atingido ele no pescoço.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

    } else if (batalha == 1) {

      System.out.println("Com a raiva de perder seu amigo você consegue desarmar o humano pega ele com as duas mão  o arremessa entre a sua coxa direita quebrando a sua espinha.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

    }

    System.out.println("HP - " + HP);
    System.out.println("A sua tristeza por perder um amigo se mistura com a raiva por participar dessa matança desnecessária mesmo com Gul’Dan expulso da Horda após a sua traição.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Você fala para si mesmo.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(nomeHeroi+": Nome do jogar: vou acabar com isso!!.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("você corre junto com os outro Orcs para a linha final da cidade onde encontra ou fileira de soldados protegendo alguns humanos que estão embarcando em grandes canoas que você jamais tinha visto antes.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("E você e seus irmão investi contra eles.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    batalha = sistemaCombate();//espra qui 
    if (batalha == 0) {

      System.out.println("O Humano o golpeia quebrando sua armadura e o jogando no chão.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      return;

    } else if (batalha == 2) {
      HP -= 20;

      System.out.println("Um dos Orcs entra na sua frente e acaba sendo morto em seu lugar com uma facada nas costas.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

    } else if (batalha == 1) {

      System.out.println("você consegue uma investida contra o inimigo o atingindo pelas costas");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

    }

    batalha = sistemaCombate();// 1
    if (batalha == 0) {

      System.out.println("Após se levantar  o humano pega você pelo o vão da armadura erguendo você do chão  e o apunhalando com uma faca em sua barriga!");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      return;

    } else if (batalha == 2) {
      HP -= 20;

      System.out.println("Com medo da investida do última ataque do soldados você vai para trás dos seus irmãos que estão  atrás de você.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

    } else if (batalha == 1) {

      System.out.println("Você consegue desviar de uma lança que voava em sua direção e coloca o corpo do humano em sua direção a lança atravessa o matando na mesma hora.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

    }

    System.out.println("HP - " + HP);
    System.out.println("Uma explosão acontece perto de você.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out
        .println("Nesse momentos seus ouvidos são  tapados e você apenas consegue escutar a sua própria respiração.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Outro humano consegue acertar a sua perna o forçando a ajoelhar.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }

    System.out.println("HP - " + HP);
    System.out.println("Mas antes mesmo que receber o golpe de misericórdia você consegue defender ao o ataque do Humano.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    batalha = sistemaCombate();// 1
    if (batalha == 0) {

      System.out.println("Você é atingido por uma lança na nuca fazendo atravessar seu rosto.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      return;

    } else if (batalha == 2) {
      HP -= 20;

      System.out.println("Você fica parado esperando receber o ultimo ataque. Mas um irmão consegue matar o humano antes dele chegar até você");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

    } else if (batalha == 1) {

      System.out.println("Você consegue desviar de uma lança que voava em sua direção e coloca o corpo do humano em sua direção a lança atravessa o matando na mesma hora.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

    }

  }

  public static void finalHistoriaHorda() {
    Scanner er = new Scanner(System.in);
    Scanner re = new Scanner(System.in);
    String vazio;

    if (respect > 8) {
      System.out.println("HP - " + HP);
      System.out.println(
          "Você e seus irmão  vence aquela investida e vê os humanos correndo para as grandes Canoas de madeiras.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(
          "A cidade está destruída, quase tudo em reiunas, e aquele maldito barulho do centro da cidade tinha cessado.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Bandeira da Horda tremulado na grande montanha de pedra do rei.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Você observa as grandes Canoas se afastando  para bem longe.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Ogrim aparece perto de você. E se pronuncia.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Ogrim: Nem sempre a PAZ vem como nós esperamos,  ela vem com muito esforço  e sangue.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(
          "Ogrim: Hoje cai nosso inimigo e com ele surge a PAZ. Hoje começaremos uma nova história para nossos clãs unidos em uma única bandeira.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Orgim: PELA HORDA!!!!!!!!!");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Orgim: PELA HORDA!!!!!!!!!");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Todos: PELA HORDA!!!!!!!!!");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }
      System.out.println();

    } else {

      System.out.println("HP - " + HP);
      System.out.println(
          "Você e seus irmão  vence aquela investida e vê os humanos correndo para as grandes Canoas de madeiras.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }

      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Você vê um único soldado correndo em direção  as canoas.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }

      System.out.println("HP - " + HP);
      System.out.println("Você pega um arco do chão e dispara o acertando em cheio em seu ombro direito o ajoelhar.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Você  se aproxima do soldado ajoelhado o pega pelo o vão da armadura  o erguendo");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("você olha nos seus olhos");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(nomeHeroi + ": Eu sei que ainda não acabou e que vamos nos encontra muitas e muitas vezes.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Com uma espada o atravessa na barriga o deixando cair no chão.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAliançaparte1();
        vazio = null;
      }
      System.out.println();

    }
  }

  public static int sistemaCombate() {

    Scanner leitor = new Scanner(System.in);
    int escolher;

    while (HP > 0 && eHP > 0) {
      System.out.println("Você pode escolher: \n\n(1) - ATACAR\n\n(2) - CORRER\n\n(3) - TOMAR POÇÃO DE CURA");
      escolher = leitor.nextInt();

      if (escolher == 1) {
        attack();
      }
      if (escolher == 2) {
        run();

      }
      if (escolher == 3) {
        potion();
      }

    }
    if (HP <= 0) {

      return 0;
    } else {
      eHP = 40;
      return 1;
    }

  }

  public static void attack() {

    int DMG = 0, eDMG = 0;

    System.out.println("Você ataca o adversário");
    System.out.println("");

    DMG = (int) (Math.random() * 40);

    System.out.println("Você causa " + DMG + " de dano");
    eHP = eHP - DMG;
    System.out.println("");

    System.out.println("Seu HP: " + HP + "\nHP do Inimigo: " + eHP);
    System.out.println("");

    eDMG = (int) (Math.random() * 40);

    System.out.println("O adversário te ataca com " + eDMG + " de dano");
    System.out.println("");
    HP = HP - eDMG;
    System.out.println("Seu HP: " + HP + "\nHP do Inimigo: " + eHP);
    System.out.println("");

    if (HP <= 0) {
      System.out.println("Você morreu");

    }
    if (eHP <= 0) {
      System.out.println("Você ganhou");

    }

  }

  public static void run() {

    int DMG = 0, eDMG = 0, dLook;

    System.out.println(
        "Você escolheu correr, será rodado um d10, se você tirar acima de 6, foge, senão, toma um d40 de dano");
    dLook = (int) (Math.random() * 10);
    System.out.println("Você tirou " + dLook);

    if (dLook > 6) {
      System.out.println("Você fugiu");
      eHP = 0;
    } else {
      DMG = (int) (Math.random() * 40);
      System.out.println("Você não fugiu e recebeu " + DMG + " de dano");
      HP = HP - DMG;
    }
    eHP = 0;
  }

  public static void potion() {

    int DMG = 0, dLook;

    DMG = (int) (Math.random() * 40);
    System.out.println("Você curou 25 de HP e reebeu " + DMG + " de dano ao se distrair");
    HP = HP - DMG;

  }

  public static void sideQuest() {
    Scanner er = new Scanner(System.in);
    Scanner re = new Scanner(System.in);
    String vazio;
    int numeroArmado, tentativa = 1;

    System.out.println("HP - " + HP);
    System.out.println("Em quanto os outros lhe dão cobertura você é segurado pelos pés.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    do {
      System.out.println("HP - " + HP);
      System.out.println(
          "Para armar a bomba é preciso coloca os pavios na ordem correta eles estão identificado com Os CARACTERES  PDJJM+T");
      System.out.print("Qual o numero da Seguencia da bomba?: ");
      numeroArmado = re.nextInt();
      System.out.println();

      if (numeroArmado == 7355608) {
        System.out.println(nomeHeroi + ": The bomb was planted!");
        System.out.println(nomeHeroi + ": Ops Jogo errado !");
        tentativa = 0;
      } else {
        HP -= 1;
        System.out.println(nomeHeroi + ": Essa seguencia está errada! ");
      }

    } while (tentativa == 1);

  }

}