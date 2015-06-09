package com.harris.netboss.provision;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreateProperties {

	public void create() {

		int indexOfSimbol = 0;
		int index = 0;

		String[] lines = (String[]) ProvisionConstants.properties.toString()
				.split("\n");
		String list = (String) Main.topologyTree.getSelectionModel()
				.getSelectionPath().toString();

		if (list != null) {
			while (indexOfSimbol < list.length()) {
				if (list.charAt(indexOfSimbol) == ',') {
					index = indexOfSimbol;
				}
				indexOfSimbol++;
			}

			list = (String) Main.topologyTree.getSelectionModel()
					.getSelectionPath().toString()
					.substring(index + 2, list.length() - 1);

			rows[0][0] = "name:";
			rows[0][1] = list;
			if (lines != null) {
				for (String line : lines) {

					Pattern pp = Pattern
							.compile("(.*/)" + list + "	(.*:)( .*)");
					Matcher mp = pp.matcher(line);

					if (mp.matches()) {
						if ((mp.group(1).length() != 0)
								&& (mp.group(2).length() != 0)) {
							if ((mp.group(1) + list)
									.equals((String) Main.topologyTree
											.getSelectionModel()
											.getSelectionPath().toString()
											.replace('[', '/')
											.replaceAll("]", "")
											.replaceAll(", ", "/")
											.replaceAll(" topology/", ""))) {
								rowFild(mp.group(2), mp.group(3));
								counter++;
							}
						}
					}
				}
			}
		}

		Main.propertiesTable.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {

				rows[0], rows[1], rows[2], rows[3], rows[4], rows[5], rows[6],
						rows[7], rows[8], rows[9], rows[10], rows[11],
						rows[12], rows[13], rows[14], rows[15], rows[16],
						rows[17], rows[18], rows[19], rows[20], rows[21],
						rows[22], rows[23], rows[24], rows[25], rows[26],
						rows[27], rows[28], rows[29], rows[30], rows[31],
						rows[32], rows[33], rows[34], rows[35], rows[36],
						rows[37], rows[38], rows[39]

				}, new String[] { "Property", "Value" }) {
			/**
					 * 
					 */
			private static final long serialVersionUID = 2237708183985897972L;

			@SuppressWarnings("rawtypes")
			Class[] types = new Class[] { java.lang.String.class,
					java.lang.String.class };

			@Override
			public Class<?> getColumnClass(int columnIndex) {
				return types[columnIndex];
			}
		});
	}

	public void rowFild(String firstValue, String secondValue) {

		rows[counter][0] = firstValue;
		rows[counter][1] = secondValue;

	}

	public int counter = 1;

	public String[][] rows = new String[40][2];

}
