package h03;

import java.awt.*;
import java.applet.*;


//een klasse met de naam Show van het type Applet.
public class Vragen extends Applet {

    //een (lege) methode die de Applet initialiseert
    TextField text1,text2;
    public void init() {
        setBackground(Color.darkGray);


    }
    //een methode die de inhoud van het scherm tekent
    //Ik heb hier ook de vragen beantwoord van h02. Leuk om in een applet uitvoeren !
    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.drawString("Vragen", 50, 60 );
        g.setColor(Color.white);
        g.drawString("Wat is een platform?", 50, 100 );

        g.setColor(Color.white);
        g.drawString("Een platform is eigenlijk een combinatie van een processor en een besturingssysteem" , 55, 120 );

        g.setColor(Color.white);
        g.drawString("Waarom hoeft een programmeur in Java maar één keer een programma te schrijven voor verschillende platforms?", 50, 155 );
        g.setColor(Color.white);
        g.drawString("In JAVA wordt de broncode vertaald naar een tussentaal, dit zorgt er voor, als je een JVM hebt, dat je broncode uiteindelijk in machinetaal wordt vertaald voor het betreffende platform", 55, 175 );

        g.setColor(Color.white);
        g.drawString("Wat is bytecode?", 50, 210 );
        g.setColor(Color.white);
        g.drawString("Bytecode of p-code, is een vorm van instructieset die is ontworpen voor efficiente uitvoering door een software-interpreter. Bytecodes zijn compacte numerieke codes, constanten en verwijzingen.", 55, 227 );

        g.setColor(Color.white);
        g.drawString("Wat doet JVM?';'", 50, 245 );
        g.setColor(Color.white);
        g.drawString("Die vertaald de bytecode in machinetaal voor het betreffende platform.", 55, 262 );

        g.setColor(Color.white);
        g.drawString("Met welke methode kun je een vierkant tekenen?", 50, 285 );
        g.setColor(Color.white);
        g.drawString("Door gebruik te maken van g.drawRect(). Als de breedte ne de hoogte gelijk zijn, wordt het een vierkant.( x , y , b , h)", 55, 303 );

        g.setColor(Color.white);
        g.drawString("Noem drie methodes waarmee je een cirkel kunt tekenen", 50, 329 );
        g.setColor(Color.white);
        g.drawString("g.drawArc(), g.drawOval() en g.fillOval", 55, 345 );

        g.setColor(Color.white);
        g.drawString("Waarom worden opdrachten voor het scherm in paint() gezet en niet in een andere methode?", 50, 365 );
        g.setColor(Color.white);
        g.drawString("??", 55, 380  );
    }


}