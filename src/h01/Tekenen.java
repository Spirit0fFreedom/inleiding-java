package h01;

import java.awt.*;
import java.applet.*;

public class Tekenen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        /* gelijkbenige driehoek */
        g.drawLine(150, 10, 200, 150);
        g.drawLine(150, 10, 100, 150);
        g.drawLine(100, 150, 200, 150);
        

    }

}