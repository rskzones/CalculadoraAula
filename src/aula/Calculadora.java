package aula;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculadora extends JFrame{
		
		double valor1, valor2;
		int cont;
		
		//COMANDOS 
		JTextField txtVisor = new JTextField ();
		JButton btnMc = new JButton("MC");
		JButton btnMR = new JButton("MR");
		JButton btnMS = new JButton("MS");
		JButton btnMPLS = new JButton ("M+");
		JButton btnMLW = new JButton ("M-");
		JButton btnBKS = new JButton ("←");
		JButton btnC = new JButton ("C");
		JButton btnCE = new JButton ("CE");
		JButton btnMN = new JButton ("±");
		JButton btnRAIZQ = new JButton ("√");
		JButton btnDIV = new JButton ("/");
		JButton btnPERC = new JButton ("%");
		JButton btnVEZES = new JButton ("*");
		JButton btn1X = new JButton ("1/x");
		JButton btnMENOS = new JButton ("-");
		JButton btnSOMA = new JButton ("+");
		JButton btnVIRG = new JButton (",");
		JButton btnIGUAL = new JButton ("=");
		
		//NUMEROS
		JButton btnSETE = new JButton ("7");
		JButton btnOITO = new JButton ("8");
		JButton btnNOVE = new JButton ("9");
		JButton btnQUAT = new JButton ("4");
		JButton btnCINC = new JButton ("5");
		JButton btnSEIS = new JButton ("6");
		JButton btnUM = new JButton ("1");
		JButton btnDOIS = new JButton ("2");
		JButton btnTRES = new JButton ("3");
		JButton btnZER = new JButton ("0");
		
		
	public Calculadora(){
		super ("Calculadora");
		
		Calculos calcs = new Calculos();		//INSTANCIAR A CLASSE CALCULOS
		
		Container paine = this.getContentPane();
		
			paine.add(txtVisor);
			txtVisor.setBounds(20,20,295,40);
			
			//PRIMEIRA LINHA
			
			paine.add(btnMc);
			btnMc.setBounds(20,70,53,40);
			
			paine.add(btnMR);
			btnMR.setBounds(80,70,53,40);
			
			paine.add(btnMS);
			btnMS.setBounds(140, 70,53, 45);
			
			paine.add(btnMPLS);
			btnMPLS.setBounds(200,70,53,45);
			
			paine.add(btnMLW);
			btnMLW.setBounds(260,70,53,45);
			
			//SEGUNDA LINHA 
			
			paine.add(btnBKS);
			btnBKS.setBounds(20,122,53,45);
			
			paine.add(btnC);
			btnC.setBounds(80,122,53,45);
			btnC.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					txtVisor.setText("");
				}
			});
		

			paine.add(btnCE);
			btnCE.setBounds(140,122,53,45);
			btnCE.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					txtVisor.setText("");
				}
			});
			
			paine.add(btnMN);
			btnMN.setBounds(200,122,53,45);

			paine.add(btnRAIZQ);		//Operação Raiz Quadrada
			btnRAIZQ.setBounds(260,122,53,45);
			btnRAIZQ.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					valor1 = Double.parseDouble(txtVisor.getText());
					txtVisor.setText(""+calcs.raizq(valor1));
				}
			});

			//terceira linha
			
			paine.add(btnDIV);		//Operação Divisão
			btnDIV.setBounds(200,174,53,45);
			btnDIV.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					valor1 = Double.parseDouble(txtVisor.getText());	//GUARDAR O 1°VALOR
					cont = 3;		//3 - Divisão
					txtVisor.setText("");
				}
			});
			
			paine.add(btnPERC);
			btnPERC.setBounds(260,174,53,45);
			btnPERC.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					valor1 = Double.parseDouble(txtVisor.getText());
					txtVisor.setText("");
				}
			});
			
			//QUARTA LINHA 
			paine.add(btnVEZES);
			btnVEZES.setBounds(200,226,53,45);
			btnVEZES.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					valor1 = Double.parseDouble(txtVisor.getText());
					cont = 2;		//2 - Multiplicação
					txtVisor.setText("");
				}
			});
			
			paine.add(btn1X);
			btn1X.setBounds(260,226,53,45);

			//QUINTA LINHA 
			paine.add(btnMENOS);
			btnMENOS.setBounds(200,278,53,45);
			btnMENOS.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					valor1 = Double.parseDouble(txtVisor.getText());
					cont = 1;		//1 - subtração
					txtVisor.setText("");
				}
			});
			
			//SEXTA LINHA 
			paine.add(btnVIRG);
			btnVIRG.setBounds(140,330,53,45);
			
			paine.add(btnSOMA);
			btnSOMA.setBounds(200,330,53,45);
			btnSOMA.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					valor1 = Double.parseDouble(txtVisor.getText());
					cont = 0;		//0 = soma
					txtVisor.setText("");
				}
			});
			
			paine.add(btnIGUAL);
			btnIGUAL.setBounds(260,278,53,97);
			btnIGUAL.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				valor2 = Double.parseDouble(txtVisor.getText());

				switch(cont){
					case 0: txtVisor.setText(""+calcs.soma(valor1, valor2));
							break;
					case 1: txtVisor.setText(""+calcs.subtr(valor1, valor2));
							break;
					case 2: txtVisor.setText(""+calcs.div(valor1, valor2));
							break;
					case 3: txtVisor.setText(""+calcs.mult(valor1, valor2));
							break;
					}
				}
			});

			
			//NUMEROS 
			paine.add(btnSETE);
			btnSETE.setBounds(20,174,53,45);
			btnSETE.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					txtVisor.setText(txtVisor.getText()+"7");
				}
			});
			
			paine.add(btnOITO);
			btnOITO.setBounds(80,174,53,45);
			btnOITO.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					txtVisor.setText(txtVisor.getText()+"8");
				}
			});
			
			paine.add(btnNOVE);
			btnNOVE.setBounds(140,174,53,45);
			btnNOVE.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					txtVisor.setText(txtVisor.getText()+"9");
				}
			});
			
			paine.add(btnQUAT);
			btnQUAT.setBounds(20,226,53,45);
			btnQUAT.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					txtVisor.setText(txtVisor.getText()+"4");
				}
			});
			
			paine.add(btnCINC);
			btnCINC.setBounds(80,226,53,45);
			btnCINC.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					txtVisor.setText(txtVisor.getText()+"5");
				}
			});
			
			paine.add(btnSEIS);
			btnSEIS.setBounds(140,226,53,45);
			btnSEIS.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					txtVisor.setText(txtVisor.getText()+"6");
				}
			});
			
			paine.add(btnUM);
			btnUM.setBounds(20,278,53,45);
			btnUM.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					txtVisor.setText(txtVisor.getText()+"1");
				}
			});
			
			paine.add(btnDOIS);
			btnDOIS.setBounds(80,278,53,45);
			btnDOIS.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					txtVisor.setText(txtVisor.getText()+"2");
				}
			});
			
			paine.add(btnTRES);
			btnTRES.setBounds(140,278,53,45);
			btnTRES.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					txtVisor.setText(txtVisor.getText()+"3");
				}
			});
			
			paine.add(btnZER);
			btnZER.setBounds(20,330,113,45);
			btnZER.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					txtVisor.setText(txtVisor.getText()+"0");
				}
			});
			

		paine.setLayout(null);
		this.setVisible(true);
		this.setSize(350, 430);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main (String args[]){
		Calculadora calc = new Calculadora();
	}
}