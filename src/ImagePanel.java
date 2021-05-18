import javax.swing.*;
import java.awt.*;

public class ImagePanel extends JPanel {
    Image first;
    Image second;

    public ImagePanel() {
        this.setLocation(0, 0);
        this.setSize(500, 200);
        this.setBackground(Color.BLACK);
    }

    public void paintSomething(String path1, String path2) {
        first = new ImageIcon(path1).getImage();
        second = new ImageIcon(path2).getImage();
        //изменение размера картинки
        first = first.getScaledInstance(80, 80, Image.SCALE_DEFAULT);
        second = second.getScaledInstance(80, 80, Image.SCALE_DEFAULT);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(first, 0, 0, this);
        g.drawImage(second, 250, 0, this);
    }
}
