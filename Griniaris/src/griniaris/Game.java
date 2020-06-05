package griniaris;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.EventListenerList;


public class Game extends javax.swing.JFrame {

    Color buffer,b;
    Dice d = new Dice();
    boolean rolledDice=false;
    Board b1 = new Board();
    int nextplayer = 0;
    ArrayList<JButton> buttons = new ArrayList<>();
    ArrayList<Pawn> pawns = new ArrayList<>();
    JButton previous;
    Color arxiko, defaultcolor;
    ArrayList<JLabel> playersLabels = new ArrayList<>();
    String defaultrgb;
    int cnt=1;
    Colors a = Colors.blue;
    String str;

    private int caught=1;
    Map<JButton,Color > tesi = new LinkedHashMap<>();
    ArrayList <Player> players = new ArrayList<>();


    public Game() {
        initComponents();
        
        //αρχικοποιούμε το πίνακα με τα πιόνια των παικτών και τα χρώματα τους
        pawns.add(new Pawn(jButton55.getBackground(), jButton55, 1));
        pawns.add(new Pawn(jButton57.getBackground(), jButton57, 2));
        pawns.add(new Pawn(jButton58.getBackground(), jButton58, 3));
        pawns.add(new Pawn(jButton59.getBackground(), jButton59, 4));
        pawns.add(new Pawn(jButton60.getBackground(), jButton60, 1));
        pawns.add(new Pawn(jButton61.getBackground(), jButton61, 2));
        pawns.add(new Pawn(jButton62.getBackground(), jButton62, 3));
        pawns.add(new Pawn(jButton63.getBackground(), jButton63, 4));
        pawns.add(new Pawn(jButton64.getBackground(), jButton64, 1));
        pawns.add(new Pawn(jButton65.getBackground(), jButton65, 2));
        pawns.add(new Pawn(jButton66.getBackground(), jButton66, 3));
        pawns.add(new Pawn(jButton67.getBackground(), jButton67, 4));
        pawns.add(new Pawn(jButton68.getBackground(), jButton68, 1));
        pawns.add(new Pawn(jButton69.getBackground(), jButton69, 2));
        pawns.add(new Pawn(jButton70.getBackground(), jButton70, 3));
        pawns.add(new Pawn(jButton71.getBackground(), jButton71, 4));
        
        //Κρύβουμε το παιχνίδι μέχρι ο χρήστης να πατήσει είσοδος στο παιχνίδι
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);

        a = a.Colors(a);
        Color o;
        for(int i=0;i<4;i++){
            o = a.nextColor();
            players.add(new Player("Player"+(1+i), o));
            for(Pawn p : pawns)
                if(o == p.getpawnColor())
                    players.get(i).setPawn(p);
        }

        arxiko = button1.getBackground();
        defaultcolor = button1.getBackground();
        defaultrgb =  defaultcolor.getRed()+","+defaultcolor.getGreen()+","+defaultcolor.getBlue();
        
        //προσθέτουμε τα στοιχεία στον πίνακα όπου αναγράφονται τα labels των παικτών
        playersLabels.add(jLabel6);
        playersLabels.add(jLabel8);
        playersLabels.add(jLabel10);
        playersLabels.add(jLabel12);

        int thePlayer=0;
        for(JLabel jl: playersLabels) {
            jl.setText(players.get(thePlayer).getname());
            thePlayer++;
        }

        //prosthetoume tous listeners sta koumpia
        button1.addActionListener(listener);
        button2.addActionListener(listener);
        button3.addActionListener(listener);
        button4.addActionListener(listener);
        button5.addActionListener(listener);
        button6.addActionListener(listener);
        button7.addActionListener(listener);
        button8.addActionListener(listener);
        button9.addActionListener(listener);
        button10.addActionListener(listener);
        button11.addActionListener(listener);
        button12.addActionListener(listener);
        button13.addActionListener(listener);
        button14.addActionListener(listener);
        button15.addActionListener(listener);
        button16.addActionListener(listener);
        button17.addActionListener(listener);
        button18.addActionListener(listener);
        button19.addActionListener(listener);
        button20.addActionListener(listener);
        button21.addActionListener(listener);
        button22.addActionListener(listener);
        button23.addActionListener(listener);
        button24.addActionListener(listener);
        button25.addActionListener(listener);
        button26.addActionListener(listener);
        button27.addActionListener(listener);
        button28.addActionListener(listener);
        button29.addActionListener(listener);
        button30.addActionListener(listener);
        button31.addActionListener(listener);
        button32.addActionListener(listener);
        button33.addActionListener(listener);
        button34.addActionListener(listener);
        button34.addActionListener(listener);
        button35.addActionListener(listener);
        button36.addActionListener(listener);
        button37.addActionListener(listener);
        button38.addActionListener(listener);
        button39.addActionListener(listener);
        button40.addActionListener(listener);
        button41.addActionListener(listener);
        button42.addActionListener(listener);
        button43.addActionListener(listener);
        button44.addActionListener(listener);
        button45.addActionListener(listener);
        button46.addActionListener(listener);
        button47.addActionListener(listener);
        button48.addActionListener(listener);
        button49.addActionListener(listener);
        button50.addActionListener(listener);
        button51.addActionListener(listener);
        button52.addActionListener(listener);
        button53.addActionListener(listener);
        button54.addActionListener(listener);
        button55.addActionListener(listener);
        button56.addActionListener(listener);
        button57.addActionListener(listener);
        button58.addActionListener(listener);
        button59.addActionListener(listener);
        button60.addActionListener(listener);
        button61.addActionListener(listener);
        button62.addActionListener(listener);
        button63.addActionListener(listener);
        button64.addActionListener(listener);
        button65.addActionListener(listener);
        button66.addActionListener(listener);
        button67.addActionListener(listener);
        button68.addActionListener(listener);
        button69.addActionListener(listener);
        button70.addActionListener(listener);
        button71.addActionListener(listener);
        button72.addActionListener(listener);
        
