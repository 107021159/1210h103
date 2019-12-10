import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {
    private Container cp;
    private JButton jb1 = new JButton("ALL");
    private JButton jb2 = new JButton("New");
    private JButton jb3 = new JButton("Edit");
    private JButton jb4 = new JButton("Del");
    private JButton jb5 = new JButton("Inquiry");
    private JButton jb6 = new JButton("Connect");
    private JButton jb7 = new JButton("Exit");
    private ImageIcon icon = new ImageIcon("1.jpg");
    private ImageIcon icon1 = new ImageIcon("2.jpg");
    private JLabel jlb = new JLabel();
    private JLabel jlb1 = new JLabel();
    private JPanel jpn = new JPanel(new GridLayout(1,6,3,3));
    private JPanel jpn1 = new JPanel(new GridLayout(1,2,3,3));
    private JScrollPane jsp = new JScrollPane();
    private JTextArea jta = new JTextArea();

    public MainFrame(){
        init();
    }
    private void init(){
        cp=this.getContentPane();
        cp.setLayout(new BorderLayout());
        this.setBounds(300,150,1000,700);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp.add(jpn,BorderLayout.NORTH);
        cp.add(jpn1,BorderLayout.SOUTH);
        Image img1 = icon.getImage();
        Image img2 = img1.getScaledInstance(35,35,Image.SCALE_SMOOTH);
        icon.setImage(img2);
        jlb.setIcon(icon);

        jpn.add(jb1);
        jpn.add(jb2);
        jpn.add(jb3);
        jpn.add(jb4);
        jpn.add(jb5);
        jpn1.add(jlb);
        jpn1.add(jb6);
        jpn1.add(jlb1);
        jpn1.add(jb7);

        jb7.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }
}
