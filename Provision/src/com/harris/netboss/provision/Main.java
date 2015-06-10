package com.harris.netboss.provision;

import java.awt.Cursor;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5600409472739057209L;

	public static Date startTimer;
	public static Date stopTimer;

	DateFormat dateFormat = new SimpleDateFormat("mm:ss");

	static File dir;

	public static void setDir(File file) {
		dir = file;

	}

	public static File getDir() {
		return dir;

	}

	public Main() {
		initComponents();
		setIconImage(getImage());
	}

	protected static Image getImage() {
		java.net.URL imgURL;
		imgURL = Main.class.getResource(ProvisionConstants.PROVISION);
		if (imgURL != null) {
			return new ImageIcon(imgURL).getImage();
		} else {
			return null;
		}
	}

	private void initComponents() {

		selectedFileField = new javax.swing.JTextField();
		createTopologyButton = new javax.swing.JButton();
		selectedFileLable = new javax.swing.JLabel();
		processTimerField = new javax.swing.JTextField();
		processTimerLable = new javax.swing.JLabel();
		scrollPane1 = new javax.swing.JScrollPane();
		topologyTree = new javax.swing.JTree();
		scrollPane2 = new javax.swing.JScrollPane();
		propertiesTable = new javax.swing.JTable();
		browseButton = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Provision");
		setName("Provision");
		setResizable(false);

		createTopologyButton.setText("Create Topology");
		createTopologyButton
				.addMouseListener(new java.awt.event.MouseAdapter() {
					public void mouseClicked(java.awt.event.MouseEvent evt) {
						try {
							createTopologyButtonMouseClicked(evt);
						} catch (Exception e) {
							JOptionPane.showMessageDialog(rootPane,
									e.getMessage(), "ERROR", WIDTH);
						}
					}
				});

		selectedFileLable.setText("Selected file:");

		processTimerField.setEditable(false);
		processTimerField.setToolTipText("");

		processTimerLable.setText("Process timer:");

		javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode(
				" topology");
		topologyTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
		topologyTree.setToolTipText("");
		topologyTree
				.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
					public void valueChanged(
							javax.swing.event.TreeSelectionEvent evt) {
						topologyTreeValueChanged(evt);
					}
				});
		scrollPane1.setViewportView(topologyTree);

		scrollPane2.setEnabled(false);

		propertiesTable.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {

				}, new String[] { "Property", "Value" }));
		propertiesTable.setCellSelectionEnabled(true);
		scrollPane2.setViewportView(propertiesTable);

		browseButton.setText("Browse...");
		browseButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				browseButtonMouseClicked(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING,
												false)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		selectedFileLable)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		selectedFileField)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		browseButton))
												.addComponent(
														scrollPane1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														437,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		createTopologyButton,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		processTimerLable)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		processTimerField,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		46,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addComponent(
														scrollPane2,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														495, Short.MAX_VALUE))));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														selectedFileField,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(selectedFileLable)
												.addComponent(
														createTopologyButton)
												.addComponent(
														processTimerField,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(processTimerLable)
												.addComponent(browseButton))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(scrollPane1)
												.addComponent(
														scrollPane2,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														670, Short.MAX_VALUE))));

		pack();
		setLocationRelativeTo(null);
	}

	private void createTopologyButtonMouseClicked(java.awt.event.MouseEvent evt)
			throws Exception {
		propertiesTable.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {

				}, new String[] { "Property", "Value" }));
		File file;
		file = new File(selectedFileField.getText());
		if (file.isFile()) {
			setDir(file);
		} else {
			setDir(null);
		}
		if (dir != null && dir.isFile()) {

			startTimer = new Date();

			setCursor(new Cursor(Cursor.WAIT_CURSOR));

			ProvisionConstants.topology.delete(0,
					ProvisionConstants.topology.length());
			ProvisionConstants.properties.delete(0,
					ProvisionConstants.properties.length());

			CreateTopology topology;
			topology = new CreateTopology();

			try {
				topology.create();
			} catch (IOException ex) {
				Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null,
						ex);
			}

			setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

			stopTimer = new Date();

			processTimerField.setText(dateFormat.format(stopTimer.getTime()
					- startTimer.getTime()));

		} else {
			JOptionPane.showMessageDialog(rootPane,
					"Wrong value of the field!", "ERROR", WIDTH);
		}

	}

	private void topologyTreeValueChanged(
			javax.swing.event.TreeSelectionEvent evt) {
		setCursor(new Cursor(Cursor.WAIT_CURSOR));

		if (!topologyTree.getSelectionModel().isSelectionEmpty()) {
			CreateProperties property;
			property = new CreateProperties();
			property.create();
		}
		setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

	}

	private void browseButtonMouseClicked(java.awt.event.MouseEvent evt) {
		JFileChooser fileopenSelectedFile = new JFileChooser();
		@SuppressWarnings("unused")
		int ret;
		ret = fileopenSelectedFile.showDialog(null, "Select file");
		File file;

		file = fileopenSelectedFile.getSelectedFile();
		if (fileopenSelectedFile.getSelectedFile() != null) {
			selectedFileField.setText((String) file.toString());
			setDir(file);
		}
	}

	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException
				| javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Main().setVisible(true);
			}
		});
	}

	private javax.swing.JButton browseButton;
	public javax.swing.JButton createTopologyButton;
	private javax.swing.JLabel selectedFileLable;
	private javax.swing.JLabel processTimerLable;
	private javax.swing.JScrollPane scrollPane1;
	private javax.swing.JScrollPane scrollPane2;
	public static javax.swing.JTable propertiesTable;
	private javax.swing.JTextField selectedFileField;
	private javax.swing.JTextField processTimerField;
	public static javax.swing.JTree topologyTree;

}
