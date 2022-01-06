import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */

   float cloudX = 0;
   float cloudY = 0;
   int sizeY = 600;
   int sizeX = 600;
   boolean upPressed = false;
   String message = "";
   int colour = 0; 

  public void settings() {
	// put your size call here
    size(sizeX, sizeY);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(8,155,155); 
    fill(255);
    stroke(255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

  if(keyPressed){
    if(key == '`'){
      hamm(mouseX, mouseY);
    }
    else if(key == '*'){
      background(8,155,155);
    }
  }
  if(upPressed){
    fill(53, 40, 92, 2);
    stroke(53, 40, 92, 50);
    rect(0, 0, sizeX, sizeY);
  
  }
    fill(colour);
    text(message, 120, 160);
    
    
    }
   
  

   public void mouseClicked() {
    fill(255);
    stroke(255);
    ellipse(mouseX - 5, mouseY, 45, 65);
    ellipse(mouseX + 16, mouseY + 15, 35, 40);
    ellipse(mouseX - 27, mouseY + 20, 30, 30);
    ellipse(mouseX -15, mouseY + 33, 100, 10);
    }

  public void hamm(float hammX, float hammY){
    fill(222, 163, 162);
    stroke(222, 163, 162);
    ellipse(hammX, hammY, 43, 43);
    ellipse(hammX - 20, hammY - 5 , 40, 40);
    ellipse(hammX - 10, hammY - 25, 10, 10);
    ellipse(hammX - 30, hammY -25, 10, 10);
    ellipse(hammX, hammY + 22, 8, 16);
    ellipse(hammX - 10, hammY + 22, 8, 16);
    ellipse(hammX + 10, hammY + 22, 8, 16);
    ellipse(hammX - 20, hammY + 22, 8, 16);
    fill(217, 157, 156);
    stroke(217, 157, 156);
    ellipse(hammX -26, hammY, 20, 20);
    stroke(204, 148, 147);
    fill(204, 148, 147);
    ellipse(hammX -20, hammY, 4, 9);
    ellipse(hammX - 30, hammY, 4, 9);
    fill(0);
    stroke(0);
    ellipse(hammX - 10, hammY - 10, 5, 5);
    ellipse(hammX -35, hammY - 10, 5, 5);
    fill(74, 38, 38);
    stroke(74, 38, 38);
    rect(hammX, hammY - 15, 15, 3);
  }

  public void keyPressed(){
    if(keyCode == UP ){
      upPressed = true;      
    } 
  }
  public void keyTyped(){
    if(key != '`' && key != '*' && key != '[' && key != ']'){
      message = message + key;
    }
    else if(key == '*'){
      message = "";
    }
   
  }
  
  public void mouseWheel(){
    if(keyPressed){
      if(key == ']'){
      colour = 255;
      }
      else if(key == '['){
        colour = 0;
      }
    }
  }
   
  
}