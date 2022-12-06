package prog;

import javax.swing.JButton;
import javax.swing.JTextField;

public class logic_class {
	public String Operatore1;
	public String Operatore2;
	public String Segno;
	public String Risultato;
	public Integer Op1;
	public Integer Op2;
	public Integer Ris;
	public Boolean it;

	public logic_class(Boolean it) {
		this.it = it;
	}
	
	protected void inserimento(JButton Bottone, JTextField TextField) {
			TextField.setText(TextField.getText()+Bottone.getText());
	}
	
	protected void inserimento_plus(JButton Bottone, JTextField disp, JTextField disp2) {
		Operatore1 = disp2.getText();
		it=true;
		disp.setText(Bottone.getText());
		Segno = Bottone.getText();
	}
	
	
}