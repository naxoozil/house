/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square campo;
    private Person persona;
    private Person niño;
    private Square libro;
    private Circle balon;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();
        
        campo = new Square();
        campo.changeColor("green");
        campo.changeSize(500);
        campo.moveVertical(140);
        campo.moveHorizontal(-310);
        campo.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
    
    /**
     * Change this picture to use color display
     */
    public void moveSun()
    {
        if (sun != null)   // only if it's painted already...
        {
            sun.slowMoveVertical(120);
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
            campo.changeColor("black");
        }
    }
    
    /**
     * Change this picture to use color display
     */
    public void createPersonAndMove()
    {
        {
            persona = new Person();
            persona.moveHorizontal(-240);
            persona.moveVertical(28);
            persona.changeSize(60,30);
            persona.makeVisible();
            persona.slowMoveHorizontal(110);
        }
    }
    
    /**
     * Change this picture to use color display
     */
    public void niñoBalonYLibro()
    {
        if (sun != null)   // only if it's painted already...
        {
          niño = new Person();
          niño.moveHorizontal(120);
          niño.moveVertical(42);
          niño.changeSize(40,20);
          balon = new Circle();
          balon.moveHorizontal(130);
          balon.moveVertical(160);
          balon.changeSize(10);
          libro = new Square();
          libro.moveHorizontal(100);
          libro.moveVertical(112);
          libro.changeSize(10);
          niño.makeVisible();
          balon.makeVisible();
          libro.makeVisible();
        }
    }
    
    /**
     * Change this picture to black/white display
     */
    public void balon()
    {
        if (balon != null)   // only if it's painted already...
        {
            libro.slowMoveVertical(18);
            niño.slowMoveHorizontal(-20);
            balon.slowMoveHorizontal(-11);
            balon.slowMoveVertical(-8);
            balon.slowMoveHorizontal(-11);
            balon.slowMoveVertical(-8);
            balon.slowMoveHorizontal(-11);
            balon.slowMoveVertical(-8);
            balon.slowMoveHorizontal(-11);
            balon.slowMoveVertical(-8);
            balon.slowMoveHorizontal(-11);
            balon.slowMoveVertical(-8);
            balon.slowMoveHorizontal(-11);
            balon.slowMoveVertical(-8);
            balon.slowMoveHorizontal(-11);
            balon.slowMoveVertical(-8);
            balon.slowMoveHorizontal(-11);
            balon.slowMoveVertical(-8);
            balon.slowMoveHorizontal(-11);
            balon.slowMoveVertical(-8);
            balon.slowMoveHorizontal(-11);
            balon.slowMoveVertical(-8);
            balon.slowMoveHorizontal(-11);
            balon.slowMoveVertical(-8);
            balon.slowMoveHorizontal(-9);
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
            campo.changeColor("black");
            balon.changeColor("white");
            libro.changeColor("black");
        }
    }
}
