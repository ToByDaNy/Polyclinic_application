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
 * @author ToBy
 */
public class SalariiMedic extends javax.swing.JFrame {

	/**
	 * Creates new form SalariiMedic
	 */
	public SalariiMedic(UserParola a) {
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
			ResultSet rs1 = statement.executeQuery(
					"Select idMedic from medic  m inner join angajat using (idMedic) inner join utilizator using (idAngajat) where CNP ='"
							+ a.Parola + "';");
			rs1.next();
			insert = con1.prepareStatement(
					"select p.idUnitate as unit ,idRaport,sm.Pret*31 as Pret,p.idMedic from servicii_medicale sm inner join consultatii using (idServicii_Medicale) inner join programarea p using (idConsultatii) where idMedic = "
							+ rs1.getString("idMedic") + ";");
			ResultSet rs = insert.executeQuery();
			ResultSetMetaData Rss = rs.getMetaData();
			x = Rss.getColumnCount();
			DefaultTableModel Df = (DefaultTableModel) jTable1.getModel();
			Df.setRowCount(0);

			while (rs.next()) {
				Vector v2 = new Vector();
				for (int i = 1; i <= x; i++) {

					v2.add(rs.getString("idRaport"));
					v2.add(rs.getString("idMedic"));
					v2.add(rs.getString("Pret"));
					v2.add(rs.getString("unit"));

				}
				Df.addRow(v2);
			}

		} catch (ClassNotFoundException ex) {
			Logger.getLogger(ProfitMedic.class.getName()).log(Level.SEVERE, null, ex);
		}

		catch (SQLException ex) {
			Logger.getLogger(ProfitMedic.class.getName()).log(Level.SEVERE, null, ex);
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

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		inapoi = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(153, 255, 255));

		jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
		jLabel1.setText("Salariu Medic");

		inapoi.setBackground(new java.awt.Color(153, 204, 255));
		inapoi.setText("Inapoi");
		inapoi.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				inapoiActionPerformed(evt, a);
			}
		});

		jTable1.setBackground(new java.awt.Color(204, 255, 255));
		jTable1.setModel(
				new javax.swing.table.DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "idRaport", "idMedic", "Salariu", "idUnitate" }));
		jScrollPane1.setViewportView(jTable1);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(15, 15, 15).addComponent(inapoi)
						.addGap(231, 231, 231).addComponent(jLabel1)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
						.addContainerGap(85, Short.MAX_VALUE).addComponent(jScrollPane1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(61, 61, 61)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(18, 18, 18).addComponent(inapoi))
								.addGroup(
										jPanel1Layout.createSequentialGroup().addGap(29, 29, 29).addComponent(jLabel1)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(50, 50, 50)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 3, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>

	private void inapoiActionPerformed(java.awt.event.ActionEvent evt, UserParola a) {
		// TODO add your handling code here:

		Medic m = new Medic(a);
		m.show();
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
			java.util.logging.Logger.getLogger(SalariiMedic.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(SalariiMedic.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(SalariiMedic.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(SalariiMedic.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				UserParola a = new UserParola("popescu.maria@yahoo.com", "1950822342352");
				new SalariiMedic(a).setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton inapoi;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	// End of variables declaration
}
