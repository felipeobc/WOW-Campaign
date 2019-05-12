import java.util.*;

public class mainTest {

  public static String[] corpoPersonagem = new String[7];
  public static String nomeHeroi;
  
  static void equipAlinca(){
    String equipamentoAlianca[] = { "Elmo-Ventobraviano", "Peitoral-Ventobraviano", "Mão Esquerda ", "Mão Direita",
            "Constas", "Cintura", "Perneiras-Ventobravo", "Botas-Ventobravianas" };
        for (int i = 0; i < equipamentoAlianca.length; i++) {
          corpoPersonagem[i] = equipamentoAlianca[i];
        }
  }
  static void equipHorda(){
    String equipamentoHorda[] = { "Cabeça", "Peitoral do Sentinela", "Mão Esquerda ", "Mão Direita", "Constas",
            "Cintura", "Perneiras do Sentinela", "Botas do Sentinela" };
        for (int i = 0; i < equipamentoHorda.length; i++) {
          corpoPersonagem[i] = equipamentoHorda[i];
        }
  }
  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);
    int start, escolha;

    System.out.println( "Seja bem-vindo a uma pequena experiência em uma fantastica narrativa dentro no universo de Warcraft (A Queda de Ventobravo)");
    System.out.println("(1) - Começar (2) - Sair");
    System.out.print("Escolha uma Opção: ");
    start = ler.nextInt();

    if (start == 1) {

      Inicio();
      escolha = escolhaPersonagem();
      
      if (escolha == 1) {// Atribui os equipamentos da Aliança, Linha de historia da Aliança
        escolha = 0;
        equipAlinca();
        historiaAliança01();
        escolha = historiaAliança01();
        if(escolha == 1){//Historia Karazan

        }else{ //Hitoria Queda de Vento-Bravo

        }


      }else{// Atribui os equipamentos da Horda, Linha de historia da Horda
        escolha = 0;
        equipHorda();
        historiaHorda01();
      }

    }

    System.out.println("Obrigado por jogar :)\nFelipe Oliveira\nGuilherme Correia");

  }

  static void Inicio() { // Inicio da Historia
    Scanner er = new Scanner(System.in);
    String vazio;

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

  static int escolhaPersonagem() {// Escolha o lado da batalha
    Scanner sc = new Scanner(System.in);
    Scanner cs = new Scanner(System.in);
    String  vazio;
    int escolha;

    System.out.println("Escolha o seu lado da batalha");
    System.out.println(
        "Aliança: VocÊ vai ser um jovem soldado humano e vai  defender a cidade  das forças poderoça que marcham en direção a Vento Bravo");
    System.out.println(
        "Horda: Você vai assumir um Orc conrrompido pelo Sangue Vil e ajudara a nova Horda a conquistar com o sangeu e furia o seu novo lar ");
    // mostrar imagem dos modelos
    System.out.println("(1) - Alinça (2) - Horda");
    System.out.print("Faça a sua escolha: ");
    escolha = sc.nextInt();

    if (escolha == 1) {// Escolheu Aliança
      System.out.println("VOCÊ ESCOLHEU ALIANÇA");
      System.out.print("Escolha o nome do seu personagem: ");
      nomeHeroi = cs.nextLine();
      System.out.println("Seja bem-vindo ao Jogo " + nomeHeroi);
      System.out.print("Aperte ENTER para continuar");
      vazio = cs.nextLine();

      return 1;
    } else {// Escolheu Horda
      System.out.println("VOCÊ ESCOLHEU HORDA");
      System.out.print("Escolha o nome do seu personagem: ");
      nomeHeroi = cs.nextLine();
      System.out.println("Seja bem-vindo ao Jogo " + nomeHeroi);
      System.out.print("Aperte ENTER para continuar");
      vazio = cs.nextLine();
      
      return 2;
    }
  }

  static void mostrarEquipamentos() { // Mostra os equipamentos do personagem

    int i;

    for (i = 0; i < corpoPersonagem.length; i++) {
      System.out.print(corpoPersonagem[i] + " ");

    }
  }

  static void mostrarMapa() {// Mostrar Mapa

  }

  static int historiaAliança01() {//Historia introdução Aliança Etapa 1
    Scanner er = new Scanner(System.in);
    Scanner re = new Scanner(System.in);
    String vazio;
    int escolha;

    // Introdução de entrada da Historia.
    System.out.println("Quando as forças de Azeroth e da Horda se enfrentaram no reino, os conflitos internos começaram a pesar nos dois exércitos. O rei Llane, que acreditava que os orcs bestiais eram incapazes de conquistar Azeroth, detestava sua posição em sua capital, Ventobravo. No entanto, Sir Lothar convenceu-se de que a batalha deveria ser levada diretamente ao inimigo, e ele foi forçado a escolher entre suas convicções e sua lealdade ao rei.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println(nomeHeroi +" é um renomado Sargento e um fiel subordinado do 1 tenente Vladimir do 25 batalhão de infantaria");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println("Vocês dois se encontra na sala de guerra dentro da bastilha de Vento Bravo onde se encontra o Rei Llane  e seu comandantes.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println("Entre eles o Sir Lothar um dos maiores comandante da Aliança e o único da mês que tinha enfrentados as novas ameças e saiu vivo e o Arch Mago Hadigar um iniciante de mago arcano e aluno da faculdade de Dalaran.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println("Entre eles o Sir.Lothar um dos maiores comandante da Aliança e o único que tinha enfrentado a nova ameça e saiu vivo para contar a historia e o Arch Mago Haddigar um iniciante de mago arcano e aluno da faculdade de Dalaran.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println("Depois de ver tantas notícias ruim de batalhões caindo, vilas queimadas, e morte.\nVladimir percebendo isso e foi  em sua direção.\ndireciona a palavra a você.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println("Vladimir - Com medo Nome do jogador?");
    System.out.println("Qual a sua Resposta ?");
    System.out.print("(1) - Sim (2) - não");
    escolha = re.nextInt();
    
    if(escolha == 1){
      System.out.println("Sim. Mas isso me faz pensar melhor pelo que está por vir !");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();
      escolha = 0;
    }else{
      System.out.println("Vladimr olha para você com o olhar sério e fala\nPois deveria não sabemos como nosso inimigo luta, eles estão conquistando província após província logo logo estaram aqui");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();
      escolha = 0;
    }
    
    System.out.println("Em Seguida entra um soldado correndo levando em sua mão uma mensagem sobre o forte Mirante de Pedra em Montanhas Cristarrubra e entrega o pergaminho ao Capital de Portões Leonidas.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();
    
    System.out.println("Você quer escutar Leonidas lendo o relatório ?");
    System.out.println("Qual a sua Resposta ?");
    System.out.print("(1) - Sim (2) - Não");
    escolha = re.nextInt();

    if(escolha == 1){
      System.out.println("Você se levanta e se aproxima da mesa de guerra");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("Leônidas lê para todos proximos a mesa:");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("Relátorio:");
      System.out.println("As forças da Horda evadiram as terras de Montanhas Cristarrubra,  Queimando a Vila Placida  e raptando os seus moradores, as torres de magos de Ilgalar  estão  em chamas, estão utilizando o Mirante de Pedra como forte sem nenhuma noticias de sobreviventes. E o suposto comandante Blackhand está morto e os Clãs de Orcs estão seguindo um novo Orc chamado Orgrim Doomhammer considerado o novo Warchief e marcham em direção a Vento Bravo com Armas de cerco.\nPS: Os líderes Gul'dan e Durotan e seu clã não foram localizados.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("Haddgar fala!\nAs minhas fontes afirmam que Através de um esforço conjunto, Medivh e os warlocks do conselho das Sombras abriram o portal dimensional.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();
      
      System.out.println("Rei Llane agumenta\nHadgar Lothar recrute mais alguém para ir a Karazan deter Mediv");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      escolha = 0;
      System.out.println("Você quer escutar Leonidas lendo o relatório ?");
      System.out.println("Qual a sua Resposta ?");
      System.out.print("(1) - Sim (2) - Não");
      escolha = re.nextInt();

      if(escolha == 1){
        System.out.println("Senhor! Vladimir direcinona a fala a Lothar");
        System.out.println("Posso indicar um dos meus melhores homems habilidoso com espada e arco o "+nomeHeroi+"  ele poderar ser de grande ajuda.");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

        System.out.println("Lothar direciona as palavras a você");
        System.out.println(nomeHeroi+" Se prepare não vai ser nada facil!");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

        corpoPersonagem[2] = "Espada de Duas Mão";
        corpoPersonagem[3] = "Espada de Duas Mão";
        corpoPersonagem[4] = "Arco Longo";

        return 1; //Chama Main Quest historiaPrincipaKazarah(); 
      }

    }

    System.out.println("Todos na sala escutam as trombetas na cidade!\n Rei Llane da a Ordem\nTODOS NA SUA POSIÇÃO !\nPELA ALIANÇA!!!");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();
    return 2; //Chama Main Quest historiaQuedaDeVentoBravo();


    
  }

  static void historiaHorda01() {//Historia introdução Horda Etapa 1

  }
  static void historiaQuedaDeVentoBravo(){

  }
  static void historiaPrincipaKarazan(){

  }
}
