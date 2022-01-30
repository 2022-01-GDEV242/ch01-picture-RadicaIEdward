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
    private Triangle rightear;
    private Triangle leftear;
    private Triangle rightear2;
    private Triangle leaftear2;
    private Circle righteye;
    private Circle lefteye;
    private Triangle rightpupil;
    private Triangle leftpupil;
    private Person mouth;
    private Triangle nose;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        head = new Circle();
        rightear = new Triangle();
        leftear = new Triangle();
        rightear2 = new Triangle();
        leaftear2 = new Triangle();
        righteye = new Circle();
        lefteye = new Circle();
        rightpupil = new Triangle();
        leftpupil = new Triangle();
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
            head.moveHorizontal(20);
            head.moveVertical(150);
            head.changeSize(500);
            head.makeVisible();
            
            rightear.changeColor("black");
            rightear.moveHorizontal(180);
            rightear.moveVertical(0);
            rightear.changeSize(200,200);
            rightear.makeVisible();
        
            leftear.changeColor("black");
            leftear.moveHorizontal(400);
            leftear.moveVertical(0);
            leftear.changeSize(200,200);
            leftear.makeVisible();
    
            rightear2.changeColor("pink");
            rightear2.moveHorizontal(180);
            rightear2.moveVertical(45);
            rightear2.changeSize(100,75);
            rightear2.makeVisible();
            
            leaftear2.changeColor("pink");
            leaftear2.moveHorizontal(400);
            leaftear2.moveVertical(45);
            leaftear2.changeSize(100,75);
            leaftear2.makeVisible();
            
            righteye.changeColor("yellow");
            righteye.moveHorizontal(180);
            righteye.moveVertical(275);
            righteye.changeSize(50);
            righteye.makeVisible();
            
            lefteye.changeColor("yellow");
            lefteye.moveHorizontal(400);
            lefteye.moveVertical(275);
            lefteye.changeSize(50);
            lefteye.makeVisible();
            
            rightpupil.changeColor("black");
            rightpupil.moveHorizontal(0);
            rightpupil.moveVertical(0);
            rightpupil.changeSize(40,10);
            rightpupil.makeVisible();
            
            leftpupil.changeColor("black");
            leftpupil.moveHorizontal(0);
            leftpupil.moveVertical(0);
            leftpupil.changeSize(40,10);
            leftpupil.makeVisible();
            
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
