package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    protected int x;
    protected int y;
    protected int w;
    protected int h;
    
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
   	 w = 50;
   	 h = 50;
    }
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
}
