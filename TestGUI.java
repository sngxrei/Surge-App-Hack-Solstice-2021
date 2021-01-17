import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;



public class TestGUI extends JFrame {
    private JPanel mainPanel;
    private JButton physicalButton;
    private JButton emotionalButton;
    private JButton mentalButton;
    private JButton giveMeASurgeButton;
    private JLabel description;
    private JPanel textPanel;
    private JCheckBox cb0,cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9;
    private JCheckBox[] array = {cb0,cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9};
    ArrayList<String> pList = new ArrayList<String>();
    ArrayList<String> eList = new ArrayList<String>();
    ArrayList<String> mList = new ArrayList<String>();
    ArrayList<Boolean> pChecked = new ArrayList<Boolean>();
    ArrayList<Boolean> eChecked = new ArrayList<Boolean>();
    ArrayList<Boolean> mChecked = new ArrayList<Boolean>();

    private JTextField textField1;
    private JButton addGoalButton;
    private JButton logProgressButton;
    private JLabel instructions;
    private String goal;
    private int pIndex = 0, eIndex = 0, mIndex = 0;
    private boolean phys = false, emot = false, ment = false;



    public TestGUI(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        textField1.setVisible(false);
        addGoalButton.setVisible(false);

        /*for (int i = 0; i < array.length; i++) {
            array[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (phys) {
                        System.out.println("chek p");
                        pChecked.set(true);
                    }
                    if (emot) {
                        System.out.println("chek e");
                    }
                }
            });
        }*/
        array[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (phys && !pChecked.get(0))
                    pChecked.set(0, true);
                else if (phys && pChecked.get(0))
                    pChecked.set(0, false);

                if (emot && !eChecked.get(0))
                    eChecked.set(0, true);
                else if (emot && eChecked.get(0))
                    eChecked.set(0, false);

                if (ment && !mChecked.get(0))
                    mChecked.set(0, true);
                else if (ment && mChecked.get(0))
                    mChecked.set(0, false);

            }
        });
        array[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (phys && !pChecked.get(1))
                    pChecked.set(1, true);
                else if (phys && pChecked.get(1))
                    pChecked.set(1, false);

                if (emot && !eChecked.get(1))
                    eChecked.set(1, true);
                else if (emot && eChecked.get(1))
                    eChecked.set(1, false);

                if (ment && !mChecked.get(1))
                    mChecked.set(1, true);
                else if (ment && mChecked.get(1))
                    mChecked.set(1, false);
            }
        });
        array[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (phys && !pChecked.get(2))
                    pChecked.set(2, true);
                else if (phys && pChecked.get(2))
                    pChecked.set(2, false);

                if (emot && !eChecked.get(2))
                    eChecked.set(2, true);
                else if (emot && eChecked.get(2))
                    eChecked.set(2, false);

                if (ment && !mChecked.get(2))
                    mChecked.set(2, true);
                else if (ment && mChecked.get(2))
                    mChecked.set(2, false);
            }
        });
        array[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (phys && !pChecked.get(3))
                    pChecked.set(3, true);
                else if (phys && pChecked.get(3))
                    pChecked.set(3, false);

                if (emot && !eChecked.get(3))
                    eChecked.set(3, true);
                else if (emot && eChecked.get(3))
                    eChecked.set(3, false);

                if (ment && !mChecked.get(3))
                    mChecked.set(3, true);
                else if (ment && mChecked.get(3))
                    mChecked.set(3, false);
            }
        });
        array[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (phys && !pChecked.get(4))
                    pChecked.set(4, true);
                else if (phys && pChecked.get(4))
                    pChecked.set(4, false);

                if (emot && !eChecked.get(4))
                    eChecked.set(4, true);
                else if (emot && eChecked.get(1))
                    eChecked.set(4, false);

                if (ment && !mChecked.get(4))
                    mChecked.set(4, true);
                else if (ment && mChecked.get(4))
                    mChecked.set(4, false);
            }
        });
        array[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (phys && !pChecked.get(5))
                    pChecked.set(5, true);
                else if (phys && pChecked.get(5))
                    pChecked.set(5, false);

                if (emot && !eChecked.get(5))
                    eChecked.set(5, true);
                else if (emot && eChecked.get(5))
                    eChecked.set(5, false);

                if (ment && !mChecked.get(5))
                    mChecked.set(5, true);
                else if (ment && mChecked.get(5))
                    mChecked.set(5, false);
            }
        });
        array[6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (phys && !pChecked.get(6))
                    pChecked.set(6, true);
                else if (phys && pChecked.get(6))
                    pChecked.set(6, false);

                if (emot && !eChecked.get(6))
                    eChecked.set(6, true);
                else if (emot && eChecked.get(6))
                    eChecked.set(6, false);

                if (ment && !mChecked.get(6))
                    mChecked.set(6, true);
                else if (ment && mChecked.get(6))
                    mChecked.set(6, false);
            }
        });
        array[7].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (phys && !pChecked.get(7))
                    pChecked.set(7, true);
                else if (phys && pChecked.get(7))
                    pChecked.set(7, false);

                if (emot && !eChecked.get(7))
                    eChecked.set(7, true);
                else if (emot && eChecked.get(7))
                    eChecked.set(7, false);

                if (ment && !mChecked.get(7))
                    mChecked.set(7, true);
                else if (ment && mChecked.get(7))
                    mChecked.set(7, false);
            }
        });
        array[8].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (phys && !pChecked.get(8))
                    pChecked.set(8, true);
                else if (phys && pChecked.get(8))
                    pChecked.set(8, false);

                if (emot && !eChecked.get(8))
                    eChecked.set(8, true);
                else if (emot && eChecked.get(8))
                    eChecked.set(8, false);

                if (ment && !mChecked.get(8))
                    mChecked.set(8, true);
                else if (ment && mChecked.get(8))
                    mChecked.set(8, false);
            }
        });
        array[9].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (phys && !pChecked.get(9))
                    pChecked.set(9, true);
                else if (phys && pChecked.get(9))
                    pChecked.set(9, false);

                if (emot && !eChecked.get(9))
                    eChecked.set(9, true);
                else if (emot && eChecked.get(9))
                    eChecked.set(9, false);

                if (ment && !mChecked.get(9))
                    mChecked.set(9, true);
                else if (ment && mChecked.get(9))
                    mChecked.set(9, false);
            }
        });

        addGoalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*for (int i = 0; i < pIndex; i++) {
                    if (array[i].isSelected()) {
                        pChecked.set(i, true);
                        System.out.println("chek p");
                    }
                }*/

                if (!textField1.getText().isEmpty()) {
                    if (phys) {
                        array[pIndex].setVisible(true);
                        goal = textField1.getText();
                        pList.add(goal);
                        pChecked.add(false);
                        array[pIndex].setText(goal);
                        textField1.setText("");
                        pIndex++;
                    }
                    if (emot) {
                        array[eIndex].setVisible(true);
                        goal = textField1.getText();
                        eList.add(goal);
                        eChecked.add(false);
                        array[eIndex].setText(goal);
                        textField1.setText("");
                        eIndex++;
                    }
                    if (ment) {
                        array[mIndex].setVisible(true);
                        goal = textField1.getText();
                        mList.add(goal);
                        mChecked.add(false);
                        array[mIndex].setText(goal);
                        textField1.setText("");
                        mIndex++;
                    }
                }
            }
        });

        physicalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setVisible(true);
                addGoalButton.setVisible(true);
                phys = true;
                emot = false;
                ment = false;


                for (int i = 0; i < eIndex; i++) {
                    array[i].setVisible(false);
                }
                for (int i = 0; i < mIndex; i++) {
                    array[i].setVisible(false);
                }
                for (int i = 0; i < pIndex; i++) {
                    array[i].setVisible(true);
                    array[i].setText(pList.get(i));
                    array[i].setSelected(pChecked.get(i));
                }

                description.setText("<html>"+ "let's get physical ;)" + "</html>");
            }
        });

        emotionalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*for (int i = 0; i < eIndex; i++) {
                    if (emot && array[i].isSelected()) {
                        eChecked.set(i, true);
                        System.out.println("chek e");
                    }
                }*/
                textField1.setVisible(true);
                addGoalButton.setVisible(true);
                phys = false;
                emot = true;
                ment = false;


                for (int i = 0; i < pIndex; i++) {
                    array[i].setVisible(false);
                }
                for (int i = 0; i < mIndex; i++) {
                    array[i].setVisible(false);
                }
                for (int i = 0; i < eIndex; i++) {
                    array[i].setVisible(true);
                    array[i].setText(eList.get(i));
                    array[i].setSelected(eChecked.get(i));
                }

                description.setText("<html>"+ "always keep in touch with your emotions." + "</html>");
            }
        });

        mentalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setVisible(true);
                addGoalButton.setVisible(true);
                phys = false;
                emot = false;
                ment = true;
                for (int i = 0; i < pIndex; i++) {
                    array[i].setVisible(false);
                }
                for (int i = 0; i < eIndex; i++) {
                    array[i].setVisible(false);
                }
                for (int i = 0; i < mIndex; i++) {
                    array[i].setVisible(true);
                    array[i].setText(mList.get(i));
                    array[i].setSelected(mChecked.get(i));

                }

                description.setText("<html>"+ "make your mental health a priority!" + "</html>");
            }
        });

        giveMeASurgeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setVisible(false);
                addGoalButton.setVisible(false);
                for (int i = 0; i < eIndex; i++) {
                    array[i].setVisible(false);
                }
                for (int i = 0; i < mIndex; i++) {
                    array[i].setVisible(false);
                }
                for (int i = 0; i < pIndex; i++) {
                    array[i].setVisible(false);
                    array[i].setText(pList.get(i));
                }

                Random randGen = new Random();
                int random = randGen.nextInt(10) + 1;

                if (phys) {

                    if (random == 1) {
                        description.setText("<html>"+ "Stand up and touch your toes." + "</html>");
                    }
                    if (random == 2) {
                        description.setText("<html>"+ "Stand up and take a walk around the block. Come back refreshed and ready to work." + "</html>");
                    }
                    if (random == 3) {
                        description.setText("<html>"+ "Stand up and do 10 windmills." + "</html>");
                    }
                    if (random == 4) {
                        description.setText("<html>"+ "Lay flat on the floor on your back. Relax all the tension in your muscles. Remain this way for 2 minutes." + "</html>");
                    }
                    if (random == 5) {
                        description.setText("<html>"+ "Do 20 jumping jacks." + "</html>");
                    }
                    if (random == 6) {
                        description.setText("<html>"+ "Do a 1 minute wall sit." + "</html>");
                    }
                    if (random == 7) {
                        description.setText("<html>"+ "Do 2 push-ups." + "</html>");
                    }
                    if (random == 8) {
                        description.setText("<html>"+ "Do 2 quad stretches on each leg, alternating sides." + "</html>");
                    }
                    if (random == 9) {
                        description.setText("<html>"+ "Do tabletop position on the floor for 15 seconds. Then, relax your body into cat and cow positions alternately." + "</html>");
                    }
                    if (random == 10) {
                        description.setText("<html>"+ "Release the tension from your neck and jaw." + "</html>");
                    }
                }
                if (ment) {
                    if (random == 1) {
                        description.setText("<html>"+ "Close your eyes and alternate touching your nose with your left and right index fingers." + "</html>");
                    }
                    if (random == 2) {
                        description.setText("<html>"+ "Stop for a moment and imagine your ideal day." + "</html>");
                    }
                    if (random == 3) {
                        description.setText("<html>"+ "Pat your head and rub your belly at the same time." + "</html>");
                    }
                    if (random == 4) {
                        description.setText("<html>"+ "Do a crossword puzzle." + "</html>");
                    }
                    if (random == 5) {
                        description.setText("<html>"+ "Pick 3 things you are grateful for right now." + "</html>");
                    }
                    if (random == 6) {
                        description.setText("<html>"+ "Think of a joke." + "</html>");
                    }
                    if (random == 7) {
                        description.setText("<html>"+ "Read an interesting article." + "</html>");
                    }
                    if (random == 8) {
                        description.setText("<html>"+ "Imagine the person you want to be. Pick one way to move yourself closer to that goal today." + "</html>");
                    }
                    if (random == 9) {
                        description.setText("<html>"+ "Look up a riddle and try to solve it." + "</html>");
                    }
                    if (random == 10) {
                        description.setText("<html>"+ "Imagine a scene from your favorite movie." + "</html>");
                    }
                }

                if (emot) {
                    if (random == 1) {
                        description.setText("<html>"+ "One kind word can change someone's entire day." + "</html>");
                    }
                    if (random == 2) {
                        description.setText("<html>"+ "Judge nothing, you will be happy. Forgive everything, you will be happier. Love everything, you will be happiest. - Sri Chinmoy" + "</html>");
                    }
                    if (random == 3) {
                        description.setText("<html>"+ "Difficult roads often lead to beautiful destinations." + "</html>");
                    }
                    if (random == 4) {
                        description.setText("<html>"+ "Don't be afraid to fail...be afraid not to try." + "</html>");
                    }
                    if (random == 5) {
                        description.setText("<html>"+ "Your only job in life is to be who you truly are." + "</html>");
                    }
                    if (random == 6) {
                        description.setText("<html>"+ "When you can't adjust the direction of the wind...adjust your sails. - H. Jackson Brown Jr." + "</html>");
                    }
                    if (random == 7) {
                        description.setText("<html>"+ "You can't change what happens to you, but you can change how you think about it." + "</html>");
                    }
                    if (random == 8) {
                        description.setText("<html>"+ "Success is not final, failure is not fatal: it is the courage to continue that counts. - Winston Churchill" + "</html>");
                    }
                    if (random == 9) {
                        description.setText("<html>"+ "The greatest test of courage on earth is to bear defeat without losing heart. - Robert Green Ingersoll" + "</html>");
                    }
                    if (random == 10) {
                        description.setText("<html>"+ "The hard work puts you where the good luck can find you." + "</html>");
                    }
                }
            }

        });

        logProgressButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setVisible(false);
                addGoalButton.setVisible(false);
                for (int i = 0; i < eIndex; i++) {
                    array[i].setVisible(false);
                }
                for (int i = 0; i < mIndex; i++) {
                    array[i].setVisible(false);
                }
                for (int i = 0; i < pIndex; i++) {
                    array[i].setVisible(false);
                    array[i].setText(pList.get(i));
                }
                description.setText("<html>"+ "congrats! you're making progress!" + "</html>");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new TestGUI("Hack Solstice 2021: Surge App");
        frame.setVisible(true);
    }
}
