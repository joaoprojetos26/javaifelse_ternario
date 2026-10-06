import java.util.Scanner;

    public class at4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("digite as vitoris dos jogadores ");
            System.out.println("digite quantas vitorias do jogador1");
            int jogador1 = sc.nextInt();
            System.out.println("agora do jogador2");
            int jogador2 = sc.nextInt();
            javax.swing.JFrame frame = new javax.swing.JFrame();
            frame.setAlwaysOnTop(true);
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "Vitórias do jogador 1: "+jogador1 +"\n"+ "Vitórias do jogador 2: "+jogador2 +"\n"+"Pontuação do jogador 1:"+(jogador1*10) +"\n"+ "Pontuação do jogador 2:"+(jogador2*5) ,
                    "",
                    javax.swing.JOptionPane.QUESTION_MESSAGE);
            frame.dispose();
            sc.close();

        }
    }

