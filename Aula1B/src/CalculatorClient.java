import java.rmi.Naming;
import javax.swing.JOptionPane;

public class CalculatorClient {
	public static void main(String[] args) {
		try {
			Calculator c = (Calculator) Naming
					.lookup("//localhost:1020/CalculatorService");
			
			System.out.println(c.sub(4, 3));
			System.out.println(c.add(4, 5));
			System.out.println(c.mul(3, 6));
			System.out.println(c.div(6, 9));
			
			String opcao[] = {"+", "-","*", "/"};
					int operacao =JOptionPane.showOptionDialog(null, "Escolha uma das operacoes",
							"Tipo de operacao",
					0,
					JOptionPane.INFORMATION_MESSAGE, null, opcao,
					opcao[0]);
					
		} catch (Exception e) {
			System.out.println (e);
		}
	}
}
