package gauss;
import java.awt.event.ActionListener;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.*;


public class GAUS {
	//function that outputs the answers when the coefficient of the unknown quantity in the last equation is 0
	public static void atbildesc(int locatx, int locaty, double x,double y, double z,double mainigie[][]) {
		JFrame frame = new JFrame("Atbildes");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	    JLabel labe4_0 = new JLabel();//x value
	    labe4_0.setBounds(60, 45, 200, 30);
	    frame.add(labe4_0);
	    labe4_0.setText(String.format("x = %.4f + %.4f С ", x, -mainigie[0][1]* y - mainigie[0][2]* z));

	    JLabel labe4_1 = new JLabel();//y value
	    labe4_1.setBounds(60, 105, 90, 30);
	    frame.add(labe4_1);
	    labe4_1.setText(String.format("y = %.4f C", y));

	    JLabel labe4_2 = new JLabel();//z value
	    labe4_2.setBounds(60, 165, 70, 30);
	    frame.add(labe4_2);
	    labe4_2.setText(String.format("z = %.4f C", z));

	    frame.setSize(400,280);//Window size
	    frame.setLocation(locatx,locaty);//Window position
	    frame.setLayout(null);
	    frame.setVisible(true);
	}
	//a function that outputs responses
	public static void atbildes(int locatx, int locaty, double x,double y, double z) {
		JFrame frame = new JFrame("Atbildes");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	    JLabel labe4_0 = new JLabel();
        labe4_0.setBounds(60,45,70,30);
        frame.add(labe4_0);
        labe4_0.setText( String.format("x = %.4f ",x));
        JLabel labe4_1 = new JLabel();
        labe4_1.setBounds(60,105,70,30);
        frame.add(labe4_1);
        labe4_1.setText( String.format("y = %.4f ",y));
        JLabel labe4_2 = new JLabel();
        labe4_2.setBounds(60,165,70,30);
        frame.add(labe4_2);
        labe4_2.setText( String.format("z = %.4f ",z));



	    frame.setSize(400,280);
	    frame.setLocation(locatx,locaty);
	    frame.setLayout(null);
	    frame.setVisible(true);
	}

