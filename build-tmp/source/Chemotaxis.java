import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Chemotaxis extends PApplet {

 Bacteria [] colony = new Bacteria[150]; 
 public void setup() 
 {  
 	//initialize bacteria variables here  
	 size(1000, 800);
 	background(255);
 	for (int j = 0; j < colony.length; j++)   
 	{
 		colony[j] = new Bacteria();
 	}
}
 public void draw()   
 {    
 	//move and show the bacteria   
 	fill(255,255,255, 60);
 	rect(0, 0, 1000, 800);
 	for(int j = 0; j < colony.length; j++)
 		{
 			colony[j].move();
 			colony[j].show();
 		}
 	
 }  

 class Bacteria    
 {     
 	//lots of java! 
 	int myX, myY, myColor, mySize, myColorx, myColory;
 	Bacteria()
 	{
 		myX = (int)(Math.random()*1001);
 		myY = (int)(Math.random()*801);
 		myColor = (int)(Math.random()*256);
 		myColorx = (int)(Math.random()*256);
 		myColory = (int)(Math.random()*256);
 		mySize = (int)(Math.random()*25) + 1;
 	}  
 	public void move()
 	{
		if(myX < mouseX)
 		{
 			myX = myX + (int)(Math.random()*7) - 3;
 		}
 		else if(myX > mouseX)
 		{
 			myX = myX + (int)(Math.random()*7) - 3;
 		}
 		else 
 		{
 			myX = myX + (int)(Math.random()*9) - 4;	
 		}
 		if(myY < mouseY)
 		{
 			myY = myY + (int)(Math.random()*7) - 3;
 		}
 		else if(myY > mouseY)
 		{
 			myY = myY + (int)(Math.random()*7) - 3;
 		}
 		else 
 		{
 			myY = myY + (int)(Math.random()*8) - 4;	
 		}
 	}
 	public void show()
 	{
 		noStroke();
 		fill(myColory,myColorx,myColor);
 		ellipse(myX,myY,mySize,mySize);
 	}
 }    
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chemotaxis" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
