/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poli14;

/**
 *
 * @author Costea Delia
 */
public class Medic extends javax.swing.JFrame {

	/**
	 * Creates new form Medic
	 */
	public Medic(UserParola a) {
		initComponents(a);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents(UserParola a) {

		jButton1 = new javax.swing.JButton();
		vizualizare_rap = new javax.swing.JPanel();
		logout = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		Salariu = new javax.swing.JButton();
		vizualizare = new javax.swing.JButton();
		pacienti = new javax.swing.JButton();
		completare_rap = new javax.swing.JButton();
		repartizare = new javax.swing.JButton();
		servicii1 = new javax.swing.JButton();

		jButton1.setText("jButton1");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		vizualizare_rap.setBackground(new java.awt.Color(153, 255, 255));

		logout.setBackground(new java.awt.Color(153, 204, 255));
		logout.setText("Log out");
		logout.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				logoutActionPerformed(evt);
			}
		});

		jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
		jLabel1.setText("Medic");

		Salariu.setBackground(new java.awt.Color(153, 204, 255));
		Salariu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		Salariu.setText("Salariu");
		Salariu.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				SalariuActionPerformed(evt, a);
			}
		});

		vizualizare.setBackground(new java.awt.Color(153, 204, 255));
		vizualizare.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		vizualizare.setText("Vizualizare Rapoarte");
		vizualizare.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				vizualizareActionPerformed(evt, a);
			}
		});

		pacienti.setBackground(new java.awt.Color(153, 204, 255));
		pacienti.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		pacienti.setText("Vizualizare Pacienti");
		pacienti.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				pacientiActionPerformed(evt, a);
			}
		});

		completare_rap.setBackground(new java.awt.Color(153, 204, 255));
		completare_rap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		completare_rap.setText("Completare Raport");
		completare_rap.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				completare_rapActionPerformed(evt, a);
			}
		});

		repartizare.setBackground(new java.awt.Color(153, 204, 255));
		repartizare.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		repartizare.setText("Repartizare");
		repartizare.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				repartizareActionPerformed(evt, a);
			}
		});

		servicii1.setBackground(new java.awt.Color(153, 204, 255));
		servicii1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		servicii1.setText("Servicii Medicale");
		servicii1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				serviciiActionPerformed(evt, a);
			}
		});

		javax.swing.GroupLayout vizualizare_rapLayout = new javax.swing.GroupLayout(vizualizare_rap);
		vizualizare_rap.setLayout(vizualizare_rapLayout);
		vizualizare_rapLayout.setHorizontalGroup(vizualizare_rapLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vizualizare_rapLayout.createSequentialGroup()
						.addGroup(vizualizare_rapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(vizualizare_rapLayout.createSequentialGroup().addGap(236, 236, 236)
										.addComponent(repartizare, javax.swing.GroupLayout.PREFERRED_SIZE, 136,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(vizualizare_rapLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
										.addGroup(vizualizare_rapLayout.createSequentialGroup().addGap(47, 47, 47)
												.addGroup(vizualizare_rapLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(pacienti, javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(vizualizare, javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(completare_rap))
										.addGroup(vizualizare_rapLayout.createSequentialGroup().addContainerGap()
												.addComponent(logout).addGap(193, 193, 193).addComponent(jLabel1,
														javax.swing.GroupLayout.PREFERRED_SIZE, 106,
														javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
						.addGroup(vizualizare_rapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(servicii1, javax.swing.GroupLayout.PREFERRED_SIZE, 130,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Salariu, javax.swing.GroupLayout.PREFERRED_SIZE, 130,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(47, 47, 47)));
		vizualizare_rapLayout.setVerticalGroup(vizualizare_rapLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(vizualizare_rapLayout.createSequentialGroup().addGroup(vizualizare_rapLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(vizualizare_rapLayout.createSequentialGroup().addGap(19, 19, 19).addComponent(logout))
						.addGroup(vizualizare_rapLayout.createSequentialGroup().addGap(36, 36, 36).addComponent(jLabel1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGroup(vizualizare_rapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(vizualizare_rapLayout.createSequentialGroup().addGap(54, 150, Short.MAX_VALUE)
										.addGroup(vizualizare_rapLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(pacienti, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(repartizare, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(Salariu, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(76, 76, 76))
								.addGroup(vizualizare_rapLayout.createSequentialGroup().addGap(40, 40, 40)
										.addGroup(vizualizare_rapLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(vizualizare, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(completare_rap, javax.swing.GroupLayout.PREFERRED_SIZE,
														60, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(servicii1, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(vizualizare_rap,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(vizualizare_rap,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>

	private void serviciiActionPerformed(java.awt.event.ActionEvent evt, UserParola a) {
		// TODO add your handling code here:
		ServiciiMedicale sm = new ServiciiMedicale(a);
		sm.show();
		dispose();
	}

	private void vizualizareActionPerformed(java.awt.event.ActionEvent evt, UserParola a) {
		// TODO add your handling code here:
		VzRapoarte vr = new VzRapoarte(a);
		vr.show();
		dispose();
	}

	private void pacientiActionPerformed(java.awt.event.ActionEvent evt, UserParola a) {
		// TODO add your handling code here:
		VizualizarePacient vp = new VizualizarePacient(a);
		vp.show();
		dispose();
	}

	private void completare_rapActionPerformed(java.awt.event.ActionEvent evt, UserParola a) {
		// TODO add your handling code here:
		String t = "Medic";
		VizualizareRapoarte vp = new VizualizareRapoarte(a, t);
		vp.show();
		dispose();
	}

	private void logoutActionPerformed(java.awt.event.ActionEvent evt) {
		LoginMedicale l = new LoginMedicale();
		l.show();
		dispose();
	}

	private void repartizareActionPerformed(java.awt.event.ActionEvent evt, UserParola a) {
		// TODO add your handling code here:
		ListaClinici2 lc = new ListaClinici2(a);
		lc.show();
		dispose();
	}

	private void SalariuActionPerformed(java.awt.event.ActionEvent evt, UserParola a) {
		// TODO add your handling code here:
		SalariiMedic sm = new SalariiMedic(a);
		sm.show();
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
			java.util.logging.Logger.getLogger(Medic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Medic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Medic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Medic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				UserParola a = new UserParola("popescu.maria@yahoo.com", "1950822342352");
				new Medic(a).setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton Salariu;
	private javax.swing.JButton completare_rap;
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JButton logout;
	private javax.swing.JButton pacienti;
	private javax.swing.JButton repartizare;
	private javax.swing.JButton servicii1;
	private javax.swing.JButton vizualizare;
	private javax.swing.JPanel vizualizare_rap;
	// End of variables declaration
}
