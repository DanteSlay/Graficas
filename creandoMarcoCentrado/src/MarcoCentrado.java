import javax.swing.*;
import java.awt.*;

public class MarcoCentrado extends JFrame {
    public MarcoCentrado() {
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamañoPantalla = miPantalla.getScreenSize();
        int alturaPantalla = tamañoPantalla.height;
        int anchoPantalla = tamañoPantalla.width;

        setSize(anchoPantalla/2, alturaPantalla/2);
        setLocation(anchoPantalla / 4, alturaPantalla / 4);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setTitle("Mi marco");

        Image miIcono = miPantalla.getImage("javi.jpeg");
        setIconImage(miIcono);
    }
}