        //προσθέτουμε ειδικούς listeners στα κουμπιά που συμβολίζουν τα πιόνια του παίκτη
        jButton55.addActionListener(startpos);
        jButton57.addActionListener(startpos);
        jButton58.addActionListener(startpos);
        jButton59.addActionListener(startpos);
        jButton60.addActionListener(startpos);
        jButton61.addActionListener(startpos);
        jButton62.addActionListener(startpos);
        jButton63.addActionListener(startpos);
        jButton64.addActionListener(startpos);
        jButton65.addActionListener(startpos);
        jButton66.addActionListener(startpos);
        jButton67.addActionListener(startpos);
        jButton68.addActionListener(startpos);
        jButton69.addActionListener(startpos);
        jButton70.addActionListener(startpos);
        jButton71.addActionListener(startpos);

        //εισαγωγή των κουμπιών και του αρχικού τους χρώματος στο map
        tesi.put(button1,button1.getBackground());
        tesi.put(button2,button2.getBackground());
        tesi.put(button3,button3.getBackground());
        tesi.put(button4,button4.getBackground());
        tesi.put(button5,button5.getBackground());
        tesi.put(button6,button6.getBackground());
        tesi.put(button7,button7.getBackground());
        tesi.put(button8,button8.getBackground());
        tesi.put(button9,button9.getBackground());
        tesi.put(button10,button10.getBackground());
        tesi.put(button11,button11.getBackground());
        tesi.put(button12,button12.getBackground());
        tesi.put(button13,button13.getBackground());
        tesi.put(button14,button14.getBackground());
        tesi.put(button15,button15.getBackground());
        tesi.put(button16,button16.getBackground());
        tesi.put(button17,button17.getBackground());
        tesi.put(button18,button18.getBackground());
        tesi.put(button19,button19.getBackground());
        tesi.put(button20,button20.getBackground());
        tesi.put(button21,button21.getBackground());
        tesi.put(button22,button22.getBackground());
        tesi.put(button23,button23.getBackground());
        tesi.put(button24,button24.getBackground());
        tesi.put(button25,button25.getBackground());
        tesi.put(button26,button26.getBackground());
        tesi.put(button27,button27.getBackground());
        tesi.put(button28,button28.getBackground());
        tesi.put(button29,button29.getBackground());
        tesi.put(button30,button30.getBackground());
        tesi.put(button31,button31.getBackground());
        tesi.put(button32,button32.getBackground());
        tesi.put(button33,button33.getBackground());
        tesi.put(button34,button34.getBackground());
        tesi.put(button35,button35.getBackground());
        tesi.put(button36,button36.getBackground());
        tesi.put(button37,button37.getBackground());
        tesi.put(button38,button38.getBackground());
        tesi.put(button39,button39.getBackground());
        tesi.put(button40,button40.getBackground());
        tesi.put(button41,button41.getBackground());
        tesi.put(button42,button42.getBackground());
        tesi.put(button43,button43.getBackground());
        tesi.put(button44,button44.getBackground());
        tesi.put(button45,button45.getBackground());
        tesi.put(button46,button46.getBackground());
        tesi.put(button47,button47.getBackground());
        tesi.put(button48,button48.getBackground());
        tesi.put(button49,button49.getBackground());
        tesi.put(button50,button50.getBackground());
        tesi.put(button51,button51.getBackground());
        tesi.put(button52,button52.getBackground());
        tesi.put(button53,button53.getBackground());
        tesi.put(button54,button54.getBackground());
        tesi.put(button55,button55.getBackground());
        tesi.put(button56,button56.getBackground());
        tesi.put(button57,button57.getBackground());
        tesi.put(button58,button58.getBackground());
        tesi.put(button59,button59.getBackground());
        tesi.put(button60,button60.getBackground());
        tesi.put(button61,button61.getBackground());
        tesi.put(button62,button62.getBackground());
        tesi.put(button63,button63.getBackground());
        tesi.put(button64,button64.getBackground());
        tesi.put(button65,button65.getBackground());
        tesi.put(button66,button66.getBackground());
        tesi.put(button67,button67.getBackground());
        tesi.put(button68,button68.getBackground());
        tesi.put(button69,button69.getBackground());
        tesi.put(button70,button70.getBackground());
        tesi.put(button71,button71.getBackground());
        tesi.put(button72,button72.getBackground());

        //εισαγωγή των κουμπιών της διαδρομής στο arraylist buttons 
        //στα οποία έχει γίνει ειδική αρίθμηση για να χρησιμοποιηθούν 
        //αργότερα από την κλάση board (η οποία συμβολίζει το ταμπλό)
        buttons.add(button1);
        buttons.add(button2);
        buttons.add(button3);
        buttons.add(button6);
        buttons.add(button9);
        buttons.add(button12);
        buttons.add(button15);
        buttons.add(button18);
        buttons.add(button37);
        buttons.add(button38);
        buttons.add(button39);
        buttons.add(button40);
        buttons.add(button41);
        buttons.add(button42);
        buttons.add(button48);
        buttons.add(button54);
        buttons.add(button53);
        buttons.add(button52);
        buttons.add(button51);
        buttons.add(button50);
        buttons.add(button49);
        buttons.add(button57);
        buttons.add(button60);
        buttons.add(button63);
        buttons.add(button66);
        buttons.add(button69);
        buttons.add(button72);
        buttons.add(button71);
        buttons.add(button70);
        buttons.add(button67);
        buttons.add(button64);
        buttons.add(button61);
        buttons.add(button58);
        buttons.add(button55);
        buttons.add(button36);
        buttons.add(button35);
        buttons.add(button34);
        buttons.add(button33);
        buttons.add(button32);
        buttons.add(button31);
        buttons.add(button25);
        buttons.add(button19);
        buttons.add(button20);
        buttons.add(button21);
        buttons.add(button22);
        buttons.add(button23);
        buttons.add(button24);
        buttons.add(button16);
        buttons.add(button13);
        buttons.add(button10);
        buttons.add(button7);
        buttons.add(button4);







        this.setDefaultCloseOperation(Game.DO_NOTHING_ON_CLOSE);


