/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Circle head;
    private Triangle rightEar;
    private Triangle leftEar;
    private Triangle rightEar2;
    private Triangle leftEar2;
    private Circle rightEye;
    private Circle leftEye;
    private Triangle rightPupil;
    private Triangle leftPupil;
    private Person mouth;
    private Square noseBackground;
    private Triangle noseEraserRight;
    private Triangle noseEraserLeft;
    private Square noseEraserTop;
    private Square noseEraserRight2;
    private Square noseEraserLeft2;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        head = new Circle();
        rightEar = new Triangle();
        leftEar = new Triangle();
        rightEar2 = new Triangle();
        leftEar2 = new Triangle();
        rightEye = new Circle();
        leftEye = new Circle();
        rightPupil = new Triangle();
        leftPupil = new Triangle();
        mouth = new Person();
        noseBackground = new Square();
        noseEraserRight = new Triangle();
        noseEraserLeft = new Triangle();
        noseEraserTop = new Square();
        noseEraserRight2 = new Square();
        noseEraserLeft2 = new Square();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            head.changeColor("black");
            head.moveHorizontal(20);
            head.moveVertical(150);
            head.changeSize(500);
            head.makeVisible();
            
            rightEar.changeColor("black");
            rightEar.moveHorizontal(180);
            rightEar.moveVertical(0);
            rightEar.changeSize(200,200);
            rightEar.makeVisible();
        
            leftEar.changeColor("black");
            leftEar.moveHorizontal(400);
            leftEar.moveVertical(0);
            leftEar.changeSize(200,200);
            leftEar.makeVisible();
    
            rightEar2.changeColor("pink");
            rightEar2.moveHorizontal(180);
            rightEar2.moveVertical(45);
            rightEar2.changeSize(100,75);
            rightEar2.makeVisible();
            
            leftEar2.changeColor("pink");
            leftEar2.moveHorizontal(400);
            leftEar2.moveVertical(45);
            leftEar2.changeSize(100,75);
            leftEar2.makeVisible();
            
            rightEye.changeColor("yellow");
            rightEye.moveHorizontal(180);
            rightEye.moveVertical(275);
            rightEye.changeSize(50);
            rightEye.makeVisible();
            
            leftEye.changeColor("yellow");
            leftEye.moveHorizontal(400);
            leftEye.moveVertical(275);
            leftEye.changeSize(50);
            leftEye.makeVisible();
            
            rightPupil.changeColor("black");
            rightPupil.moveHorizontal(230);
            rightPupil.moveVertical(195);
            rightPupil.changeSize(50,10);
            rightPupil.makeVisible();
     
            leftPupil.changeColor("black");
            leftPupil.moveHorizontal(450);
            leftPupil.moveVertical(195);
            leftPupil.changeSize(50,10);
            leftPupil.makeVisible();
            
            mouth.changeColor("pink");
            mouth.moveHorizontal(300);
            mouth.moveVertical(320);
            mouth.changeSize(50,50);
            mouth.makeVisible();
            
            noseBackground.changeColor("pink");
            noseBackground.moveHorizontal(234);
            noseBackground.moveVertical(332);
            noseBackground.changeSize(75);
            noseBackground.makeVisible();
            
            noseEraserRight.changeColor("black");
            noseEraserRight.moveHorizontal(349);
            noseEraserRight.moveVertical(347);
            noseEraserRight.changeSize(40,40);
            noseEraserRight.makeVisible();
            
            noseEraserLeft.changeColor("black");
            noseEraserLeft.moveHorizontal(391);
            noseEraserLeft.moveVertical(347);
            noseEraserLeft.changeSize(40,40);
            noseEraserLeft.makeVisible();
            
            noseEraserTop.changeColor("black");
            noseEraserTop.moveHorizontal(234);
            noseEraserTop.moveVertical(300);
            noseEraserTop.changeSize(75);
            noseEraserTop.makeVisible();
            
            noseEraserRight2.changeColor("black");
            noseEraserRight2.moveHorizontal(175);
            noseEraserRight2.moveVertical(332);
            noseEraserRight2.changeSize(75);
            noseEraserRight2.makeVisible();
            
            noseEraserLeft2.changeColor("black");
            noseEraserLeft2.moveHorizontal(292);
            noseEraserLeft2.moveVertical(332);
            noseEraserLeft2.changeSize(75);
            noseEraserLeft2.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        // wall.changeColor("black");
        // window.changeColor("white");
        // roof.changeColor("black");
        // sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        // wall.changeColor("red");
        // window.changeColor("black");
        // roof.changeColor("green");
        // sun.changeColor("yellow");
    }
}
