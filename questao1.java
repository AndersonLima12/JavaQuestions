// QUESTÃO 1 JAVA

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class questao1{
    public static void main(String[] args) throws ParseException {
       String Data;
       Scanner d = new Scanner(System.in);
       Calendar c = Calendar.getInstance();
       Locale local = new Locale("pt", "BR");
       SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
       System.out.print("Informe uma data: ");
       Data = d.next();
       Date dataFormatada = df.parse(Data);
       c.setTime(dataFormatada);
       SimpleDateFormat nf = new SimpleDateFormat("dd 'de' MMMM' de' yyyy",local);
       System.out.println(nf.format(dataFormatada));
    }
}

