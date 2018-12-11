import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;
// Importing all libraries we need...

public class NewApplet extends Applet implements ActionListener
{
    TextField alan = new TextField();
    Button Bir = new Button("1");
    Button İki = new Button("2");
    Button Uc = new Button("3");
    // Defining our buttons... 
    
    public void init() {
      
        setLayout(null); // This is not very necessery
        alan.setLocation(10,10);
        alan.setSize(150,30);
        add(alan);
        
        Bir.setLocation(10,40);
        Bir.setSize(45, 45);
        add(Bir);
        
        İki.setLocation(55,40);
        İki.setSize(45, 45);
        add(İki);
        
        Uc.setLocation(100,40);
        Uc.setSize(45, 45);
        add(Uc);
        
        Bir.addActionListener(this);
        İki.addActionListener(this);
        Uc.addActionListener(this);
    }

    public void actionPerformed(ActionEvent Nesne){
    
        String Eklenecek ="";
        if (Nesne.getSource()==Bir) {
            Eklenecek="1";
        }
        if (Nesne.getSource()==İki) {
            Eklenecek="2";
        }
        if (Nesne.getSource()==Uc) {
            Eklenecek="3";
        }
        alan.setText(alan.getText()+Eklenecek);
    
    }
}
