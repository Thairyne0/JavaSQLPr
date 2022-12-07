package prog;

import javax.swing.JButton;
import javax.swing.JTextField;

public class calcolatriceData {
	public JTextField PrimoOP;
	public JTextField SecondoOP;
	public Boolean it=false;
	String var,gesu;

	public calcolatriceData(Boolean it) {
		this.it = it;
	}
	
	protected void inserimentocifra_SE_PRIMA_volta(JButton Bottone) {
		if(!it) {
			PrimoOP.setText(PrimoOP.getText()+Bottone.getText());
		}
	}
	
	protected void inserimentocifra_SE_SECONDA_volta(JButton Bottone) {
		if(it=true) {
			SecondoOP.setText(SecondoOP.getText()+Bottone.getText());
		}
	}
	
	protected String inserimento(String var) {
		
		return var;
	}
	
	protected String stampa(String gesu) {
		System.out.println("PROVA");
		return gesu;
		
	}
	
	
}