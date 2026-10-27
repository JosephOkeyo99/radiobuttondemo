import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class RadioButtonDemo extends JFrame {
    private static final long serialVersionUID = 1L;

    private JRadioButton birdButton, catButton, dogButton, rabbitButton, pigButton;
    private ButtonGroup petGroup;

    @SuppressWarnings("this-escape")
    public RadioButtonDemo() {
        setTitle("RadioButtonDemo");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));

        // Initialize Radio Buttons
        birdButton = new JRadioButton("Bird");
        catButton = new JRadioButton("Cat");
        dogButton = new JRadioButton("Dog");
        rabbitButton = new JRadioButton("Rabbit");
        pigButton = new JRadioButton("Pig");

        // Group the radio buttons so only one can be selected at a time
        petGroup = new ButtonGroup();
        petGroup.add(birdButton);
        petGroup.add(catButton);
        petGroup.add(dogButton);
        petGroup.add(rabbitButton);
        petGroup.add(pigButton);

        // Add ActionListener to each radio button to show a message box on selection
        ActionListener listener = e -> {
            JRadioButton source = (JRadioButton) e.getSource();
            if (source.isSelected()) {
                JOptionPane.showMessageDialog(RadioButtonDemo.this,
                        "You selected: " + source.getText(),
                        "Pet Selection",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        };

        birdButton.addActionListener(listener);
        catButton.addActionListener(listener);
        dogButton.addActionListener(listener);
        rabbitButton.addActionListener(listener);
        pigButton.addActionListener(listener);

        // Add components to the frame
        add(birdButton);
        add(catButton);
        add(dogButton);
        add(rabbitButton);
        add(pigButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new RadioButtonDemo().setVisible(true);
        });
    }
}