            this.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    int choice = JOptionPane.showConfirmDialog(null, "Do you really want to close the application ?",
                            "Confirm Exit", JOptionPane.YES_NO_OPTION,
                            JOptionPane.INFORMATION_MESSAGE);
                    if (choice == JOptionPane.YES_OPTION) {
                        //if(jMenuItem3.isEnabled() == true)
                        //{
                            e.getWindow().dispose();
                            System.out.println("Chose to exit");
                        //}
                        //else{
                            //JOptionPane.showMessageDialog(null, "Δεν μπορείς να βγεις ενώ είσαι σε παιχνίδι!", " Προειδοποίηση", JOptionPane.WARNING_MESSAGE);
                        //}
                    }
                    else
                        System.out.println("Chose to stay");
                    }
            });


    }

    public void setjLabel6(String s) {
        System.out.println(s + " -> jlabel6 string");
        jLabel6.setText(s);
    }


    public void setjLabel8(String s) {
        jLabel8.setText(s);
    }

    public void setjLabel10(String s) {
        jLabel10.setText(s);
    }

    public void setjLabel12(String s) {
        jLabel12.setText(s);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jButton55 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        button10 = new javax.swing.JButton();
        button11 = new javax.swing.JButton();
        button12 = new javax.swing.JButton();
        button13 = new javax.swing.JButton();
        button14 = new javax.swing.JButton();
        button15 = new javax.swing.JButton();
        button16 = new javax.swing.JButton();
        button17 = new javax.swing.JButton();
        button18 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(15, 15), new java.awt.Dimension(32767, 0));
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        button19 = new javax.swing.JButton();
        button20 = new javax.swing.JButton();
        button21 = new javax.swing.JButton();
        button22 = new javax.swing.JButton();
        button23 = new javax.swing.JButton();
        button24 = new javax.swing.JButton();
        button25 = new javax.swing.JButton();
        button26 = new javax.swing.JButton();
        button27 = new javax.swing.JButton();
        button28 = new javax.swing.JButton();
        button29 = new javax.swing.JButton();
        button30 = new javax.swing.JButton();
        button31 = new javax.swing.JButton();
        button32 = new javax.swing.JButton();
        button33 = new javax.swing.JButton();
        button34 = new javax.swing.JButton();
        button35 = new javax.swing.JButton();
        button36 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        button37 = new javax.swing.JButton();
        button38 = new javax.swing.JButton();
        button39 = new javax.swing.JButton();
        button40 = new javax.swing.JButton();
        button41 = new javax.swing.JButton();
        button42 = new javax.swing.JButton();
        button43 = new javax.swing.JButton();
        button44 = new javax.swing.JButton();
        button45 = new javax.swing.JButton();
        button46 = new javax.swing.JButton();
        button47 = new javax.swing.JButton();
        button48 = new javax.swing.JButton();
        button49 = new javax.swing.JButton();
        button50 = new javax.swing.JButton();
        button51 = new javax.swing.JButton();
        button52 = new javax.swing.JButton();
        button53 = new javax.swing.JButton();
        button54 = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(15, 15), new java.awt.Dimension(32767, 0));
        jPanel21 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jButton64 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        jButton67 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        button55 = new javax.swing.JButton();
        button56 = new javax.swing.JButton();
        button57 = new javax.swing.JButton();
        button58 = new javax.swing.JButton();
        button59 = new javax.swing.JButton();
        button60 = new javax.swing.JButton();
        button61 = new javax.swing.JButton();
        button62 = new javax.swing.JButton();
        button63 = new javax.swing.JButton();
        button64 = new javax.swing.JButton();
        button65 = new javax.swing.JButton();
        button66 = new javax.swing.JButton();
        button67 = new javax.swing.JButton();
        button68 = new javax.swing.JButton();
        button69 = new javax.swing.JButton();
        button70 = new javax.swing.JButton();
        button71 = new javax.swing.JButton();
        button72 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jButton68 = new javax.swing.JButton();
        jButton69 = new javax.swing.JButton();
        jButton70 = new javax.swing.JButton();
        jButton71 = new javax.swing.JButton();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 15), new java.awt.Dimension(15, 15), new java.awt.Dimension(15, 15));
        jPanel11 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Client");
        setMaximumSize(new java.awt.Dimension(680, 537));
        setMinimumSize(new java.awt.Dimension(680, 537));
        setPreferredSize(new java.awt.Dimension(680, 537));
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jPanel2.setMaximumSize(new java.awt.Dimension(680, 185));
        jPanel2.setMinimumSize(new java.awt.Dimension(680, 185));
        jPanel2.setPreferredSize(new java.awt.Dimension(680, 185));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 3, 0));

        jPanel5.setBackground(new java.awt.Color(0, 255, 0));
        jPanel5.setForeground(new java.awt.Color(0, 255, 0));
        jPanel5.setMaximumSize(new java.awt.Dimension(150, 150));
        jPanel5.setMinimumSize(new java.awt.Dimension(150, 150));
        jPanel5.setPreferredSize(new java.awt.Dimension(185, 185));
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 50));

        jPanel12.setMaximumSize(new java.awt.Dimension(85, 85));
        jPanel12.setMinimumSize(new java.awt.Dimension(85, 85));
        jPanel12.setName(""); // NOI18N
        jPanel12.setPreferredSize(new java.awt.Dimension(85, 85));
        jPanel12.setLayout(new java.awt.GridLayout(2, 2));

        jButton55.setBackground(new java.awt.Color(0, 130, 0));
        jButton55.setForeground(new java.awt.Color(0, 130, 0));
        jPanel12.add(jButton55);

        jButton57.setBackground(new java.awt.Color(0, 130, 0));
        jButton57.setForeground(new java.awt.Color(0, 130, 0));
        jPanel12.add(jButton57);

        jButton58.setBackground(new java.awt.Color(0, 130, 0));
        jButton58.setForeground(new java.awt.Color(0, 130, 0));
        jPanel12.add(jButton58);

        jButton59.setBackground(new java.awt.Color(0, 130, 0));
        jButton59.setForeground(new java.awt.Color(0, 130, 0));
        jPanel12.add(jButton59);

        jPanel5.add(jPanel12);

        jPanel2.add(jPanel5);

        jPanel6.setMinimumSize(new java.awt.Dimension(150, 150));
        jPanel6.setPreferredSize(new java.awt.Dimension(100, 185));
        jPanel6.setLayout(new java.awt.GridLayout(6, 3));

        buttonGroup1.add(button1);
        jPanel6.add(button1);

        buttonGroup1.add(button2);
        jPanel6.add(button2);

        buttonGroup1.add(button3);
        jPanel6.add(button3);

        buttonGroup1.add(button4);
        jPanel6.add(button4);

        button5.setBackground(new java.awt.Color(255, 0, 0));
        button5.setForeground(new java.awt.Color(255, 0, 0));
        button5.setBorder(null);
        buttonGroup1.add(button5);
        jPanel6.add(button5);

        button6.setBackground(new java.awt.Color(255, 0, 0));
        button6.setForeground(new java.awt.Color(255, 0, 0));
        buttonGroup1.add(button6);
        jPanel6.add(button6);

        buttonGroup1.add(button7);
        jPanel6.add(button7);

        button8.setBackground(new java.awt.Color(255, 0, 0));
        buttonGroup1.add(button8);
        jPanel6.add(button8);

        buttonGroup1.add(button9);
        jPanel6.add(button9);

        button10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/griniaris/ball.png"))); // NOI18N
        buttonGroup1.add(button10);
        jPanel6.add(button10);

        button11.setBackground(new java.awt.Color(255, 0, 0));
        buttonGroup1.add(button11);
        jPanel6.add(button11);

        buttonGroup1.add(button12);
        jPanel6.add(button12);

        buttonGroup1.add(button13);
        jPanel6.add(button13);

        button14.setBackground(new java.awt.Color(255, 0, 0));
        buttonGroup1.add(button14);
        jPanel6.add(button14);

        button15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/griniaris/s.png"))); // NOI18N
        buttonGroup1.add(button15);
        jPanel6.add(button15);

        buttonGroup1.add(button16);
        jPanel6.add(button16);

        button17.setBackground(new java.awt.Color(255, 0, 0));
        buttonGroup1.add(button17);
        jPanel6.add(button17);

        buttonGroup1.add(button18);
        jPanel6.add(button18);

        jPanel2.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 0, 0));
        jPanel7.setMinimumSize(new java.awt.Dimension(150, 150));
        jPanel7.setPreferredSize(new java.awt.Dimension(185, 185));
        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 50));

        jPanel13.setMaximumSize(new java.awt.Dimension(85, 85));
        jPanel13.setMinimumSize(new java.awt.Dimension(85, 85));
        jPanel13.setName(""); // NOI18N
        jPanel13.setPreferredSize(new java.awt.Dimension(85, 85));
        jPanel13.setLayout(new java.awt.GridLayout(2, 2));

        jButton60.setBackground(new java.awt.Color(130, 0, 0));
        jButton60.setForeground(new java.awt.Color(130, 0, 0));
        jPanel13.add(jButton60);

        jButton61.setBackground(new java.awt.Color(130, 0, 0));
        jButton61.setForeground(new java.awt.Color(130, 0, 0));
        jPanel13.add(jButton61);

        jButton62.setBackground(new java.awt.Color(130, 0, 0));
        jButton62.setForeground(new java.awt.Color(130, 0, 0));
        jPanel13.add(jButton62);

        jButton63.setBackground(new java.awt.Color(130, 0, 0));
        jButton63.setForeground(new java.awt.Color(130, 0, 0));
        jPanel13.add(jButton63);

        jPanel7.add(jPanel13);

        jPanel2.add(jPanel7);
        jPanel2.add(filler1);

        jPanel1.setPreferredSize(new java.awt.Dimension(150, 180));
        jPanel1.setLayout(new java.awt.GridLayout(0, 1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("YELLOW'S TURN");
        jPanel1.add(jLabel1);

        jButton1.setText("I CAN'T MOVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton56.setText("ROLL THE DICE");
        jButton56.setMaximumSize(new java.awt.Dimension(120, 25));
        jButton56.setMinimumSize(new java.awt.Dimension(120, 25));
        jButton56.setPreferredSize(new java.awt.Dimension(120, 25));
        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton56ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton56);

        jPanel2.add(jPanel1);

        getContentPane().add(jPanel2);
        jPanel2.getAccessibleContext().setAccessibleName("");

        jPanel3.setMaximumSize(new java.awt.Dimension(680, 105));
        jPanel3.setMinimumSize(new java.awt.Dimension(680, 105));
        jPanel3.setPreferredSize(new java.awt.Dimension(650, 105));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 3, 0));

        jPanel8.setPreferredSize(new java.awt.Dimension(185, 100));
        jPanel8.setLayout(new java.awt.GridLayout(3, 6));

        buttonGroup1.add(button19);
        jPanel8.add(button19);

        button20.setBackground(new java.awt.Color(0, 255, 0));
        button20.setToolTipText("");
        buttonGroup1.add(button20);
        jPanel8.add(button20);

        buttonGroup1.add(button21);
        jPanel8.add(button21);

        buttonGroup1.add(button22);
        jPanel8.add(button22);

        button23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/griniaris/s.png"))); // NOI18N
        buttonGroup1.add(button23);
        jPanel8.add(button23);

        buttonGroup1.add(button24);
        jPanel8.add(button24);

        buttonGroup1.add(button25);
        jPanel8.add(button25);

        button26.setBackground(new java.awt.Color(0, 255, 0));
        buttonGroup1.add(button26);
        jPanel8.add(button26);

        button27.setBackground(new java.awt.Color(0, 255, 0));
        buttonGroup1.add(button27);
        jPanel8.add(button27);

        button28.setBackground(new java.awt.Color(0, 255, 0));
        buttonGroup1.add(button28);
        jPanel8.add(button28);

        button29.setBackground(new java.awt.Color(0, 255, 0));
        buttonGroup1.add(button29);
        jPanel8.add(button29);

        button30.setBackground(new java.awt.Color(0, 255, 0));
        buttonGroup1.add(button30);
        jPanel8.add(button30);

        buttonGroup1.add(button31);
        jPanel8.add(button31);

        buttonGroup1.add(button32);
        jPanel8.add(button32);

        buttonGroup1.add(button33);
        jPanel8.add(button33);

        button34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/griniaris/ball.png"))); // NOI18N
        buttonGroup1.add(button34);
        jPanel8.add(button34);

        buttonGroup1.add(button35);
        jPanel8.add(button35);

        buttonGroup1.add(button36);
        jPanel8.add(button36);

        jPanel3.add(jPanel8);

        jPanel9.setPreferredSize(new java.awt.Dimension(102, 102));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/griniaris/centre.png"))); // NOI18N
        jButton2.setMaximumSize(new java.awt.Dimension(95, 95));
        jButton2.setMinimumSize(new java.awt.Dimension(95, 95));
        jButton2.setPreferredSize(new java.awt.Dimension(95, 95));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton2);

        jPanel3.add(jPanel9);

        jPanel10.setPreferredSize(new java.awt.Dimension(185, 100));
        jPanel10.setLayout(new java.awt.GridLayout(3, 6));

        buttonGroup1.add(button37);
        jPanel10.add(button37);

        buttonGroup1.add(button38);
        jPanel10.add(button38);

        button39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/griniaris/ball.png"))); // NOI18N
        buttonGroup1.add(button39);
        jPanel10.add(button39);

        buttonGroup1.add(button40);
        jPanel10.add(button40);

        buttonGroup1.add(button41);
        jPanel10.add(button41);

        buttonGroup1.add(button42);
        jPanel10.add(button42);

        button43.setBackground(new java.awt.Color(0, 0, 255));
        buttonGroup1.add(button43);
        jPanel10.add(button43);

        button44.setBackground(new java.awt.Color(0, 0, 255));
        buttonGroup1.add(button44);
        jPanel10.add(button44);

        button45.setBackground(new java.awt.Color(0, 0, 255));
        buttonGroup1.add(button45);
        jPanel10.add(button45);

        button46.setBackground(new java.awt.Color(0, 0, 255));
        buttonGroup1.add(button46);
        jPanel10.add(button46);

        button47.setBackground(new java.awt.Color(0, 0, 255));
        buttonGroup1.add(button47);
        jPanel10.add(button47);

        buttonGroup1.add(button48);
        jPanel10.add(button48);

        buttonGroup1.add(button49);
        jPanel10.add(button49);

        button50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/griniaris/s.png"))); // NOI18N
        buttonGroup1.add(button50);
        jPanel10.add(button50);

        buttonGroup1.add(button51);
        jPanel10.add(button51);

        buttonGroup1.add(button52);
        jPanel10.add(button52);

        button53.setBackground(new java.awt.Color(0, 0, 255));
        buttonGroup1.add(button53);
        jPanel10.add(button53);

        buttonGroup1.add(button54);
        jPanel10.add(button54);

        jPanel3.add(jPanel10);
        jPanel3.add(filler2);

        jPanel21.setLayout(new java.awt.GridBagLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/griniaris/dice.gif"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(140, 49));
        jLabel3.setMinimumSize(new java.awt.Dimension(45, 49));
        jLabel3.setPreferredSize(new java.awt.Dimension(140, 80));
        jPanel21.add(jLabel3, new java.awt.GridBagConstraints());

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Ο αριθμός είναι...");
        jLabel15.setMaximumSize(new java.awt.Dimension(140, 16));
        jLabel15.setPreferredSize(new java.awt.Dimension(140, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel21.add(jLabel15, gridBagConstraints);

        jPanel3.add(jPanel21);

        getContentPane().add(jPanel3);

        jPanel4.setMaximumSize(new java.awt.Dimension(680, 250));
        jPanel4.setMinimumSize(new java.awt.Dimension(680, 250));
        jPanel4.setPreferredSize(new java.awt.Dimension(680, 250));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jPanel14.setMaximumSize(new java.awt.Dimension(600, 185));
        jPanel14.setMinimumSize(new java.awt.Dimension(600, 185));
        jPanel14.setPreferredSize(new java.awt.Dimension(600, 185));
        jPanel14.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 3, 0));

        jPanel15.setBackground(new java.awt.Color(255, 255, 0));
        jPanel15.setForeground(new java.awt.Color(255, 255, 0));
        jPanel15.setMaximumSize(new java.awt.Dimension(150, 150));
        jPanel15.setMinimumSize(new java.awt.Dimension(150, 150));
        jPanel15.setPreferredSize(new java.awt.Dimension(185, 185));
        jPanel15.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 50));

        jPanel18.setMaximumSize(new java.awt.Dimension(85, 85));
        jPanel18.setMinimumSize(new java.awt.Dimension(85, 85));
        jPanel18.setName(""); // NOI18N
        jPanel18.setPreferredSize(new java.awt.Dimension(85, 85));
        jPanel18.setLayout(new java.awt.GridLayout(2, 2));

        jButton64.setBackground(new java.awt.Color(160, 160, 0));
        jButton64.setForeground(new java.awt.Color(160, 160, 0));
        jPanel18.add(jButton64);

        jButton65.setBackground(new java.awt.Color(160, 160, 0));
        jButton65.setForeground(new java.awt.Color(160, 160, 0));
        jPanel18.add(jButton65);

        jButton66.setBackground(new java.awt.Color(160, 160, 0));
        jButton66.setForeground(new java.awt.Color(160, 160, 0));
        jPanel18.add(jButton66);

        jButton67.setBackground(new java.awt.Color(160, 160, 0));
        jButton67.setForeground(new java.awt.Color(160, 160, 0));
        jPanel18.add(jButton67);

        jPanel15.add(jPanel18);

        jPanel14.add(jPanel15);

        jPanel16.setMinimumSize(new java.awt.Dimension(150, 150));
        jPanel16.setPreferredSize(new java.awt.Dimension(100, 185));
        jPanel16.setLayout(new java.awt.GridLayout(6, 3));

        buttonGroup1.add(button55);
        jPanel16.add(button55);

        button56.setBackground(new java.awt.Color(255, 255, 0));
        buttonGroup1.add(button56);
        jPanel16.add(button56);

        buttonGroup1.add(button57);
        jPanel16.add(button57);

        button58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/griniaris/s.png"))); // NOI18N
        buttonGroup1.add(button58);
        jPanel16.add(button58);

        button59.setBackground(new java.awt.Color(255, 255, 0));
        button59.setForeground(new java.awt.Color(255, 0, 0));
        button59.setBorder(null);
        buttonGroup1.add(button59);
        jPanel16.add(button59);

        buttonGroup1.add(button60);
        jPanel16.add(button60);

        buttonGroup1.add(button61);
        jPanel16.add(button61);

        button62.setBackground(new java.awt.Color(255, 255, 0));
        buttonGroup1.add(button62);
        jPanel16.add(button62);

        button63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/griniaris/ball.png"))); // NOI18N
        buttonGroup1.add(button63);
        jPanel16.add(button63);

        buttonGroup1.add(button64);
        jPanel16.add(button64);

        button65.setBackground(new java.awt.Color(255, 255, 0));
        buttonGroup1.add(button65);
        jPanel16.add(button65);

        buttonGroup1.add(button66);
        jPanel16.add(button66);

        button67.setBackground(new java.awt.Color(255, 255, 0));
        buttonGroup1.add(button67);
        jPanel16.add(button67);

        button68.setBackground(new java.awt.Color(255, 255, 0));
        buttonGroup1.add(button68);
        jPanel16.add(button68);

        buttonGroup1.add(button69);
        jPanel16.add(button69);

        buttonGroup1.add(button70);
        jPanel16.add(button70);

        buttonGroup1.add(button71);
        jPanel16.add(button71);

        buttonGroup1.add(button72);
        jPanel16.add(button72);

        jPanel14.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(0, 0, 255));
        jPanel17.setMinimumSize(new java.awt.Dimension(150, 150));
        jPanel17.setPreferredSize(new java.awt.Dimension(185, 185));
        jPanel17.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 50));

        jPanel19.setMaximumSize(new java.awt.Dimension(85, 85));
        jPanel19.setMinimumSize(new java.awt.Dimension(85, 85));
        jPanel19.setName(""); // NOI18N
        jPanel19.setPreferredSize(new java.awt.Dimension(85, 85));
        jPanel19.setLayout(new java.awt.GridLayout(2, 2));

        jButton68.setBackground(new java.awt.Color(0, 0, 130));
        jButton68.setForeground(new java.awt.Color(0, 0, 130));
        jPanel19.add(jButton68);

        jButton69.setBackground(new java.awt.Color(0, 0, 130));
        jButton69.setForeground(new java.awt.Color(0, 0, 130));
        jPanel19.add(jButton69);

        jButton70.setBackground(new java.awt.Color(0, 0, 130));
        jButton70.setForeground(new java.awt.Color(0, 0, 130));
        jPanel19.add(jButton70);

        jButton71.setBackground(new java.awt.Color(0, 0, 130));
        jButton71.setForeground(new java.awt.Color(0, 0, 130));
        jPanel19.add(jButton71);

        jPanel17.add(jPanel19);

        jPanel14.add(jPanel17);
        jPanel14.add(filler3);

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel11.setMaximumSize(new java.awt.Dimension(150, 150));
        jPanel11.setMinimumSize(new java.awt.Dimension(150, 150));
        jPanel11.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel11.setLayout(new java.awt.GridLayout(5, 2));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Όνομα");
        jPanel11.add(jLabel4);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Χρώμα");
        jPanel11.add(jLabel5);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("...");
        jPanel11.add(jLabel6);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Yellow");
        jPanel11.add(jLabel7);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("...");
        jPanel11.add(jLabel8);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Green");
        jPanel11.add(jLabel9);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("...");
        jPanel11.add(jLabel10);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Red");
        jPanel11.add(jLabel11);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("...");
        jPanel11.add(jLabel12);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Blue");
        jPanel11.add(jLabel13);

        jPanel14.add(jPanel11);

        jPanel4.add(jPanel14);

        getContentPane().add(jPanel4);

        jMenu1.setText("Παιχνίδι");

        jMenuItem1.setText("Έναρξη παιχνιδιού");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Διακοπή παιχνιδιού");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Έξοδος");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Βοήθεια");

        jMenuItem4.setText("Βοήθεια");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Σχετικά με τον «Γκρινιάρη»");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        if(jMenuItem1.isEnabled()==true)
        {
            //ipinfo ip= new ipinfo();
            //ip.setVisible(true);
            //int c=ip.jbuttonc;
            //System.out.println(c);
            jMenuItem1.setEnabled(false);
            jMenuItem3.setEnabled(false);
            jPanel2.setVisible(true);
            jPanel3.setVisible(true);
            jPanel4.setVisible(true);

//            if(c==1)
//            {
//                jMenuItem1.setEnabled(false);
//                System.out.println("ame");
//            }
        }


    }//GEN-LAST:event_jMenuItem1ActionPerformed

     public JPanel getjPanel2() {
        return jPanel2;
    }

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public JPanel getjPanel4() {
        return jPanel4;
    }

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        if(jMenuItem1.isEnabled()==true){
            int n = JOptionPane.showConfirmDialog(this,"Είσαι σίγουρος ότι θες να τερματίσεις το παιχνίδι ;","", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(n == JOptionPane.YES_OPTION) {
                this.dispose();
            }
            else {
                //do nothing
            }
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

        Object[] options = {"OK"};
        int n = JOptionPane.showOptionDialog(jMenuItem4, " Κάθε παίκτης έχει τέσσερα πιόνια του ίδιου χρώματος (κίτρινο, πράσινο, κόκκινο ή μπλε) τα \n οποία αρχικά τοποθετούνται στη γωνία του αντίστοιχου χρώματος (περιοχή εκκίνησης). Κάθε \n πιόνι διατρέχει, ανάλογα με το αποτέλεσμα της ρίψης ενός ζαριού, τη διαδρομή με τα άσπρα τε- \n τράγωνα στο ταμπλό, με τη φορά των δεικτών του ρολογιού. Όταν ολοκληρώσει έναν ολόκληρο \n γύρο εισέρχεται στα τελικά τετράγωνα του χρώματός του. Εκεί θα πρέπει να φτάσει ακριβώς στο \n κεντρικό τετράγωνο του ταμπλό ώστε να τερματίσει. Νικητής είναι ο παίκτης του οποίου τα πιό- \n νια τερματίζουν πρώτα.\n Για να βγει ένα πιόνι από την περιοχή εκκίνησης πρέπει ο παίκτης να φέρει 5. Αυτό το 5 δεν \n το παίζει, αλλά τοποθετεί το πιόνι του στο πρώτο τετράγωνο της διαδρομής του, ξαναρίχνει το \n ζάρι και προχωρεί το πιόνι του τόσες θέσεις όσες η ζαριά. \n Ο παίκτης μπορεί να έχει πολλά πιόνια του στο ταμπλό ταυτόχρονα, και σε κάθε κίνηση επι- \n λέγει ποιο θα κινήσει. Αν για διάφορους λόγους δεν μπορεί να κινήσει κανένα πιόνι, απλώς χάνει \n τη σειρά του."," Βοήθεια", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE,null,options,options[0]);


    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Object[] options = {"OK"};
        int n = JOptionPane.showOptionDialog(jMenuItem5,"Galatis Athanasios       , email: dit15017@uop.gr , AM:2022201500017 \nVakouftsis Athanasios , email: dit15007@uop.gr , AM:2022201500007","",JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE,null,options,options[0]);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton56ActionPerformed
        d = new Dice();
        jLabel3.setIcon(d.getDiceIcon());
        jLabel15.setText(d+"");
        rolledDice = true;
        jButton56.setEnabled(false);
    }//GEN-LAST:event_jButton56ActionPerformed

    class myActionListener2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            buffer = ((JButton) e.getSource()).getBackground();
            previous = ((JButton) e.getSource());
        }
    }


 class myActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        //το κουμπί στο οποίο πάτησε ο χρήστης
        JButton button = (JButton) e.getSource();
        //το χρώμα του προηγούμενου κουμπιού
        Color prevcolor = previous.getBackground();
        //το χρώμα σε string με rgb
        String color_previous = prevcolor.getRed()+","+prevcolor.getGreen()+","+prevcolor.getBlue();
        Color rescolor = ((JButton) e.getSource()).getBackground();
        String button_color = rescolor.getRed()+","+rescolor.getGreen()+","+rescolor.getBlue();

        System.out.println(button_color);
        //έλεγχος για το αν η σειρά είναι σωστή
        if(!players.get(nextplayer).getcolor().equals(button_color) && !players.get(nextplayer).getcolor().equals(color_previous) )
        {
            System.out.println("not right color");
        }
        else if (!button_color.equals(color_previous)) {
             //αν ο χρήστης πατήσει σε κάποιο από τα πιόνια του
             if(button_color.equals("160,160,0") || button_color.equals("0,130,0") || button_color.equals("130,0,0") || button_color.equals("0,0,130")) {
                buffer = ((JButton) e.getSource()).getBackground();
                previous = ((JButton) e.getSource());
                return;
             }
             else {
                if(!rolledDice) {
                    JOptionPane.showMessageDialog(null, "Πάτα στο κουμπί Roll The Dice για να ρίξεις το ζάρι!", " Προειδοποίηση", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                //ελέγχουμε αν ο χρήστης τοποθετεί ένα πιόνι από την αρχική του θέση στο ταμπλό
                if(!tesi.containsKey(previous)) {
                    if (color_previous.equals("130,0,0")) {
                        if(!rolledDice) {
                              JOptionPane.showMessageDialog(null, "Πάτα στο κουμπί Roll The Dice για να ρίξεις το ζάρι!", " Προειδοποίηση", JOptionPane.WARNING_MESSAGE);
                              return;
                        }
                            if (button == button6 && d.getN()==5)
                            {
                                //set button's color on the board
                                b1.setButtonsColor(((JButton) e.getSource()), buffer);
                                //((JButton) e.getSource()).setBackground(buffer);
                                buffer = ((JButton) e.getSource()).getBackground();
                            }
                            else return;
                    }
                    else if(color_previous.equals("0,0,130")) {
                        if(!rolledDice) {
                              JOptionPane.showMessageDialog(null, "Πάτα στο κουμπί Roll The Dice για να ρίξεις το ζάρι!", " Προειδοποίηση", JOptionPane.WARNING_MESSAGE);
                              return;
                        }
                            if (button == button53 && d.getN()==5)
                            {
                                //set button's color on the board
                                b1.setButtonsColor(((JButton) e.getSource()), buffer);
                                //((JButton) e.getSource()).setBackground(buffer);
                                buffer = ((JButton) e.getSource()).getBackground();
                            }
                            else return;
                    }
                    else if(color_previous.equals("160,160,0")) {
                        if(!rolledDice) {
                              JOptionPane.showMessageDialog(null, "Πάτα στο κουμπί Roll The Dice για να ρίξεις το ζάρι!", " Προειδοποίηση", JOptionPane.WARNING_MESSAGE);
                              return;
                        }
                            if (button == button67 && d.getN()==5)
                            {
                                //set button's color on the board
                                b1.setButtonsColor(((JButton) e.getSource()), buffer);
                                //((JButton) e.getSource()).setBackground(buffer);
                                buffer = ((JButton) e.getSource()).getBackground();
                            }
                            else return;
                    }
                    else if(color_previous.equals("0,130,0")) {
                        if(!rolledDice) {
                              JOptionPane.showMessageDialog(null, "Πάτα στο κουμπί Roll The Dice για να ρίξεις το ζάρι!", " Προειδοποίηση", JOptionPane.WARNING_MESSAGE);
                              return;
                        }
                            if (button == button20 && d.getN()==5)
                            {
                                //set button's color on the board
                                b1.setButtonsColor(((JButton) e.getSource()), buffer);
                                //((JButton) e.getSource()).setBackground(buffer);
                                buffer = ((JButton) e.getSource()).getBackground();
                            }
                            else return;
                    }
                }
                //ελέγχουμε αν η κίνηση είναι έγκυρη
                else if(tesi.containsKey(previous) && !b1.checkBoard(buttons, previous, (JButton) e.getSource(), d.getN())) {
                    System.out.println("Can't move there!");
                    return;
                }
                
                //an o xrhsths pathsei se asteri kai dn oloklhronei ton guro tou metaferetai sto epomeno asteri
                if(button == button23 && !color_previous.equals("130,0,0")) {
                        //set button's color on the board
                        b1.setButtonsColor(((JButton) button15), buffer);
                        //((JButton) button15).setBackground(buffer);
                        buffer = ((JButton) button15).getBackground();
                }
                else if(button == button15 && !color_previous.equals("0,0,130")) {
                        //set button's color on the board
                        b1.setButtonsColor(((JButton) button50), buffer);
                        //((JButton) button15).setBackground(buffer);
                        buffer = ((JButton) button50).getBackground();
                }
                else if(button == button50 && !color_previous.equals("160,160,0")) {
                        //set button's color on the board
                        b1.setButtonsColor(((JButton) button58), buffer);
                        //((JButton) button15).setBackground(buffer);
                        buffer = ((JButton) button58).getBackground();
                }
                else if(button == button58 && !color_previous.equals("0,130,0")) {
                        //set button's color on the board
                        b1.setButtonsColor(((JButton) button23), buffer);
                        //((JButton) button15).setBackground(buffer);
                        buffer = ((JButton) button23).getBackground();
                }
                else {
                    b1.setButtonsColor(((JButton) e.getSource()), buffer);
                    //((JButton) e.getSource()).setBackground(buffer);
                    buffer = ((JButton) e.getSource()).getBackground();
                }
                
                //χρησιμοποιούμε το map μας για να ενημερώσουμε το χρώμα του τετραγώνου της διαδρομής από το οποίο
                //ο χρήστης έφυγε, το οποίο αποκτά το αρχικό του χρώμα και πάλι
                boolean found = false;
                for (Map.Entry<JButton,Color> entry : tesi.entrySet())
                {
                        if(previous == entry.getKey())
                        {
                            //set the button's color on the board
                            b1.setButtonsColor(previous, entry.getValue());
                            previous.setBackground(entry.getValue());
                            System.out.println("value"+entry.getValue());
                            found = true;
                        }
                }
                if(!found){
                   b1.setButtonsColor(previous, defaultcolor);
                   previous.setBackground(defaultcolor);
                }
                previous = ((JButton) e.getSource());
                check();
            }
        }
        else { 
            buffer = ((JButton) e.getSource()).getBackground();
            previous = ((JButton) e.getSource());
        }
    }
 }

