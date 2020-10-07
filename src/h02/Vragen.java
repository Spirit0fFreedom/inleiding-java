package h02;
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

        g.drawString("Wat is machinetaal?", 50, 100 );

        g.drawString("Machinetaal is een taal die direct kan worden uitgevoerd door de processor." , 55, 120 );
        g.drawString("Als het goed is wordt in dit geval, JAVA omgezet in machinetaal door een compiler." , 55, 135 );


        g.drawString("Welke drie hulpmiddelen heb je nodig om te programmeren?", 50, 155 );


        g.drawString("Integrated Development Enviroment (IDE) programma,", 55, 175 );
        g.drawString("daar zitten meerdere functies bij inbegrepen, zoals een compiler, debugger en een editor.  En natuurlijk een toetsenboord haha!", 55, 190 );

        g.drawString("Hoe herken je opdrachten in de broncode?", 50, 210 );

        g.drawString("Die kun je herkennen omdat ze altijd moeten eindigen met een puntkomma ';'", 55, 227 );

        g.drawString("Waartoe dienen de import-opdrachten?';'", 50, 245 );


        g.drawString("Die opdrachten importeren een klassenbibliotheek waarin voorgedefinieerde codes te halen zijn waardoor je dus meer klassen kunt gebruik in je code';'", 55, 262 );

        g.drawString("Wat is een methode?", 50, 285 );
        g.drawString("Een methode is een stuk code die alleen werkt ls hij wordt opgeroepen.", 55, 303 );
        g.drawString("In een methode kun je ook data doorgeven, ook wel bekend als 'Parameters' ", 55, 316 );
        g.drawString("Methodes worden gebruikt om bepaalde acties uit te voeren, ze zijn ook bekend als functies.", 55, 329 );
    }

}
