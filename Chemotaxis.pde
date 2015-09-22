 Bacteria [] colony = new Bacteria[150]; 
 void setup() 
 {  
 	//initialize bacteria variables here  
	 size(1000, 800);
 	background(255);
 	for (int j = 0; j < colony.length; j++)   
 	{
 		colony[j] = new Bacteria();
 	}
}
 void draw()   
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
 	void move()
 	{
 		if (mousePressed){
		if(myX < mouseX)
 		{
 			myX = myX + (int)(Math.random()*4) - 1;
 		}
 		else if(myX > mouseX)
 		{
 			myX = myX + (int)(Math.random()*4) - 2;
 		}
 		else 
 		{
 			myX = myX + (int)(Math.random()*5) - 2;	
 		}
 		if(myY < mouseY)
 		{
 			myY = myY + (int)(Math.random()*4) - 1;
 		}
 		else if(myY > mouseY)
 		{
 			myY = myY + (int)(Math.random()*4) - 2;
 		}
 		else 
 		{
 			myY = myY + (int)(Math.random()*5) - 2;	
 		}

 		}
 		else
 		{
 			myX = myX + (int)(Math.random()*5) - 2;
 			myY = myY + (int)(Math.random()*5) - 2;
 		}
 	}
 	void show()
 	{
 		noStroke();
 		fill(myColory,myColorx,myColor);
 		ellipse(myX,myY,mySize,mySize);
 	}
 }    