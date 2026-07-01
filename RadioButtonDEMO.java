import java.awt.*;
import javax.swing.*;

public class RadioButtonDEMO extends JFrame {

    private final JLabel imageLabel;

    public RadioButtonDEMO(){

        setTitle("Radio Button Demo");
        setSize(550,350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Left Panel
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(5,1));

        JRadioButton bird = new JRadioButton("Bird");
        JRadioButton cat = new JRadioButton("Cat");
        JRadioButton dog = new JRadioButton("Dog");
        JRadioButton rabbit = new JRadioButton("Rabbit");
        JRadioButton pig = new JRadioButton("Pig");

        ButtonGroup group = new ButtonGroup();
        group.add(bird);
        group.add(cat);
        group.add(dog);
        group.add(rabbit);
        group.add(pig);

        leftPanel.add(bird);
        leftPanel.add(cat);
        leftPanel.add(dog);
        leftPanel.add(rabbit);
        leftPanel.add(pig);

        // Image Panel
        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);

        add(leftPanel, BorderLayout.WEST);
        add(imageLabel, BorderLayout.CENTER);

        bird.addActionListener(e -> showPet("Bird","bird.jfif"));
        cat.addActionListener(e -> showPet("Cat","cat.jfif"));
        dog.addActionListener(e -> showPet("Dog","dog.jfif"));
        rabbit.addActionListener(e -> showPet("Rabbit","rabbit.jfif"));
        pig.addActionListener(e -> showPet("Pig","pig.jfif"));

        pig.setSelected(true);
        showPet("Pig","pig.jfif");

        setVisible(true);
    }

    private void showPet(String pet, String imagePath){

        ImageIcon icon = new ImageIcon(imagePath);

        Image img = icon.getImage().getScaledInstance(
                220,
                220,
                Image.SCALE_SMOOTH);

        imageLabel.setIcon(new ImageIcon(img));

        JOptionPane.showMessageDialog(
                this,
                "You selected " + pet + "!",
                "Selection",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> new RadioButtonDEMO());

    }
}

