import java.util.Scanner;
    public class at5 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("digite seu salario");
            double salario = sc.nextDouble();
            javax.swing.JFrame frame = new javax.swing.JFrame();
            frame.setAlwaysOnTop(true);
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "Salário bruto:" + salario + "\n" + "Imposto de 10%: " + (salario * 0.10) + "\n" + "Salário líquido: " + (salario - (salario * 0.10)),
                    "",
                    javax.swing.JOptionPane.QUESTION_MESSAGE);
            frame.dispose();
            sc.close();
        }
    }

