package com.harris.netboss.provision;

import static com.harris.netboss.provision.CreateTopology.properties;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreateProperties {

	public void create() {

		int indexOfSimbol = 0;
		int index = 0;

		String[] lines = (String[]) properties.toString().split("\n");
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

			row[0] = "name:";
			row[1] = list;
			if (lines != null) {
				for (String line : lines) {

					Pattern pp = Pattern
							.compile("(.*/)" + list + "	(.*:)( .*)");
					Matcher mp = pp.matcher(line);

					if (mp.matches()) {

						if ((mp.group(1) + list)
								.equals((String) Main.topologyTree
										.getSelectionModel().getSelectionPath()
										.toString().replace('[', '/')
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

		Main.propertiesTable
				.setModel(new javax.swing.table.DefaultTableModel(
						new Object[][] { row, row1, row2, row3, row4, row5,
								row6, row7, row8, row9, row10, row11, row12,
								row13, row14, row15, row16, row17, row18,
								row19, row20, row21, row22, row23, row24,
								row25, row26, row27, row28, row29, row30,
								row31, row32, row33, row34, row35, row36,
								row37, row38, row39 }, new String[] {
								"Property", "Value" }) {
					private static final long serialVersionUID = 1L;
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

		switch (counter) {
		case 1:
			row1[0] = firstValue;
			row1[1] = secondValue;
			break;
		case 2:
			row2[0] = firstValue;
			row2[1] = secondValue;
			break;
		case 3:
			row3[0] = firstValue;
			row3[1] = secondValue;
			break;
		case 4:
			row4[0] = firstValue;
			row4[1] = secondValue;
			break;
		case 5:
			row5[0] = firstValue;
			row5[1] = secondValue;
			break;
		case 6:
			row6[0] = firstValue;
			row6[1] = secondValue;
			break;
		case 7:
			row7[0] = firstValue;
			row7[1] = secondValue;
			break;
		case 8:
			row8[0] = firstValue;
			row8[1] = secondValue;
			break;
		case 9:
			row9[0] = firstValue;
			row9[1] = secondValue;
			break;
		case 10:
			row10[0] = firstValue;
			row10[1] = secondValue;
			break;
		case 11:
			row11[0] = firstValue;
			row11[1] = secondValue;
			break;
		case 12:
			row12[0] = firstValue;
			row12[1] = secondValue;
			break;
		case 13:
			row13[0] = firstValue;
			row13[1] = secondValue;
			break;
		case 14:
			row14[0] = firstValue;
			row14[1] = secondValue;
			break;
		case 15:
			row15[0] = firstValue;
			row15[1] = secondValue;
			break;
		case 16:
			row16[0] = firstValue;
			row16[1] = secondValue;
			break;
		case 17:
			row17[0] = firstValue;
			row17[1] = secondValue;
			break;
		case 18:
			row18[0] = firstValue;
			row18[1] = secondValue;
			break;
		case 19:
			row19[0] = firstValue;
			row19[1] = secondValue;
			break;
		case 20:
			row20[0] = firstValue;
			row20[1] = secondValue;
			break;
		case 21:
			row21[0] = firstValue;
			row21[1] = secondValue;
			break;
		case 22:
			row22[0] = firstValue;
			row22[1] = secondValue;
			break;
		case 23:
			row23[0] = firstValue;
			row23[1] = secondValue;
			break;
		case 24:
			row24[0] = firstValue;
			row24[1] = secondValue;
			break;
		case 25:
			row25[0] = firstValue;
			row25[1] = secondValue;
			break;
		case 26:
			row26[0] = firstValue;
			row26[1] = secondValue;
			break;
		case 27:
			row27[0] = firstValue;
			row27[1] = secondValue;
			break;
		case 28:
			row28[0] = firstValue;
			row28[1] = secondValue;
			break;
		case 29:
			row29[0] = firstValue;
			row29[1] = secondValue;
			break;
		case 30:
			row30[0] = firstValue;
			row30[1] = secondValue;
			break;
		case 31:
			row31[0] = firstValue;
			row31[1] = secondValue;
			break;
		case 32:
			row32[0] = firstValue;
			row32[1] = secondValue;
			break;
		case 33:
			row33[0] = firstValue;
			row33[1] = secondValue;
			break;
		case 34:
			row34[0] = firstValue;
			row34[1] = secondValue;
			break;
		case 35:
			row35[0] = firstValue;
			row35[1] = secondValue;
			break;
		case 36:
			row36[0] = firstValue;
			row36[1] = secondValue;
			break;
		case 37:
			row37[0] = firstValue;
			row37[1] = secondValue;
			break;
		case 38:
			row38[0] = firstValue;
			row38[1] = secondValue;
			break;
		case 39:
			row39[0] = firstValue;
			row39[1] = secondValue;
			break;
		default:
			break;
		}

	}

	public int counter = 1;

	public String[] row = new String[2];
	public String[] row1 = new String[2];
	public String[] row2 = new String[2];
	public String[] row3 = new String[2];
	public String[] row4 = new String[2];
	public String[] row5 = new String[2];
	public String[] row6 = new String[2];
	public String[] row7 = new String[2];
	public String[] row8 = new String[2];
	public String[] row9 = new String[2];
	public String[] row10 = new String[2];
	public String[] row11 = new String[2];
	public String[] row12 = new String[2];
	public String[] row13 = new String[2];
	public String[] row14 = new String[2];
	public String[] row15 = new String[2];
	public String[] row16 = new String[2];
	public String[] row17 = new String[2];
	public String[] row18 = new String[2];
	public String[] row19 = new String[2];
	public String[] row20 = new String[2];
	public String[] row21 = new String[2];
	public String[] row22 = new String[2];
	public String[] row23 = new String[2];
	public String[] row24 = new String[2];
	public String[] row25 = new String[2];
	public String[] row26 = new String[2];
	public String[] row27 = new String[2];
	public String[] row28 = new String[2];
	public String[] row29 = new String[2];
	public String[] row30 = new String[2];
	public String[] row31 = new String[2];
	public String[] row32 = new String[2];
	public String[] row33 = new String[2];
	public String[] row34 = new String[2];
	public String[] row35 = new String[2];
	public String[] row36 = new String[2];
	public String[] row37 = new String[2];
	public String[] row38 = new String[2];
	public String[] row39 = new String[2];

}
