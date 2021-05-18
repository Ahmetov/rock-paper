import javax.swing.*;

public class AppMain {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        ImagePanel imagePanel = new ImagePanel();
        frame.add(imagePanel);
        frame.add(new ButtonsPanel(imagePanel));

//        JButton rock = new JButton();
//        rock.setText("Камень");
//        rock.setSize(400,50);
//        frame.add(rock);

        frame.setVisible(true);
    }
}