	//a function that outputs equations and comments
	public static void frame1(int locatx, int locaty, double mainigie[][],boolean zim,boolean mainig) {
		JFrame frame = new JFrame("=>");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    JLabel labe2_1 = new JLabel();
	    JLabel labe2_0 = new JLabel();
	    if(zim==true) {							//the sign is haunted { or [

	    	labe2_0.setBounds(0,0,100,200);
	    }
	    else {
	    	labe2_1.setBounds(0,0,100,200);
	    }
        frame.add(labe2_0);
        labe2_0.setText( "{");
        labe2_0.setFont(new Font("Arial", Font.PLAIN, 150));

        frame.add(labe2_1);
        labe2_1.setText( "[");
        labe2_1.setFont(new Font("Arial", Font.PLAIN, 150));
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //column output

        JLabel labe4_0 = new JLabel();						//1.column

        labe4_0.setBounds(60,45,50,30);
        frame.add(labe4_0);
        labe4_0.setText( String.valueOf(mainigie[0][0]));
        JLabel labe4_1 = new JLabel();
        labe4_1.setBounds(60,105,50,30);
        frame.add(labe4_1);
        labe4_1.setText( String.valueOf(mainigie[1][0]));
        JLabel labe4_2 = new JLabel();
        labe4_2.setBounds(60,165,50,30);
        frame.add(labe4_2);
        labe4_2.setText( String.valueOf(mainigie[2][0]));

        JLabel labe4_3 = new JLabel();						//2.column
        labe4_3.setBounds(140,45,50,30);
        frame.add(labe4_3);
        labe4_3.setText( String.valueOf(mainigie[0][1]));
        JLabel labe4_4 = new JLabel();
        labe4_4.setBounds(140,105,50,30);
        frame.add(labe4_4);
        labe4_4.setText( String.valueOf(mainigie[1][1]));
        JLabel labe4_5 = new JLabel();
        labe4_5.setBounds(140,165,50,30);
        frame.add(labe4_5);
        labe4_5.setText( String.valueOf(mainigie[2][1]));

        JLabel labe4_6 = new JLabel();						//3.column
        labe4_6.setBounds(220,45,50,30);
        frame.add(labe4_6);
        labe4_6.setText( String.valueOf(mainigie[0][2]));
        JLabel labe4_7 = new JLabel();
        labe4_7.setBounds(220,105,50,30);
        frame.add(labe4_7);
        labe4_7.setText( String.valueOf(mainigie[1][2]));
        JLabel labe4_8 = new JLabel();
        labe4_8.setBounds(220,165,50,30);
        frame.add(labe4_8);
        labe4_8.setText( String.valueOf(mainigie[2][2]));

        JLabel labe4_9 = new JLabel();						//4.column
        labe4_9.setBounds(340,45,50,30);
        frame.add(labe4_9);
        labe4_9.setText( String.valueOf(mainigie[0][3]));
        JLabel labe4_10 = new JLabel();
        labe4_10.setBounds(340,105,50,30);
        frame.add(labe4_10);
        labe4_10.setText( String.valueOf(mainigie[1][3]));
        JLabel labe4_11 = new JLabel();
        labe4_11.setBounds(340,165,50,30);
        frame.add(labe4_11);
        labe4_11.setText( String.valueOf(mainigie[2][3]));

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //all '=' signs
        JLabel label1_0 = new JLabel();
        label1_0.setBounds(315,150,50,50);
        frame.add(label1_0);
        label1_0.setText("=");
        label1_0.setFont(new Font("Arial", Font.PLAIN, 30));
        JLabel label1_1 = new JLabel();
        label1_1.setBounds(315,90,50,50);
        frame.add(label1_1);
        label1_1.setText("=");
        label1_1.setFont(new Font("Arial", Font.PLAIN, 30));
        JLabel label1_2 = new JLabel();
        label1_2.setBounds(315,30,50,50);
        frame.add(label1_2);
        label1_2.setText("=");
        label1_2.setFont(new Font("Arial", Font.PLAIN, 30));
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if(mainig==true) {
        //variables x
        JLabel labe3_0 = new JLabel();
        labe3_0.setBounds(120,55,10,10);
        frame.add(labe3_0);
        labe3_0.setText( "X");
        JLabel labe3_1 = new JLabel();
        labe3_1.setBounds(120,115,10,10);
        frame.add(labe3_1);
        labe3_1.setText( "X");
        JLabel labe3_2 = new JLabel();
        labe3_2.setBounds(120,175,10,10);
        frame.add(labe3_2);
        labe3_2.setText( "X");
        //variables y
        JLabel labe3_3 = new JLabel();
        labe3_3.setBounds(200,55,10,10);
        frame.add(labe3_3);
        labe3_3.setText( "Y");
        JLabel labe3_4 = new JLabel();
        labe3_4.setBounds(200,115,10,10);
        frame.add(labe3_4);
        labe3_4.setText( "Y");
        JLabel labe3_5 = new JLabel();
        labe3_5.setBounds(200,175,10,10);
        frame.add(labe3_5);
        labe3_5.setText( "Y");
        //variables z
        JLabel labe3_6 = new JLabel();
        labe3_6.setBounds(280,55,10,10);
        frame.add(labe3_6);
        labe3_6.setText( "Z");
        JLabel labe3_7 = new JLabel();
        labe3_7.setBounds(280,115,10,10);
        frame.add(labe3_7);
        labe3_7.setText( "Z");
        JLabel labe3_8 = new JLabel();
        labe3_8.setBounds(280,175,10,10);
        frame.add(labe3_8);
        labe3_8.setText( "Z");
        }

	    frame.setSize(400,280);
	    frame.setLocation(locatx,locaty);
	    frame.setLayout(null);
	    frame.setVisible(true);
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame(" Gausa metod");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    //fields for input
	    JTextField txtf1 = new JTextField(); //1. column
        txtf1.setBounds(70, 40,50,30);
        frame.add(txtf1);
        JTextField txtf2 = new JTextField();
        txtf2.setBounds(70, 100,50,30);
        frame.add(txtf2);
        JTextField txtf3 = new JTextField();
        txtf3.setBounds(70, 160,50,30);
        frame.add(txtf3);

        JTextField txtf4 = new JTextField(); //2. column
        txtf4.setBounds(150, 40,50,30);
        frame.add(txtf4);
        JTextField txtf5 = new JTextField();
        txtf5.setBounds(150, 100,50,30);
        frame.add(txtf5);
        JTextField txtf6 = new JTextField();
        txtf6.setBounds(150, 160,50,30);
        frame.add(txtf6);

        JTextField txtf7 = new JTextField(); //3. column
        txtf7.setBounds(230, 40,50,30);
        frame.add(txtf7);
        JTextField txtf8 = new JTextField();
        txtf8.setBounds(230, 100,50,30);
        frame.add(txtf8);
        JTextField txtf9 = new JTextField();
        txtf9.setBounds(230, 160,50,30);
        frame.add(txtf9);

        JTextField txtf10 = new JTextField(); //4. column
        txtf10.setBounds(340, 40,50,30);
        frame.add(txtf10);
        JTextField txtf11 = new JTextField();
        txtf11.setBounds(340, 100,50,30);
        frame.add(txtf11);
        JTextField txtf12 = new JTextField();
        txtf12.setBounds(340, 160,50,30);
        frame.add(txtf12);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //all '=' signs
        JLabel label1_0 = new JLabel();
        label1_0.setBounds(315,150,50,50);
        frame.add(label1_0);
        label1_0.setText("=");
        label1_0.setFont(new Font("Arial", Font.PLAIN, 30));
        JLabel label1_1 = new JLabel();
        label1_1.setBounds(315,90,50,50);
        frame.add(label1_1);
        label1_1.setText("=");
        label1_1.setFont(new Font("Arial", Font.PLAIN, 30));
        JLabel label1_2 = new JLabel();
        label1_2.setBounds(315,30,50,50);
        frame.add(label1_2);
        label1_2.setText("=");
        label1_2.setFont(new Font("Arial", Font.PLAIN, 30));

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        JLabel labe2_0 = new JLabel();    // "{"signs
        labe2_0.setBounds(20,0,100,200);
        frame.add(labe2_0);
        labe2_0.setText( "{");
        labe2_0.setFont(new Font("Arial", Font.PLAIN, 150));
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //visualisation of variables: x,y,z
        //variable x
        JLabel labe3_0 = new JLabel();
        labe3_0.setBounds(120,55,10,10);
        frame.add(labe3_0);
        labe3_0.setText( "X");
        JLabel labe3_1 = new JLabel();
        labe3_1.setBounds(120,115,10,10);
        frame.add(labe3_1);
        labe3_1.setText( "X");
        JLabel labe3_2 = new JLabel();
        labe3_2.setBounds(120,175,10,10);
        frame.add(labe3_2);
        labe3_2.setText( "X");
        //variable y
        JLabel labe3_3 = new JLabel();
        labe3_3.setBounds(200,55,10,10);
        frame.add(labe3_3);
        labe3_3.setText( "Y");
        JLabel labe3_4 = new JLabel();
        labe3_4.setBounds(200,115,10,10);
        frame.add(labe3_4);
        labe3_4.setText( "Y");
        JLabel labe3_5 = new JLabel();
        labe3_5.setBounds(200,175,10,10);
        frame.add(labe3_5);
        labe3_5.setText( "Y");
        //variable z
        JLabel labe3_6 = new JLabel();
        labe3_6.setBounds(280,55,10,10);
        frame.add(labe3_6);
        labe3_6.setText( "Z");
        JLabel labe3_7 = new JLabel();
        labe3_7.setBounds(280,115,10,10);
        frame.add(labe3_7);
        labe3_7.setText( "Z");
        JLabel labe3_8 = new JLabel();
        labe3_8.setBounds(280,175,10,10);
        frame.add(labe3_8);
        labe3_8.setText( "Z");
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        JButton Calc = new JButton("Aprēķināt"); //creating a button to activate the solution algorithm
	       Calc.setBounds(200,200,90,30);
	       frame.add(Calc);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	        int line = 3;             //creating variables indicating the number of rows and columns in the array
			int col = line+1;		  //they are needed for easier handling of arrays using loops.
			double[][] mainigie = new double [line][col];  //array with original data
			double[][] mainigie2 =mainigie;				   //array of calculations
			double[][] mainigieparb=new double [line][col];//an array to test the solution after finding variables

        Calc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

            	try { //checks that the data entered is correct.

    	        	mainigie[0][0] = Float.parseFloat(txtf1.getText());//filling the array
    	        	mainigie[1][0] = Float.parseFloat(txtf2.getText());
    	        	mainigie[2][0] = Float.parseFloat(txtf3.getText());

    	        	mainigie[0][1] = Float.parseFloat(txtf4.getText());
    	        	mainigie[1][1] = Float.parseFloat(txtf5.getText());
    	        	mainigie[2][1] = Float.parseFloat(txtf6.getText());

    	        	mainigie[0][2] = Float.parseFloat(txtf7.getText());
    	        	mainigie[1][2] = Float.parseFloat(txtf8.getText());
    	        	mainigie[2][2] = Float.parseFloat(txtf9.getText());

    	        	mainigie[0][3] = Float.parseFloat(txtf10.getText());
    	        	mainigie[1][3] = Float.parseFloat(txtf11.getText());
    	        	mainigie[2][3] = Float.parseFloat(txtf12.getText());

    	        	for (int i = 0; i < line; i++) {  //check that all variables have a value not equal to 0
        				for (int j = 0; j < col-1; j++) {
        					if( mainigie[i][j]==0) {
        						JOptionPane.showMessageDialog(frame, "Lūdzu, ievadiet mainīgo vērtības, kas nav vienādas ar 0!");
        						System.exit(0);
        					}
        			    }
        			}

    	        	for (int i = 0; i < line; i++) {  //copying values from the original array to the array to be checked.
        				for (int j = 0; j < col; j++) {
        					mainigieparb[i][j]=mainigie[i][j];
        			        }
        			}

            		double divisor=mainigie[0][0];//dividing the first row by its x value
    				for (int j=0; j<col;++j) {
    					mainigie2[0][j] /=divisor ;
    				}

    					frame1(400,0,mainigie2,true,true);//function that creates a window with the first action

        			double multiplier=-mainigie[1][0]; //the multiplier of the first row is the negative x-values in the second row
        			double multiplier2=-mainigie[2][0];//the multiplier of the first row is the negative x-values in the third row

        			double[][] komentars1 = new double [line][col];//Creating comment arrays
        			double[][] komentars2 = new double [line][col];
        			double[][] komentars3 = new double [line][col];
        			for (int i = 0; i < col; i++) {

        				komentars1[0][i]=mainigie2[0][i]*multiplier;//1. comment
        				komentars1[1][i]=mainigie2[1][i];
        				komentars1[2][i]=komentars1[0][i]+komentars1[1][i];
        			}
        			frame1(790,0,komentars1,false,true);//a function that displays the first comment in a separate window.
        			for (int i = 0; i < col; i++) {

        				komentars2[0][i]=mainigie2[0][i]*multiplier2;//2. comment
        				komentars2[1][i]=mainigie2[2][i];
        				komentars2[2][i]=komentars2[0][i]+komentars2[1][i];
        			}
        			frame1(1180,0,komentars2,false,true);//a function that displays the second comment in a separate window.

        			for (int i = 0; i < col; i++) {

        				mainigie2[1][i]=komentars1[2][i];//replacing line 2 of the equation with the values from comment 1.
        				mainigie2[2][i]=komentars2[2][i];//by replacing line 3 of the equation with the values from comment 2.
        			}
        			frame1(0,270,mainigie2,true,true);//function that outputs the equation with the comment value in a separate window.
        			double multiplier3=-mainigie2[2][1];

        			double divisor2=mainigie2[1][1];
        			for (int j=0+1; j<col;++j) {//division of all values in the second row by the y value from the second row.
        				mainigie2[1][j] /=divisor2 ;
        			}


        			frame1(400,270,mainigie2,true,true);//function that creates a window with the action for any comments
        			for (int i = 0; i < col; i++) {

        				komentars3[0][i]=mainigie2[1][i]*multiplier3;//3. comment
        				komentars3[1][i]=mainigie2[2][i];
        				komentars3[2][i]=komentars3[0][i]+komentars3[1][i];
        				}
        			frame1(790,270,komentars3,false,true);//a function that displays the third comment in a separate window.

        			for (int i = 0; i < col; i++) {
        				mainigie2[2][i]=komentars3[2][i];//replacing line 3 of the equation with the values from comment 3.
        			}

        			frame1(1180,270,mainigie2,true,true);//function that outputs the solved equation

        			if(mainigie2[2][2]==0&&!(mainigie2[2][3]==0)) {//checking if the system is incompatible
        				JOptionPane.showMessageDialog(frame, "The system is not compatible!");
        				System.exit(0);
        			}
        			if(!(mainigie2[2][2]==0)&&mainigie2[2][3]==0) {//checking whether the system has infinitely many solutions
        				JOptionPane.showMessageDialog(frame, "The system has an infinite number of solutions!");

        			}
        			if(mainigie2[2][2]==0&&mainigie2[2][3]==0) {//checking that the coefficient of the unknown quantity in the last equation is 0
        				double z=1;
            			double y=mainigie2[1][3]+(-mainigie2[1][2]*z);
            			double x= mainigie2[0][3];
            			atbildesc(400,540,x,y,z,mainigie2);//function that outputs the answers when the coefficient of the unknown quantity in the last equation is 0
        			}
        			else {//all other cases

        				double divisor3=mainigie2[2][2];
        				for (int i = 0; i < col; i++) {
        					mainigie2[2][i]=mainigie2[2][i]/divisor3;//find out the exact value of z
        				}
        				frame1(0,540,mainigie2,true,true);//function that outputs the solved equation

        				//calculating x, y, z values
        				double z=mainigie2[2][3];
        				double y=mainigie2[1][3]+(-mainigie2[1][2]*z);
        				double x= mainigie2[0][3]+(-mainigie2[0][1]*y)+(-mainigie2[0][2]*z);

	        			for (int i = 0; i < line; i++) {
	        				//checking x, y, z values
	        				mainigieparb[i][0]=mainigieparb[i][0]*x;
	        				mainigieparb[i][1]=mainigieparb[i][1]*y;
	        				mainigieparb[i][2]=mainigieparb[i][2]*z;
	        				mainigieparb[i][3]=mainigieparb[i][0]+mainigieparb[i][1]+mainigieparb[i][2];

	        				}
	        			atbildes(400,540,x,y,z);//function that outputs x, y, z values
	        			frame1(790,540,mainigieparb,true,false);//function that outputs the check

        			}
            	}catch(NumberFormatException e)
    	        {									//window displayed if incorrect data is entered
    	        	   JOptionPane.showMessageDialog(frame, "Error, incorrect values entered");

    	        }
            }
       });


	    frame.setSize(410,280);
	    frame.setLayout(null);
	    frame.setVisible(true);
	}
}
