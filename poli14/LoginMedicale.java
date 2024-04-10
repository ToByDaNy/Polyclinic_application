/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poli14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

/**
 *
 * 
 */
public class LoginMedicale extends javax.swing.JFrame {

	/**
	 * Creates new form Login1
	 */
	public LoginMedicale() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jToggleButton1 = new javax.swing.JToggleButton();
		jPanel1 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		Email = new javax.swing.JTextField();
		Selectare = new javax.swing.JComboBox<>();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		Ok = new javax.swing.JButton();
		Parola = new javax.swing.JPasswordField();
		inapoi = new javax.swing.JButton();

		jLabel1.setText("jLabel1");

		jLabel5.setText("jLabel5");

		jToggleButton1.setText("jToggleButton1");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBackground(new java.awt.Color(255, 51, 51));

		jPanel1.setBackground(new java.awt.Color(153, 255, 255));

		jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
		jLabel2.setText("LOGIN");

		Email.setBackground(new java.awt.Color(204, 255, 255));

		Selectare.setBackground(new java.awt.Color(204, 255, 255));
		Selectare.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "Receptioner", "Asistent Medical", "Medic" }));
		Selectare.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				SelectareActionPerformed(evt);
			}
		});

		jLabel3.setText("Email");

		jLabel4.setText("Password");

		Ok.setBackground(new java.awt.Color(153, 204, 255));
		Ok.setText("Ok");
		Ok.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OkActionPerformed(evt);
			}
		});

		Parola.setBackground(new java.awt.Color(204, 255, 255));

		inapoi.setBackground(new java.awt.Color(153, 204, 255));
		inapoi.setText("Inapoi");
		inapoi.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				inapoiActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(18, 18, 18).addGroup(jPanel1Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(inapoi)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup().addGap(43, 43, 43)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(Selectare, 0,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(Email).addComponent(Parola)))
										.addGroup(jPanel1Layout.createSequentialGroup().addGap(56, 56, 56).addComponent(
												jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113,
												javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(164, 164, 164).addComponent(Ok)))
						.addContainerGap(145, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(35, 35, 35).addComponent(jLabel2,
								javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(17, 17, 17).addComponent(inapoi)))
						.addGap(34, 34, 34)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel3))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel4).addComponent(Parola, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addComponent(Selectare, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(Ok)
						.addContainerGap(23, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
								.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>

	private void SelectareActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	Connection con;
	Statement statement;

	private void OkActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

		String userName = Email.getText();
		String password = Parola.getText();
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/policlinica", "root", "1234");

			statement = (Statement) con.createStatement();
			ResultSet rs = statement.executeQuery("Select CNP,Email,Functia from utilizator where CNP = '" + password
					+ "' and Email = '" + userName + "';");

			if (rs.next()) {
				if (!rs.getString("Email").equals(null)) {

					JOptionPane.showMessageDialog(this, "Conectare cu succes!");

					UserParola a = new UserParola(userName, password);
					if (Selectare.getSelectedItem().toString().equals("Receptioner")
							&& rs.getString("Functia").equals("Receptioner")) {

						Receptioner r = new Receptioner(a);
						r.show();
						dispose();

					} else if (Selectare.getSelectedItem().toString().equals("Asistent Medical")
							&& rs.getString("Functia").equals("Asistent medical")) {
						AsistentMedical r = new AsistentMedical(a);
						r.show();
						dispose();
					} else if (Selectare.getSelectedItem().toString().equals("Medic")
							&& rs.getString("Functia").equals("Medic")) {
						Medic r = new Medic(a);
						r.show();
						dispose();
					} else {

						JOptionPane.showMessageDialog(this, "Functia gresita!");

					}

				}
			} else
				JOptionPane.showMessageDialog(this, "Parola sau email gresite!");

		} catch (

		SQLException sqlException) {
			sqlException.printStackTrace();
		}

	}

	private void inapoiActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		Departamente d = new Departamente();
		d.show();
		dispose();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(LoginMedicale.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(LoginMedicale.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(LoginMedicale.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(LoginMedicale.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new LoginMedicale().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JTextField Email;
	private javax.swing.JButton inapoi;
	private javax.swing.JButton Inregistrare;
	private javax.swing.JButton Ok;
	private javax.swing.JPasswordField Parola;
	private javax.swing.JComboBox<String> Selectare;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JToggleButton jToggleButton1;
	// End of variables declaration
}