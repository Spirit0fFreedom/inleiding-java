
import java.awt.*;
import java.applet.*;


//een klasse met de naam Show van het type Applet
public class Opdracht22 extends Applet {

    //een (lege) methode die de Applet initialiseert
    TextField text1,text2;
    public void init() {
        setBackground(Color.white);


    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Roy", 50, 60 );
        g.setColor(Color.red);
        g.drawString("Huizing", 50, 70 );
    }

}