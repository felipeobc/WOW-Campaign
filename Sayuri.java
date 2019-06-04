import java.util.Scanner;

public class Sayuri {
    public static void main(String[] agrs) {

        int[] vetor;
        vetor = new int[3];
        vetor[3] = Joia();
        System.out.println(vetor[3]);
    }

    public static int Joia() {
        Scanner leitor = new Scanner(System.in);
        int[] fragmento3;
        fragmento3 = new int[1];
        int escolha12;
        System.out.println("\n1.Pegar a chave.\n\n"
                + "Tentei pegar a chave, e de repente o homem se levantou e tentou me atacar. Me esquivei, ele caiu no chão\n"
                + "e seu corpo se desfez, sobrando apenas a chave na superfície.\n"
                + "Com a chave em mãos, não vi nenhuma porta, a antiga que estava ali sumira. Embaixo da cadeira onde o corpo\n"
                + "estava antes avistei um pequeno baú, então tentei abri-lo com a chave e consegui. Ao abrir o baú me deparei \n"
                + "com um outro baú, com uma senha e um papel com uma dica ao lado. \n"
                + "                       “Sua casa e sua gestação, número e números, quais serão eles?”");

        for (int i = 0; i < 4; i++) {
            escolha12 = leitor.nextInt();
            if (escolha12 == 33 + 5) {
                System.out.println(
                        "A tampa do baú se abriu e dentro havia uma pequena pedra brilhosa vermelha, então peguei-a e guardei no bolso. \n"
                                + "Depois de fechar a caixa novamente pude ouvir o barulho de uma porta se abrindo, olhei para frente e vi a mesma \n"
                                + "saída pela qual entrei, me levantei e corri para fora de lá.");
                fragmento3[0] = 1;
                if (fragmento3[0] == 1) {
                    break;
                }
            } else {
                System.out.println("Resposta errada, tente novamente.");
                fragmento3[0] = 0;

            }
        }
        return fragmento3[0];
    }
}