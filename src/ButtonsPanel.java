import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ButtonsPanel extends JPanel {
    JButton rock = new JButton();
    JButton paper = new JButton();
    JButton scissors = new JButton();
    ImagePanel imagePanel;

    public ButtonsPanel(ImagePanel imagePanel) {
        this.imagePanel = imagePanel;
        this.setLayout(null);
        this.setLocation(0,200);
        this.setSize(500,300);
        this.setBackground(Color.DARK_GRAY);

        //камень кнопка
        rock.setLocation(0,20);
        rock.setText("Камень");
        rock.setSize(100,50);

        rock.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagePanel.paintSomething("images/rock.jpg", getRandomImagePass());
            }
        });
        this.add(rock);

        //ножницы кнопка
        scissors.setLocation(0,80);
        scissors.setText("Ножницы");
        scissors.setSize(100,50);
        scissors.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagePanel.paintSomething("images/scissors.jpg", getRandomImagePass());
            }
        });
        this.add(scissors);

        //бумага кнопка
        paper.setLocation(0,140);
        paper.setText("Бумага");
        paper.setSize(100,50);
        paper.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagePanel.paintSomething("images/paper.jpg", getRandomImagePass());
            }
        });
        this.add(paper);
    }

    //генерирует случайное число и возвращает случайную картинку
    public String getRandomImagePass() {
        Random r = new Random();
        int number = r.nextInt(3);
        switch (number) {
            case 0:
                return "images/paper.jpg";
            case 1:
                return "images/rock.jpg";
            case 2:
                return "images/scissors.jpg";
        }

        return "";
    }
}
