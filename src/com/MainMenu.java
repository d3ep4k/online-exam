package com;

import com.util.ImageUtil;
import com.util.Util;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.border.AbstractBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;

public class MainMenu extends JFrame {

    private static MainMenu instance = new MainMenu();
    public JPanel contentPane;
    public JMenuBar menuBar;
    public boolean isQuestionLatexOn = false, isAnswerLatexOn = false;

    /**
     * Create the frame.
     */
    public static MainMenu getInstance() {
        if (null == instance) {
            instance = new MainMenu();
        }
        return instance;
    }

    public JPanel timmingP, answerP, questionP, levelsP, navigationalP;
    public Timer timer;
    public JLabel level5L, level4L, level3L, level2L, level1L, level0L;
    public JMyLabel level51L, level41L, level31L, level21L, level11L, level01L;
    public JButton learnLevel5B, learnLevel4B, learnLevel3B, learnLevel2B, learnLevel1B, learnLevel0B;
    public JButton learnAllB;
    public JTextField cardNoT;
    public JLabel cardL, levelL, levelNoL, lessionNameL, lessionL;
    public JButton autoTimingB, autoB;
    public JLabel autoTimingL, autoL;
    public JScrollPane questionDefaultS, questionLatexS, questionLatexS1;
    public JTextArea questionDefaultT, questionLatexT, questionLatexT1;
    public JScrollPane answerDefaultS, answerLatexS, answerLatexS1;
    public JTextArea answerDefaultT, answerLatexT, answerLatexT1;
    public JButton myTimingB;
    public JLabel timing2L;
    public JButton firstCardB, leftDoubleB, leftB, rightB, rightDoubleB, lastCardB;
    public JPanel cardModifyP;
    public JTextArea numberT;

    public JLabel questionImageL;
    public JPanel questionLinkP;
    public JButton questionLinkB;
    public JButton recordOffQuestionAudioB, recordOnQuestionAudioB;
    public JLabel answerImageL;
    public JButton deleteCardB, newCardB, editCardB;
    public JPanel choiceP;
    public JButton correctB;
    public JButton wrongB;
    public JButton stopB;
    public JLabel answerErrorL;
    public JLabel questionErrorL;
    public JLabel actionL;
    public JPanel numberP;
    public JButton showB;
    public JLayeredPane layeredPane;
    public JPanel saveP;
    public JButton saveB;
    public JButton cancelB;
    public JTextField questionHyperlinkT = new JTextField();
    public JTextField answerHyperlinkT = new JTextField();
    public JPanel answerLinkP;
    public JButton answerLinkB;
    public JButton playQuestionAudioB, stopQuestionAudioB, deleteQuestionAudioB;
    public JToggleButton latexQuestionB, latexAnswerB;
    public JButton recordOffAnswerAudioB, stopAnswerAudioB, recordOnAnswerAudioB, playAnswerAudioB, deleteAnswerAudioB;
    public JPanel questionImageP;
    public JButton questionSnapshotB, questionImageUploadB, deleteQuestionImageB;
    public JPanel answerImageP;
    public JButton answerSnapshotB, answerImageUploadB, deleteAnswerImageB;
    public JButton myTimeHelpB, autoTimeHelpB, autoHelpB, numberHelpB;
    public JRadioButton latexModeQR, normalModeQR, normalModeAR, multipleModeAR, exactMatchModeAR;
    public JLabel latexModeQL, normalModeQL, normalModeAL, exactMatchModeAL, multipleModeAL;
    public JPanel questionModeP, answerModeP;
    public JPanel questionTextDefaultP, questionTextLatexP;
    public JPanel answerTextDefaultP, answerTextLatexP, answerTextMultiP;
    public JTextField answer1T, answer2T, answer3T, answer4T, answer5T;
    public JPanel answer1P, answer2P, answer3P, answer4P, answer5P;
    public JCheckBox answer1C, answer2C, answer3C, answer4C, answer5C;
    public JButton latexAnswerLinkB;
    public JButton exactAnswerHelpB;
    public JButton latexQuestionLinkB;

    JMenuItem mntmFeature1;
    JMenuItem mntmFeature2;
    JMenuItem mntmFeature3;
    JMenuItem mntmFeature4;
    JMenuItem mntmFeature5;
    JMenuItem mntmFeature6;

