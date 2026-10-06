import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ternario {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String resultado = "";
    // Define o formato da data como o padrão brasileiro (dia/mês/ano)
    DateTimeFormatter formador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    System.out.println("digite a data do seu nacimento dd/mm/ano");
    String datanacimentocliente = sc.nextLine();
    try {
        // Converte o texto digitado em um objeto LocalDate
        LocalDate dataNascimento = LocalDate.parse(datanacimentocliente, formador);
        // Pega a data atual do sistema
        LocalDate dataAtual = LocalDate.now();
        // Calcula o período de tempo entre a data de nascimento e a data atual
        int idade = Period.between(dataNascimento, dataAtual).getYears();
        System.out.println("Você tem " + idade + " anos.");
        resultado =(idade >= 18)? "voce e maior de idade" :"voce e menor de idade ";
    } catch (Exception e) {
        System.out.println("Erro: Formato de data inválido! Certifique-se de usar o padrão dd/MM/aaaa.");
    } finally { javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                resultado,
                "",
                javax.swing.JOptionPane.QUESTION_MESSAGE);
        frame.dispose();
        sc.close();
    }
}

}

