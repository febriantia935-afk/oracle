import java.awt.*;
import javax.swing.JPanel;

public class DrawShapes extends JPanel {
    Font font;
    Color blackColor;
    Color grayColor;
    Color backgroundColor;

    public DrawShapes() {
        font = new Font("Arial", Font.ITALIC, 18);
        blackColor = Color.black;           // sebelumnya merah
        backgroundColor = Color.lightGray;  // sebelumnya oranye
        grayColor = Color.darkGray;         // sebelumnya biru (0,0,122)
        setBackground(backgroundColor);
        setPreferredSize(new Dimension(300, 300));
    }

    @Override
    protected void paintComponent(Graphics graph) {
        super.paintComponent(graph);
        graph.setFont(font);
        graph.setColor(blackColor);          // teks judul dibuat hitam
        graph.drawString("Draw Shapes", 90, 20);
        graph.setColor(grayColor);
        graph.drawRect(120, 120, 120, 120);
        graph.fillRect(115, 115, 90, 90);
        graph.setColor(blackColor);
        graph.fillArc(110, 110, 50, 50, 0, 360);
        graph.setColor(Color.white);         // sebelumnya cyan
        graph.drawRect(50, 50, 50, 50);
        graph.fillRect(50, 50, 60, 60);
    }
}