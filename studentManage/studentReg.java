package studentManage;

import javax.swing.JFrame;
import javax.swing.*;

public class studentReg extends JFrame {
	
	public int xaxis =10, yaxis =10;
	
	JLabel name,rollno,Branch,year,gender,birthDate,address,email,city,state,pin,fatherName;
	
	JTextField namet,rollnot,fatherNamet,pint,addresst,emailt,birthDatet;
	
	JRadioButton male,female;
	ButtonGroup gen;
	
	JComboBox yearc,branchc;
	public studentReg(){
		listOfObject list =new listOfObject();
		int yax=0;
		/**
		 * Placing label on the Screen
		 */
		yax =yaxis +40;
		rollno = new JLabel("Roll Number");
		rollno.setBounds(10, yax, 200, 30);
		add(rollno);
		
		rollnot =new JTextField();
		rollnot.setBounds(130, yax, 200, 30);
		add(rollnot);
//-----------------------------------------------------------------------------		
		yax =yax+40;
		Branch =new JLabel("Branch");
		Branch.setBounds(10, yax, 60, 30);
		add(Branch);
		
		branchc = new JComboBox(list.branch);
		branchc.setBounds(130,yax,170,30);
		add(branchc);
//-----------------------------------------------------------------------------		
		yax =yax +40;
		name = new JLabel("Name");
		name.setBounds(10, (yax), 60, 30);
		add(name);
		
		namet =new JTextField();
		namet.setBounds(130, yax, 200, 30);
		add(namet);
//-----------------------------------------------------------------------------		
		yax =yax +40;
		fatherName = new JLabel("Father's Name");
		fatherName.setBounds(10, (yax), 100, 30);
		add(fatherName);
		
		fatherNamet =new JTextField();
		fatherNamet.setBounds(130, yax, 200, 30);
		add(fatherNamet);
//-----------------------------------------------------------------------------
		yax =yax +40;
		gender = new JLabel("Gender");
		gender.setBounds(10, (yax), 60, 30);
		add(gender);
		
		male = new JRadioButton("Male");
		male.setBounds(130, yax, 60, 30);
		add(male);
		
		female = new JRadioButton("Female");
		female.setBounds(190, yax, 90, 30);
		add(female);
		
		gen =new ButtonGroup();
		gen.add(male);
		gen.add(female);
//-----------------------------------------------------------------------------		
		
		yax =yax +40;
		birthDate = new JLabel("Birth Date(dd/mm/yy)");
		birthDate.setBounds(10, (yax), 130, 30);
		add(birthDate);
		
		birthDatet =new JTextField();
		birthDatet.setBounds(150, yax, 200, 30);
		add(birthDatet);
//-----------------------------------------------------------------------------
		yax =yax +40;
		email = new JLabel("E-Mail");
		email.setBounds(10, (yax), 60, 30);
		add(email);
		
		emailt =new JTextField();
		emailt.setBounds(130, yax, 200, 30);
		add(emailt);
//-----------------------------------------------------------------------------		
		yax =yax +40;
		year = new JLabel("Year");
		year.setBounds(10, (yax), 60, 30);
		add(year);
		
		yearc = new JComboBox(list.year);
		yearc.setBounds(130,yax,100,30);
		add(yearc);
//-----------------------------------------------------------------------------		
		yax =yax +40;
		address = new JLabel("Address");
		address.setBounds(10, (yax), 60, 30);
		add(address);
		
		addresst =new JTextField();
		addresst.setBounds(130, yax, 200, 30);
		add(addresst);
//-----------------------------------------------------------------------------		
		yax =yax +40;
		city = new JLabel("City");
		city.setBounds(10, (yax), 60, 30);
		add(city);
		
//-----------------------------------------------------------------------------	
		yax =yax +40;
		state= new JLabel("State");
		state.setBounds(10, (yax), 60, 30);
		add(state);
//-----------------------------------------------------------------------------
		yax =yax +40;
		pin = new JLabel("Pin");
		pin.setBounds(10, (yax), 60, 30);
		add(pin);
		
		pint =new JTextField();
		pint.setBounds(130, yax, 100, 30);
		add(pint);
		/**
		 * Detail about the Frame and
		 */
		setTitle("Student-Registration");
		setLayout(null);
		setBounds(200,10,800,700);
		setVisible(true);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

}
