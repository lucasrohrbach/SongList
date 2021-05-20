import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;

/**
 * @author Lucas Rohrbach
 * @version 1.0
 * @since 1.0
 */

public class SongListGui {
    Song[] songs;

    /**
     * creates the GUI
     * @param args contains arguments
     */
    public static void main(String[] args) {
        new SongListGui();
    }

    public SongListGui(){
        songs = new Song[100];

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
        addSong.addActionListener(new ActionListener() {

            int i = 0;

            /**
             * Adds a song to the array songs when the Button addSong is pressed
             * @param e performs action triggered
             */
            @Override
            public void actionPerformed(ActionEvent e) {

                int trackNum = Integer.parseInt(trackNumField.getText());
                String songTitle = songTitleField.getText();
                String date = relDateField.getText();

                var song = new Song(trackNum, songTitle, date);

                songs[i] = song;
                i ++;

                trackNumField.setText("");
                songTitleField.setText("");
                relDateField.setText("");
            }
        });


        JButton remSong = new JButton("Remove song");
        remSong.addActionListener(new ActionListener() {
            /**
             * removes song
             * @param e performs action triggered
             */
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        JButton console = new JButton("Write to console");
        console.addActionListener(new ActionListener() {
            /**
             * writes every song in songs into the console
             * @param e performs action triggered
             */
            @Override
            public void actionPerformed(ActionEvent e) {

                for (var song:
                     songs) {
                    if(song != null) {
                        System.out.println("==================================");
                        System.out.println("Track: " + song.tracknumber);
                        System.out.println("Name: " + song.name);
                        System.out.println("Release date: " +song.date);
                    }
                }

            }
        });

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
        /*addSong.addActionListener(new );*/

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



}