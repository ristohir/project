package Quiz;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import java.awt.Font;

public class QuizGUI extends JFrame {
	// answer class privates
	private Answer answer;
	private Answer2 answer2;
	private Answer3 answer3;
	private Answer4 answer4;
	private Answer5 answer5;
	private Answer6 answer6;
	// radiobuttongroup so can choose only on answer
	private final ButtonGroup buttonGroup = new ButtonGroup();
	// textfields for answers
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	// radiobuttongroup so can choose only on answer
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	// answer wrong/correct textfields
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	
	public QuizGUI() {
// JFrame configuration
		setAlwaysOnTop(true);
		setBounds(0,0,700,1000); 
		setLocationRelativeTo(null); 
		getContentPane().setLayout(null);
		

		// 1. question
		JLabel lblHowMany = new JLabel("1. How many pairs of ribs would the normal human have?");
		lblHowMany.setBounds(31, 11, 406, 20);
		getContentPane().add(lblHowMany);
		// textfield showing "well done" if correct answer or shows correct answer if wrong answer
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(389, 33, 272, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		// setting up radiobuttons and answer text
		JRadioButton radioButton = new JRadioButton("12");
		buttonGroup.add(radioButton);
		radioButton.setBounds(31, 32, 54, 23);
		getContentPane().add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("34");
		buttonGroup.add(radioButton_1);
		radioButton_1.setBounds(87, 32, 54, 23);
		getContentPane().add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("3");
		buttonGroup.add(radioButton_2);
		radioButton_2.setBounds(142, 32, 54, 23);
		getContentPane().add(radioButton_2);
		// submit button which checks the answer, disables answering, gives message "correct"or"false", adds text to answer checking textfield
		JButton button = new JButton("submit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean button1 = radioButton.isSelected();
				boolean button2 = radioButton_1.isSelected();
				boolean button3 = radioButton_2.isSelected();
				if(button1==true) {	JOptionPane.showMessageDialog(rootPane, "Correct"); textField_3.setText("Well done!");}else if(button2==true||button3==true) {	JOptionPane.showMessageDialog(rootPane, "False");textField_3.setText("Answer: 12");}else {JOptionPane.showMessageDialog(rootPane, "False");textField_3.setText("Answer: 12");}
				radioButton.setEnabled(false);
				radioButton_1.setEnabled(false);
				radioButton_2.setEnabled(false);
			}
		});
		button.setBounds(215, 29, 115, 29);
		getContentPane().add(button);

