/*

@(#)Show.java 1.0 03/02/26

*

Voorbeeld 2.1

*

*/

//importeer de benodigde klassen uit de Java bibliotheek
import javax.xml.soap.Text;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.Label;


//een klasse met de naam Show van het type Applet
public class Show extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(Color.white);
    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Roy", 50, 60 );
        g.setColor(Color.red);
        g.drawString("Huizing", 50, 75 );
    }

}