// Без исходных файлов этот урок не осилил, и в методичке маловато данных. Поэтому скопировал чужой вариант решения
// и разобрал, как смог. Все таки сроки горят. В последствии, конечно, подробно разберу всю тему. Добавьте, пожалуйста,
// архив с файлами к уроку, мне бы это очень помогло. Спасибо.

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private int x1 = 0, x2 = 500, x3 = 250;
    private int y1 = 0, y2 = 0, y3 = 500;
    private boolean paint = false;

    public Window() {
        setTitle("Окошко");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 200, 60);
        setVisible(true);
        JButton button = new JButton("Нажми меня");
        setLayout(new BorderLayout());
        add(button, BorderLayout.NORTH);
        setResizable(false);
        DrawPanel dPanel = new DrawPanel();
        add(dPanel);

        button.addActionListener(e -> {
            setBounds(300, 300, 600, 600);
            System.out.println("Button pressed...");
            paint = true;
            remove(button);
        });

        for(int i = 0; i<220; i++){
            x1++;
            y1++;
            x2--;
            y2++;
            y3--;
            dPanel.repaint();
            try {
                Thread.sleep(50);
            }catch (Exception ignored){}
        }
    }

    public static void main(String[] args) {
        new Window();
    }

    private class DrawPanel extends JPanel {
        @Override
        public void paintComponent(Graphics g){
            if(paint) {
                g.setColor(Color.WHITE);
                g.fillRect(0,0,this.getWidth(),this.getHeight());

                g.setColor(Color.RED);
                g.fillOval(x1,y1,100,100);
                g.setColor(Color.GREEN);
                g.fillOval(x2,y2,100,100);
                g.setColor(Color.BLUE);
                g.fillOval(x3,y3,100,100);

            }
        }
    }
} 