		// 2. question
		JLabel lblWhoAre = new JLabel("2. Who are the founders of apple?");
		lblWhoAre.setBounds(31, 67, 406, 20);
		getContentPane().add(lblWhoAre);
		// textfield showing "well done" if correct answer or shows correct answer if wrong answer
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(389, 90, 272, 20);
		getContentPane().add(textField_4);
		// setting up checkboxes and answer text
		JCheckBox chckbxSteveJobs = new JCheckBox("Steve Jobs");
		chckbxSteveJobs.setBounds(31, 89, 115, 23);
		getContentPane().add(chckbxSteveJobs);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Steve Wozniak");
		chckbxNewCheckBox.setBounds(163, 89, 125, 23);
		getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxBillGates = new JCheckBox("Bill Gates");
		chckbxBillGates.setBounds(290, 89, 125, 23);
		getContentPane().add(chckbxBillGates);
		// submit button which checks the answer, disables answering, gives message "correct"or"false", adds text to answer checking textfield
		JButton button_1 = new JButton("submit");
		button_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			boolean check1 = chckbxSteveJobs.isSelected();
			boolean check2 = chckbxNewCheckBox.isSelected();
			boolean check3 = chckbxBillGates.isSelected();
			if(check1==true&&check2==true) {	JOptionPane.showMessageDialog(rootPane, "Correct"); textField_4.setText("Well done!");}else if(check3==true) {	JOptionPane.showMessageDialog(rootPane, "False");textField_4.setText("Answer: Steve Jobs AND Steve Wozniak");}
			else{JOptionPane.showMessageDialog(rootPane, "False");textField_4.setText("Answer: Steve Jobs AND Steve Wozniak");}
			chckbxSteveJobs.setEnabled(false);
			chckbxNewCheckBox.setEnabled(false);
			chckbxBillGates.setEnabled(false);
		}
	});
		button_1.setBounds(31, 115, 115, 29);
		getContentPane().add(button_1);
		
		// 3. question
		JLabel lbl = new JLabel("3. What was the name of Sherlock Holmes Housekeeper?");
		lbl.setBounds(33, 155, 404, 20);
		getContentPane().add(lbl);
		// textfield showing "well done" if correct answer or shows correct answer if wrong answer
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(389, 178, 272, 20);
		getContentPane().add(textField_5);
		// setting up drop-downbox and answer text
		JComboBox<String> cmb = new JComboBox<String>();
		cmb.setBounds(31, 175, 146, 26);
		getContentPane().add(cmb);
		cmb.addItem("Mrs Penny");
		cmb.addItem("Mrs Hudson");
		cmb.addItem("Mrs Watson");
		// submit button which checks the answer, disables answering, gives message "correct"or"false", adds text to answer checking textfield
		JButton btnSayHello = new JButton("submit");
		btnSayHello.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				answer = new Answer(cmb.getSelectedItem().toString());
				JOptionPane.showMessageDialog(rootPane, answer.greet());			
				if(answer.greet()=="Correct") {textField_5.setText("Well done!");}else if(answer.greet()!="Correct"){textField_5.setText("Answer: Mrs Hudson");}
				cmb.setEnabled(false);
			}
		});
		btnSayHello.setBounds(31, 212, 115, 29);
		getContentPane().add(btnSayHello);
		
		// 4. question
		JLabel lblWhichActress = new JLabel("4. Which actress played the part of Sybil Fawlty in Television's Fawlty Towers?");
		lblWhichActress.setBounds(31, 251, 525, 20);
		getContentPane().add(lblWhichActress);
		// textfield showing "well done" if correct answer or shows correct answer if wrong answer
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(389, 275, 272, 20);
		getContentPane().add(textField_6);
		// setting up empty textfield for answer
		textField = new JTextField();
		textField.setBounds(31, 271, 175, 28);
		getContentPane().add(textField);
		textField.setColumns(10);
		// submit button which checks the answer, disables answering, gives message "correct"or"false", adds text to answer checking textfield
		JButton button_2 = new JButton("submit");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				answer2 = new Answer2(textField.getText());
				JOptionPane.showMessageDialog(rootPane, answer2.greet());
				if(answer2.greet()=="Correct") {textField_6.setText("Well done!");}else if(answer2.greet()!="Correct"){textField_6.setText("Answer: Prunella Scale");}
				textField.setEnabled(false);
			}
		});
		button_2.setBounds(215, 270, 115, 29);
		getContentPane().add(button_2);
		
		// 5. question
		JLabel lblWhatWas = new JLabel("5. What was the title of Beethoven's only opera?");
		lblWhatWas.setBounds(31, 305, 406, 20);
		getContentPane().add(lblWhatWas);
		// textfield showing "well done" if correct answer or shows correct answer if wrong answer
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(389, 328, 272, 20);
		getContentPane().add(textField_7);
		// setting up empty textfield for answer
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(31, 324, 175, 28);
		getContentPane().add(textField_1);
		// submit button which checks the answer, disables answering, gives message "correct"or"false", adds text to answer checking textfield
		JButton button_3 = new JButton("submit");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				answer3 = new Answer3(textField_1.getText());
				JOptionPane.showMessageDialog(rootPane, answer3.greet());
				if(answer3.greet()=="Correct") {textField_7.setText("Well done!");}else if(answer3.greet()!="Correct"){textField_7.setText("Answer: Fidelio");}
				textField_1.setEnabled(false);
			}
		});
		button_3.setBounds(215, 324, 115, 29);
		getContentPane().add(button_3);
		
		// 6. question
		JLabel lblWhichRiver = new JLabel("6. Which river flows through the city of Dublin?");
		lblWhichRiver.setBounds(31, 363, 406, 20);
		getContentPane().add(lblWhichRiver);
		// textfield showing "well done" if correct answer or shows correct answer if wrong answer
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(461, 385, 200, 20);
		getContentPane().add(textField_8);
		// setting up radiobuttons and answer text
		JRadioButton rdbtnMississippi = new JRadioButton("Mississippi");
		buttonGroup_1.add(rdbtnMississippi);
		rdbtnMississippi.setBounds(31, 384, 115, 23);
		getContentPane().add(rdbtnMississippi);
		
		JRadioButton rdbtnTames = new JRadioButton("Tames");
		buttonGroup_1.add(rdbtnTames);
		rdbtnTames.setBounds(157, 384, 86, 23);
		getContentPane().add(rdbtnTames);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Liffey");
		buttonGroup_1.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(249, 384, 63, 23);
		getContentPane().add(rdbtnNewRadioButton);
		// submit button which checks the answer, disables answering, gives message "correct"or"false", adds text to answer checking textfield
		JButton button_4 = new JButton("submit");
		button_4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			boolean button4 = rdbtnMississippi.isSelected();
			boolean button5 = rdbtnTames.isSelected();
			boolean button6 = rdbtnNewRadioButton.isSelected();
			if(button6==true) {	JOptionPane.showMessageDialog(rootPane, "Correct");textField_8.setText("Well done!");}else if(button5==true||button4==true) {	JOptionPane.showMessageDialog(rootPane, "False");textField_8.setText("Answer: Liffey");}else {JOptionPane.showMessageDialog(rootPane, "False");textField_8.setText("Answer: Liffey");}
			rdbtnMississippi.setEnabled(false);
			rdbtnTames.setEnabled(false);
			rdbtnNewRadioButton.setEnabled(false);
		}
	});
		button_4.setBounds(322, 381, 115, 29);
		getContentPane().add(button_4);
		
		// 7. question
		JLabel lblWhoAppeared = new JLabel("7. Who appeared with David McCallum in the title role of the TV series Sapphire and Steel?");
		lblWhoAppeared.setBounds(31, 424, 552, 20);
		getContentPane().add(lblWhoAppeared);
		// textfield showing "well done" if correct answer or shows correct answer if wrong answer
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(389, 449, 272, 20);
		getContentPane().add(textField_9);
		// setting up drop-downbox and answer text
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(31, 446, 146, 26);
		getContentPane().add(comboBox);
		comboBox.addItem("Sandi Toksvig");
		comboBox.addItem("Joanna Lumley");
		comboBox.addItem("Sue Perkins");
		// submit button which checks the answer, disables answering, gives message "correct"or"false", adds text to answer checking textfield
		JButton button_5 = new JButton("submit");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				answer4 = new Answer4(comboBox.getSelectedItem().toString());
				JOptionPane.showMessageDialog(rootPane, answer4.greet());
				if(answer4.greet()=="Correct") {textField_9.setText("Well done!");}else if(answer4.greet()!="Correct"){textField_9.setText("Answer: Joanna Lumley");}
				comboBox.setEnabled(false);
			}
		});
		button_5.setBounds(201, 445, 115, 29);
		getContentPane().add(button_5);
		
		// 8. question
		JLabel lblWhichOf = new JLabel("8. Which of the following are mammals?");
		lblWhichOf.setBounds(31, 476, 444, 20);
		getContentPane().add(lblWhichOf);
		// textfield showing "well done" if correct answer or shows correct answer if wrong answer
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBounds(461, 499, 200, 20);
		getContentPane().add(textField_10);
		// setting up checkboxes and answer text
		JCheckBox chckbxJoannaLumley = new JCheckBox("Dogs");
		chckbxJoannaLumley.setBounds(29, 498, 81, 23);
		getContentPane().add(chckbxJoannaLumley);
		
		JCheckBox chckbxSandiToksvig = new JCheckBox("Tigers");
		chckbxSandiToksvig.setBounds(142, 498, 90, 23);
		getContentPane().add(chckbxSandiToksvig);
		
		JCheckBox chckbxSuePerkins = new JCheckBox("Pidgeons");
		chckbxSuePerkins.setBounds(234, 498, 78, 23);
		getContentPane().add(chckbxSuePerkins);
		// submit button which checks the answer, disables answering, gives message "correct"or"false", adds text to answer checking textfield
		JButton button_6 = new JButton("submit");
		button_6.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			boolean check4 = chckbxJoannaLumley.isSelected();
			boolean check5 = chckbxSandiToksvig.isSelected();
			boolean check6 = chckbxSuePerkins.isSelected();
			if(check4==true&&check5==true) {	JOptionPane.showMessageDialog(rootPane, "Correct");textField_10.setText("Well done!");}else if(check6==true) {	JOptionPane.showMessageDialog(rootPane, "False");textField_10.setText("Answer: Dogs AND Tigers");}
			else{JOptionPane.showMessageDialog(rootPane, "False");textField_10.setText("Answer: Dogs AND Tigers");}
			chckbxJoannaLumley.setEnabled(false);
			chckbxSandiToksvig.setEnabled(false);
			chckbxSuePerkins.setEnabled(false);
		}
	});
		button_6.setBounds(322, 495, 115, 29);
		getContentPane().add(button_6);
		
		// 9. question
		JLabel lblInWhichCity = new JLabel("9. In which city is the eiffel tower located?");
		lblInWhichCity.setBounds(31, 529, 444, 20);
		getContentPane().add(lblInWhichCity);
		// textfield showing "well done" if correct answer or shows correct answer if wrong answer
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBounds(389, 554, 272, 20);
		getContentPane().add(textField_11);
		// setting up empty textfield for answer
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(31, 550, 175, 28);
		getContentPane().add(textField_2);
		// submit button which checks the answer, disables answering, gives message "correct"or"false", adds text to answer checking textfield
		JButton button_7 = new JButton("submit");
		button_7.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {

			answer5 = new Answer5(textField_2.getText());
			JOptionPane.showMessageDialog(rootPane, answer5.greet());
			if(answer5.greet()=="Correct") {textField_11.setText("Well done!");}else if(answer5.greet()!="Correct"){textField_11.setText("Answer: Paris");}
			textField_2.setEnabled(false);
		}
	});
		button_7.setBounds(230, 550, 115, 29);
		getContentPane().add(button_7);
		
		// 10. question
		JLabel lblWhoWrote = new JLabel("10. Who wrote the book called 1984?");
		lblWhoWrote.setBounds(31, 590, 444, 20);
		getContentPane().add(lblWhoWrote);
		// textfield showing "well done" if correct answer or shows correct answer if wrong answer
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBounds(389, 613, 272, 20);
		getContentPane().add(textField_12);
		// setting up drop-downbox and answer text
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(31, 610, 146, 26);
		getContentPane().add(comboBox_1);
		comboBox_1.addItem("Aldous Huxley");
		comboBox_1.addItem("George Orwell");
		comboBox_1.addItem("Isaac Asimov");
		// submit button which checks the answer, disables answering, gives message "correct"or"false", adds text to answer checking textfield
		JButton button_8 = new JButton("submit");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				answer6 = new Answer6(comboBox_1.getSelectedItem().toString());
				JOptionPane.showMessageDialog(rootPane, answer6.greet());
				if(answer6.greet()=="Correct") {textField_12.setText("Well done!");}else if(answer6.greet()!="Correct"){textField_12.setText("Answer: George Orwell");}
				comboBox_1.setEnabled(false);
			}
		});
		button_8.setBounds(197, 610, 115, 29);
		getContentPane().add(button_8);
		// results button, checks if answer correct, if correct adds a point, if clicked shows message of how many points
		JButton btnNewButton = new JButton("RESULTS");
		btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			int score=0;
			answer = new Answer(cmb.getSelectedItem().toString());
			answer2 = new Answer2(textField.getText());
			answer3 = new Answer3(textField_1.getText());
			answer4 = new Answer4(comboBox.getSelectedItem().toString());
			answer5 = new Answer5(textField_2.getText());
			answer6 = new Answer6(comboBox_1.getSelectedItem().toString());
			boolean button1 = radioButton.isSelected();
			boolean button6 = rdbtnNewRadioButton.isSelected();
			boolean check1 = chckbxSteveJobs.isSelected();
			boolean check2 = chckbxNewCheckBox.isSelected();
			boolean check4 = chckbxJoannaLumley.isSelected();
			boolean check5 = chckbxSandiToksvig.isSelected();
			if(answer6.greet()=="Correct") {
			score++;}
			if(answer5.greet()=="Correct") {
			score++;}
			if(answer4.greet()=="Correct") {
			score++;}
			if(answer3.greet()=="Correct") {
			score++;}
			if(answer2.greet()=="Correct") {
			score++;}
			if(answer.greet()=="Correct") {
			score++;}
			if(button1==true) {score++;}
			if(check1==true&&check2==true) {score++;}
			if(button6==true) {score++;}
			if(check4==true&&check5==true) {score++;}
			JOptionPane.showMessageDialog(rootPane, "You have "+score +" points");
		}
	});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(501, 649, 160, 58);
		getContentPane().add(btnNewButton);
		



	}
	

	public static void main(String[] args) {
		JFrame frame = new QuizGUI();
		frame.setVisible(true);
	}
}