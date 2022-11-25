import java.util.GregorianCalendar;

public class Exercicio22
{
	public static void main (String arg[])
	{
		GregorianCalendar	data;
		int	dia;
		int	mes;
		int	ano;
		int	hora;
		int	minuto;
		int	segundo;

		data = new GregorianCalendar();
		dia = data.get(data.DAY_OF_MONTH);
		mes = data.get(data.MONTH) + 1;
		ano = data.get(data.YEAR);
		hora = data.get(data.HOUR);
		minuto = data.get(data.MINUTE);
		segundo = data.get(data.SECOND);
		System.out.print("\nData Atual é : " + dia + "/" + mes + "/" + ano);
		System.out.println("  O horário atual é : " +
			hora + ":" + minuto + ":" + segundo + "\n");
	}
}
