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
 * @author ToBy
 */
public class BonFiscal extends javax.swing.JFrame {

	/**
	 * Creates new form BonFiscal
	 */
	public BonFiscal(UserParola a) {
		initComponents(a);
		tabel_update(a);
		tabel_update2(a);
	}

	Connection con1;
	PreparedStatement insert;
	Statement statement;

	private void tabel_update(UserParola a) {
		int x;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con1 = DriverManager.getConnection("jdbc:mysql://localhost/policlinica", "root", "1234");

			insert = con1.prepareStatement("select * from Bon_fiscal ;");
			ResultSet rs = insert.executeQuery();
			ResultSetMetaData Rss = rs.getMetaData();
			x = Rss.getColumnCount();
			DefaultTableModel Df = (DefaultTableModel) jTable1.getModel();
			Df.setRowCount(0);

			while (rs.next()) {
				Vector v2 = new Vector();
				for (int i = 1; i <= x; i++) {
					v2.add(rs.getString("idBon"));
					v2.add(rs.getString("Unitate_medicala"));
					v2.add(rs.getString("Today"));
					v2.add(rs.getFloat("Pret"));
				}
				Df.addRow(v2);
			}

		} catch (ClassNotFoundException ex) {
			Logger.getLogger(BonFiscal.class.getName()).log(Level.SEVERE, null, ex);
		}

		catch (SQLException ex) {
			Logger.getLogger(BonFiscal.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	private void tabel_update2(UserParola a) {
		int x;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con1 = DriverManager.getConnection("jdbc:mysql://localhost/policlinica", "root", "1234");

			insert = con1.prepareStatement("select * from Raport where incheiat = 1;");
			ResultSet rs = insert.executeQuery();
			ResultSetMetaData Rss = rs.getMetaData();
			x = Rss.getColumnCount();
			DefaultTableModel Df = (DefaultTableModel) jTable2.getModel();
			Df.setRowCount(0);

			while (rs.next()) {
				Vector v2 = new Vector();
				for (int i = 1; i <= x; i++) {
					v2.add(rs.getString("idRaport"));
					v2.add(rs.getString("CNP"));
					v2.add(rs.getString("idMedic"));
					v2.add(rs.getString("idAsistent"));
					v2.add(rs.getString("Tip_raport"));
				}
				Df.addRow(v2);
			}

		} catch (ClassNotFoundException ex) {
			Logger.getLogger(BonFiscal.class.getName()).log(Level.SEVERE, null, ex);
		}

		catch (SQLException ex) {
			Logger.getLogger(BonFiscal.class.getName()).log(Level.SEVERE, null, ex);
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
		jScrollPane2 = new javax.swing.JScrollPane();
		jTable2 = new javax.swing.JTable();
		jLabel2 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		raport = new javax.swing.JTextField();
		pret = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		raport1 = new javax.swing.JTextField();
		emitere = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(153, 255, 255));

		jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
		jLabel1.setText("Bon Fiscal");

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
						new String[] { "idRaport", "Unitate Medicala", "Ziua", "Pret" }) {
					Class[] types = new Class[] { java.lang.Integer.class, java.lang.String.class,
							java.lang.String.class, java.lang.Float.class };

					public Class getColumnClass(int columnIndex) {
						return types[columnIndex];
					}
				});
		jScrollPane1.setViewportView(jTable1);