//αρχικοποιούμε τους listeners για τα τετράγωνα της διαδρομής και των πιονιών
myActionListener listener = new myActionListener ();

myActionListener2 startpos = new myActionListener2 ();

public void check()
{
        //check player's turn
        Player currentPlayer = players.get(nextplayer);

        b=a.nextColor();
        String b_color = b.getRed()+","+b.getGreen()+","+b.getBlue();
        
        //ενημέρωση του label ανάλογα με το ποιος παίκτης παίζει τώρα
        if(currentPlayer.getcolor().equals("160,160,0"))
            jLabel1.setText("GREEN'S TURN");
        else if(currentPlayer.getcolor().equals("0,130,0"))
            jLabel1.setText("RED'S TURN");
        else if(currentPlayer.getcolor().equals("130,0,0"))
            jLabel1.setText("BLUE'S TURN");
        if(currentPlayer.getcolor().equals("0,0,130"))
            jLabel1.setText("YELLOW'S TURN");

        //System.out.println("\n"+b+":Make your move");
        buffer = b;
        //b_color = buffer.getRed()+","+buffer.getGreen()+","+buffer.getBlue();
        //System.out.println(b_color);
        rolledDice = !rolledDice;
        jButton56.setEnabled(true);
        nextplayer=(nextplayer+1)%4;
}

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(null, "Νίκησες Το Παιχνίδι!!!", "Νίκη", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        check();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button1;
    private javax.swing.JButton button10;
    private javax.swing.JButton button11;
    private javax.swing.JButton button12;
    private javax.swing.JButton button13;
    private javax.swing.JButton button14;
    private javax.swing.JButton button15;
    private javax.swing.JButton button16;
    private javax.swing.JButton button17;
    private javax.swing.JButton button18;
    private javax.swing.JButton button19;
    private javax.swing.JButton button2;
    private javax.swing.JButton button20;
    private javax.swing.JButton button21;
    private javax.swing.JButton button22;
    private javax.swing.JButton button23;
    private javax.swing.JButton button24;
    private javax.swing.JButton button25;
    private javax.swing.JButton button26;
    private javax.swing.JButton button27;
    private javax.swing.JButton button28;
    private javax.swing.JButton button29;
    private javax.swing.JButton button3;
    private javax.swing.JButton button30;
    private javax.swing.JButton button31;
    private javax.swing.JButton button32;
    private javax.swing.JButton button33;
    private javax.swing.JButton button34;
    private javax.swing.JButton button35;
    private javax.swing.JButton button36;
    private javax.swing.JButton button37;
    private javax.swing.JButton button38;
    private javax.swing.JButton button39;
    private javax.swing.JButton button4;
    private javax.swing.JButton button40;
    private javax.swing.JButton button41;
    private javax.swing.JButton button42;
    private javax.swing.JButton button43;
    private javax.swing.JButton button44;
    private javax.swing.JButton button45;
    private javax.swing.JButton button46;
    private javax.swing.JButton button47;
    private javax.swing.JButton button48;
    private javax.swing.JButton button49;
    private javax.swing.JButton button5;
    private javax.swing.JButton button50;
    private javax.swing.JButton button51;
    private javax.swing.JButton button52;
    private javax.swing.JButton button53;
    private javax.swing.JButton button54;
    private javax.swing.JButton button55;
    private javax.swing.JButton button56;
    private javax.swing.JButton button57;
    private javax.swing.JButton button58;
    private javax.swing.JButton button59;
    private javax.swing.JButton button6;
    private javax.swing.JButton button60;
    private javax.swing.JButton button61;
    private javax.swing.JButton button62;
    private javax.swing.JButton button63;
    private javax.swing.JButton button64;
    private javax.swing.JButton button65;
    private javax.swing.JButton button66;
    private javax.swing.JButton button67;
    private javax.swing.JButton button68;
    private javax.swing.JButton button69;
    private javax.swing.JButton button7;
    private javax.swing.JButton button70;
    private javax.swing.JButton button71;
    private javax.swing.JButton button72;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton68;
    private javax.swing.JButton jButton69;
    private javax.swing.JButton jButton70;
    private javax.swing.JButton jButton71;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables



}
