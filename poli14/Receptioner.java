/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poli14;

/**
 *
 * 
 */
public class Receptioner extends javax.swing.JFrame {

	/**
	 * Creates new form Receptioner
	 */
	public Receptioner(UserParola a) {
		initComponents(a);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents(UserParola a) {

		jPanel15 = new javax.swing.JPanel();
		jLabel14 = new javax.swing.JLabel();
		programare = new javax.swing.JButton();
		anulare = new javax.swing.JButton();
		bon_fiscal = new javax.swing.JButton();
		orar = new javax.swing.JButton();
		inregistrare = new javax.swing.JButton();
		medici = new javax.swing.JButton();
		logout = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel15.setBackground(new java.awt.Color(153, 255, 255));

		jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
		jLabel14.setText("Receptioner");

		programare.setBackground(new java.awt.Color(153, 204, 255));
		programare.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		programare.setText("Programare Pacient");
		programare.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				programareActionPerformed(evt, a);
			}
		});

		anulare.setBackground(new java.awt.Color(153, 204, 255));
		anulare.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		anulare.setText("Anulare Programare");
		anulare.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				anulareActionPerformed(evt, a);
			}
		});

		bon_fiscal.setBackground(new java.awt.Color(153, 204, 255));
		bon_fiscal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		bon_fiscal.setText("Emitere bon fiscal");
		bon_fiscal.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				bon_fiscalActionPerformed(evt, a);
			}
		});

		orar.setBackground(new java.awt.Color(153, 204, 255));
		orar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		orar.setText("Orar Medici");
		orar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				orarActionPerformed(evt, a);
			}
		});

		inregistrare.setBackground(new java.awt.Color(153, 204, 255));
		inregistrare.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		inregistrare.setText("Inregistrare Pacient");
		inregistrare.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				inregistrareActionPerformed(evt);
			}
		});

		medici.setBackground(new java.awt.Color(153, 204, 255));
		medici.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		medici.setText("Lista Medici");
		medici.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				mediciActionPerformed(evt, a);
			}
		});

		logout.setBackground(new java.awt.Color(153, 204, 255));
		logout.setText("Log out");
		logout.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				logoutActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
		jPanel15.setLayout(jPanel15Layout);
		jPanel15Layout.setHorizontalGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel15Layout.createSequentialGroup().addGroup(jPanel15Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
						.addGroup(jPanel15Layout.createSequentialGroup().addGap(36, 36, 36)
								.addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(anulare, javax.swing.GroupLayout.PREFERRED_SIZE, 151,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(programare, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.PREFERRED_SIZE, 151,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(bon_fiscal, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(inregistrare, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGap(18, 18, Short.MAX_VALUE)
								.addGroup(jPanel15Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(orar, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(medici, javax.swing.GroupLayout.DEFAULT_SIZE, 156,
												Short.MAX_VALUE)))
						.addGroup(jPanel15Layout.createSequentialGroup().addContainerGap().addComponent(logout)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 162,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(174, 174, 174)))
						.addGap(108, 108, 108)));
		jPanel15Layout.setVerticalGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel15Layout.createSequentialGroup().addGroup(jPanel15Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel15Layout.createSequentialGroup().addGap(32, 32, 32).addComponent(jLabel14,
								javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel15Layout.createSequentialGroup().addGap(16, 16, 16).addComponent(logout)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(programare, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(orar, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(inregistrare, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(anulare, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(bon_fiscal, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(medici, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(35, 35, 35)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addComponent(jPanel15,
								javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>

	private void programareActionPerformed(java.awt.event.ActionEvent evt, UserParola a) {
		// TODO add your handling code here:
		ProgramarePacient p = new ProgramarePacient(a);
		p.show();
		dispose();
	}

	private void anulareActionPerformed(java.awt.event.ActionEvent evt, UserParola a) {
		// TODO add your handling code here:
		ProgramarePacient2 p = new ProgramarePacient2(a);
		p.show();
		dispose();
	}

	private void bon_fiscalActionPerformed(java.awt.event.ActionEvent evt, UserParola a) {
		// TODO add your handling code here:
		BonFiscal bf = new BonFiscal(a);
		bf.show();
		dispose();
	}

	private void orarActionPerformed(java.awt.event.ActionEvent evt, UserParola a) {
		OrarMedici o = new OrarMedici(a);
		o.show();
		dispose();
		// TODO add your handling code here:
	}

	private void inregistrareActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		Inregistrare_utilizator u = new Inregistrare_utilizator();
		u.show();
		dispose();
	}

	private void mediciActionPerformed(java.awt.event.ActionEvent evt, UserParola a) {
		// TODO add your handling code here:
		ListaMedici m = new ListaMedici(a);
		m.show();
		dispose();
	}

	private void logoutActionPerformed(java.awt.event.ActionEvent evt) {
		LoginMedicale l = new LoginMedicale();
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
			java.util.logging.Logger.getLogger(Receptioner.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Receptioner.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Receptioner.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Receptioner.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				UserParola a = new UserParola("are", "1");
				new Receptioner(a).setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton Clinici;
	private javax.swing.JButton logout;
	private javax.swing.JButton Clinici1;
	private javax.swing.JButton Clinici10;
	private javax.swing.JButton Clinici11;
	private javax.swing.JButton Clinici12;
	private javax.swing.JButton Clinici2;
	private javax.swing.JButton Clinici3;
	private javax.swing.JButton Clinici4;
	private javax.swing.JButton Clinici5;
	private javax.swing.JButton Clinici6;
	private javax.swing.JButton Clinici7;
	private javax.swing.JButton Clinici8;
	private javax.swing.JButton Clinici9;
	private javax.swing.JButton Medici;
	private javax.swing.JButton Medici1;
	private javax.swing.JButton Medici10;
	private javax.swing.JButton Medici11;
	private javax.swing.JButton Medici12;
	private javax.swing.JButton Medici2;
	private javax.swing.JButton Medici3;
	private javax.swing.JButton Medici4;
	private javax.swing.JButton Medici5;
	private javax.swing.JButton Medici6;
	private javax.swing.JButton Medici7;
	private javax.swing.JButton Medici8;
	private javax.swing.JButton Medici9;
	private javax.swing.JButton Programari;
	private javax.swing.JButton Programari1;
	private javax.swing.JButton Programari10;
	private javax.swing.JButton Programari11;
	private javax.swing.JButton Programari12;
	private javax.swing.JButton Programari2;
	private javax.swing.JButton Programari3;
	private javax.swing.JButton Programari4;
	private javax.swing.JButton Programari5;
	private javax.swing.JButton Programari6;
	private javax.swing.JButton Programari7;
	private javax.swing.JButton Programari8;
	private javax.swing.JButton Programari9;
	private javax.swing.JButton Raport;
	private javax.swing.JButton Raport1;
	private javax.swing.JButton Raport10;
	private javax.swing.JButton Raport11;
	private javax.swing.JButton Raport12;
	private javax.swing.JButton Raport2;
	private javax.swing.JButton Raport3;
	private javax.swing.JButton Raport4;
	private javax.swing.JButton Raport5;
	private javax.swing.JButton Raport6;
	private javax.swing.JButton Raport7;
	private javax.swing.JButton Raport8;
	private javax.swing.JButton Raport9;
	private javax.swing.JButton anulare;
	private javax.swing.JButton bon_fiscal;
	private javax.swing.JButton inregistrare;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel10;
	private javax.swing.JPanel jPanel11;
	private javax.swing.JPanel jPanel12;
	private javax.swing.JPanel jPanel13;
	private javax.swing.JPanel jPanel14;
	private javax.swing.JPanel jPanel15;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JPanel jPanel7;
	private javax.swing.JPanel jPanel8;
	private javax.swing.JPanel jPanel9;
	private javax.swing.JButton medici;
	private javax.swing.JButton orar;
	private javax.swing.JButton programare;
	// End of variables declaration
}
