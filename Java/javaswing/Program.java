import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class Program
{
    public static void Swing()
    {
        // instance / alias
        JFrame layar = new JFrame();

        // input to label
        String nama = macam.inputString("Nama lengkap : ");
        String umur = macam.inputString("Umur : ");
        String sekolah = macam.inputString("Sekolah : ");
        String hobi = macam.inputString("Hobby : ");

        // button
        JButton button = new JButton("Submit");
        JLabel judul = new JLabel("Line1\nLine2");
        JLabel name = new JLabel(nama);
        JLabel age = new JLabel(umur);
        JLabel school = new JLabel(sekolah);
        JLabel hobby = new JLabel(hobi);
        

        button.setBounds(100,200,180,70);
        judul.setBounds(100, 80, 180, 70);
        name.setForeground(Color.BLUE);
        name.setBounds(100, 0, 180, 70);
        name.setFont(new Font("Arial", Font.BOLD, 15));
        age.setForeground(Color.RED);
        age.setBounds(100, 20, 180, 70);
        school.setForeground(Color.GREEN);
        school.setBounds(100, 40, 180, 70);
        hobby.setForeground(Color.GRAY);
        hobby.setBounds(100, 60, 180, 70);


        // tambah item
        layar.add(judul);
        layar.add(button);
        layar.add(name);
        layar.add(age);
        layar.add(school);
        layar.add(hobby);

        // frame main
        layar.setSize(500,500); // size
        layar.setLayout(null);  // membuat layout isi
        layar.setVisible(true); // tampilan

        // TEST
    //     int act = macam.inputInt("Test");
    //     if (act == 1)
    //     {
    //         layar.add(judul);

    //         layar.setSize(500,500); // size
    //         layar.setLayout(null);  // membuat layout isi
    //         layar.setVisible(true); // tampilan
            
    //     }

    //     else if (act == 2)
    //     {
    //         layar.add(name);

    //         layar.setSize(500,500); // size
    //         layar.setLayout(null);  // membuat layout isi
    //         layar.setVisible(true); // tampilan
    //     }
    }

    public static void main(String[] args) 
    {
        Swing();
    }
}