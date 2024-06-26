/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poli14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * 
 */
public class ProgramarePacient2 extends javax.swing.JFrame {

	/**
	 * Creates new form ProgramarePacient
	 */
	public ProgramarePacient2(UserParola a) {
		initComponents(a);
		tabel_update(a);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents(UserParola a) {

		jPanel1 = new javax.swing.JPanel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTable2 = new javax.swing.JTable();
		jPanel2 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		unitate = new javax.swing.JTextField();
		stergere = new javax.swing.JButton();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		consult = new javax.swing.JTextField();
		nume = new javax.swing.JTextField();
		prenume = new javax.swing.JTextField();
		cnp = new javax.swing.JTextField();
		inceput = new javax.swing.JTextField();
		sfarsit = new javax.swing.JTextField();
		jLabel10 = new javax.swing.JLabel();
		medic = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		inapoi = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(153, 255, 255));

		jScrollPane2.setBorder(null);

		jTable2.setBackground(new java.awt.Color(204, 255, 255));
		jTable2.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null } },
				new String[] { "idProgramarea", "idMedic", "idReceptioner", "idUnitate", "idConsultatii",
						"Nume_Pacient", "Prenume_Pacient", "CNP_Pacient", "Inceput_Prog", "Final_Prog", "Today" }) {
			Class[] types = new Class[] { java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class,
					java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class,
					java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}
		});
		jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jTable2MouseClicked(evt);
			}
		});
		jScrollPane2.setViewportView(jTable2);

		jPanel2.setBackground(new java.awt.Color(153, 255, 255));

		jLabel3.setText("idUnitate");

		unitate.setBackground(new java.awt.Color(204, 255, 255));

		stergere.setBackground(new java.awt.Color(153, 204, 255));
		stergere.setText("Stergere");
		stergere.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				stergereActionPerformed(evt, a);
			}
		});

		jLabel5.setText("idConsultatii");

		jLabel6.setText("Nume Pacient");

		jLabel7.setText("Prenume Pacient");

		jLabel8.setText("CNP Pacient");

		jLabel9.setText("Inceput Programare");

		consult.setBackground(new java.awt.Color(204, 255, 255));

		nume.setBackground(new java.awt.Color(204, 255, 255));
		nume.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionPerformed(evt);
			}
		});

		prenume.setBackground(new java.awt.Color(204, 255, 255));

		cnp.setBackground(new java.awt.Color(204, 255, 255));

		inceput.setBackground(new java.awt.Color(204, 255, 255));

		sfarsit.setBackground(new java.awt.Color(204, 255, 255));
		sfarsit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				sfarsitActionPerformed(evt);
			}
		});

		jLabel10.setText("Final Programare");

		medic.setBackground(new java.awt.Color(204, 255, 255));
		medic.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				medicActionPerformed(evt);
			}
		});

		jLabel2.setText("idMedic");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup()
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addGroup(jPanel2Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
												.addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 152,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(nume, javax.swing.GroupLayout.PREFERRED_SIZE, 107,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel5)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(consult, javax.swing.GroupLayout.PREFERRED_SIZE, 107,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel2Layout.createSequentialGroup()
												.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(unitate, javax.swing.GroupLayout.PREFERRED_SIZE, 107,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel2Layout.createSequentialGroup()
												.addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGap(43, 43, 43).addComponent(medic,
														javax.swing.GroupLayout.PREFERRED_SIZE, 107,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(127, 127, 127))
						.addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(stergere)
								.addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 152,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 105,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel9).addComponent(jLabel10,
												javax.swing.GroupLayout.PREFERRED_SIZE, 105,
												javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(prenume, javax.swing.GroupLayout.DEFAULT_SIZE, 107,
														Short.MAX_VALUE)
												.addComponent(cnp).addComponent(inceput).addComponent(sfarsit))))
								.addContainerGap()))));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(medic, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel2))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel3).addComponent(unitate, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel5).addComponent(consult, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(nume, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel6))
						.addGap(18, 18, 18)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel7).addComponent(prenume, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(cnp, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel8))
						.addGap(18, 18, 18)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(inceput, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel9))
						.addGap(18, 18, 18)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel10).addComponent(sfarsit, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
						.addComponent(stergere)));

		jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
		jLabel1.setText("Anulare Programare");

		inapoi.setBackground(new java.awt.Color(153, 204, 255));
		inapoi.setText("Inapoi");
		inapoi.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				inapoiActionPerformed(evt, a);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(40, 40, 40).addComponent(inapoi)
								.addGap(459, 459, 459).addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE,
										306, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(16, 16, 16)
								.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 285,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1090,
										javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(27, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(22, 22, 22)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1).addComponent(inapoi))
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(65, 65, 65).addComponent(jPanel2,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(48, 48, 48).addComponent(
										jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 353,
										javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGap(0, 38, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}
// </editor-fold>

	Connection con1;
	PreparedStatement insert;
	Statement statement;

	private void tabel_update(UserParola a) {
		int x;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con1 = DriverManager.getConnection("jdbc:mysql://localhost/policlinica", "root", "1234");
			statement = con1.createStatement();
			ResultSet rs2 = statement.executeQuery(
					"select idReceptioner from receptioner r inner join angajat using (idReceptioner) inner join utilizator using (idAngajat) where CNP = '"
							+ a.Parola + "'");
			rs2.next();
			insert = con1.prepareStatement(
					"select* from programarea where idReceptioner = " + rs2.getString("idReceptioner") + ";");
			ResultSet rs = insert.executeQuery();
			ResultSetMetaData Rss = rs.getMetaData();
			x = Rss.getColumnCount();
			DefaultTableModel Df = (DefaultTableModel) jTable2.getModel();
			Df.setRowCount(0);

			while (rs.next()) {
				Vector v2 = new Vector();
				for (int i = 1; i <= x; i++) {
					v2.add(rs.getString("idProgramarea"));
					v2.add(rs.getString("idMedic"));
					v2.add(rs.getString("idReceptioner"));
					v2.add(rs.getString("idUnitate"));
					v2.add(rs.getString("idConsultatii"));
					v2.add(rs.getString("Nume_Pacient"));
					v2.add(rs.getString("Prenume_pacient"));
					v2.add(rs.getString("CNP_Pacient"));
					v2.add(rs.getString("Inceput_Prog"));
					v2.add(rs.getString("Final_Prog"));

					v2.add(rs.getString("Today"));
				}
				Df.addRow(v2);
			}

		} catch (ClassNotFoundException ex) {
			Logger.getLogger(ProgramarePacient2.class.getName()).log(Level.SEVERE, null, ex);
		}

		catch (SQLException ex) {
			Logger.getLogger(ProgramarePacient2.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		DefaultTableModel Df = (DefaultTableModel) jTable2.getModel();
		int selectedIndex = jTable2.getSelectedRow();
		medic.setText(Df.getValueAt(selectedIndex, 1).toString());
		unitate.setText(Df.getValueAt(selectedIndex, 3).toString());
		consult.setText(Df.getValueAt(selectedIndex, 4).toString());
		nume.setText(Df.getValueAt(selectedIndex, 5).toString());
		prenume.setText(Df.getValueAt(selectedIndex, 6).toString());
		cnp.setText(Df.getValueAt(selectedIndex, 7).toString());
		inceput.setText(Df.getValueAt(selectedIndex, 8).toString());
		sfarsit.setText(Df.getValueAt(selectedIndex, 9).toString());

	}

	private void medicActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void stergereActionPerformed(java.awt.event.ActionEvent evt, UserParola a) {
		// TODO add your handling code here:
		DefaultTableModel Df = (DefaultTableModel) jTable2.getModel();
		int selectedIndex = jTable2.getSelectedRow();
		int id = Integer.parseInt(Df.getValueAt(selectedIndex, 0).toString());

		try {

			int dialogResult = JOptionPane.showConfirmDialog(null, "Vrei sa stergi inregistrarea?", "Atentie!",
					JOptionPane.YES_NO_OPTION);
			if (dialogResult == JOptionPane.YES_OPTION) {
				Class.forName("com.mysql.jdbc.Driver");
				con1 = DriverManager.getConnection("jdbc:mysql://localhost/policlinica", "root", "1234");
				insert = con1.prepareStatement("delete from programarea where idProgramarea = ?");

				insert.setInt(1, id);
				insert.executeUpdate();
				JOptionPane.showMessageDialog(this, "Sters");
				tabel_update(a);

				medic.setText("");
				unitate.setText("");
				consult.setText("");
				nume.setText("");
				prenume.setText("");
				cnp.setText("");
				inceput.setText("");
				sfarsit.setText("");

				medic.requestFocus();
			}

		} catch (ClassNotFoundException ex) {
			Logger.getLogger(ProgramarePacient2.class.getName()).log(Level.SEVERE, null, ex);
		}

		catch (SQLException ex) {
			Logger.getLogger(ProgramarePacient2.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	private void sfarsitActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void inapoiActionPerformed(java.awt.event.ActionEvent evt, UserParola a) {
		// TODO add your handling code here:
		Receptioner r = new Receptioner(a);
		r.show();
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
			java.util.logging.Logger.getLogger(ProgramarePacient2.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ProgramarePacient2.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ProgramarePacient2.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ProgramarePacient2.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				UserParola a = new UserParola();
				new ProgramarePacient2(a).setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JTextField cnp;
	private javax.swing.JTextField consult;
	private javax.swing.JButton inapoi;
	private javax.swing.JTextField inceput;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTable jTable2;
	private javax.swing.JTextField medic;
	private javax.swing.JTextField nume;
	private javax.swing.JTextField prenume;
	private javax.swing.JTextField sfarsit;
	private javax.swing.JButton stergere;
	private javax.swing.JTextField unitate;
	// End of variables declaration
}
