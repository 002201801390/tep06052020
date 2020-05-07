package br.edu.usf;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.net.MalformedURLException;
import java.net.URL;

public class Janela extends JFrame {

    private static ImageIcon imageIcon;
    static {
        try {
            URL gifLocation = new URL("https://media.tenor.com/images/6326dfe238979d31e0f90b7faafa5281/tenor.gif");
            imageIcon = new ImageIcon(gifLocation);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public Janela() {
        super("Título da janela");

        final Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(3, 1));

        final JLabel lblPresentation = new JLabel("<html><FONT COLOR=RED>Texto</FONT> chique com <FONT COLOR=BLUE>HTML</FONT></html>");
        lblPresentation.setToolTipText("Com uma excelênte cor de fundo diga-se de passagem");

        lblPresentation.setFont(lblPresentation.getFont().deriveFont(20f));
        lblPresentation.setHorizontalAlignment(JLabel.CENTER);

        lblPresentation.setOpaque(true);
        lblPresentation.setBackground(Color.CYAN);

        contentPane.add(lblPresentation);

        final JPanel pnlInput = new JPanel();
        pnlInput.setLayout(new BorderLayout());

        pnlInput.add(new JLabel("Descrição do campo: "), BorderLayout.WEST);
        pnlInput.add(new JTextField(), BorderLayout.CENTER);

        contentPane.add(pnlInput);

        final JPanel pnlBtnPosition = new JPanel(new FlowLayout());

        final JButton btnQueFaz = new JButton("Um botão que faz...");
        btnQueFaz.addActionListener(this::HUE);
        btnQueFaz.setMaximumSize(new Dimension(100, 20));

        pnlBtnPosition.add(btnQueFaz);

        contentPane.add(pnlBtnPosition);

        setMinimumSize(new Dimension(1280, 720));
        setPreferredSize(new Dimension(1280, 720));
        setMaximumSize(new Dimension(1820, 1080));

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void HUE(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(this, "Nada...");
        JOptionPane.showMessageDialog(this, "Absolutamente...");
        JOptionPane.showMessageDialog(this, "N");
        JOptionPane.showMessageDialog(this, "A");
        JOptionPane.showMessageDialog(this, "D");
        JOptionPane.showMessageDialog(this, "A");
        JOptionPane.showMessageDialog(this, "Nadinha msm");
        JOptionPane.showMessageDialog(this, imageIcon);
    }
}
