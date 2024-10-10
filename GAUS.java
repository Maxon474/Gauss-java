package gauss;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class GAUS2 {
    // Function to display answers when the coefficient of the unknown in the last equation is 0
    public static void displayAnswersC(double x, double y, double z, double[][] mainigie) {
        JFrame frame = new JFrame("Answers");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel inputPanel = new JPanel(new GridLayout(3, 4));
        inputPanel.setBorder(BorderFactory.createTitledBorder("Input Values"));

        JTextField[] textFields = new JTextField[12];
        for (int i = 0; i < 12; i++) {
            textFields[i] = new JTextField();
            inputPanel.add(textFields[i]);
        }

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    // Fill the mainigie array with input values
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 4; j++) {
                            mainigie[i][j] = Double.parseDouble(textFields[i * 4 + j].getText());
                        }
                    }

                    // ... (rest of your calculation logic)

                    // Display the results in a single panel
                    JPanel resultsPanel = new JPanel(new GridLayout(3, 2));
                    resultsPanel.setBorder(BorderFactory.createTitledBorder("Results"));

                    JLabel labelX = new JLabel("x = " + String.format("%.4f + %.4f С ", x, -mainigie[0][1] * y - mainigie[0][2] * z));
                    JLabel labelY = new JLabel("y = " + String.format("%.4f C", y));
                    JLabel labelZ = new JLabel("z = " + String.format("%.4f C", z));

                    resultsPanel.add(labelX);
                    resultsPanel.add(new JLabel());
                    resultsPanel.add(labelY);
                    resultsPanel.add(new JLabel());
                    resultsPanel.add(labelZ);
                    resultsPanel.add(new JLabel());

                    // Display the calculations and comments in a single panel
                    JPanel calculationsPanel = new JPanel(new GridLayout(0, 3));
                    calculationsPanel.setBorder(BorderFactory.createTitledBorder("Calculations"));

                    // ... (add your calculations and comments here)

                    // Add input, results, and calculations panels to the main frame
                    frame.getContentPane().setLayout(new BorderLayout());
                    frame.getContentPane().add(inputPanel, BorderLayout.NORTH);
                    frame.getContentPane().add(resultsPanel, BorderLayout.CENTER);
                    frame.getContentPane().add(calculationsPanel, BorderLayout.SOUTH);

                    frame.pack();
                    frame.setVisible(true);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(frame, "Error: Invalid input values");
                }
            }
        });

        inputPanel.add(calculateButton);

        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

   


	
	//funkcija, kas izvada vienādojimus un komentarus
	public static void frame1(int locatx, int locaty, double mainigie[][],boolean zim,boolean mainig) {
		JFrame frame = new JFrame("=>");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    JLabel labe2_1 = new JLabel();
	    JLabel labe2_0 = new JLabel();
	    if(zim==true) {							//parbaudijums,kada zīme ir vajādzīga { vai [
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
        //kolonnas izvads 
        JLabel labe4_0 = new JLabel();						//1.kolonna
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
       
        JLabel labe4_3 = new JLabel();						//2.kolonna
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
        
        JLabel labe4_6 = new JLabel();						//3.kolonna
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
        
        JLabel labe4_9 = new JLabel();						//4.kolonna
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
        //visas = zīmes
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
        //mainigie x
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
        //mainigie y
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
        //mainigie z
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
	public static void main(String[] args) {			//galvenā funkcija
		JFrame frame = new JFrame(" Gausa metod");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    //lauki mainīgo ievadīšanai
	    JTextField txtf1 = new JTextField(); //1. kolonna
        txtf1.setBounds(70, 40,50,30);
        frame.add(txtf1);
        JTextField txtf2 = new JTextField(); 
        txtf2.setBounds(70, 100,50,30);
        frame.add(txtf2);
        JTextField txtf3 = new JTextField(); 
        txtf3.setBounds(70, 160,50,30);
        frame.add(txtf3);
	    
        JTextField txtf4 = new JTextField(); //2. kolonna
        txtf4.setBounds(150, 40,50,30);
        frame.add(txtf4);
        JTextField txtf5 = new JTextField(); 
        txtf5.setBounds(150, 100,50,30);
        frame.add(txtf5);
        JTextField txtf6 = new JTextField(); 
        txtf6.setBounds(150, 160,50,30);
        frame.add(txtf6);
        
        JTextField txtf7 = new JTextField(); //3. kolonna
        txtf7.setBounds(230, 40,50,30);
        frame.add(txtf7);
        JTextField txtf8 = new JTextField(); 
        txtf8.setBounds(230, 100,50,30);
        frame.add(txtf8);
        JTextField txtf9 = new JTextField(); 
        txtf9.setBounds(230, 160,50,30);
        frame.add(txtf9);
        
        JTextField txtf10 = new JTextField(); //4. kolonna
        txtf10.setBounds(340, 40,50,30);
        frame.add(txtf10);
        JTextField txtf11 = new JTextField(); 
        txtf11.setBounds(340, 100,50,30);
        frame.add(txtf11);
        JTextField txtf12 = new JTextField(); 
        txtf12.setBounds(340, 160,50,30);
        frame.add(txtf12);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////        
        //visas = zīmes
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

        JLabel labe2_0 = new JLabel();    // { zīme
        labe2_0.setBounds(20,0,100,200);
        frame.add(labe2_0);
        labe2_0.setText( "{");
        labe2_0.setFont(new Font("Arial", Font.PLAIN, 150));
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //mainigie zīmes: x,y,z
        //mainigie x
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
        //mainigie y
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
        //mainigie z
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
        JButton Calc = new JButton("Aprēķināt"); //izveidojot pogu, lai aktivizētu risinājuma algoritmu
	       Calc.setBounds(200,200,90,30);
	       frame.add(Calc);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	        int line = 3;             //veidojot mainīgos, kas norāda rindu un kolonnu skaitu masīvā
			int col = line+1;		  //tie ir nepieciešami ērtākai masīvu apstrādei, izmantojot cilpas.
			double[][] mainigie = new double [line][col];  //masīvs ar sākotnējiem datiem
			double[][] mainigie2 =mainigie;				   //aprēķinu masīvs
			double[][] mainigieparb=new double [line][col];//masīvs risinājuma pārbaudei pēc mainīgo atrašanas
			
        Calc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            	
            	try { //pārbauda, vai ievadītie dati ir pareizi.
            		
    	        	mainigie[0][0] = Float.parseFloat(txtf1.getText());//masīva aizpildīšana
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
        	
    	        	for (int i = 0; i < line; i++) {  //pārbaudīt, vai visiem mainīgajiem ir vērtība, kas nav vienāda ar 0
        				for (int j = 0; j < col-1; j++) {
        					if( mainigie[i][j]==0) {
        						JOptionPane.showMessageDialog(frame, "Lūdzu, ievadiet mainīgo vērtības, kas nav vienādas ar 0!");
        						System.exit(0);
        					}
        			    } 
        			}
    	        	
    	        	for (int i = 0; i < line; i++) {  //vērtību kopēšana no sākotnējā masīva uz pārbaudāmo masīvu.
        				for (int j = 0; j < col; j++) {
        					mainigieparb[i][j]=mainigie[i][j];
        			        }   
        			}
            		
            		
            		
            		double divisor=mainigie[0][0];//dalot pirmo rindu ar tās x vērtību
    				for (int j=0; j<col;++j) {
    					mainigie2[0][j] /=divisor ;	
    				}

    					frame1(400,0,mainigie2,true,true);//funkcija, kas izveido logu ar pirmo darbību

        			double multiplier=-mainigie[1][0]; //pirmās rindas reizinātājs ir negatīvas x vērtības otrajā rindā
        			double multiplier2=-mainigie[2][0];//pirmās rindas reizinātājs ir negatīvas x vērtības trešajā rindā
        			
        			
        			double[][] komentars1 = new double [line][col];//komentāru masīvu izveide
        			double[][] komentars2 = new double [line][col];
        			double[][] komentars3 = new double [line][col];
        			for (int i = 0; i < col; i++) {
        					
        				komentars1[0][i]=mainigie2[0][i]*multiplier;//1. komentārs	
        				komentars1[1][i]=mainigie2[1][i];
        				komentars1[2][i]=komentars1[0][i]+komentars1[1][i];
        			}
        			frame1(790,0,komentars1,false,true);//funkcija, kas izvada 1.komentāru atsevišķā logā.
        			for (int i = 0; i < col; i++) {
    					
        				komentars2[0][i]=mainigie2[0][i]*multiplier2;//2. komentārs		
        				komentars2[1][i]=mainigie2[2][i];
        				komentars2[2][i]=komentars2[0][i]+komentars2[1][i];
        			}
        			frame1(1180,0,komentars2,false,true);//funkcija, kas izvada 2.komentāru atsevišķā logā.
        			
        			for (int i = 0; i < col; i++) {
        				
        				mainigie2[1][i]=komentars1[2][i];//aizstājot vienādojuma 2. rindu ar vērtībām no 1.komentāru.
        				mainigie2[2][i]=komentars2[2][i];//aizstājot vienādojuma 3. rindu ar vērtībām no 2.komentāru.
        			}
        			frame1(0,270,mainigie2,true,true);//funkcija, kas izvada vienādojumu ar komentāru vertībam atsevišķā logā.
        			double multiplier3=-mainigie2[2][1];
        			
        			double divisor2=mainigie2[1][1];
        			for (int j=0+1; j<col;++j) {//visu otrās rindas vērtību dalīšana ar y vērtību no otrās rindas.
        				mainigie2[1][j] /=divisor2 ;		
        			}
        			

        			frame1(400,270,mainigie2,true,true);//funkcija, kas izveido logu ar darbību priekš nakamām komentarām
        			for (int i = 0; i < col; i++) {
        				
        				komentars3[0][i]=mainigie2[1][i]*multiplier3;//3. komentārs		
        				komentars3[1][i]=mainigie2[2][i];
        				komentars3[2][i]=komentars3[0][i]+komentars3[1][i];
        				}
        			frame1(790,270,komentars3,false,true);//funkcija, kas izvada 3.komentāru atsevišķā logā.
        			
        			for (int i = 0; i < col; i++) {
        				mainigie2[2][i]=komentars3[2][i];//aizstājot vienādojuma 3. rindu ar vērtībām no 3.komentāru.
        			}
        			
        			frame1(1180,270,mainigie2,true,true);//funkcija, kas izvada atrisinato vienādojumu
        			
        			if(mainigie2[2][2]==0&&!(mainigie2[2][3]==0)) {//pārbaude, vai sistēma nav saderīga
        				JOptionPane.showMessageDialog(frame, "Sistēma nav saderīga!");
        				System.exit(0);
        			}
        			if(!(mainigie2[2][2]==0)&&mainigie2[2][3]==0) {//pārbaude, vai sistēmai ir bezgalīgi daudz risinājumu
        				JOptionPane.showMessageDialog(frame, "Sistēmai ir bezgalīgi daudz risinājumu!");
        			
            			
        			}
        			if(mainigie2[2][2]==0&&mainigie2[2][3]==0) {//pārbaude, vai pēdējā vienādojumā nezināmā lieluma koeficents ir 0 
        				double z=1;
            			double y=mainigie2[1][3]+(-mainigie2[1][2]*z);
            			double x= mainigie2[0][3];
            			//atbildesc(400,540,x,y,z,mainigie2);//funkcija, kas izvada atbildes kad pēdējā vienādojumā nezināmā lieluma koeficents ir 0
        			}
        			else {//visi pārējie gadījumi
        			
        			
        				double divisor3=mainigie2[2][2];
        				for (int i = 0; i < col; i++) {
        					mainigie2[2][i]=mainigie2[2][i]/divisor3;//noskaidrot precīzu z vērtību
        				}
        				frame1(0,540,mainigie2,true,true);//funkcija, kas izvada atrisinato vienādojumu
        			
        				//x, y, z vērtību aprēķināšana
        				double z=mainigie2[2][3];
        				double y=mainigie2[1][3]+(-mainigie2[1][2]*z);
        				double x= mainigie2[0][3]+(-mainigie2[0][1]*y)+(-mainigie2[0][2]*z);
        			
	        			for (int i = 0; i < line; i++) {  
	        				//x, y, z vērtību pārbaude
	        				mainigieparb[i][0]=mainigieparb[i][0]*x;
	        				mainigieparb[i][1]=mainigieparb[i][1]*y;
	        				mainigieparb[i][2]=mainigieparb[i][2]*z;
	        				mainigieparb[i][3]=mainigieparb[i][0]+mainigieparb[i][1]+mainigieparb[i][2];
	        					
	        				}
	        			//atbildes(400,540,x,y,z);//funkcija, kas izvada x, y, z vērtības
	        			frame1(790,540,mainigieparb,true,false);//funkcija, kas izvada parbaudīšanu
        			
        			}
            	}catch(NumberFormatException e)
    	        {									//logs, kas tiek parādīts, ja ir ievadīti nepareizi dati
    	        	   JOptionPane.showMessageDialog(frame, "Kļūda, ievadītas neatbilstošas ​​vērtības");
    	        	  
    	        } 	
            }
       });
 

	    frame.setSize(410,280);
	    frame.setLayout(null);
	    frame.setVisible(true);
	}
}

		
	

	
		
	
