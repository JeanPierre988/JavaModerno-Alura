import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println("HOJE = " + hoje);
        System.out.println("Amanhã = " + hoje.plusDays(1));

        LocalDate CopaDoMundo2022 = LocalDate.of(2022, Month.JUNE, 15);
        System.out.println("Copa de 2022 = " + CopaDoMundo2022);

        System.out.println("Anos que faltam para Copa = " + (CopaDoMundo2022.getYear() - hoje.getYear()));

        System.out.println("=============PERIODO==============");
        Period periodoCopa = Period.between(CopaDoMundo2022, hoje);
        System.out.println("Periodo até a Copa = " + periodoCopa);

        System.out.println("=============Formatando Datas==============");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data com Formatador = " + hoje.format(formatter));
        System.out.println("=============Formatando Datas com Tempo==============");
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("dd/MM/yy hh:mm");
        System.out.println(agora.format(timeFormatter));
        System.out.println("=============Modelos Mais Especificos de Data==============");
        YearMonth anoMes = YearMonth.of(2022, 12);
        System.out.println(anoMes);
    }
}
