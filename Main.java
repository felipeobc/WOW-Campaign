import java.util.*;


public class Main {
    public static int[] corpoPersonagem = new int[2];
  
    public static void main(String[] args){
      Scanner ler = new Scanner(System.in);
      int start, escolha;
        
  
      System.out.println("Seja bem-vindo a uma pequena experiência em uma fantastica narrativa dentro no universo de Warcraft (A Queda de Ventobravo)");
      System.out.println("(1) - Começar (2) - Sair");
      System.out.print("Escolha uma Opção: ");
      start = ler.nextInt();
  
      if(start == 1){
        
        Inicio();
        escolha = escolhapersonagem();
        
        if(escolha == 1){
          corpoPersonagem[0] = 1;
          System.out.println(corpoPersonagem[0]);           
        }else{
  
        }
        
      }else{
        System.out.println("Obrigado por jogar :)\nFelipe Oliveira\nGuilherme Correia");
      }
    }
      

    static void Inicio() {
      Scanner er = new Scanner(System.in);
      String vazio;
      
      //Introdução de entrada da Historia.
      System.out.println("Enquanto Kil'jaeden preparava a Horda para a invasão de Azeroth, Medivh continuava a lutar por sua alma contra Sargeras. O rei Llane, o nobre monarca de Ventobravo, ficou cauteloso com a escuridão que parecia manchar o espírito de seu ex-amigo.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      
      System.out.println("O rei Llane compartilhou suas preocupações com Anduin Lothar, o último descendente da linhagem Arathi, a quem ele nomeou seu tenente de armas. Mesmo assim, nenhum homem poderia imaginar que a lenta descida de Medivh à loucura provocaria os horrores que estavam por vir.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
  
      System.out.println("Como um incentivo final, Sargeras prometeu conceder grande poder a Gul'dan se ele concordasse em liderar a Horda para Azeroth. Através de Medivh, Sargeras disse ao bruxo que ele poderia se tornar um deus vivo se ele encontrasse a tumba submarina onde o Guardiã Aegwynn havia colocado o corpo aleijado de Sargeras quase mil anos antes.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
  
      System.out.println("Gul'dan concordou e decidiu que uma vez que os habitantes de Azeroth fossem espancados, ele encontraria a lendária tumba e reivindicaria sua recompensa. Assegurando que a Horda serviria a seus propósitos, Sargeras ordenou que a invasão começasse.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
  
      System.out.println("Através de um esforço conjunto, Medivh e os warlocks do onselho das Sombras abriram o portal dimensional conhecido como Dark Portal. Este portal fazia a ponte entre Azeroth e Draenor, e era grande o suficiente para que exércitos passassem por ele. Gul'dan despachou orcs pelo portal para inspecionar as terras que eles conquistariam. Os batedores de retorno asseguraram ao Conselonselho das Sombras que o mundo de Azeroth estava maduro para a tomada.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
  
      System.out.println("Ainda convencido de que a corrupção de Gul'dan iria destruir o seu povo, Durotan falou contra os warlocks mais uma vez. O bravo guerreiro alegou que os bruxos estavam destruindo a pureza do espírito dos orcs e que essa invasão imprudente seria o destino deles. Gul'dan, incapaz de se arriscar a matar um herói tão popular, foi forçado a exilar Durotan e seu Frostwolf Clan nos confins deste novo mundo.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
  
      System.out.println("Depois que os Frostwolves exilados invadiram o portal, apenas alguns clãs orcs seguiram. Esses orcs rapidamente montaram uma base de operações dentro do Black Morass, uma área escura e pantanosa distante ao leste do reino de Stormwind. Quando os orcs começaram a se ramificar e explorar as novas terras, eles entraram em conflito imediato com os defensores humanos de Ventobravo.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
  
      System.out.println("Embora essas escaramuças terminassem rapidamente, eles fizeram muito para ilustrar as fraquezas e forças de ambas as espécies rivais. Llane e Lothar nunca foram capazes de coletar dados precisos dos números dos orcs e só podiam adivinhar a força que teriam que enfrentar.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
  
      System.out.println("Depois de alguns anos, a maioria da Horda dos orcs havia entrado em Azeroth, e Gul'dan considerou que chegara a hora do primeiro ataque contra a humanidade. A Horda lançou toda a sua força contra o reino desavisado de Ventobravo. ");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
  
     
      
      
    }
    
    static int escolhapersonagem(){// Escolha o lado da batalha 
      Scanner sc = new Scanner(System.in);
  
      int escolha;
  
      System.out.println("Escolha o seu lado da batalha");
      System.out.println("Aliança: VocÊ vai ser um jovem soldado humano e vai  defender a cidade  das forças poderoça que marcham en direção a Vento Bravo");
      System.out.println("Horda: Você vai assumir um Orc conrrompido pelo Sangue Vil e ajudara a nova Horda a conquistar com o sangeu e furia o seu novo lar ");
      System.out.println("(1) - Alinça (2) - Horda");
      System.out.print("Faça a sua escolha: ");
      escolha = sc.nextInt();
  
      if(escolha == 1){// Escolheu Aliança
        escolha = 1;
        return escolha;
      }else{            //Escolheu Horda
        return 2;
      }
    }
  
    static void historiaAliança01(){
  
    }
      
  }
  