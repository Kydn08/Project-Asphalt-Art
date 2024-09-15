import org.code.neighborhood.*;
public class FlowerPainter extends MuralPainter{
 
  public void paintFlower(String stemColor,String petalColor, String middleColor) {
getToStartStem();
    paintStem(stemColor);
    getToStartBed();
    paintMiddle(middleColor);
    paintPetals(petalColor);
  } 
  /*Painter is at the corner
  *Gets to the very beggining of the mural
  *and gets ready to paint the stem
  */
  
public void getToStartStem() {
  move();
  turnRight();
  move();
  move();
  move();
  move();
  move();
  turnLeft();
  move();
  move();
  move();
  move();
  move();
  move();
    
  
}
 //paints the stem for the flower
  public void paintStem(String color){
    turnLeft();
  turnLeft();
  turnLeft();
  move();
  move();
  move();
  paintLine("green",8);
  }

  //gets the painter to the starting the bed of the flower
    public void getToStartBed(){
    turnRight();
    turnRight();
    move();
    move();
    move();
    move();
    move();
    move();
    turnRight();
    }

  //Paints the middle of the flower
    public void paintMiddle(String Color){
    paintLine("yellow",2);
    turnLeft();
    paintLine("yellow",2);
    turnLeft();
    turnLeft();
    move();
    turnLeft();
    turnLeft();
    turnLeft();
    paintLine("yellow",4);
    turnLeft();
    paintLine("yellow",2);
    turnLeft();
    move();  
turnLeft();
    move();
paintLine("yellow",1);
    move();
    turnLeft();
    move();
    turnRight();
    paintLine("red",4);
    }

  //paints the petals for the flower
  public void paintPetals(String color){  
  turnRight();
    move();
    move();
    turnRight();
    paintLine("red",5);
    turnLeft();
    move();
    move();
    turnLeft();
     move();
     paintLine("red",4);
    turnRight();
      turnRight();
    move();
    move();
    move();
    move();
    move();
    move();
    turnLeft();
    move();
    paintLine("red",4);
    turnLeft();
    turnLeft();
    move();
     move();
     move();
     move();
     move();
     move();
     move();
     move();
     move();
    move();
    paintLine("red",4);
  }
    
     
    
  }   
    