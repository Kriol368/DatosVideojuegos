package videogame.ui;

import org.springframework.beans.factory.annotation.Autowired;
import videogame.entity.Videogame;
import videogame.repository.VideogameRepository;

import javax.swing.*;

public class VideogameUI extends JFrame {
    private JTextField idField;
    private JTextField nameField;
    private JPanel panel1;
    private Videogame videogame;

    @Autowired
    public VideogameUI(VideogameRepository videogameRepository) {
        setTitle("Videogame Maintenance");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        initComponents();

        this.videogame = videogameRepository.findFirstByOrderByIdAsc();
        updateData();
    }

    private void updateData() {
        idField.setText(Long.toString(this.videogame.getId()));
        nameField.setText(this.videogame.getName());

    }

    private void initComponents() {
        panel1 = new JPanel();
        idField = new JTextField(10);
        nameField = new JTextField(10);
        JLabel l;

        this.setLayout(null);
        panel1.setLayout(null);
        panel1.setBounds(0, 0, 500, 650);

        l = new JLabel("ID:");
        l.setBounds(10, 10, 70, 20);
        panel1.add(l);
        idField.setEnabled(false);
        idField.setBounds(10 + 80, 10, 200, 20);
        panel1.add(idField);

        l = new JLabel("Name:");
        l.setBounds(10, 40, 70, 20);
        panel1.add(l);
        nameField.setBounds(10 + 80, 40, 200, 20);
        panel1.add(nameField);
        this.add(panel1);
    }
}
