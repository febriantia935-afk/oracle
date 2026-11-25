import java.awt.Component;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// Pembungkus agar applet DrawShapes bisa dijalankan di VS Code (browser modern tidak mendukung applet)
public class ShowApplet {
    public static void main(String[] args) {
        try {
            Frame frame = new Frame("DrawShapes");
            Object appletObject = Class.forName("DrawShapes")
                    .getDeclaredConstructor()
                    .newInstance();

            if (!(appletObject instanceof Component)) {
                throw new IllegalStateException("DrawShapes harus merupakan turunan dari java.awt.Component");
            }

            Component applet = (Component) appletObject;
            frame.add(applet);

            appletObject.getClass().getMethod("init").invoke(appletObject);
            appletObject.getClass().getMethod("start").invoke(appletObject);

            frame.setSize(300, 300);
            frame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}