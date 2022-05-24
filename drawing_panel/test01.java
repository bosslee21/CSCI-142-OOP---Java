package drawing_panel;
import java.awt.*;

public class test01 {

	public static void main(String[] args) {
		DrawingPanel p = new DrawingPanel(400,500);
		Graphics g = p.getGrahpics();
		
		g.drawRect(100,100,200,200);

	}

}
