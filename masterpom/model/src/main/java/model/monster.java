package model;

import java.awt.Image;


import javax.swing.ImageIcon;

public class monster extends objet {
	public int x;
	public int y;
	
	public monster() {
		this.setImage(fond);
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	Image fond=new ImageIcon("C:\\Users\\User\\Music\\projet UML java\\boulder romzy\\monster.png").getImage();
}
