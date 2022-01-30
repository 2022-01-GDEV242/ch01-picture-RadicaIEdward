/**
 * This class represents a simple Cat. You can draw the Cat using
 * the draw method. But wait, there's more: being an electronic Cat, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written because Cats.
 * 
 * @author  Edward Galindez
 * @version 01.29.2022
 */
public class Cat
{
    private Square bwBackground;
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
     * Constructor for objects of class Cat
     */
    public Cat()
    {
        bwBackground = new Square();
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
     * Draw this Cat.
     */
    public void draw()
    {
        if(!drawn) {
            bwBackground.changeColor("black");
            bwBackground.changeSize(1000);
            bwBackground.moveHorizontal(-310);
            bwBackground.moveVertical(-120);
            
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
            rightEar2.changeColor("pink");
            
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
     * Change this Cat to black/white display
     */
    public void setBlackAndWhite()
    {
        bwBackground.makeVisible();
        head.changeColor("white");
        rightEar.changeColor("white");
        leftEar.changeColor("white");
        rightEar2.changeColor("black");
        leftEar2.changeColor("black");
        rightEye.changeColor("black");
        leftEye.changeColor("black");
        rightPupil.changeColor("white");
        leftPupil.changeColor("white");
        mouth.changeColor("black");
        noseBackground.changeColor("black");
        noseEraserRight.changeColor("white");
        noseEraserLeft.changeColor("white");
        noseEraserTop.changeColor("white");
        noseEraserRight2.changeColor("white");
        noseEraserLeft2.changeColor("white");
    }

    /**
     * Change this Cat to use color display
     */
    public void setColor()
    {
        bwBackground.makeInvisible();
        head.changeColor("black");
        rightEar.changeColor("black");
        leftEar.changeColor("black");
        rightEar2.changeColor("pink");
        leftEar2.changeColor("pink");
        rightEye.changeColor("yellow");
        leftEye.changeColor("yellow");
        rightPupil.changeColor("black");
        leftPupil.changeColor("black");
        mouth.changeColor("pink");
        noseBackground.changeColor("pink");
        noseEraserRight.changeColor("black");
        noseEraserLeft.changeColor("black");
        noseEraserTop.changeColor("black");
        noseEraserRight2.changeColor("black");
        noseEraserLeft2.changeColor("black");
    }
}
