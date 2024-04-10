/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poli14;

/**
 *
 * @author Costea Delia
 */
public class Administrator extends javax.swing.JFrame {

	/**
	 * Creates new form Administrator
	 */
	public Administrator() {
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

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		logout = new javax.swing.JButton();
		modifica = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(153, 255, 255));

		jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
		jLabel1.setText("Administrator");

		logout.setBackground(new java.awt.Color(153, 204, 255));
		logout.setText("Log out");
		logout.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				logoutActionPerformed(evt);
			}
		});

		modifica.setBackground(new java.awt.Color(153, 204, 255));
		modifica.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		modifica.setText("Modifica informatii despre utilizatori");
		modifica.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				modificaActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(logout)
						.addContainerGap(506, Short.MAX_VALUE))
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(171, 171, 171).addComponent(modifica).addGap(0,
						0, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(189, 189, 189)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(15, 15, 15).addComponent(logout)
						.addGap(32, 32, 32).addComponent(jLabel1).addGap(65, 65, 65).addComponent(modifica,
								javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(153, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>

	private void modificaActionPerformed(java.awt.event.ActionEvent evt) {
		String s = "Administrator";
		Modifica_Utilizatori u = new Modifica_Utilizatori(s);
		u.show();
		dispose();
	}

	private void logoutActionPerformed(java.awt.event.ActionEvent evt) {
		LoginAdministrator l = new LoginAdministrator();
		l.show();
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
			java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Administrator().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JButton logout;
	private javax.swing.JButton modifica;
	// End of variables declaration
}