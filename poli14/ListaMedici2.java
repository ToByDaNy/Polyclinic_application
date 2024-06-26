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
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.table.DefaultTableModel;

/**
 *
 * 
 */
public class ListaMedici2 extends javax.swing.JFrame {

	/**
	 * Creates new form ListaMedici
	 */
	public ListaMedici2(UserParola a) {
		initComponents(a);
		tabel_update();
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
		jLabel1 = new javax.swing.JLabel();
		Inapoi = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(153, 255, 255));

		jTable2.setBackground(new java.awt.Color(204, 255, 255));
		jTable2.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null } },
				new String[] { "idMedic", "Specialitate", "Grad", "Cod Parafa", "Competente", "Titlu Stiintific",
						"Post Didactic", "Procent Salariu" }) {
			Class[] types = new Class[] { java.lang.Integer.class, java.lang.String.class, java.lang.String.class,
					java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class,
					java.lang.Integer.class };

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

		jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
		jLabel1.setText("Lista Medicilor");

		Inapoi.setBackground(new java.awt.Color(153, 204, 255));
		Inapoi.setText("Inapoi");
		Inapoi.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				InapoiActionPerformed(evt, a);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap(46, Short.MAX_VALUE)
						.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 772,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(41, 41, 41))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup().addGap(25, 25, 25).addComponent(Inapoi)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(311, 311, 311)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
						.addGap(22, 22, 22)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel1).addComponent(Inapoi))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
						.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 361,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(45, 45, 45)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>

	private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		DefaultTableModel Df = (DefaultTableModel) jTable2.getModel();
		int selectedIndex = jTable2.getSelectedRow();

	}

	private void InapoiActionPerformed(java.awt.event.ActionEvent evt, UserParola a) {
		// TODO add your handling code here:
		Pacient n = new Pacient(a);
		n.show();
		dispose();
	}

	Connection con1;
	PreparedStatement insert;

	private void tabel_update() {
		int x;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con1 = DriverManager.getConnection("jdbc:mysql://localhost/policlinica", "root", "1234");
			insert = con1.prepareStatement("select* from medic");
			ResultSet rs = insert.executeQuery();
			ResultSetMetaData Rss = rs.getMetaData();
			x = Rss.getColumnCount();
			DefaultTableModel Df = (DefaultTableModel) jTable2.getModel();
			Df.setRowCount(0);

			while (rs.next()) {
				Vector v2 = new Vector();
				for (int i = 1; i <= x; i++) {
					v2.add(rs.getString("idMedic"));
					v2.add(rs.getString("Specialitate"));
					v2.add(rs.getString("Gradul"));
					v2.add(rs.getString("Cod_Parafa"));
					v2.add(rs.getString("Competente"));
					v2.add(rs.getString("Titlul_ST"));
					v2.add(rs.getString("Post_Didactic"));
					v2.add(rs.getString("Procent_Salariu"));

				}
				Df.addRow(v2);
			}

		} catch (ClassNotFoundException ex) {
			Logger.getLogger(ListaMedici.class.getName()).log(Level.SEVERE, null, ex);
		}

		catch (SQLException ex) {
			Logger.getLogger(ListaMedici.class.getName()).log(Level.SEVERE, null, ex);
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
			java.util.logging.Logger.getLogger(ListaMedici.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ListaMedici.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ListaMedici.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ListaMedici.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				UserParola a = new UserParola();
				new ListaMedici(a).setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton Inapoi;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTable jTable2;
	// End of variables declaration
}
