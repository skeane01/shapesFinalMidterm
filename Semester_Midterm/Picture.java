
/**
 * Draw a pretty picture composed of shape objects on a canvas
 * 
 * @author: (Your name)
 * @version: (Date)
 * 
 */
import java.io.File;
import java.io.IOException;

public class Picture {
    public static void main(String[] args) {
        // Get a reference to the canvas for this drawing
        Canvas pic = Canvas.getCanvas();

        // Set the title and background for the picture
        pic.setTitle("My Picture");
        pic.setBackgroundColor("#F50b9a");

        // Draw my picture
        Arc sun = new Arc();
        sun.changeColor("#FFA500");
        sun.makeVisible();
        sun.changeArcBeginning(0);
        sun.changeArcEnd(180);
        sun.setPosition(300, 275);
        sun.changeSize(200);
        
        Triangle sunT1 = new Triangle();
        sunT1.makeVisible();
        sunT1.changeColor("#FFA500");
        sunT1.changeSize(65, 65);
        sunT1.moveHorizontal(190);
        sunT1.moveVertical(100);
        
        Arc sunA1 = new Arc();
        sunA1.changeColor("#FFA500");
        sunA1.makeVisible();
        sunA1.changeArcBeginning(-45);
        sunA1.changeArcEnd(20);
        sunA1.setPosition(215, 250);
        sunA1.changeSize(150);
        
        Arc sunA2 = new Arc();
        sunA2.changeColor("#FFA500");
        sunA2.makeVisible();
        sunA2.changeArcBeginning(170);
        sunA2.changeArcEnd(215);
        sunA2.setPosition(445, 250);
        sunA2.changeSize(150);
        
        Rect water = new Rect();
        water.makeVisible();
        water.changeColor("blue");
        water.moveVertical(225);
        water.moveHorizontal(-400);
        water.changeSize(300, 1000);
        
        Rect sand = new Rect();
        sand.makeVisible();
        sand.changeColor("#FFCC00");
        sand.moveVertical(350);
        sand.moveHorizontal(-400);
        sand.changeSize(300, 1000);
        
        Circle cloud1 = new Circle();
        cloud1.makeVisible();
        cloud1.changeColor("#800080");
        cloud1.changeSize(75);
        cloud1.moveHorizontal(-65);
        cloud1.moveVertical(0);
        
        Circle cloud2 = new Circle();
        cloud2.makeVisible();
        cloud2.changeColor("#800080");
        cloud2.changeSize(95);
        cloud2.moveHorizontal(-25);
        cloud2.moveVertical(-15);
        
        Circle cloud3 = new Circle();
        cloud3.makeVisible();
        cloud3.changeColor("#800080");
        cloud3.changeSize(75);
        cloud3.moveHorizontal(20);
        cloud3.moveVertical(0);
        
        Circle cloud4 = new Circle();
        cloud4.makeVisible();
        cloud4.changeColor("#800080");
        cloud4.changeSize(75);
        cloud4.moveHorizontal(300);
        cloud4.moveVertical(15);
        
        Circle cloud5 = new Circle();
        cloud5.makeVisible();
        cloud5.changeColor("#800080");
        cloud5.changeSize(95);
        cloud5.moveHorizontal(325);
        cloud5.moveVertical(0);
        
        Circle cloud6 = new Circle();
        cloud6.makeVisible();
        cloud6.changeColor("#800080");
        cloud6.changeSize(75);
        cloud6.moveHorizontal(370);
        cloud6.moveVertical(15);
        
        Circle beachball1 = new Circle();
        beachball1.makeVisible();
        beachball1.changeColor("white");
        beachball1.changeSize(60);
        beachball1.moveVertical(415);
        
        

        // Get the filename to save to from the command line arguments, defaulting to
        // MyPicture.png if no argument is given
        String filename;
        if (args.length > 0 && args[0] != null && !args[0].isEmpty()) {
            filename = args[0];
        }
        else {
            filename = "MyPicture.png";
        }

        // Save the picture to a file
        try {
            pic.saveToFile(new File(filename));
            System.out.println("Picture saved to " + filename);
        } catch (IOException e) {
            System.err.println(e);
            System.err.println("Could not save file.");
        }
    }
}