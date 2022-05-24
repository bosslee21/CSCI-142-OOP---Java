// Jae Butler
//CSCI 142 Art Contest
// December 5th 2021
// Creating a squid Game facilitator using DrawingPanel Java.
//

// calling library for drawing Panels.
import java.awt.*;

//main method for Drawing Panels.
public class Main_drawing {

	public static void main(String[] args) {
		// declaring a drawing Panel with width 800 and height of 800 pixels to a
		// variable "p"
		DrawingPanel p = new DrawingPanel(800, 800);

		// setting background color to Gray
		p.setBackground(Color.GRAY);

		// getting brush to color drawing Panel and storing the drawingPanel p to
		// Graphics g.
		Graphics g = p.getGraphics();

		// Setting the red color.
		g.setColor(Color.RED);
		// calling cloteR and clothL method to draw on the drawing panels.
		clotheR(g);
		clotheL(g);

		// first two is coordinate of where the location (x,y,width,height) last two is
		// width and height)

		// setting the color to black
		g.setColor(Color.BLACK);
		// creating an oval and coloring to black. position to middle of the
		// drawingPanel.
		g.fillOval(300, 200, 200, 250);

		// set the color to white for next drawing
		g.setColor(Color.WHITE);
		// calling drawTriangle Method to draw.
		DrawTriangle(g);

		// setting pink colors to 3 object above the head
		g.setColor(Color.PINK);
		// drawing rectangle above the squidgame facilitator.
		g.drawRect(214, 47, 100, 100);

		// circle above the head
		g.drawOval(500, 63, 90, 90);
		triangle(g);

		// setting color to black for the zipper of the line
		g.setColor(Color.BLACK);
		// calling middleLine method
		middleLine(g);

	}

	public static void DrawTriangle(Graphics g) {
		// declare new polygon
		Polygon p = new Polygon();
		// add point on top of the circle
		p.addPoint(398, 206);
		p.addPoint(309, 303);
		p.addPoint(486, 304);

		g.drawPolygon(p);
	}

	// creating a method for triangle polygon middle of the square and circle to
	// complete 3 polygon group represent in squid game

	public static void triangle(Graphics g) {
		Polygon t = new Polygon();
		t.addPoint(413, 16);
		t.addPoint(366, 85);
		t.addPoint(457, 85);

		g.drawPolygon(t);

	}

	// right side of the clothes polygon
	public static void clotheR(Graphics g) {
		Polygon c = new Polygon();
		c.addPoint(398, 196);
		c.addPoint(398, 155);
		c.addPoint(431, 175);
		c.addPoint(463, 197);
		c.addPoint(495, 222);
		c.addPoint(542, 309);
		c.addPoint(542, 508);
		c.addPoint(585, 533);
		c.addPoint(633, 575);
		c.addPoint(678, 762);
		c.addPoint(382, 762);

		g.fillPolygon(c);

	}

	// left side. subtract from the first two points to get the x,y of the reverse
	// side
	public static void clotheL(Graphics g) {
		Polygon c = new Polygon();
		c.addPoint(398, 196);
		c.addPoint(398, 155);
		c.addPoint(303, 209);
		c.addPoint(250, 303);
		c.addPoint(251, 309);
		c.addPoint(268, 508);
		c.addPoint(199, 533);
		c.addPoint(190, 575);
		c.addPoint(120, 762);
		c.addPoint(382, 762);

		g.fillPolygon(c);

	}

	// Creating a method middle line to draw black zipper line
	public static void middleLine(Graphics g) {
		Polygon l = new Polygon();
		l.addPoint(387, 450);
		l.addPoint(405, 450);
		l.addPoint(405, 760);
		l.addPoint(387, 760);

		g.fillPolygon(l);

	}
}
