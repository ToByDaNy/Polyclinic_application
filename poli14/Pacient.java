/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poli14;

/**
 *
 * 
 */
public class Pacient extends javax.swing.JFrame {

	/**
	 * Creates new form Pacient
	 */
	public Pacient(UserParola a) {
		initComponents(a);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents(UserParola a) {

		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		Clinici = new javax.swing.JButton();
		Medici = new javax.swing.JButton();
		Programari = new javax.swing.JButton();
		Raport = new javax.swing.JButton();
		logout = new javax.swing.JButton();

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 100, Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 100, Short.MAX_VALUE));

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel2.setBackground(new java.awt.Color(153, 255, 255));

		jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
		jLabel1.setText("Pacient");

		Clinici.setBackground(new java.awt.Color(153, 204, 255));
		Clinici.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		Clinici.setText("Vizualizare Clinici");
		Clinici.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				CliniciActionPerformed(evt, a);
			}
		});

		Medici.setBackground(new java.awt.Color(153, 204, 255));
		Medici.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		Medici.setText("Vizualizare Medici");
		Medici.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				MediciActionPerformed(evt, a);
			}
		});

		Programari.setBackground(new java.awt.Color(153, 204, 255));
		Programari.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		Programari.setText("Vizualizare Programari");
		Programari.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ProgramariActionPerformed(evt, a);
			}
		});

		Raport.setBackground(new java.awt.Color(153, 204, 255));
		Raport.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		Raport.setText("Vizualizare Raport");
		Raport.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				RaportActionPerformed(evt, a);
			}
		});

		logout.setBackground(new java.awt.Color(153, 204, 255));
		logout.setText("Log out");
		logout.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				logoutActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(
						jPanel2Layout
								.createParallelGroup(
										javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel2Layout.createSequentialGroup().addGap(28, 28, 28)
										.addComponent(Clinici, javax.swing.GroupLayout.PREFERRED_SIZE, 130,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(Medici, javax.swing.GroupLayout.PREFERRED_SIZE, 130,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(Raport, javax.swing.GroupLayout.PREFERRED_SIZE, 136,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18).addComponent(Programari)
										.addContainerGap(35, Short.MAX_VALUE))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(logout)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(231, 231, 231)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup().addGap(39, 39, 39).addComponent(jLabel1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel2Layout.createSequentialGroup().addGap(19, 19, 19).addComponent(logout)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(Clinici, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Medici, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Programari, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Raport, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(106, 106, 106)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>

	private void CliniciActionPerformed(java.awt.event.ActionEvent evt, UserParola a) {
		// TODO add your handling code here:
		ListaClinici l = new ListaClinici(a);
		l.show();
		dispose();
	}

	private void MediciActionPerformed(java.awt.event.ActionEvent evt, UserParola a) {
		// TODO add your handling code here:
		ListaMedici2 m = new ListaMedici2(a);
		m.show();
		dispose();
	}

	private void RaportActionPerformed(java.awt.event.ActionEvent evt, UserParola a) {
		// TODO add your handling code here:
		VizualizareP2 vr = new VizualizareP2(a);
		vr.show();
		dispose();

	}

	private void ProgramariActionPerformed(java.awt.event.ActionEvent evt, UserParola a) {
		// TODO add your handling code here:
		VizProgramare vp = new VizProgramare(a);
		vp.show();
		dispose();
	}

	private void logoutActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		LoginPacient l = new LoginPacient();
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
			java.util.logging.Logger.getLogger(Pacient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Pacient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Pacient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Pacient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				UserParola a = new UserParola("", "");
				new Pacient(a).setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton Clinici;
	private javax.swing.JButton Medici;
	private javax.swing.JButton Programari;
	private javax.swing.JButton Raport;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JButton logout;
	// End of variables declaration
}