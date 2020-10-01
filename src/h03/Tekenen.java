package h03;

import java.awt.*;
import java.applet.*;
import java.awt.Graphics;

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

        g.setColor(Color.black);
        g.drawLine(800,400,800,50);
        g.drawLine(800,400,1200,400);

        // Aantal Kg

        g.drawString("150",765,95);
        g.drawString("140",765,115);
        g.drawString("130",765,135);
        g.drawString("120",765,155);
        g.drawString("110",765,175);
        g.drawString("100",765,195);
        g.drawString("90",765,215);
        g.drawString("80",765,235);
        g.drawString("70",765,255);
        g.drawString("60",765,275);
        g.drawString("50",765,295);
        g.drawString("40",765,315);
        g.drawString("30",765,335);
        g.drawString("20",765,355);
        g.drawString("10",765,375);
        g.drawString("0",765,395);
        g.drawString("Aantal KG",700,395);
        g.drawString("Personen",800,435);

        // Personen

        g.drawString("Valerie",850,420);
        g.drawString("Jeroen",950,420);
        g.drawString("Hans",1050,420);

        // De staven + kleur

        g.setColor(Color.magenta);
        g.fillRect(845,310,50,90);
        g.drawRect(845, 310, 50,90); // Valerie
        g.setColor(Color.BLUE);
        g.fillRect(945,195,50,205);
        g.drawRect(945, 195, 50,205); // Jeroen
        g.setColor(Color.red);
        g.fillRect(1045,230,50,170);
        g.drawRect(1045, 230, 50,170); // HANS HOL DEN FLAMMENWERFER, WO IST MEIN FLAMMENWERFER HANS? ICH BRAUCHE ES JETZT!














    }

}