import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SongListGui {

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JPanel panelA = new JPanel();
        JPanel panelB = new JPanel();
        JPanel panelC = new JPanel();

        JLabel trackNum = new JLabel("Track Number");
        JLabel songTitle = new JLabel("Song Title");
        JLabel relDate = new JLabel("Release Date");

        JTextField trackNumField = new JTextField();
        JTextField songTitleField = new JTextField();
        JTextField relDateField = new JTextField();

        JButton addSong = new JButton("Add song");
        JButton remSong = new JButton("Remove song");
        JButton console = new JButton("Write to console");

        /*panel A*/
        panelA.add(panelB);
        panelA.add(panelC);

        /*panel B*/
        panelB.setLayout(new BoxLayout(panelB, BoxLayout.Y_AXIS));

        panelB.add(trackNum);
        panelB.add(trackNumField);
        panelB.add(songTitle);
        panelB.add(songTitleField);
        panelB.add(relDate);
        panelB.add(relDateField);

        panelB.add(addSong);
        addSong.addActionListener(new );

        panelB.add(remSong);
        panelB.add(console);

        panelB.setSize(200, 300);

        /*frame*/
        frame.getContentPane().add(BorderLayout.CENTER, panelA);
        frame.getContentPane().add(BorderLayout.CENTER, panelB);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 250);
        frame.setVisible(true);

    }

    public void
}