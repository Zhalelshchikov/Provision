package com.harris.netboss.provision;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreateProperties {

	public void create() {

		Object property = ProvisionConstants.properties.toString().split("\n");
		String selectionPath = Main.topologyTree.getSelectionModel()
				.getSelectionPath().toString();

		if (property != null && selectionPath != null) {

			String[] lines = (String[]) property;

			int startIndex = selectionPath.lastIndexOf(',') + 1;
			int endIndex = selectionPath.length() - 1;

			String list = selectionPath.substring(startIndex, endIndex).trim();

			if (list != null) {

				rows[0][0] = "name:";
				rows[0][1] = list;
				if (lines != null) {

					for (String line : lines) {

						Pattern pp = Pattern.compile("(.*/)" + list
								+ "	(.*:)( .*)");
						Matcher mp = pp.matcher(line);

						if (mp.matches()) {
							if (mp.groupCount() <= 3) {

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
		}

		Main.propertiesTable.setModel(new javax.swing.table.DefaultTableModel(

		rows

		, new String[] { "Property", "Value" }) {
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

	public String[][] rows = new String[ProvisionConstants.COUNT_OF_ROWS][2];

}
