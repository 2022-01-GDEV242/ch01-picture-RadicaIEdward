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
    private Triangle ear1;
    private Triangle ear2;
    private Triangle ear3;
    private Triangle ear4;
    private Circle eye1;
    private Circle eye2;
    private Square pupil1;
    private Square pupil2;
    private Person mouth;
    private Triangle nose;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        head = new Circle();
        ear1 = new Triangle();
        ear2 = new Triangle();
        ear3 = new Triangle();
        ear4 = new Triangle();
        eye1 = new Circle();
        eye2 = new Circle();
        pupil1 = new Square();
        pupil2 = new Square();
        mouth = new Person();
        nose = new Triangle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            head.changeColor("black");
            head.moveHorizontal(0);
            head.moveVertical(0);
            head.changeSize(400);
            head.makeVisible();
            
            ear1.changeColor("black");
            ear1.moveHorizontal(0);
            ear1.moveVertical(0);
            ear1.changeSize(0,0);
            ear1.makeVisible();
    
            ear2.changeColor("black");
            ear2.moveHorizontal(0);
            ear2.moveVertical(0);
            ear2.changeSize(0,0);
            ear2.makeVisible();
    
            ear3.changeColor("pink");
            ear3.moveHorizontal(0);
            ear3.moveVertical(0);
            ear3.changeSize(0,0);
            ear3.makeVisible();
            
            ear4.changeColor("pink");
            ear4.moveHorizontal(0);
            ear4.moveVertical(0);
            ear4.changeSize(0,0);
            ear4.makeVisible();
            
            eye1.changeColor("yellow");
            eye1.moveHorizontal(0);
            eye1.moveVertical(0);
            eye1.changeSize(0);
            eye1.makeVisible();
            
            eye2.changeColor("yellow");
            eye2.moveHorizontal(0);
            eye2.moveVertical(0);
            eye2.changeSize(0);
            eye2.makeVisible();
            
            pupil1.changeColor("black");
            pupil1.moveHorizontal(0);
            pupil1.moveVertical(0);
            pupil1.changeSize(0);
            pupil1.makeVisible();
            
            pupil2.changeColor("black");
            pupil2.moveHorizontal(0);
            pupil2.moveVertical(0);
            pupil2.changeSize(0);
            pupil2.makeVisible();
            
            mouth.changeColor("pink");
            mouth.moveHorizontal(0);
            mouth.moveVertical(0);
            mouth.changeSize(0,0);
            mouth.makeVisible();
            
            nose.changeColor("pink");
            nose.moveHorizontal(0);
            nose.moveVertical(0);
            nose.changeSize(0,0);
            nose.makeVisible();
            
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
