package h02;
import java.awt.*;
import java.applet.*;


//een klasse met de naam Show van het type Applet
public class Opdracht21 extends Applet {

    //een (lege) methode die de Applet initialiseert
    TextField text1,text2;
    public void init() {
        setBackground(Color.blue);


    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Roy", 50, 60 );
    }

}