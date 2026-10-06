import java.util.Scanner;

    public class at3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("digite a distancia do seu veiculo");
            int dist = sc.nextInt();
            System.out.println("agora o consulmo do veiculo");
            int consulmo =sc.nextInt();
            javax.swing.JFrame frame = new javax.swing.JFrame();
            frame.setAlwaysOnTop(true);
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "distancia: "+dist +"km" +"\n"+ "consulmo medio: "+consulmo +"km" +"\n"+"quantidade de combustivel necessaria: "+(dist/ consulmo) +"litros ",
                    "",
                    javax.swing.JOptionPane.QUESTION_MESSAGE);
            sc.close();
        }
    }

