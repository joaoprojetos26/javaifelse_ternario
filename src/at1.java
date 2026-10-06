import java.util.Scanner;



    public class at1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String resultado ="";
            System.out.println("digite a nota da prova");
            double ntprova = sc.nextDouble();
            System.out.println("digite a nota das atividades");
            double ntatv = sc.nextDouble();
            if ((ntprova*0.70)+(ntatv*0.30)>=6){
                resultado = "aprovado";
                System.out.println();
            }else if ((ntprova*0.70)+(ntatv*0.30)<6){
                resultado = "reprovado";
            }else;
            javax.swing.JFrame frame = new javax.swing.JFrame();
            frame.setAlwaysOnTop(true);
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "nota da prova: "+ntprova +"\n"+ "nota das atividades: "+ntatv +"\n"+"resultado final: "+resultado,
                    "",
                    javax.swing.JOptionPane.QUESTION_MESSAGE);
            frame.dispose();
            sc.close();
        }
    }

