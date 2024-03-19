package kuispbo;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lomba extends JFrame{
    
    private JButton ButtonA, ButtonB, save, finish;
    private JTextField nama, sekolah ;
    private double nilaiA,nilaiB,nilaiC,nilaiD;
    private JPanel panel1, panel2, panel3, panel4,panel5;
    private double totalnilai = 0.0;

    public lomba() {
        setTitle("Perlombaan Antar SMA");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(5, 1));
        JLabel header = new JLabel("Selamat Datang!");
        JLabel label1 = new JLabel("Silakan pilih kategori Lomba:");
        ButtonA = new JButton("Animasi");
        ButtonB = new JButton("Menulis Surat");
        panel1.add(label1);
        panel1.add(ButtonA);
        panel1.add(ButtonB);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(10, 2));
        JLabel label2 = new JLabel("Masukkan data:");
        JLabel nameLabel = new JLabel("Nama Peserta:");
        nama = new JTextField(10);
        JLabel asalLabel = new JLabel("Asal Sekolah:");
        sekolah = new JTextField(10);
        //nilai = new JTextField(10);
        panel2.add(label2);
        panel2.add(new JLabel(""));
        panel2.add(nameLabel);
        panel2.add(nama);
        panel2.add(asalLabel);
        panel2.add(sekolah);
        
        
        panel3 = new JPanel();
        panel3.setLayout(new GridLayout(10, 2));
        JLabel label3 = new JLabel("Masukkan data:");
        JLabel timLabel = new JLabel("Nama Tim:");
        nama = new JTextField(10);
        panel3.add(label3);
        panel3.add(new JLabel(""));
        panel3.add(timLabel);
        panel3.add(nama);

        panel4 = new JPanel();
        finish = new JButton("Selesai");
        panel4.add(finish);
        
        ButtonA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                remove(panel1);
                add(panel2);
                revalidate();
                repaint();
            }
        });

        ButtonB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                remove(panel1);
                add(panel3);
                revalidate();
                repaint();
            }
        });
        save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String name = nama.getText();
                    String asal = sekolah.getText();
                    totalnilai = nilaiA+nilaiB+nilaiC+nilaiD ;
                  if (totalnilai >= 85){
                    panel5 = new JPanel();
                    panel5.setLayout(new GridLayout(5, 1));
                    JLabel header = new JLabel("Selamat Anda Lolos!");
                } else if (totalnilai<85){
                    panel5 = new JPanel();
                    panel5.setLayout(new GridLayout(5, 1));
                    JLabel header = new JLabel("Maaf Anda Tidak Lolos!");
                }
                    remove(panel2);
                    add(panel4);
                    revalidate();
                    repaint();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(lomba.this, "Masukkan data!!");
                }
            }
        });
        
        finish.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); 
            }
        });

        add(panel1);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new lomba();
            }
        });
    }
}