    private MainMenu() {
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setBounds(200, 50, 900, 800);
        //setResizable(false);
        setIconImage(ImageUtil.getImage("Icon.png"));

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
                e.getWindow().dispose();
                System.exit(1);
            }
        });

        contentPane = new JPanel();
        contentPane.setBackground(new Color(0xfaaaaa));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        navigationalP = new JPanel();
        navigationalP.setBounds(251, 701, 384, 42);
        navigationalP.setBackground(new Color(0xfaaffa));

        levelsP = new JPanel();
        levelsP.setBounds(19, 17, 220, 572);
        levelsP.setBackground(Util.color);

        timmingP = new JPanel();
        timmingP.setBounds(19, 600, 220, 116);
        timmingP.setBackground(Util.color);

        questionP = new RoundedPanel(632, 292, 20, 5);
        questionP.setBounds(251, 34, 632, 292);
        questionP.setBackground(new Color(0xccffaa));

        answerP = new RoundedPanel(632, 292, 20, 5);
        answerP.setBounds(251, 340, 632, 292);
        answerP.setBackground(new Color(0x99aa99));

        cardModifyP = new JPanel();
        cardModifyP.setBounds(690, 644, 193, 45);
        cardModifyP.setBackground(new Color(0x99ffaa));
        cardModifyP.setVisible(false);
        
        choiceP = new JPanel();
        choiceP.setBounds(251, 644, 193, 45);
        choiceP.setBackground(new Color(0x99ffaa));

        correctB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("RightAnswerButton.png")).getImage()
                .getScaledInstance(40, 15, Image.SCALE_SMOOTH)))));
        correctB.setBounds(6, 6, 56, 30);
        //correctB.setToolTipText("You guessed Correct");
        //correctB.setBorder(new RoundedBorder());
        correctB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        wrongB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("WrongAnswerButton.png")).getImage()
                .getScaledInstance(40, 15, Image.SCALE_SMOOTH)))));
        wrongB.setBounds(68, 6, 56, 30);
        //wrongB.setToolTipText("You guessed Wrong");
        //wrongB.setBorder(new RoundedBorder());
        wrongB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        stopB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("StopButton.png")).getImage()
                .getScaledInstance(40, 15, Image.SCALE_SMOOTH)))));
        stopB.setBounds(130, 6, 56, 30);
        //stopB.setToolTipText("Stop learning");
        //stopB.setBorder(new RoundedBorder());
        stopB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        answerErrorL = new JLabel("");
        answerErrorL.setBounds(251, 326, 204, 14);
        answerErrorL.setFont(new Font("SansSerif", Font.PLAIN, 10));
        answerErrorL.setForeground(Color.RED);
        answerErrorL.setBounds(251, 326, 549, 14);

        questionErrorL = new JLabel(" ");
        questionErrorL.setBounds(251, 18, 204, 14);
        questionErrorL.setForeground(Color.RED);
        questionErrorL.setFont(new Font("SansSerif", Font.PLAIN, 10));
        questionErrorL.setBounds(251, 18, 508, 14);

        actionL = new JLabel(" ");
        actionL.setForeground(Color.BLUE);
        actionL.setFont(new Font("SansSerif", Font.BOLD, 12));
        actionL.setBounds(405, 6, 315, 16);
        actionL.setHorizontalAlignment(SwingConstants.CENTER);

        newCardB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("AddButton.png")).getImage()
                .getScaledInstance(40, 15, Image.SCALE_SMOOTH)))));
        //newCardB.setBorder(new RoundedBorder());
        newCardB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        editCardB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("EditButton.png")).getImage()
                .getScaledInstance(40, 15, Image.SCALE_SMOOTH)))));
        editCardB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        deleteCardB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("DeleteButton.png")).getImage()
                .getScaledInstance(40, 15, Image.SCALE_SMOOTH)))));
        deleteCardB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        GroupLayout gl_cardModifyP = new GroupLayout(cardModifyP);
        gl_cardModifyP.setHorizontalGroup(
                gl_cardModifyP.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_cardModifyP.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(newCardB, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addComponent(editCardB, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addComponent(deleteCardB, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(45, Short.MAX_VALUE))
        );
        gl_cardModifyP.setVerticalGroup(
                gl_cardModifyP.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_cardModifyP.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(gl_cardModifyP.createParallelGroup(Alignment.LEADING)
                                .addComponent(deleteCardB, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(editCardB, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(newCardB, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                        .addGap(9))
        );
        cardModifyP.setLayout(gl_cardModifyP);

        numberP = new RoundedPanel(50, 33, 10, 4);
        numberP.setBounds(575, 20, 52, 33);
        numberP.setBackground(Util.color);

        questionTextLatexP = new JPanel();
        questionTextLatexP.setBackground(Util.color);
        questionTextLatexP.setLayout(null);
        questionTextLatexP.setBounds(6, 6, 469, 251);
        questionP.add(questionTextLatexP);

        questionLatexS = new JScrollPane();
        questionLatexS.setBounds(0, 0, 457, 90);
        questionLatexS.setBackground(Util.color);

        questionLatexT = new JTextArea();

        questionLatexT.setFont(new Font("SansSerif", Font.PLAIN, 15));
        questionLatexT.setForeground(Color.BLACK);
        questionLatexT.setBackground(Util.color);
        //questionLatexT.setToolTipText("question");
        questionLatexT.setEditable(false);
        questionLatexT.setLineWrap(true);
        questionLatexT.setWrapStyleWord(true);
        questionLatexT.requestFocusInWindow();

        questionLatexS.setViewportView(questionLatexT);

        questionLatexS1 = new JScrollPane();
        questionLatexS1.setBounds(0, 92, 457, 150);
        questionLatexS1.setBackground(Util.color);

        questionLatexT1 = new JTextArea();
        questionLatexT1.setBackground(Util.color);
        questionLatexT1.addFocusListener(new FocusListener() {
            @Override
            public void focusLost(FocusEvent e) {
            }

            @Override
            public void focusGained(FocusEvent e) {
            }
        });

        questionLatexT1.setFont(new Font("SansSerif", Font.PLAIN, 15));
        questionLatexT1.setForeground(Color.BLACK);
        questionLatexT1.setBackground(Util.color);
        //questionLatexT1.setToolTipText("question");
        questionLatexT1.setEditable(false);
        questionLatexT1.requestFocusInWindow();
        questionLatexS1.setViewportView(questionLatexT1);

        questionTextLatexP.add(questionLatexS);
        questionTextLatexP.add(questionLatexS1);

        answerImageL = new JLabel();
        answerImageL.setBounds(485, 159, 138, 78);
        answerImageL.setBorder(new DashedBorder());
        answerImageL.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
        });

        answerLinkP = new JPanel();
        answerLinkP.setBounds(15, 259, 274, 26);
        answerLinkP.setBackground(Util.color);

        answerLinkB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("HyperlinkButton.png")).getImage()
                .getScaledInstance(35, 10, Image.SCALE_SMOOTH)))));
        answerLinkB.setBounds(6, 0, 38, 22);
        answerLinkB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        recordOffAnswerAudioB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("RecordOffButton.png")).getImage()
                .getScaledInstance(35, 10, Image.SCALE_SMOOTH)))));
        recordOffAnswerAudioB.setBounds(46, 0, 38, 22);
        recordOffAnswerAudioB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        recordOnAnswerAudioB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("RecordOnButton.png")).getImage()
                .getScaledInstance(35, 10, Image.SCALE_SMOOTH)))));
        recordOnAnswerAudioB.setBounds(46, 0, 38, 22);
        recordOnAnswerAudioB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        playAnswerAudioB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("PlayButton.png")).getImage()
                .getScaledInstance(35, 10, Image.SCALE_SMOOTH)))));
        playAnswerAudioB.setBounds(86, 0, 38, 22);
        playAnswerAudioB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        stopAnswerAudioB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("StopButton.png")).getImage()
                .getScaledInstance(35, 10, Image.SCALE_SMOOTH)))));
        stopAnswerAudioB.setBounds(86, 0, 38, 22);
        stopAnswerAudioB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        deleteAnswerAudioB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("DeleteButton.png")).getImage()
                .getScaledInstance(35, 10, Image.SCALE_SMOOTH)))));
        deleteAnswerAudioB.setBounds(126, 0, 38, 22);
        deleteAnswerAudioB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        answerImageP = new JPanel();
        answerImageP.setBounds(485, 259, 138, 25);
        answerImageP.setBackground(new Color(232, 232, 232));

        answerSnapshotB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("ImageSnapshotButton.png")).getImage()
                .getScaledInstance(35, 10, Image.SCALE_SMOOTH)))));
        answerSnapshotB.setBounds(1, 0, 38, 22);
        answerSnapshotB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        answerImageUploadB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("ImageUploadButton.png")).getImage()
                .getScaledInstance(35, 10, Image.SCALE_SMOOTH)))));
        answerImageUploadB.setBounds(45, 0, 38, 22);
        answerImageUploadB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        deleteAnswerImageB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("DeleteButton.png")).getImage()
                .getScaledInstance(35, 10, Image.SCALE_SMOOTH)))));
        deleteAnswerImageB.setBounds(89, 0, 38, 22);
        deleteAnswerImageB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        answerModeP = new JPanel();
        answerModeP.setBounds(543, 60, 80, 87);
        answerModeP.setLayout(null);
        answerModeP.setBackground(Util.color);
        normalModeAR = new JRadioButton();
        normalModeAR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        normalModeAR.setBounds(6, 5, 18, 18);
        normalModeAR.setSelected(true);
        answerModeP.add(normalModeAR);

        normalModeAL = new JLabel(new ImageIcon(((new ImageIcon(ImageUtil.getImage("NormalModeButton.png")).getImage()
                .getScaledInstance(18, 15, Image.SCALE_SMOOTH)))));
        normalModeAL.setBounds(30, 5, 36, 15);
        answerModeP.add(normalModeAL);

        exactMatchModeAR = new JRadioButton();
        exactMatchModeAR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        exactMatchModeAR.setBounds(6, 25, 18, 18);
        answerModeP.add(exactMatchModeAR);

        exactMatchModeAL = new JLabel(new ImageIcon(((new ImageIcon(ImageUtil.getImage("ExactMatchButton.png")).getImage()
                .getScaledInstance(30, 15, Image.SCALE_SMOOTH)))));
        exactMatchModeAL.setBounds(30, 21, 44, 15);
        answerModeP.add(exactMatchModeAL);

        multipleModeAR = new JRadioButton();
        multipleModeAR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        multipleModeAR.setBounds(6, 45, 18, 18);

        multipleModeAL = new JLabel(new ImageIcon(((new ImageIcon(ImageUtil.getImage("MultipleChoiceButton.png")).getImage()
                .getScaledInstance(35, 24, Image.SCALE_SMOOTH)))));
        multipleModeAL.setBounds(25, 36, 44, 33);
        answerModeP.add(multipleModeAL);
        ButtonGroup group = new ButtonGroup();
        group.add(normalModeAR);
        group.add(exactMatchModeAR);
        group.add(multipleModeAR);

        answerModeP.add(multipleModeAR);
        answerLinkP.setLayout(null);
        answerLinkP.add(answerLinkB);
        answerLinkP.add(recordOffAnswerAudioB);
        answerLinkP.add(recordOnAnswerAudioB);
        answerLinkP.add(playAnswerAudioB);
        answerLinkP.add(stopAnswerAudioB);
        answerLinkP.add(deleteAnswerAudioB);

        questionImageL = new JLabel();
        questionImageL.setBounds(487, 163, 138, 78);
        questionImageL.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
        });
        questionImageL.setBorder(new DashedBorder());

        questionLinkP = new JPanel();
        questionLinkP.setBounds(15, 259, 301, 26);
        questionLinkP.setBackground(Util.color);

        questionLinkB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("HyperlinkButton.png")).getImage()
                .getScaledInstance(35, 10, Image.SCALE_SMOOTH)))));
        questionLinkB.setBounds(6, 0, 38, 22);
        questionLinkB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        //questionLinkB.setBorder(new RoundedBorder());

        recordOffQuestionAudioB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("RecordOffButton.png")).getImage()
                .getScaledInstance(35, 10, Image.SCALE_SMOOTH)))));
        recordOffQuestionAudioB.setBounds(46, 0, 38, 22);
        recordOffQuestionAudioB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        recordOnQuestionAudioB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("RecordOnButton.png")).getImage()
                .getScaledInstance(35, 10, Image.SCALE_SMOOTH)))));
        recordOnQuestionAudioB.setBounds(46, 0, 38, 22);
        recordOnQuestionAudioB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        playQuestionAudioB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("PlayButton.png")).getImage()
                .getScaledInstance(35, 10, Image.SCALE_SMOOTH)))));
        playQuestionAudioB.setBounds(86, 0, 38, 22);
        playQuestionAudioB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        stopQuestionAudioB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("StopButton.png")).getImage()
                .getScaledInstance(35, 10, Image.SCALE_SMOOTH)))));
        stopQuestionAudioB.setBounds(86, 0, 38, 22);
        stopQuestionAudioB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        deleteQuestionAudioB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("DeleteButton.png")).getImage()
                .getScaledInstance(35, 10, Image.SCALE_SMOOTH)))));
        deleteQuestionAudioB.setBounds(126, 0, 38, 22);
        deleteQuestionAudioB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        latexQuestionB = new JToggleButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("LatexButton.png")).getImage()
                .getScaledInstance(30, 13, Image.SCALE_SMOOTH)))));
        //latexQuestionB.setToolTipText("Turn on to use Latex");
        latexQuestionB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        latexQuestionB.setBounds(163, 0, 38, 22);
        questionLinkP.add(latexQuestionB);

        questionImageP = new JPanel();
        questionImageP.setBounds(487, 259, 138, 25);
        questionImageP.setBackground(Util.color);

        questionModeP = new JPanel();
        questionModeP.setBounds(545, 77, 80, 74);
        questionModeP.setBackground(Util.color);

        questionSnapshotB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("ImageSnapshotButton.png")).getImage()
                .getScaledInstance(35, 10, Image.SCALE_SMOOTH)))));
        questionSnapshotB.setBounds(1, 0, 38, 22);
        questionSnapshotB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        questionImageUploadB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("ImageUploadButton.png")).getImage()
                .getScaledInstance(35, 10, Image.SCALE_SMOOTH)))));
        questionImageUploadB.setBounds(45, 0, 38, 22);
        questionImageUploadB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        deleteQuestionImageB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("DeleteButton.png")).getImage()
                .getScaledInstance(35, 10, Image.SCALE_SMOOTH)))));
        deleteQuestionImageB.setBounds(89, 0, 38, 22);
        deleteQuestionImageB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        numberT = new JTextArea();
        numberT.setBounds(10, 6, 19, 16);
        numberT.setBackground(Util.color);
        numberT.requestFocusInWindow();
        numberT.setBorder(null);

        numberHelpB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("HelpButton.png")).getImage()
                .getScaledInstance(27, 28, Image.SCALE_SMOOTH)))));
        numberHelpB.setBounds(28, 5, 17, 19);
        numberHelpB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        numberHelpB.setFocusPainted(false);
        numberHelpB.setContentAreaFilled(false);
        numberHelpB.setBorderPainted(false);
        numberHelpB.setVisible(false);
        numberP.setLayout(null);
        numberT.setEditable(false);
        numberP.add(numberT);
        numberP.add(numberHelpB);
        questionLinkP.setLayout(null);
        questionLinkP.add(questionLinkB);
        questionLinkP.add(recordOffQuestionAudioB);
        questionLinkP.add(recordOnQuestionAudioB);
        questionLinkP.add(playQuestionAudioB);
        questionLinkP.add(stopQuestionAudioB);
        questionLinkP.add(deleteQuestionAudioB);

        firstCardB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("BeginningButton.png")).getImage()
                .getScaledInstance(40, 15, Image.SCALE_SMOOTH)))));
        //firstCardB.setBorder(new RoundedBorder());
        firstCardB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        leftDoubleB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("RewindButton.png")).getImage()
                .getScaledInstance(40, 15, Image.SCALE_SMOOTH)))));
        leftDoubleB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        leftB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("BackButton.png")).getImage()
                .getScaledInstance(40, 15, Image.SCALE_SMOOTH)))));
        UIManager.put("Button.disabledForeGround", Util.color);
        leftB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        rightB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("NextButton.png")).getImage()
                .getScaledInstance(40, 15, Image.SCALE_SMOOTH)))));
        rightB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        rightDoubleB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("ForwardButton.png")).getImage()
                .getScaledInstance(40, 15, Image.SCALE_SMOOTH)))));
        rightDoubleB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        lastCardB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("EndButton.png")).getImage()
                .getScaledInstance(40, 15, Image.SCALE_SMOOTH)))));
        lastCardB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        GroupLayout gl_navigationalP = new GroupLayout(navigationalP);
        gl_navigationalP.setHorizontalGroup(
                gl_navigationalP.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_navigationalP.createSequentialGroup()
                        .addGap(4)
                        .addComponent(firstCardB, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addComponent(leftDoubleB, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addComponent(leftB, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addComponent(rightB, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addComponent(rightDoubleB, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addComponent(lastCardB, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(219, Short.MAX_VALUE))
        );
        gl_navigationalP.setVerticalGroup(
                gl_navigationalP.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_navigationalP.createSequentialGroup()
                        .addGap(4)
                        .addGroup(gl_navigationalP.createParallelGroup(Alignment.LEADING)
                                .addComponent(lastCardB, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(rightDoubleB, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(rightB, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(leftB, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(leftDoubleB, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(firstCardB, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(19, Short.MAX_VALUE))
        );
        navigationalP.setLayout(gl_navigationalP);

        autoTimingB = new JButton(new ImageIcon(ImageUtil.getImage("AutoTimingOffButton.png")));
        autoTimingB.setBounds(24, 6, 80, 36);
        autoTimingB.setFocusPainted(false);
        autoTimingB.setContentAreaFilled(false);
        autoTimingB.setBorderPainted(false);
        autoTimingB.setBorder(new LineBorder(Color.black));

        autoTimingL = new JLabel("timing1");
        autoTimingL.setBounds(116, 14, 73, 16);

        myTimingB = new JButton(new ImageIcon(ImageUtil.getImage("MyTimingOffButton.png")));
        myTimingB.setBounds(76, 54, 22, 29);
        myTimingB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        myTimingB.setFocusPainted(false);
        myTimingB.setContentAreaFilled(false);
        myTimingB.setBorderPainted(false);

        timing2L = new JLabel("timing2");
        timing2L.setBounds(116, 60, 73, 16);

        autoB = new JButton(new ImageIcon(ImageUtil.getImage("AutoPaukOffButton.png")));
        autoB.setBounds(24, 80, 80, 36);
        autoB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        autoB.setFocusPainted(false);
        autoB.setContentAreaFilled(false);
        autoB.setBorderPainted(false);
        autoB.setBorder(new LineBorder(Color.black));

        autoL = new JLabel("AUTO");
        autoL.setBounds(116, 88, 73, 16);

        JLabel connectionL = new JLabel(new ImageIcon(((new ImageIcon(ImageUtil.getImage("ConnectionButton.png")).getImage()
                .getScaledInstance(17, 30, Image.SCALE_SMOOTH)))));
        connectionL.setBounds(31, 48, 39, 24);

        autoTimeHelpB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("HelpButton.png")).getImage()
                .getScaledInstance(27, 28, Image.SCALE_SMOOTH)))));
        autoTimeHelpB.setBounds(195, 14, 17, 21);
        autoTimeHelpB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        autoTimeHelpB.setFocusPainted(false);
        autoTimeHelpB.setContentAreaFilled(false);
        autoTimeHelpB.setBorderPainted(false);

        autoHelpB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("HelpButton.png")).getImage()
                .getScaledInstance(27, 28, Image.SCALE_SMOOTH)))));
        autoHelpB.setBounds(195, 88, 17, 21);
        autoHelpB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        autoHelpB.setFocusPainted(false);
        autoHelpB.setContentAreaFilled(false);
        autoHelpB.setBorderPainted(false);

        myTimeHelpB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("HelpButton.png")).getImage()
                .getScaledInstance(27, 28, Image.SCALE_SMOOTH)))));
        myTimeHelpB.setBounds(195, 60, 17, 21);
        myTimeHelpB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        myTimeHelpB.setFocusPainted(false);
        myTimeHelpB.setContentAreaFilled(false);
        myTimeHelpB.setBorderPainted(false);

        cardL = new JLabel("Card:");
        cardL.setBounds(6, 22, 45, 16);

        cardNoT = new JTextField(" ");
        cardNoT.setBounds(51, 22, 30, 20);
        cardNoT.setEditable(false);
        cardNoT.setBackground(Util.color);
        cardNoT.setBorder(BorderFactory.createEmptyBorder());
        cardNoT.setFont(new Font("SansSerif", Font.BOLD, 12));
        cardNoT.setFocusTraversalKeysEnabled(false);
        cardNoT.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
            }
        });
        levelL = new JLabel("Level");
        levelL.setBounds(87, 22, 38, 16);

        levelNoL = new JLabel(" ");
        levelNoL.setBounds(129, 22, 14, 16);
        levelNoL.setFont(new Font("SansSerif", Font.BOLD, 12));

        lessionL = new JLabel("File : ");
        lessionL.setBounds(6, 0, 45, 16);

        lessionNameL = new JLabel(" ");
        lessionNameL.setBounds(51, 0, 170, 16);
        lessionNameL.setFont(new Font("SansSerif", Font.BOLD, 12));

        level5L = new JLabel("Level 5");
        level5L.setBounds(6, 75, 47, 16);

        level51L = new JMyLabel(new ImageIcon(((new ImageIcon(ImageUtil.getImage("cardbox.png")).getImage()
                .getScaledInstance(60, 40, Image.SCALE_SMOOTH)))));
        level51L.setBounds(57, 59, 68, 45);
        //level51L.setBorder(new LineBorder(Color.black));
        //level51L.setToolTipText("Display no of questions of level 5");

        learnLevel5B = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("LevelBButton.png")).getImage()
                .getScaledInstance(64, 64, Image.SCALE_SMOOTH)))));
        learnLevel5B.setBounds(131, 54, 92, 50);
        learnLevel5B.setBorderPainted(false);
        learnLevel5B.setFocusPainted(false);
        learnLevel5B.setContentAreaFilled(false);
        //learnLevel5B.setToolTipText("Start learning file of level 5 questions");
        learnLevel5B.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        level4L = new JLabel("Level 4");
        level4L.setBounds(6, 143, 47, 16);

        level41L = new JMyLabel(new ImageIcon(((new ImageIcon(ImageUtil.getImage("cardbox.png")).getImage()
                .getScaledInstance(60, 40, Image.SCALE_SMOOTH)))));
        level41L.setBounds(57, 127, 68, 45);
        //level41L.setBorder(new LineBorder(Color.black));
        level41L.setHorizontalAlignment(SwingConstants.CENTER);
        //level41L.setToolTipText("Display no of questions of level 4");

        learnLevel4B = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("LevelBButton.png")).getImage()
                .getScaledInstance(64, 64, Image.SCALE_SMOOTH)))));
        learnLevel4B.setBounds(131, 122, 92, 50);
        learnLevel4B.setBorderPainted(false);
        learnLevel4B.setFocusPainted(false);
        learnLevel4B.setContentAreaFilled(false);
        learnLevel4B.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        level3L = new JLabel("Level 3");
        level3L.setBounds(6, 211, 47, 16);

        level31L = new JMyLabel(new ImageIcon(((new ImageIcon(ImageUtil.getImage("cardbox.png")).getImage()
                .getScaledInstance(60, 40, Image.SCALE_SMOOTH)))));
        level31L.setBounds(57, 195, 68, 45);
        level31L.setHorizontalAlignment(SwingConstants.CENTER);

        learnLevel3B = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("LevelBButton.png")).getImage()
                .getScaledInstance(64, 64, Image.SCALE_SMOOTH)))));
        learnLevel3B.setBounds(131, 190, 92, 50);
        learnLevel3B.setBorderPainted(false);
        learnLevel3B.setFocusPainted(false);
        learnLevel3B.setContentAreaFilled(false);
        learnLevel3B.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        level2L = new JLabel("Level 2");
        level2L.setBounds(6, 279, 47, 16);

        level21L = new JMyLabel(new ImageIcon(((new ImageIcon(ImageUtil.getImage("cardbox.png")).getImage()
                .getScaledInstance(60, 40, Image.SCALE_SMOOTH)))));
        level21L.setBounds(57, 263, 68, 45);
        level21L.setHorizontalAlignment(SwingConstants.CENTER);

        learnLevel2B = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("LevelBButton.png")).getImage()
                .getScaledInstance(64, 64, Image.SCALE_SMOOTH)))));
        learnLevel2B.setBounds(131, 258, 92, 50);
        learnLevel2B.setBorderPainted(false);
        learnLevel2B.setFocusPainted(false);
        learnLevel2B.setContentAreaFilled(false);
        //learnLevel2B.setToolTipText("Start learning file of level 2 questions");
        learnLevel2B.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        level1L = new JLabel("Level 1");
        level1L.setBounds(6, 347, 47, 16);

        level11L = new JMyLabel(new ImageIcon(((new ImageIcon(ImageUtil.getImage("cardbox.png")).getImage()
                .getScaledInstance(60, 40, Image.SCALE_SMOOTH)))));
        level11L.setBounds(57, 331, 68, 45);
        level11L.setHorizontalAlignment(SwingConstants.CENTER);

        learnLevel1B = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("LevelBButton.png")).getImage()
                .getScaledInstance(64, 64, Image.SCALE_SMOOTH)))));
        learnLevel1B.setBounds(131, 326, 92, 50);
        learnLevel1B.setBorderPainted(false);
        learnLevel1B.setFocusPainted(false);
        learnLevel1B.setContentAreaFilled(false);
        learnLevel1B.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        level0L = new JLabel("Level 0");
        level0L.setBounds(6, 415, 47, 16);

        level01L = new JMyLabel(new ImageIcon(((new ImageIcon(ImageUtil.getImage("cardbox.png")).getImage()
                .getScaledInstance(60, 40, Image.SCALE_SMOOTH)))));
        level01L.setBounds(57, 399, 68, 45);
        level01L.setHorizontalAlignment(SwingConstants.CENTER);

        learnLevel0B = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("LevelBButton.png")).getImage()
                .getScaledInstance(64, 64, Image.SCALE_SMOOTH)))));
        learnLevel0B.setBounds(131, 394, 92, 50);
        learnLevel0B.setBorderPainted(false);
        learnLevel0B.setFocusPainted(false);
        learnLevel0B.setContentAreaFilled(false);
        learnLevel0B.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        learnAllB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("AllLevelsBButton.png")).getImage()
                .getScaledInstance(95, 95, Image.SCALE_SMOOTH)))));
        learnAllB.setBounds(40, 459, 100, 107);
        learnAllB.setFocusPainted(false);
        learnAllB.setContentAreaFilled(false);
        learnAllB.setBorderPainted(false);
        learnAllB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        contentPane.setLayout(null);

        contentPane.add(levelsP);
        levelsP.setLayout(null);
        levelsP.add(level5L);
        levelsP.add(level51L);
        levelsP.add(learnLevel5B);
        levelsP.add(level4L);
        levelsP.add(level41L);
        levelsP.add(learnLevel4B);
        levelsP.add(level3L);
        levelsP.add(level31L);
        levelsP.add(learnLevel3B);
        levelsP.add(level2L);
        levelsP.add(level21L);
        levelsP.add(learnLevel2B);
        levelsP.add(level1L);
        levelsP.add(level11L);
        levelsP.add(learnLevel1B);
        levelsP.add(level0L);
        levelsP.add(level01L);
        levelsP.add(learnLevel0B);
        levelsP.add(learnAllB);
        levelsP.add(cardL);
        levelsP.add(cardNoT);
        levelsP.add(levelL);
        levelsP.add(levelNoL);
        levelsP.add(lessionL);
        levelsP.add(lessionNameL);
        contentPane.add(timmingP);
        timmingP.setLayout(null);
        timmingP.add(connectionL);
        timmingP.add(myTimingB);
        timmingP.add(autoTimingB);
        timmingP.add(autoTimingL);
        timmingP.add(autoTimeHelpB);
        timmingP.add(timing2L);
        timmingP.add(myTimeHelpB);
        timmingP.add(autoB);
        timmingP.add(autoHelpB);
        timmingP.add(autoL);
        contentPane.add(questionP);
        questionP.setLayout(null);
        questionP.add(questionLinkP);

        latexQuestionLinkB = new JButton((Icon) null);
        latexQuestionLinkB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("LatexEditButton.png")).getImage()
                .getScaledInstance(30, 13, Image.SCALE_SMOOTH)))));
        latexQuestionLinkB.setBounds(201, 0, 38, 22);
        latexQuestionLinkB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        questionLinkP.add(latexQuestionLinkB);

        questionP.add(questionImageP);
        questionImageP.setLayout(null);
        questionImageP.add(questionSnapshotB);
        questionImageP.add(questionImageUploadB);
        questionImageP.add(deleteQuestionImageB);
        questionP.add(questionImageL);
        questionP.add(questionModeP);
        questionModeP.setLayout(null);

        normalModeQR = new JRadioButton();
        normalModeQR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        normalModeQR.setBounds(6, 5, 18, 15);
        normalModeQR.setSelected(true);
        questionModeP.add(normalModeQR);

        normalModeQL = new JLabel(new ImageIcon(((new ImageIcon(ImageUtil.getImage("NormalModeButton.png")).getImage()
                .getScaledInstance(18, 15, Image.SCALE_SMOOTH)))));
        normalModeQL.setBounds(30, 5, 36, 15);
        questionModeP.add(normalModeQL);

        latexModeQR = new JRadioButton();
        latexModeQR.setBounds(6, 25, 18, 15);
        latexModeQR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        questionModeP.add(latexModeQR);

        latexModeQL = new JLabel(new ImageIcon(((new ImageIcon(ImageUtil.getImage("LatexButton.png")).getImage()
                .getScaledInstance(30, 15, Image.SCALE_SMOOTH)))));
        latexModeQL.setBounds(30, 25, 44, 15);
        ButtonGroup group1 = new ButtonGroup();
        group1.add(normalModeQR);
        group1.add(latexModeQR);

        questionModeP.add(latexModeQL);
        questionP.add(numberP);

        contentPane.add(answerErrorL);
        contentPane.add(navigationalP);
        contentPane.add(choiceP);
        choiceP.setLayout(null);
        choiceP.add(correctB);
        choiceP.add(wrongB);
        choiceP.add(stopB);
        contentPane.add(cardModifyP);
        contentPane.add(questionErrorL);
        contentPane.add(answerP);
        answerP.setLayout(null);
        answerP.add(answerLinkP);

        latexAnswerB = new JToggleButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("LatexButton.png")).getImage()
                .getScaledInstance(30, 13, Image.SCALE_SMOOTH)))));
        //latexAnswerB.setToolTipText("Turn on to use Latex");
        latexAnswerB.setBounds(164, 0, 38, 22);
        latexAnswerB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        answerLinkP.add(latexAnswerB);

        latexAnswerLinkB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("LatexEditButton.png")).getImage()
                .getScaledInstance(30, 13, Image.SCALE_SMOOTH)))));
        latexAnswerLinkB.setBounds(202, 0, 38, 22);
        latexAnswerLinkB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        answerLinkP.add(latexAnswerLinkB);
        answerP.add(answerImageP);
        answerImageP.setLayout(null);
        answerImageP.add(answerSnapshotB);
        answerImageP.add(answerImageUploadB);
        answerImageP.add(deleteAnswerImageB);
        answerP.add(answerImageL);
        answerP.add(answerModeP);

        answerDefaultS = new JScrollPane();
        answerDefaultS.setBounds(2, 2, 457, 239);
        answerDefaultT = new JTextArea();
        answerDefaultT.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
            }
        });
        answerDefaultT.addFocusListener(new FocusListener() {
            @Override
            public void focusLost(FocusEvent e) {
            }

            @Override
            public void focusGained(FocusEvent e) {
            }
        });
        answerDefaultT.setFont(new Font("SansSerif", Font.PLAIN, 15));
        answerDefaultT.setForeground(Color.BLACK);
        answerDefaultT.setBackground(Util.color);
        //answerDefaultT.setToolTipText("answer");
        answerDefaultT.setEditable(false);
        answerDefaultT.setLineWrap(true);
        answerDefaultT.setWrapStyleWord(true);
        answerDefaultT.requestFocusInWindow();
        answerDefaultS.setViewportView(answerDefaultT);
        answerDefaultS.setBorder(BorderFactory.createEmptyBorder());

        answerTextMultiP = new JPanel();
        answerTextMultiP.setLayout(null);
        answerTextMultiP.setBackground(new Color(232, 232, 232));
        answerTextMultiP.setBounds(6, 6, 469, 251);
        answerP.add(answerTextMultiP);

        answer1T = new JTextField();
        //answer1T.setBackground(Util.color);
        answer1T.setBounds(57, 6, 395, 38);
        answerTextMultiP.add(answer1T);
        answer1T.setColumns(10);

        answer2T = new JTextField();
        //answer2T.setBackground(Util.color);
        answer2T.setColumns(10);
        answer2T.setBounds(57, 56, 395, 38);
        answerTextMultiP.add(answer2T);

        answer3T = new JTextField();
        //answer3T.setBackground(Util.color);
        answer3T.setColumns(10);
        answer3T.setBounds(57, 106, 395, 38);

        answerTextMultiP.add(answer3T);

        answer4T = new JTextField();
        //answer4T.setBackground(Util.color);
        answer4T.setColumns(10);
        answer4T.setBounds(57, 158, 395, 38);

        answerTextMultiP.add(answer4T);

        answer5T = new JTextField();
        answer5T.setFocusTraversalKeysEnabled(false);
        answer5T.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent e) {
            }
        });
        //answer5T.setBackground(Util.color);
        answer5T.setColumns(10);
        answer5T.setBounds(57, 208, 395, 38);

        answerTextMultiP.add(answer5T);

        answer1P = new JPanel();
        answer1P.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        answer1P.setBounds(6, 6, 39, 36);
        answer1P.setBackground(Util.color);
        answerTextMultiP.add(answer1P);
        answer1P.setLayout(null);
        answer1C = new JCheckBox(new ImageIcon());
        answer1C.setBackground(Util.color);
        answer1C.setBounds(1, 1, 35, 33);

        answer1C.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (answer1C.isSelected()) {
                    answer1C.setIcon(new ImageIcon(((new ImageIcon(ImageUtil.getImage("RightAnswerButton.png")).getImage()
                            .getScaledInstance(30, 25, Image.SCALE_SMOOTH)))));
                } else {
                    answer1C.setIcon(new ImageIcon());
                }
            }
        });
        answer1P.add(answer1C);

        answer2P = new JPanel();
        answer2P.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        answer2P.setLayout(null);
        answer2P.setBounds(6, 56, 39, 36);
        answer2P.setBackground(Util.color);
        answerTextMultiP.add(answer2P);

        answer2C = new JCheckBox(new ImageIcon());
        answer2C.setBackground(Util.color);
        answer2C.setBounds(1, 1, 35, 33);
        answer2C.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (answer2C.isSelected()) {
                    answer2C.setIcon(new ImageIcon(((new ImageIcon(ImageUtil.getImage("RightAnswerButton.png")).getImage()
                            .getScaledInstance(30, 25, Image.SCALE_SMOOTH)))));
                } else {
                    answer2C.setIcon(new ImageIcon());
                }
            }
        });
        answer2C.setBorder(new LineBorder(new Color(0, 0, 0)));
        answer2P.add(answer2C);
        answer2P.setLayout(null);

        answer3P = new JPanel();
        answer3P.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        answer3P.setBounds(6, 106, 39, 36);
        answer3P.setBackground(Util.color);
        answerTextMultiP.add(answer3P);
        answer3P.setLayout(null);

        answer3C = new JCheckBox(new ImageIcon());
        answer3C.setBounds(1, 1, 35, 33);
        answer3C.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (answer3C.isSelected()) {
                    answer3C.setIcon(new ImageIcon(((new ImageIcon(ImageUtil.getImage("RightAnswerButton.png")).getImage()
                            .getScaledInstance(30, 25, Image.SCALE_SMOOTH)))));
                } else {
                    answer3C.setIcon(new ImageIcon());
                }
            }
        });
        answer3C.setBorder(new LineBorder(new Color(0, 0, 0)));
        answer3P.add(answer3C);
        answer3P.setLayout(null);

        answer4P = new JPanel();
        answer4P.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        answer4P.setBounds(6, 160, 39, 36);
        answer4P.setBackground(Util.color);
        answerTextMultiP.add(answer4P);
        answer4P.setLayout(null);

        answer4C = new JCheckBox(new ImageIcon());
        answer4C.setBounds(1, 1, 35, 33);
        answer4C.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (answer4C.isSelected()) {
                    answer4C.setIcon(new ImageIcon(((new ImageIcon(ImageUtil.getImage("RightAnswerButton.png")).getImage()
                            .getScaledInstance(30, 25, Image.SCALE_SMOOTH)))));
                } else {
                    answer4C.setIcon(new ImageIcon());
                }
            }
        });
        answer4C.setBorder(new LineBorder(new Color(0, 0, 0)));
        answer4P.add(answer4C);

        answer5P = new JPanel();
        answer5P.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        answer5P.setBounds(6, 208, 39, 36);
        answer5P.setBackground(Util.color);
        answerTextMultiP.add(answer5P);
        answer5P.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        answer5C = new JCheckBox(new ImageIcon());
        answer5C.setBounds(1, 1, 35, 33);

        answer5C.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (answer5C.isSelected()) {
                    answer5C.setIcon(new ImageIcon(((new ImageIcon(ImageUtil.getImage("RightAnswerButton.png")).getImage()
                            .getScaledInstance(30, 25, Image.SCALE_SMOOTH)))));
                } else {
                    answer5C.setIcon(new ImageIcon());
                }
            }
        });
        answer5C.setBorder(new LineBorder(new Color(0, 0, 0)));
        answer5P.add(answer5C);
        answer5P.setLayout(null);

        contentPane.add(actionL);

        saveP = new JPanel();
        saveP.setBounds(690, 644, 170, 45);
        saveP.setBackground(Util.color);
        contentPane.add(saveP);

        saveB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("SaveButton.png")).getImage()
                .getScaledInstance(40, 15, Image.SCALE_SMOOTH)))));
        saveB.addKeyListener(new KeyAdapter() {
        });
        saveB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        saveB.addFocusListener(new FocusListener() {
            @Override
            public void focusLost(FocusEvent e) {
            }

            @Override
            public void focusGained(FocusEvent e) {
                answerLatexT1.setText(answerLatexT1.getText().trim());
                answerDefaultT.setText(answerDefaultT.getText().trim());
            }
        });
        //saveB.setBorder(new RoundedBorder());

        cancelB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("CancelButton.png")).getImage()
                .getScaledInstance(40, 15, Image.SCALE_SMOOTH)))));
        cancelB.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
            }
        });
        //cancelB.setBorder(new RoundedBorder());
        cancelB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        GroupLayout gl_saveP = new GroupLayout(saveP);
        gl_saveP.setHorizontalGroup(
                gl_saveP.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_saveP.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(saveB, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addComponent(cancelB, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(16, Short.MAX_VALUE))
        );
        gl_saveP.setVerticalGroup(
                gl_saveP.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_saveP.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(gl_saveP.createParallelGroup(Alignment.LEADING)
                                .addComponent(cancelB, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(saveB, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                        .addGap(9))
        );
        saveP.setLayout(gl_saveP);
        timer = new Timer(5000, new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                timer.stop();
            }
        });
    }

}

class DashedBorder extends AbstractBorder {

    @Override
    public void paintBorder(Component comp, Graphics g, int x, int y, int w, int h) {
        Graphics2D gg = (Graphics2D) g;
        gg.setColor(Color.GRAY);
        gg.setStroke(new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{5}, 0));
        gg.drawRect(x, y, w - 1, h - 1);
    }
}
