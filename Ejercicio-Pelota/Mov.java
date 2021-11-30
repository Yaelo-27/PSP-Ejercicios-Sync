package MultiHilo1;

import javax.swing.*;

public class Mov extends Thread {
	
	private boolean activo = true;
	private JLabel pelota;
	private int x,y;
	
	public Mov(JLabel o) {
		this.pelota = o;
	}
	
	public void run() {
		x = 0;
		y = 140;
		while(activo) {
			while(x!=270) {
				try {
					this.sleep(10);
				}catch(Exception ex) {
					ex.printStackTrace();
				}
				pelota.setLocation(x,y);
				x++;
			}
			while(x!=0) {
				try {
					this.sleep(10);
				}catch(Exception ex) {
					ex.printStackTrace();
				}
				pelota.setLocation(x,y);
				x--;
			}
			
		}
	}
	
	
	public JLabel returnpelota() {
		return pelota;
	}
	
	public boolean returnactivo() {
		return activo;
	}
	
	public void parar() {
		activo = false;
	}
	
	public void activar() {
		activo = true;
	}
	
}