		jTable2.setBackground(new java.awt.Color(204, 255, 255));
		jTable2.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null, null }, { null, null, null, null, null },
						{ null, null, null, null, null }, { null, null, null, null, null } },
				new String[] { "idRaport", "CNP", "idMedic", "idAsistent", "Tip Raport" }) {
			Class[] types = new Class[] { java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class,
					java.lang.Integer.class, java.lang.String.class };

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

		jLabel2.setText("Raport");

		jLabel5.setText("Pret");

		jLabel3.setText("Unitate");

		emitere.setBackground(new java.awt.Color(153, 204, 255));
		emitere.setText("Emitere Bon");
		emitere.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				emitereActionPerformed(evt, a);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(jPanel1Layout.createSequentialGroup()
																.addGap(24, 24, 24).addComponent(inapoi))
														.addGroup(
																jPanel1Layout.createSequentialGroup().addGap(57, 57, 57)
																		.addComponent(jLabel1)))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
														.createSequentialGroup().addContainerGap()
														.addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 59,
																Short.MAX_VALUE)
														.addGap(26, 26, 26)
														.addGroup(jPanel1Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(pret,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 111,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(raport,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 111,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(raport1,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 111,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGap(65, 65, 65)))
												.addComponent(
														jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
														.addGroup(jPanel1Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(jLabel5,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 44,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(jLabel3,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 59,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
														jPanel1Layout.createSequentialGroup()
																.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addComponent(emitere).addGap(73, 73, 73)))
												.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(33, 33, 33)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(26, 26, 26).addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addComponent(inapoi).addGap(40, 40, 40)
								.addComponent(jLabel1).addGap(76, 76, 76)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel2).addComponent(raport,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207,
								javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(
								jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup().addGap(18, 18, 18)
												.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0,
														Short.MAX_VALUE)
												.addContainerGap())
										.addGroup(jPanel1Layout.createSequentialGroup().addGap(25, 25, 25)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel3)
														.addComponent(raport1, javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(38, 38, 38)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(pret, javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel5))
												.addGap(41, 41, 41).addComponent(emitere)
												.addContainerGap(82, Short.MAX_VALUE)))));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
		Receptioner r = new Receptioner(a);
		r.show();
		dispose();

	}

	private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		DefaultTableModel Df = (DefaultTableModel) jTable2.getModel();
		int selectedIndex = jTable2.getSelectedRow();
		raport.setText(Df.getValueAt(selectedIndex, 0).toString());

		try {
			statement = con1.createStatement();
			ResultSet rs = statement.executeQuery(
					"Select Pret*Durata AS Pretul from servicii_medicale sm inner join consultatii using (idServicii_Medicale) where idRaport = "
							+ raport.getText() + ";");
			rs.next();
			pret.setText(rs.getString("Pretul"));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void emitereActionPerformed(java.awt.event.ActionEvent evt, UserParola a) {
		// TODO add your handling code here:

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con1 = DriverManager.getConnection("jdbc:mysql://localhost/policlinica", "root", "1234");
			insert = con1.prepareStatement(
					"insert into bon_fiscal(idRaport, Unitate_medicala,Today ,Pret)values(?,?,NOW(),?)");
			statement = con1.createStatement();
			ResultSet rs = statement.executeQuery(
					"Select Pret*Durata AS Pretul from servicii_medicale sm inner join consultatii using (idServicii_Medicale) where idRaport = "
							+ raport.getText() + ";");
			insert.setString(1, raport.getText());
			insert.setString(2, raport1.getText());
			rs.next();
			insert.setString(3, rs.getString("Pretul"));// ordinea din tabele

			insert.executeUpdate();

			JOptionPane.showMessageDialog(this, "Adaugat");

			insert = con1.prepareStatement("call drop_raport( " + raport.getText() + ");");
			insert.executeUpdate();
			tabel_update(a);
			tabel_update2(a);

			raport.setText("");
			raport1.setText("");
			pret.setText("");

			raport.requestFocus();

		} catch (ClassNotFoundException ex) {
			Logger.getLogger(BonFiscal.class.getName()).log(Level.SEVERE, null, ex);
		}

		catch (SQLException ex) {
			Logger.getLogger(BonFiscal.class.getName()).log(Level.SEVERE, null, ex);
		}

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
			java.util.logging.Logger.getLogger(BonFiscal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(BonFiscal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(BonFiscal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(BonFiscal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				UserParola a = new UserParola();
				new BonFiscal(a).setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton emitere;
	private javax.swing.JButton inapoi;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTable jTable1;
	private javax.swing.JTable jTable2;
	private javax.swing.JTextField pret;
	private javax.swing.JTextField raport;
	private javax.swing.JTextField raport1;
	// End of variables declaration
}
