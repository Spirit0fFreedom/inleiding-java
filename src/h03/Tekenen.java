package h03;

import java.awt.*;
import java.applet.*;

public class Tekenen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        Color myBrown = new Color(222, 184, 135); // brown
        /* Gelijkbenige driehoek | Opdracht 4.1 */
        g.drawLine(150, 10, 200, 150);
        g.drawLine(150, 10, 100, 150);
        g.drawLine(100, 150, 200, 150);
        // Huis | Opdracht 4.2
        g.drawRect(250, 200, 150,150);
        g.drawRect(270, 300, 50,30);
        g.drawRect(270, 225, 50,30);
        g.drawRect(350, 300, 30,50);
        g.drawRect(357, 310, 15,15);
        g.drawRect(370, 330, 5,5);
        g.drawLine(325, 100, 250, 200);
        g.drawLine(325, 100, 400, 200);
        g.drawOval(300,135,50,50);
        g.drawOval(340,220,40,40);
        g.drawOval(300,135,50,50);
        // Teken de Nederlandse vlag | Opdracht 4.3
        g.drawLine(500, 350, 500, 200);
        g.drawRect(500, 200, 75,20);
        g.drawRect(500, 220, 75,20);
        g.drawRect(500, 240, 75,20);
        g.setColor(Color.red);
        g.fillRect(500, 200, 75,20);
        g.setColor(Color.white);
        g.fillRect(500, 220, 75,20);
        g.setColor(Color.blue);
        g.fillRect(500, 240, 75,20);
        // Maak een staafdiagram | Opdracht 4.4






    }

}