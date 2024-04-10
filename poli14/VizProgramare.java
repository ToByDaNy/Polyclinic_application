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

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Costea Delia
 */
public class VizProgramare extends javax.swing.JFrame {

	/**
	 * Creates new form ProgramarePacient
	 */
	public VizProgramare(UserParola a) {
		initComponents(a);
		tabel_update(a);
	}

	Connection con1;
	PreparedStatement insert;
	Statement statement;

	private void tabel_update(UserParola a) {
		int x;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con1 = DriverManager.getConnection("jdbc:mysql://localhost/policlinica", "root", "1234");
			statement = con1.createStatement();

			insert = con1.prepareStatement("select* from programarea where CNP_Pacient = '" + a.Parola + "';");
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
			Logger.getLogger(VizProgramare.class.getName()).log(Level.SEVERE, null, ex);
		}

		catch (SQLException ex) {
			Logger.getLogger(VizProgramare.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents(UserParola a) {

		jLabel4 = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTable2 = new javax.swing.JTable();
		jPanel2 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		inapoi = new javax.swing.JButton();

		jLabel4.setText("jLabel4");

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

		jScrollPane2.setViewportView(jTable2);

		jPanel2.setBackground(new java.awt.Color(153, 255, 255));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 285, Short.MAX_VALUE));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 323, Short.MAX_VALUE));

		jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
		jLabel1.setText("Programare Pacient");

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
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(163, 163, 163)
								.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1090,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(40, 40, 40).addComponent(inapoi)
								.addGap(459, 459, 459).addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE,
										306, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap(22, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1).addComponent(inapoi))
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(65, 65, 65).addComponent(jPanel2,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(18, 18, 18).addComponent(
										jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 353,
										javax.swing.GroupLayout.PREFERRED_SIZE)))));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addComponent(jPanel1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 1317, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>

	private void inapoiActionPerformed(java.awt.event.ActionEvent evt, UserParola a) {
		// TODO add your handling code here:
		Pacient p = new Pacient(a);
		p.show();
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
			java.util.logging.Logger.getLogger(VizProgramare.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(VizProgramare.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(VizProgramare.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(VizProgramare.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				UserParola a = new UserParola("", "");
				new VizProgramare(a).setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton inapoi;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTable jTable2;
	// End of variables declaration
}