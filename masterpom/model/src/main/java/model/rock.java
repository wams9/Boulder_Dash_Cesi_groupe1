package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class rock extends objet {
	public int x;
	public int y;
	
	public rock() {
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
	Image fond=new ImageIcon("C:\\Users\\User\\Music\\projet UML java\\boulder romzy\\rock.png").getImage();
}
