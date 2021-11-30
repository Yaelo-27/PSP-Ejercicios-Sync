package MultiHilo2;

import java.awt.Label;

import javax.swing.*;

public class Hilo extends Thread {
	
	private boolean activar = true;
	private int contador=0;
	private JLabel label;
	
	public Hilo(JLabel lframe) {
		this.label = lframe;
	}
	
	@Override
	public void run() {
		while(activar) {
			try {
				this.sleep(2000);
			}catch(Exception ex) {
				ex.printStackTrace();
			}
			contador++;
			label.setText(String.valueOf(contador)); 
		}
	}
	
	public JLabel returnlabel(){
		return label;
	}
	
	public void detener() {
		activar = false;
	}
	
}
