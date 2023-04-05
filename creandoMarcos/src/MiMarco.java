import javax.swing.*;
import java.awt.*;

public class MiMarco extends JFrame {
    public MiMarco() {
        //setSize(500, 300);
        setBounds(500,300,250,250);
        setVisible(true);
        //setResizable(false);
        setExtendedState(Frame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Mi ventana");

    }


}
