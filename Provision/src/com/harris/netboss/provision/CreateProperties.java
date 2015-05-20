package com.harris.netboss.provision;

import static com.harris.netboss.provision.CreateTopology.properties;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreateProperties {

	public void create() {

		int counter = 1;
		String[] row = { null, null };
		String[] row1 = { null, null };
		String[] row2 = { null, null };
		String[] row3 = { null, null };
		String[] row4 = { null, null };
		String[] row5 = { null, null };
		String[] row6 = { null, null };
		String[] row7 = { null, null };
		String[] row8 = { null, null };
		String[] row9 = { null, null };
		String[] row10 = { null, null };
		String[] row11 = { null, null };
		String[] row12 = { null, null };
		String[] row13 = { null, null };
		String[] row14 = { null, null };
		String[] row15 = { null, null };
		String[] row16 = { null, null };
		String[] row17 = { null, null };
		String[] row18 = { null, null };
		String[] row19 = { null, null };
		String[] row20 = { null, null };
		String[] row21 = { null, null };
		String[] row22 = { null, null };
		String[] row23 = { null, null };
		String[] row24 = { null, null };
		String[] row25 = { null, null };
		String[] row26 = { null, null };
		String[] row27 = { null, null };
		String[] row28 = { null, null };
		String[] row29 = { null, null };
		String[] row30 = { null, null };
		String[] row31 = { null, null };
		String[] row32 = { null, null };
		String[] row33 = { null, null };
		String[] row34 = { null, null };
		String[] row35 = { null, null };
		String[] row36 = { null, null };
		String[] row37 = { null, null };
		String[] row38 = { null, null };
		String[] row39 = { null, null };

		String[] lines = properties.toString().split("\n");
		String list = Main.topologyTree.getSelectionModel().getSelectionPath()
				.toString();

		Pattern p = Pattern
				.compile("(.*topology,) ([a-z||A-Z||0-9].*[a-z||A-Z||0-9])(.*[^,].*)");
		Pattern p1 = Pattern
				.compile("(.*topology,) ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9])(.*[^,].*)");
		Pattern p2 = Pattern
				.compile("(.*topology,) ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9])(.*[^,].*)");
		Pattern p3 = Pattern
				.compile("(.*topology,) ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9])(.*[^,].*)");
		Pattern p4 = Pattern
				.compile("(.*topology,) ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9])(.*[^,].*)");
		Pattern p5 = Pattern
				.compile("(.*topology,) ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9])(.*[^,].*)");
		Pattern p6 = Pattern
				.compile("(.*topology,) ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9])(.*[^,].*)");
		Pattern p7 = Pattern
				.compile("(.*topology,) ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9])(.*[^,].*)");
		Pattern p8 = Pattern
				.compile("(.*topology,) ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9])(.*[^,].*)");
		Pattern p9 = Pattern
				.compile("(.*topology,) ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9])(.*[^,].*)");
		Pattern p10 = Pattern
				.compile("(.*topology,) ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9]), ([a-z||A-Z||0-9].*[a-z||A-Z||0-9])(.*[^,].*)");

		Matcher m = p.matcher(list);
		Matcher m1 = p1.matcher(list);
		Matcher m2 = p2.matcher(list);
		Matcher m3 = p3.matcher(list);
		Matcher m4 = p4.matcher(list);
		Matcher m5 = p5.matcher(list);
		Matcher m6 = p6.matcher(list);
		Matcher m7 = p7.matcher(list);
		Matcher m8 = p8.matcher(list);
		Matcher m9 = p9.matcher(list);
		Matcher m10 = p10.matcher(list);

		if (m.matches() && !m1.matches() && !m2.matches() && !m3.matches()
				&& !m4.matches() && !m5.matches() && !m6.matches()
				&& !m7.matches() && !m8.matches() && !m9.matches()
				&& !m10.matches()) {
			Pattern pn = Pattern
					.compile("(.*,) ([a-z||A-Z||0-9].*[a-z||A-Z||0-9])(.*[^,].*)");
			Matcher mn = pn.matcher(list);
			if (mn.matches()) {

				row[0] = "name:";
				row[1] = mn.group(2);

			}

			for (String line : lines) {

				Pattern pp = Pattern
						.compile("(/)" + m.group(2) + "	(.*:)( .*)");
				Matcher mp = pp.matcher(line);

				if (mp.matches()) {
					if (counter == 1) {
						row1[0] = mp.group(2);
						row1[1] = mp.group(3);
					}
					if (counter == 2) {
						row2[0] = mp.group(2);
						row2[1] = mp.group(3);
					}
					if (counter == 3) {
						row3[0] = mp.group(2);
						row3[1] = mp.group(3);
					}
					if (counter == 4) {
						row4[0] = mp.group(2);
						row4[1] = mp.group(3);
					}
					if (counter == 5) {
						row5[0] = mp.group(2);
						row5[1] = mp.group(3);
					}

					if (counter == 6) {
						row6[0] = mp.group(2);
						row6[1] = mp.group(3);
					}

					if (counter == 7) {
						row7[0] = mp.group(2);
						row7[1] = mp.group(3);
					}

					if (counter == 8) {
						row8[0] = mp.group(2);
						row8[1] = mp.group(3);
					}

					if (counter == 9) {
						row9[0] = mp.group(2);
						row9[1] = mp.group(3);
					}

					if (counter == 10) {
						row10[0] = mp.group(2);
						row10[1] = mp.group(3);
					}

					if (counter == 11) {
						row11[0] = mp.group(2);
						row11[1] = mp.group(3);
					}

					if (counter == 12) {
						row12[0] = mp.group(2);
						row12[1] = mp.group(3);
					}

					if (counter == 13) {
						row13[0] = mp.group(2);
						row13[1] = mp.group(3);
					}

					if (counter == 14) {
						row14[0] = mp.group(2);
						row14[1] = mp.group(3);
					}

					if (counter == 15) {
						row15[0] = mp.group(2);
						row15[1] = mp.group(3);
					}

					if (counter == 16) {
						row16[0] = mp.group(2);
						row16[1] = mp.group(3);
					}

					if (counter == 17) {
						row17[0] = mp.group(2);
						row17[1] = mp.group(3);
					}

					if (counter == 18) {
						row18[0] = mp.group(2);
						row18[1] = mp.group(3);
					}

					if (counter == 19) {
						row19[0] = mp.group(2);
						row19[1] = mp.group(3);
					}

					if (counter == 20) {
						row20[0] = mp.group(2);
						row20[1] = mp.group(3);
					}

					if (counter == 21) {
						row21[0] = mp.group(2);
						row21[1] = mp.group(3);
					}

					if (counter == 22) {
						row22[0] = mp.group(2);
						row22[1] = mp.group(3);
					}

					if (counter == 23) {
						row23[0] = mp.group(2);
						row23[1] = mp.group(3);
					}

					if (counter == 24) {
						row24[0] = mp.group(2);
						row24[1] = mp.group(3);
					}

					if (counter == 25) {
						row25[0] = mp.group(2);
						row25[1] = mp.group(3);
					}

					if (counter == 26) {
						row26[0] = mp.group(2);
						row26[1] = mp.group(3);
					}

					if (counter == 27) {
						row27[0] = mp.group(2);
						row27[1] = mp.group(3);
					}

					if (counter == 28) {
						row28[0] = mp.group(2);
						row28[1] = mp.group(3);
					}

					if (counter == 29) {
						row29[0] = mp.group(2);
						row29[1] = mp.group(3);
					}

					if (counter == 30) {
						row30[0] = mp.group(2);
						row30[1] = mp.group(3);
					}

					if (counter == 31) {
						row31[0] = mp.group(2);
						row31[1] = mp.group(3);
					}

					if (counter == 32) {
						row32[0] = mp.group(2);
						row32[1] = mp.group(3);
					}

					if (counter == 33) {
						row33[0] = mp.group(2);
						row33[1] = mp.group(3);
					}

					if (counter == 34) {
						row34[0] = mp.group(2);
						row34[1] = mp.group(3);
					}

					if (counter == 35) {
						row35[0] = mp.group(2);
						row35[1] = mp.group(3);
					}

					if (counter == 36) {
						row36[0] = mp.group(2);
						row36[1] = mp.group(3);
					}

					if (counter == 37) {
						row37[0] = mp.group(2);
						row37[1] = mp.group(3);
					}

					if (counter == 38) {
						row38[0] = mp.group(2);
						row38[1] = mp.group(3);
					}

					if (counter == 39) {
						row39[0] = mp.group(2);
						row39[1] = mp.group(3);
					}
					counter++;

				}

			}

		}

		if (m1.matches() && !m2.matches() && !m3.matches() && !m4.matches()
				&& !m5.matches() && !m6.matches() && !m7.matches()
				&& !m8.matches() && !m9.matches() && !m10.matches()) {

			Pattern pn = Pattern
					.compile("(.*,) ([a-z||A-Z||0-9].*[a-z||A-Z||0-9])(.*[^,].*)");
			Matcher mn = pn.matcher(list);
			if (mn.matches()) {

				row[0] = "name:";
				row[1] = mn.group(2);

			}

			for (String line : lines) {
				Pattern pp = Pattern.compile("(/)" + m1.group(2) + "(/)"
						+ m1.group(3) + "	(.*:)( .*)");
				Matcher mp = pp.matcher(line);
				if (mp.matches()) {
					if (counter == 1) {
						row1[0] = mp.group(3);
						row1[1] = mp.group(4);
					}
					if (counter == 2) {
						row2[0] = mp.group(3);
						row2[1] = mp.group(4);
					}
					if (counter == 3) {
						row3[0] = mp.group(3);
						row3[1] = mp.group(4);
					}
					if (counter == 4) {
						row4[0] = mp.group(3);
						row4[1] = mp.group(4);
					}
					if (counter == 5) {
						row5[0] = mp.group(3);
						row5[1] = mp.group(4);
					}

					if (counter == 6) {
						row6[0] = mp.group(3);
						row6[1] = mp.group(4);
					}

					if (counter == 7) {
						row7[0] = mp.group(3);
						row7[1] = mp.group(4);
					}

					if (counter == 8) {
						row8[0] = mp.group(3);
						row8[1] = mp.group(4);
					}

					if (counter == 9) {
						row9[0] = mp.group(3);
						row9[1] = mp.group(4);
					}

					if (counter == 10) {
						row10[0] = mp.group(3);
						row10[1] = mp.group(4);
					}

					if (counter == 11) {
						row11[0] = mp.group(3);
						row11[1] = mp.group(4);
					}

					if (counter == 12) {
						row12[0] = mp.group(3);
						row12[1] = mp.group(4);
					}

					if (counter == 13) {
						row13[0] = mp.group(3);
						row13[1] = mp.group(4);
					}

					if (counter == 14) {
						row14[0] = mp.group(3);
						row14[1] = mp.group(4);
					}

					if (counter == 15) {
						row15[0] = mp.group(3);
						row15[1] = mp.group(4);
					}

					if (counter == 16) {
						row16[0] = mp.group(3);
						row16[1] = mp.group(4);
					}

					if (counter == 17) {
						row17[0] = mp.group(3);
						row17[1] = mp.group(4);
					}

					if (counter == 18) {
						row18[0] = mp.group(3);
						row18[1] = mp.group(4);
					}

					if (counter == 19) {
						row19[0] = mp.group(3);
						row19[1] = mp.group(4);
					}

					if (counter == 20) {
						row20[0] = mp.group(3);
						row20[1] = mp.group(4);
					}

					if (counter == 21) {
						row21[0] = mp.group(3);
						row21[1] = mp.group(4);
					}

					if (counter == 22) {
						row22[0] = mp.group(3);
						row22[1] = mp.group(4);
					}

					if (counter == 23) {
						row23[0] = mp.group(3);
						row23[1] = mp.group(4);
					}

					if (counter == 24) {
						row24[0] = mp.group(3);
						row24[1] = mp.group(4);
					}

					if (counter == 25) {
						row25[0] = mp.group(3);
						row25[1] = mp.group(4);
					}

					if (counter == 26) {
						row26[0] = mp.group(3);
						row26[1] = mp.group(4);
					}

					if (counter == 27) {
						row27[0] = mp.group(3);
						row27[1] = mp.group(4);
					}

					if (counter == 28) {
						row28[0] = mp.group(3);
						row28[1] = mp.group(4);
					}

					if (counter == 29) {
						row29[0] = mp.group(3);
						row29[1] = mp.group(4);
					}

					if (counter == 30) {
						row30[0] = mp.group(3);
						row30[1] = mp.group(4);
					}

					if (counter == 31) {
						row31[0] = mp.group(3);
						row31[1] = mp.group(4);
					}

					if (counter == 32) {
						row32[0] = mp.group(3);
						row32[1] = mp.group(4);
					}

					if (counter == 33) {
						row33[0] = mp.group(3);
						row33[1] = mp.group(4);
					}

					if (counter == 34) {
						row34[0] = mp.group(3);
						row34[1] = mp.group(4);
					}

					if (counter == 35) {
						row35[0] = mp.group(3);
						row35[1] = mp.group(4);
					}

					if (counter == 36) {
						row36[0] = mp.group(3);
						row36[1] = mp.group(4);
					}

					if (counter == 37) {
						row37[0] = mp.group(3);
						row37[1] = mp.group(4);
					}

					if (counter == 38) {
						row38[0] = mp.group(3);
						row38[1] = mp.group(4);
					}

					if (counter == 39) {
						row39[0] = mp.group(3);
						row39[1] = mp.group(4);
					}
					counter++;

				}
			}
		}

		if (m2.matches() && !m3.matches() && !m4.matches() && !m5.matches()
				&& !m6.matches() && !m7.matches() && !m8.matches()
				&& !m9.matches() && !m10.matches()) {
			Pattern pn = Pattern
					.compile("(.*,) ([a-z||A-Z||0-9].*[a-z||A-Z||0-9])(.*[^,].*)");
			Matcher mn = pn.matcher(list);
			if (mn.matches()) {

				row[0] = "name:";
				row[1] = mn.group(2);

			}

			for (String line : lines) {
				Pattern pp = Pattern.compile("(/)" + m2.group(2) + "(/)"
						+ m2.group(3) + "(/)" + m2.group(4) + "	(.*:)( .*)");
				Matcher mp = pp.matcher(line);
				if (mp.matches()) {
					if (counter == 1) {
						row1[0] = mp.group(4);
						row1[1] = mp.group(5);
					}
					if (counter == 2) {
						row2[0] = mp.group(4);
						row2[1] = mp.group(5);
					}
					if (counter == 3) {
						row3[0] = mp.group(4);
						row3[1] = mp.group(5);
					}
					if (counter == 4) {
						row4[0] = mp.group(4);
						row4[1] = mp.group(5);
					}
					if (counter == 5) {
						row5[0] = mp.group(4);
						row5[1] = mp.group(5);
					}

					if (counter == 6) {
						row6[0] = mp.group(4);
						row6[1] = mp.group(5);
					}

					if (counter == 7) {
						row7[0] = mp.group(4);
						row7[1] = mp.group(5);
					}

					if (counter == 8) {
						row8[0] = mp.group(4);
						row8[1] = mp.group(5);
					}

					if (counter == 9) {
						row9[0] = mp.group(4);
						row9[1] = mp.group(5);
					}

					if (counter == 10) {
						row10[0] = mp.group(4);
						row10[1] = mp.group(5);
					}

					if (counter == 11) {
						row11[0] = mp.group(4);
						row11[1] = mp.group(5);
					}

					if (counter == 12) {
						row12[0] = mp.group(4);
						row12[1] = mp.group(5);
					}

					if (counter == 13) {
						row13[0] = mp.group(4);
						row13[1] = mp.group(5);
					}

					if (counter == 14) {
						row14[0] = mp.group(4);
						row14[1] = mp.group(5);
					}

					if (counter == 15) {
						row15[0] = mp.group(4);
						row15[1] = mp.group(5);
					}

					if (counter == 16) {
						row16[0] = mp.group(4);
						row16[1] = mp.group(5);
					}

					if (counter == 17) {
						row17[0] = mp.group(4);
						row17[1] = mp.group(5);
					}

					if (counter == 18) {
						row18[0] = mp.group(4);
						row18[1] = mp.group(5);
					}

					if (counter == 19) {
						row19[0] = mp.group(4);
						row19[1] = mp.group(5);
					}

					if (counter == 20) {
						row20[0] = mp.group(4);
						row20[1] = mp.group(5);
					}

					if (counter == 21) {
						row21[0] = mp.group(4);
						row21[1] = mp.group(5);
					}

					if (counter == 22) {
						row22[0] = mp.group(4);
						row22[1] = mp.group(5);
					}

					if (counter == 23) {
						row23[0] = mp.group(4);
						row23[1] = mp.group(5);
					}

					if (counter == 24) {
						row24[0] = mp.group(4);
						row24[1] = mp.group(5);
					}

					if (counter == 25) {
						row25[0] = mp.group(4);
						row25[1] = mp.group(5);
					}

					if (counter == 26) {
						row26[0] = mp.group(4);
						row26[1] = mp.group(5);
					}

					if (counter == 27) {
						row27[0] = mp.group(4);
						row27[1] = mp.group(5);
					}

					if (counter == 28) {
						row28[0] = mp.group(4);
						row28[1] = mp.group(5);
					}

					if (counter == 29) {
						row29[0] = mp.group(4);
						row29[1] = mp.group(5);
					}

					if (counter == 30) {
						row30[0] = mp.group(4);
						row30[1] = mp.group(5);
					}

					if (counter == 31) {
						row31[0] = mp.group(4);
						row31[1] = mp.group(5);
					}

					if (counter == 32) {
						row32[0] = mp.group(4);
						row32[1] = mp.group(5);
					}

					if (counter == 33) {
						row33[0] = mp.group(4);
						row33[1] = mp.group(5);
					}

					if (counter == 34) {
						row34[0] = mp.group(4);
						row34[1] = mp.group(5);
					}

					if (counter == 35) {
						row35[0] = mp.group(4);
						row35[1] = mp.group(5);
					}

					if (counter == 36) {
						row36[0] = mp.group(4);
						row36[1] = mp.group(5);
					}

					if (counter == 37) {
						row37[0] = mp.group(4);
						row37[1] = mp.group(5);
					}

					if (counter == 38) {
						row38[0] = mp.group(4);
						row38[1] = mp.group(5);
					}

					if (counter == 39) {
						row39[0] = mp.group(4);
						row39[1] = mp.group(5);
					}
					counter++;
				}
			}
		}

		if (m3.matches() && !m4.matches() && !m5.matches() && !m6.matches()
				&& !m7.matches() && !m8.matches() && !m9.matches()
				&& !m10.matches()) {

			Pattern pn = Pattern
					.compile("(.*,) ([a-z||A-Z||0-9].*[a-z||A-Z||0-9])(.*[^,].*)");
			Matcher mn = pn.matcher(list);
			if (mn.matches()) {

				row[0] = "name:";
				row[1] = mn.group(2);

			}

			for (String line : lines) {
				Pattern pp = Pattern.compile("(/)" + m3.group(2) + "(/)"
						+ m3.group(3) + "(/)" + m3.group(4) + "(/)"
						+ m3.group(5) + "	(.*:)( .*)");
				Matcher mp = pp.matcher(line);
				if (mp.matches()) {
					if (counter == 1) {
						row1[0] = mp.group(5);
						row1[1] = mp.group(6);
					}
					if (counter == 2) {
						row2[0] = mp.group(5);
						row2[1] = mp.group(6);
					}
					if (counter == 3) {
						row3[0] = mp.group(5);
						row3[1] = mp.group(6);
					}
					if (counter == 4) {
						row4[0] = mp.group(5);
						row4[1] = mp.group(6);
					}
					if (counter == 5) {
						row5[0] = mp.group(5);
						row5[1] = mp.group(6);
					}

					if (counter == 6) {
						row6[0] = mp.group(5);
						row6[1] = mp.group(6);
					}

					if (counter == 7) {
						row7[0] = mp.group(5);
						row7[1] = mp.group(6);
					}

					if (counter == 8) {
						row8[0] = mp.group(5);
						row8[1] = mp.group(6);
					}

					if (counter == 9) {
						row9[0] = mp.group(5);
						row9[1] = mp.group(6);
					}

					if (counter == 10) {
						row10[0] = mp.group(5);
						row10[1] = mp.group(6);
					}

					if (counter == 11) {
						row11[0] = mp.group(5);
						row11[1] = mp.group(6);
					}

					if (counter == 12) {
						row12[0] = mp.group(5);
						row12[1] = mp.group(6);
					}

					if (counter == 13) {
						row13[0] = mp.group(5);
						row13[1] = mp.group(6);
					}

					if (counter == 14) {
						row14[0] = mp.group(5);
						row14[1] = mp.group(6);
					}

					if (counter == 15) {
						row15[0] = mp.group(5);
						row15[1] = mp.group(6);
					}

					if (counter == 16) {
						row16[0] = mp.group(5);
						row16[1] = mp.group(6);
					}

					if (counter == 17) {
						row17[0] = mp.group(5);
						row17[1] = mp.group(6);
					}

					if (counter == 18) {
						row18[0] = mp.group(5);
						row18[1] = mp.group(6);
					}

					if (counter == 19) {
						row19[0] = mp.group(5);
						row19[1] = mp.group(6);
					}

					if (counter == 20) {
						row20[0] = mp.group(5);
						row20[1] = mp.group(6);
					}

					if (counter == 21) {
						row21[0] = mp.group(5);
						row21[1] = mp.group(6);
					}

					if (counter == 22) {
						row22[0] = mp.group(5);
						row22[1] = mp.group(6);
					}

					if (counter == 23) {
						row23[0] = mp.group(5);
						row23[1] = mp.group(6);
					}

					if (counter == 24) {
						row24[0] = mp.group(5);
						row24[1] = mp.group(6);
					}

					if (counter == 25) {
						row25[0] = mp.group(5);
						row25[1] = mp.group(6);
					}

					if (counter == 26) {
						row26[0] = mp.group(5);
						row26[1] = mp.group(6);
					}

					if (counter == 27) {
						row27[0] = mp.group(5);
						row27[1] = mp.group(6);
					}

					if (counter == 28) {
						row28[0] = mp.group(5);
						row28[1] = mp.group(6);
					}

					if (counter == 29) {
						row29[0] = mp.group(5);
						row29[1] = mp.group(6);
					}

					if (counter == 30) {
						row30[0] = mp.group(5);
						row30[1] = mp.group(6);
					}

					if (counter == 31) {
						row31[0] = mp.group(5);
						row31[1] = mp.group(6);
					}

					if (counter == 32) {
						row32[0] = mp.group(5);
						row32[1] = mp.group(6);
					}

					if (counter == 33) {
						row33[0] = mp.group(5);
						row33[1] = mp.group(6);
					}

					if (counter == 34) {
						row34[0] = mp.group(5);
						row34[1] = mp.group(6);
					}

					if (counter == 35) {
						row35[0] = mp.group(5);
						row35[1] = mp.group(6);
					}

					if (counter == 36) {
						row36[0] = mp.group(5);
						row36[1] = mp.group(6);
					}

					if (counter == 37) {
						row37[0] = mp.group(5);
						row37[1] = mp.group(6);
					}

					if (counter == 38) {
						row38[0] = mp.group(5);
						row38[1] = mp.group(6);
					}

					if (counter == 39) {
						row39[0] = mp.group(5);
						row39[1] = mp.group(6);
					}
					counter++;
				}
			}
		}

		if (m4.matches() && !m5.matches() && !m6.matches() && !m7.matches()
				&& !m8.matches() && !m9.matches() && !m10.matches()) {

			Pattern pn = Pattern
					.compile("(.*,) ([a-z||A-Z||0-9].*[a-z||A-Z||0-9])(.*[^,].*)");
			Matcher mn = pn.matcher(list);
			if (mn.matches()) {

				row[0] = "name:";
				row[1] = mn.group(2);

			}

			for (String line : lines) {
				Pattern pp = Pattern.compile("(/)" + m4.group(2) + "(/)"
						+ m4.group(3) + "(/)" + m4.group(4) + "(/)"
						+ m4.group(5) + "(/)" + m4.group(6) + "	(.*:)( .*)");
				Matcher mp = pp.matcher(line);
				if (mp.matches()) {
					if (counter == 1) {
						row1[0] = mp.group(6);
						row1[1] = mp.group(7);
					}
					if (counter == 2) {
						row2[0] = mp.group(6);
						row2[1] = mp.group(7);
					}
					if (counter == 3) {
						row3[0] = mp.group(6);
						row3[1] = mp.group(7);
					}
					if (counter == 4) {
						row4[0] = mp.group(6);
						row4[1] = mp.group(7);
					}
					if (counter == 5) {
						row5[0] = mp.group(6);
						row5[1] = mp.group(7);
					}

					if (counter == 6) {
						row6[0] = mp.group(6);
						row6[1] = mp.group(7);
					}

					if (counter == 7) {
						row7[0] = mp.group(6);
						row7[1] = mp.group(7);
					}

					if (counter == 8) {
						row8[0] = mp.group(6);
						row8[1] = mp.group(7);
					}

					if (counter == 9) {
						row9[0] = mp.group(6);
						row9[1] = mp.group(7);
					}

					if (counter == 10) {
						row10[0] = mp.group(6);
						row10[1] = mp.group(7);
					}

					if (counter == 11) {
						row11[0] = mp.group(6);
						row11[1] = mp.group(7);
					}

					if (counter == 12) {
						row12[0] = mp.group(6);
						row12[1] = mp.group(7);
					}

					if (counter == 13) {
						row13[0] = mp.group(6);
						row13[1] = mp.group(7);
					}

					if (counter == 14) {
						row14[0] = mp.group(6);
						row14[1] = mp.group(7);
					}

					if (counter == 15) {
						row15[0] = mp.group(6);
						row15[1] = mp.group(7);
					}

					if (counter == 16) {
						row16[0] = mp.group(6);
						row16[1] = mp.group(7);
					}

					if (counter == 17) {
						row17[0] = mp.group(6);
						row17[1] = mp.group(7);
					}

					if (counter == 18) {
						row18[0] = mp.group(6);
						row18[1] = mp.group(7);
					}

					if (counter == 19) {
						row19[0] = mp.group(6);
						row19[1] = mp.group(7);
					}

					if (counter == 20) {
						row20[0] = mp.group(6);
						row20[1] = mp.group(7);
					}

					if (counter == 21) {
						row21[0] = mp.group(6);
						row21[1] = mp.group(7);
					}

					if (counter == 22) {
						row22[0] = mp.group(6);
						row22[1] = mp.group(7);
					}

					if (counter == 23) {
						row23[0] = mp.group(6);
						row23[1] = mp.group(7);
					}

					if (counter == 24) {
						row24[0] = mp.group(6);
						row24[1] = mp.group(7);
					}

					if (counter == 25) {
						row25[0] = mp.group(6);
						row25[1] = mp.group(7);
					}

					if (counter == 26) {
						row26[0] = mp.group(6);
						row26[1] = mp.group(7);
					}

					if (counter == 27) {
						row27[0] = mp.group(6);
						row27[1] = mp.group(7);
					}

					if (counter == 28) {
						row28[0] = mp.group(6);
						row28[1] = mp.group(7);
					}

					if (counter == 29) {
						row29[0] = mp.group(6);
						row29[1] = mp.group(7);
					}

					if (counter == 30) {
						row30[0] = mp.group(6);
						row30[1] = mp.group(7);
					}

					if (counter == 31) {
						row31[0] = mp.group(6);
						row31[1] = mp.group(7);
					}

					if (counter == 32) {
						row32[0] = mp.group(6);
						row32[1] = mp.group(7);
					}

					if (counter == 33) {
						row33[0] = mp.group(6);
						row33[1] = mp.group(7);
					}

					if (counter == 34) {
						row34[0] = mp.group(6);
						row34[1] = mp.group(7);
					}

					if (counter == 35) {
						row35[0] = mp.group(6);
						row35[1] = mp.group(7);
					}

					if (counter == 36) {
						row36[0] = mp.group(6);
						row36[1] = mp.group(7);
					}

					if (counter == 37) {
						row37[0] = mp.group(6);
						row37[1] = mp.group(7);
					}

					if (counter == 38) {
						row38[0] = mp.group(6);
						row38[1] = mp.group(7);
					}

					if (counter == 39) {
						row39[0] = mp.group(6);
						row39[1] = mp.group(7);
					}
					counter++;
				}
			}
		}

		if (m5.matches() && !m6.matches() && !m7.matches() && !m8.matches()
				&& !m9.matches() && !m10.matches()) {

			Pattern pn = Pattern
					.compile("(.*,) ([a-z||A-Z||0-9].*[a-z||A-Z||0-9])(.*[^,].*)");
			Matcher mn = pn.matcher(list);
			if (mn.matches()) {

				row[0] = "name:";
				row[1] = mn.group(2);

			}

			for (String line : lines) {
				Pattern pp = Pattern.compile("(/)" + m5.group(2) + "(/)"
						+ m5.group(3) + "(/)" + m5.group(4) + "(/)"
						+ m5.group(5) + "(/)" + m5.group(6) + "(/)"
						+ m5.group(7) + "	(.*:)( .*)");
				Matcher mp = pp.matcher(line);
				if (mp.matches()) {
					if (counter == 1) {
						row1[0] = mp.group(7);
						row1[1] = mp.group(8);
					}
					if (counter == 2) {
						row2[0] = mp.group(7);
						row2[1] = mp.group(8);
					}
					if (counter == 3) {
						row3[0] = mp.group(7);
						row3[1] = mp.group(8);
					}
					if (counter == 4) {
						row4[0] = mp.group(7);
						row4[1] = mp.group(8);
					}
					if (counter == 5) {
						row5[0] = mp.group(7);
						row5[1] = mp.group(8);
					}

					if (counter == 6) {
						row6[0] = mp.group(7);
						row6[1] = mp.group(8);
					}

					if (counter == 7) {
						row7[0] = mp.group(7);
						row7[1] = mp.group(8);
					}

					if (counter == 8) {
						row8[0] = mp.group(7);
						row8[1] = mp.group(8);
					}

					if (counter == 9) {
						row9[0] = mp.group(7);
						row9[1] = mp.group(8);
					}

					if (counter == 10) {
						row10[0] = mp.group(7);
						row10[1] = mp.group(8);
					}

					if (counter == 11) {
						row11[0] = mp.group(7);
						row11[1] = mp.group(8);
					}

					if (counter == 12) {
						row12[0] = mp.group(7);
						row12[1] = mp.group(8);
					}

					if (counter == 13) {
						row13[0] = mp.group(7);
						row13[1] = mp.group(8);
					}

					if (counter == 14) {
						row14[0] = mp.group(7);
						row14[1] = mp.group(8);
					}

					if (counter == 15) {
						row15[0] = mp.group(7);
						row15[1] = mp.group(8);
					}

					if (counter == 16) {
						row16[0] = mp.group(7);
						row16[1] = mp.group(8);
					}

					if (counter == 17) {
						row17[0] = mp.group(7);
						row17[1] = mp.group(8);
					}

					if (counter == 18) {
						row18[0] = mp.group(7);
						row18[1] = mp.group(8);
					}

					if (counter == 19) {
						row19[0] = mp.group(7);
						row19[1] = mp.group(8);
					}

					if (counter == 20) {
						row20[0] = mp.group(7);
						row20[1] = mp.group(8);
					}

					if (counter == 21) {
						row21[0] = mp.group(7);
						row21[1] = mp.group(8);
					}

					if (counter == 22) {
						row22[0] = mp.group(7);
						row22[1] = mp.group(8);
					}

					if (counter == 23) {
						row23[0] = mp.group(7);
						row23[1] = mp.group(8);
					}

					if (counter == 24) {
						row24[0] = mp.group(7);
						row24[1] = mp.group(8);
					}

					if (counter == 25) {
						row25[0] = mp.group(7);
						row25[1] = mp.group(8);
					}

					if (counter == 26) {
						row26[0] = mp.group(7);
						row26[1] = mp.group(8);
					}

					if (counter == 27) {
						row27[0] = mp.group(7);
						row27[1] = mp.group(8);
					}

					if (counter == 28) {
						row28[0] = mp.group(7);
						row28[1] = mp.group(8);
					}

					if (counter == 29) {
						row29[0] = mp.group(7);
						row29[1] = mp.group(8);
					}

					if (counter == 30) {
						row30[0] = mp.group(7);
						row30[1] = mp.group(8);
					}

					if (counter == 31) {
						row31[0] = mp.group(7);
						row31[1] = mp.group(8);
					}

					if (counter == 32) {
						row32[0] = mp.group(7);
						row32[1] = mp.group(8);
					}

					if (counter == 33) {
						row33[0] = mp.group(7);
						row33[1] = mp.group(8);
					}

					if (counter == 34) {
						row34[0] = mp.group(7);
						row34[1] = mp.group(8);
					}

					if (counter == 35) {
						row35[0] = mp.group(7);
						row35[1] = mp.group(8);
					}

					if (counter == 36) {
						row36[0] = mp.group(7);
						row36[1] = mp.group(8);
					}

					if (counter == 37) {
						row37[0] = mp.group(7);
						row37[1] = mp.group(8);
					}

					if (counter == 38) {
						row38[0] = mp.group(7);
						row38[1] = mp.group(8);
					}

					if (counter == 39) {
						row39[0] = mp.group(7);
						row39[1] = mp.group(8);
					}
					counter++;
				}
			}
		}

		if (m6.matches() && !m7.matches() && !m8.matches() && !m9.matches()
				&& !m10.matches()) {

			Pattern pn = Pattern
					.compile("(.*,) ([a-z||A-Z||0-9].*[a-z||A-Z||0-9])(.*[^,].*)");
			Matcher mn = pn.matcher(list);
			if (mn.matches()) {

				row[0] = "name:";
				row[1] = mn.group(2);

			}

			for (String line : lines) {
				Pattern pp = Pattern.compile("(/)" + m6.group(2) + "(/)"
						+ m6.group(3) + "(/)" + m6.group(4) + "(/)"
						+ m6.group(5) + "(/)" + m6.group(6) + "(/)"
						+ m6.group(7) + "(/)" + m6.group(8) + "	(.*:)( .*)");
				Matcher mp = pp.matcher(line);
				if (mp.matches()) {
					if (counter == 1) {
						row1[0] = mp.group(8);
						row1[1] = mp.group(9);
					}
					if (counter == 2) {
						row2[0] = mp.group(8);
						row2[1] = mp.group(9);
					}
					if (counter == 3) {
						row3[0] = mp.group(8);
						row3[1] = mp.group(9);
					}
					if (counter == 4) {
						row4[0] = mp.group(8);
						row4[1] = mp.group(9);
					}
					if (counter == 5) {
						row5[0] = mp.group(8);
						row5[1] = mp.group(9);
					}

					if (counter == 6) {
						row6[0] = mp.group(8);
						row6[1] = mp.group(9);
					}

					if (counter == 7) {
						row7[0] = mp.group(8);
						row7[1] = mp.group(9);
					}

					if (counter == 8) {
						row8[0] = mp.group(8);
						row8[1] = mp.group(9);
					}

					if (counter == 9) {
						row9[0] = mp.group(8);
						row9[1] = mp.group(9);
					}

					if (counter == 10) {
						row10[0] = mp.group(8);
						row10[1] = mp.group(9);
					}

					if (counter == 11) {
						row11[0] = mp.group(8);
						row11[1] = mp.group(9);
					}

					if (counter == 12) {
						row12[0] = mp.group(8);
						row12[1] = mp.group(9);
					}

					if (counter == 13) {
						row13[0] = mp.group(8);
						row13[1] = mp.group(9);
					}

					if (counter == 14) {
						row14[0] = mp.group(8);
						row14[1] = mp.group(9);
					}

					if (counter == 15) {
						row15[0] = mp.group(8);
						row15[1] = mp.group(9);
					}

					if (counter == 16) {
						row16[0] = mp.group(8);
						row16[1] = mp.group(9);
					}

					if (counter == 17) {
						row17[0] = mp.group(8);
						row17[1] = mp.group(9);
					}

					if (counter == 18) {
						row18[0] = mp.group(8);
						row18[1] = mp.group(9);
					}

					if (counter == 19) {
						row19[0] = mp.group(8);
						row19[1] = mp.group(9);
					}

					if (counter == 20) {
						row20[0] = mp.group(8);
						row20[1] = mp.group(9);
					}

					if (counter == 21) {
						row21[0] = mp.group(8);
						row21[1] = mp.group(9);
					}

					if (counter == 22) {
						row22[0] = mp.group(8);
						row22[1] = mp.group(9);
					}

					if (counter == 23) {
						row23[0] = mp.group(8);
						row23[1] = mp.group(9);
					}

					if (counter == 24) {
						row24[0] = mp.group(8);
						row24[1] = mp.group(9);
					}

					if (counter == 25) {
						row25[0] = mp.group(8);
						row25[1] = mp.group(9);
					}

					if (counter == 26) {
						row26[0] = mp.group(8);
						row26[1] = mp.group(9);
					}

					if (counter == 27) {
						row27[0] = mp.group(8);
						row27[1] = mp.group(9);
					}

					if (counter == 28) {
						row28[0] = mp.group(8);
						row28[1] = mp.group(9);
					}

					if (counter == 29) {
						row29[0] = mp.group(8);
						row29[1] = mp.group(9);
					}

					if (counter == 30) {
						row30[0] = mp.group(8);
						row30[1] = mp.group(9);
					}

					if (counter == 31) {
						row31[0] = mp.group(8);
						row31[1] = mp.group(9);
					}

					if (counter == 32) {
						row32[0] = mp.group(8);
						row32[1] = mp.group(9);
					}

					if (counter == 33) {
						row33[0] = mp.group(8);
						row33[1] = mp.group(9);
					}

					if (counter == 34) {
						row34[0] = mp.group(8);
						row34[1] = mp.group(9);
					}

					if (counter == 35) {
						row35[0] = mp.group(8);
						row35[1] = mp.group(9);
					}

					if (counter == 36) {
						row36[0] = mp.group(8);
						row36[1] = mp.group(9);
					}

					if (counter == 37) {
						row37[0] = mp.group(8);
						row37[1] = mp.group(9);
					}

					if (counter == 38) {
						row38[0] = mp.group(8);
						row38[1] = mp.group(9);
					}

					if (counter == 39) {
						row39[0] = mp.group(8);
						row39[1] = mp.group(9);
					}
					counter++;
				}
			}
		}

		if (m7.matches() && !m8.matches() && !m9.matches() && !m10.matches()) {

			Pattern pn = Pattern
					.compile("(.*,) ([a-z||A-Z||0-9].*[a-z||A-Z||0-9])(.*[^,].*)");
			Matcher mn = pn.matcher(list);
			if (mn.matches()) {

				row[0] = "name:";
				row[1] = mn.group(2);

			}

			for (String line : lines) {
				Pattern pp = Pattern.compile("(/)" + m7.group(2) + "(/)"
						+ m7.group(3) + "(/)" + m7.group(4) + "(/)"
						+ m7.group(5) + "(/)" + m7.group(6) + "(/)"
						+ m7.group(7) + "(/)" + m7.group(8) + "(/)"
						+ m7.group(9) + "	(.*:)( .*)");
				Matcher mp = pp.matcher(line);
				if (mp.matches()) {
					if (counter == 1) {
						row1[0] = mp.group(9);
						row1[1] = mp.group(10);
					}
					if (counter == 2) {
						row2[0] = mp.group(9);
						row2[1] = mp.group(10);
					}
					if (counter == 3) {
						row3[0] = mp.group(9);
						row3[1] = mp.group(10);
					}
					if (counter == 4) {
						row4[0] = mp.group(9);
						row4[1] = mp.group(10);
					}
					if (counter == 5) {
						row5[0] = mp.group(9);
						row5[1] = mp.group(10);
					}

					if (counter == 6) {
						row6[0] = mp.group(9);
						row6[1] = mp.group(10);
					}

					if (counter == 7) {
						row7[0] = mp.group(9);
						row7[1] = mp.group(10);
					}

					if (counter == 8) {
						row8[0] = mp.group(9);
						row8[1] = mp.group(10);
					}

					if (counter == 9) {
						row9[0] = mp.group(9);
						row9[1] = mp.group(10);
					}

					if (counter == 10) {
						row10[0] = mp.group(9);
						row10[1] = mp.group(10);
					}

					if (counter == 11) {
						row11[0] = mp.group(9);
						row11[1] = mp.group(10);
					}

					if (counter == 12) {
						row12[0] = mp.group(9);
						row12[1] = mp.group(10);
					}

					if (counter == 13) {
						row13[0] = mp.group(9);
						row13[1] = mp.group(10);
					}

					if (counter == 14) {
						row14[0] = mp.group(9);
						row14[1] = mp.group(10);
					}

					if (counter == 15) {
						row15[0] = mp.group(9);
						row15[1] = mp.group(10);
					}

					if (counter == 16) {
						row16[0] = mp.group(9);
						row16[1] = mp.group(10);
					}

					if (counter == 17) {
						row17[0] = mp.group(9);
						row17[1] = mp.group(10);
					}

					if (counter == 18) {
						row18[0] = mp.group(9);
						row18[1] = mp.group(10);
					}

					if (counter == 19) {
						row19[0] = mp.group(9);
						row19[1] = mp.group(10);
					}

					if (counter == 20) {
						row20[0] = mp.group(9);
						row20[1] = mp.group(10);
					}

					if (counter == 21) {
						row21[0] = mp.group(9);
						row21[1] = mp.group(10);
					}

					if (counter == 22) {
						row22[0] = mp.group(9);
						row22[1] = mp.group(10);
					}

					if (counter == 23) {
						row23[0] = mp.group(9);
						row23[1] = mp.group(10);
					}

					if (counter == 24) {
						row24[0] = mp.group(9);
						row24[1] = mp.group(10);
					}

					if (counter == 25) {
						row25[0] = mp.group(9);
						row25[1] = mp.group(10);
					}

					if (counter == 26) {
						row26[0] = mp.group(9);
						row26[1] = mp.group(10);
					}

					if (counter == 27) {
						row27[0] = mp.group(9);
						row27[1] = mp.group(10);
					}

					if (counter == 28) {
						row28[0] = mp.group(9);
						row28[1] = mp.group(10);
					}

					if (counter == 29) {
						row29[0] = mp.group(9);
						row29[1] = mp.group(10);
					}

					if (counter == 30) {
						row30[0] = mp.group(9);
						row30[1] = mp.group(10);
					}

					if (counter == 31) {
						row31[0] = mp.group(9);
						row31[1] = mp.group(10);
					}

					if (counter == 32) {
						row32[0] = mp.group(9);
						row32[1] = mp.group(10);
					}

					if (counter == 33) {
						row33[0] = mp.group(9);
						row33[1] = mp.group(10);
					}

					if (counter == 34) {
						row34[0] = mp.group(9);
						row34[1] = mp.group(10);
					}

					if (counter == 35) {
						row35[0] = mp.group(9);
						row35[1] = mp.group(10);
					}

					if (counter == 36) {
						row36[0] = mp.group(9);
						row36[1] = mp.group(10);
					}

					if (counter == 37) {
						row37[0] = mp.group(9);
						row37[1] = mp.group(10);
					}

					if (counter == 38) {
						row38[0] = mp.group(9);
						row38[1] = mp.group(10);
					}

					if (counter == 39) {
						row39[0] = mp.group(9);
						row39[1] = mp.group(10);
					}
					counter++;
				}
			}
		}

		if (m8.matches() && !m9.matches() && !m10.matches()) {

			Pattern pn = Pattern
					.compile("(.*,) ([a-z||A-Z||0-9].*[a-z||A-Z||0-9])(.*[^,].*)");
			Matcher mn = pn.matcher(list);
			if (mn.matches()) {

				row[0] = "name:";
				row[1] = mn.group(2);

			}

			for (String line : lines) {
				Pattern pp = Pattern.compile("(/)" + m8.group(2) + "(/)"
						+ m8.group(3) + "(/)" + m8.group(4) + "(/)"
						+ m8.group(5) + "(/)" + m8.group(6) + "(/)"
						+ m8.group(7) + "(/)" + m8.group(8) + "(/)"
						+ m8.group(9) + "(/)" + m8.group(10) + "	(.*:)( .*)");
				Matcher mp = pp.matcher(line);
				if (mp.matches()) {
					if (counter == 1) {
						row1[0] = mp.group(10);
						row1[1] = mp.group(11);
					}
					if (counter == 2) {
						row2[0] = mp.group(10);
						row2[1] = mp.group(11);
					}
					if (counter == 3) {
						row3[0] = mp.group(10);
						row3[1] = mp.group(11);
					}
					if (counter == 4) {
						row4[0] = mp.group(10);
						row4[1] = mp.group(11);
					}
					if (counter == 5) {
						row5[0] = mp.group(10);
						row5[1] = mp.group(11);
					}

					if (counter == 6) {
						row6[0] = mp.group(10);
						row6[1] = mp.group(11);
					}

					if (counter == 7) {
						row7[0] = mp.group(10);
						row7[1] = mp.group(11);
					}

					if (counter == 8) {
						row8[0] = mp.group(10);
						row8[1] = mp.group(11);
					}

					if (counter == 9) {
						row9[0] = mp.group(10);
						row9[1] = mp.group(11);
					}

					if (counter == 10) {
						row10[0] = mp.group(10);
						row10[1] = mp.group(11);
					}

					if (counter == 11) {
						row11[0] = mp.group(10);
						row11[1] = mp.group(11);
					}

					if (counter == 12) {
						row12[0] = mp.group(10);
						row12[1] = mp.group(11);
					}

					if (counter == 13) {
						row13[0] = mp.group(10);
						row13[1] = mp.group(11);
					}

					if (counter == 14) {
						row14[0] = mp.group(10);
						row14[1] = mp.group(11);
					}

					if (counter == 15) {
						row15[0] = mp.group(10);
						row15[1] = mp.group(11);
					}

					if (counter == 16) {
						row16[0] = mp.group(10);
						row16[1] = mp.group(11);
					}

					if (counter == 17) {
						row17[0] = mp.group(10);
						row17[1] = mp.group(11);
					}

					if (counter == 18) {
						row18[0] = mp.group(10);
						row18[1] = mp.group(11);
					}

					if (counter == 19) {
						row19[0] = mp.group(10);
						row19[1] = mp.group(11);
					}

					if (counter == 20) {
						row20[0] = mp.group(10);
						row20[1] = mp.group(11);
					}

					if (counter == 21) {
						row21[0] = mp.group(10);
						row21[1] = mp.group(11);
					}

					if (counter == 22) {
						row22[0] = mp.group(10);
						row22[1] = mp.group(11);
					}

					if (counter == 23) {
						row23[0] = mp.group(10);
						row23[1] = mp.group(11);
					}

					if (counter == 24) {
						row24[0] = mp.group(10);
						row24[1] = mp.group(11);
					}

					if (counter == 25) {
						row25[0] = mp.group(10);
						row25[1] = mp.group(11);
					}

					if (counter == 26) {
						row26[0] = mp.group(10);
						row26[1] = mp.group(11);
					}

					if (counter == 27) {
						row27[0] = mp.group(10);
						row27[1] = mp.group(11);
					}

					if (counter == 28) {
						row28[0] = mp.group(10);
						row28[1] = mp.group(11);
					}

					if (counter == 29) {
						row29[0] = mp.group(10);
						row29[1] = mp.group(11);
					}

					if (counter == 30) {
						row30[0] = mp.group(10);
						row30[1] = mp.group(11);
					}

					if (counter == 31) {
						row31[0] = mp.group(10);
						row31[1] = mp.group(11);
					}

					if (counter == 32) {
						row32[0] = mp.group(10);
						row32[1] = mp.group(11);
					}

					if (counter == 33) {
						row33[0] = mp.group(10);
						row33[1] = mp.group(11);
					}

					if (counter == 34) {
						row34[0] = mp.group(10);
						row34[1] = mp.group(11);
					}

					if (counter == 35) {
						row35[0] = mp.group(10);
						row35[1] = mp.group(11);
					}

					if (counter == 36) {
						row36[0] = mp.group(10);
						row36[1] = mp.group(11);
					}

					if (counter == 37) {
						row37[0] = mp.group(10);
						row37[1] = mp.group(11);
					}

					if (counter == 38) {
						row38[0] = mp.group(10);
						row38[1] = mp.group(11);
					}

					if (counter == 39) {
						row39[0] = mp.group(10);
						row39[1] = mp.group(11);
					}
					counter++;
				}
			}
		}

		if (m9.matches() && !m10.matches()) {

			Pattern pn = Pattern
					.compile("(.*,) ([a-z||A-Z||0-9].*[a-z||A-Z||0-9])(.*[^,].*)");
			Matcher mn = pn.matcher(list);
			if (mn.matches()) {

				row[0] = "name:";
				row[1] = mn.group(2);

			}

			for (String line : lines) {
				Pattern pp = Pattern.compile("(/)" + m9.group(2) + "(/)"
						+ m9.group(3) + "(/)" + m9.group(4) + "(/)"
						+ m9.group(5) + "(/)" + m9.group(6) + "(/)"
						+ m9.group(7) + "(/)" + m9.group(8) + "(/)"
						+ m9.group(9) + "(/)" + m9.group(10) + "(/)"
						+ m9.group(11) + "	(.*:)( .*)");
				Matcher mp = pp.matcher(line);
				if (mp.matches()) {
					if (counter == 1) {
						row1[0] = mp.group(11);
						row1[1] = mp.group(12);
					}
					if (counter == 2) {
						row2[0] = mp.group(11);
						row2[1] = mp.group(12);
					}
					if (counter == 3) {
						row3[0] = mp.group(11);
						row3[1] = mp.group(12);
					}
					if (counter == 4) {
						row4[0] = mp.group(11);
						row4[1] = mp.group(12);
					}
					if (counter == 5) {
						row5[0] = mp.group(11);
						row5[1] = mp.group(12);
					}

					if (counter == 6) {
						row6[0] = mp.group(11);
						row6[1] = mp.group(12);
					}

					if (counter == 7) {
						row7[0] = mp.group(11);
						row7[1] = mp.group(12);
					}

					if (counter == 8) {
						row8[0] = mp.group(11);
						row8[1] = mp.group(12);
					}

					if (counter == 9) {
						row9[0] = mp.group(11);
						row9[1] = mp.group(12);
					}

					if (counter == 10) {
						row10[0] = mp.group(11);
						row10[1] = mp.group(12);
					}

					if (counter == 11) {
						row11[0] = mp.group(11);
						row11[1] = mp.group(12);
					}

					if (counter == 12) {
						row12[0] = mp.group(11);
						row12[1] = mp.group(12);
					}

					if (counter == 13) {
						row13[0] = mp.group(11);
						row13[1] = mp.group(12);
					}

					if (counter == 14) {
						row14[0] = mp.group(11);
						row14[1] = mp.group(12);
					}

					if (counter == 15) {
						row15[0] = mp.group(11);
						row15[1] = mp.group(12);
					}

					if (counter == 16) {
						row16[0] = mp.group(11);
						row16[1] = mp.group(12);
					}

					if (counter == 17) {
						row17[0] = mp.group(11);
						row17[1] = mp.group(12);
					}

					if (counter == 18) {
						row18[0] = mp.group(11);
						row18[1] = mp.group(12);
					}

					if (counter == 19) {
						row19[0] = mp.group(11);
						row19[1] = mp.group(12);
					}

					if (counter == 20) {
						row20[0] = mp.group(11);
						row20[1] = mp.group(12);
					}

					if (counter == 21) {
						row21[0] = mp.group(11);
						row21[1] = mp.group(12);
					}

					if (counter == 22) {
						row22[0] = mp.group(11);
						row22[1] = mp.group(12);
					}

					if (counter == 23) {
						row23[0] = mp.group(11);
						row23[1] = mp.group(12);
					}

					if (counter == 24) {
						row24[0] = mp.group(11);
						row24[1] = mp.group(12);
					}

					if (counter == 25) {
						row25[0] = mp.group(11);
						row25[1] = mp.group(12);
					}

					if (counter == 26) {
						row26[0] = mp.group(11);
						row26[1] = mp.group(12);
					}

					if (counter == 27) {
						row27[0] = mp.group(11);
						row27[1] = mp.group(12);
					}

					if (counter == 28) {
						row28[0] = mp.group(11);
						row28[1] = mp.group(12);
					}

					if (counter == 29) {
						row29[0] = mp.group(11);
						row29[1] = mp.group(12);
					}

					if (counter == 30) {
						row30[0] = mp.group(11);
						row30[1] = mp.group(12);
					}

					if (counter == 31) {
						row31[0] = mp.group(11);
						row31[1] = mp.group(12);
					}

					if (counter == 32) {
						row32[0] = mp.group(11);
						row32[1] = mp.group(12);
					}

					if (counter == 33) {
						row33[0] = mp.group(11);
						row33[1] = mp.group(12);
					}

					if (counter == 34) {
						row34[0] = mp.group(11);
						row34[1] = mp.group(12);
					}

					if (counter == 35) {
						row35[0] = mp.group(11);
						row35[1] = mp.group(12);
					}

					if (counter == 36) {
						row36[0] = mp.group(11);
						row36[1] = mp.group(12);
					}

					if (counter == 37) {
						row37[0] = mp.group(11);
						row37[1] = mp.group(12);
					}

					if (counter == 38) {
						row38[0] = mp.group(11);
						row38[1] = mp.group(12);
					}

					if (counter == 39) {
						row39[0] = mp.group(11);
						row39[1] = mp.group(12);
					}
					counter++;
				}
			}
		}

		if (m10.matches()) {

			Pattern pn = Pattern
					.compile("(.*,) ([a-z||A-Z||0-9].*[a-z||A-Z||0-9])(.*[^,].*)");
			Matcher mn = pn.matcher(list);
			if (mn.matches()) {

				row[0] = "name:";
				row[1] = mn.group(2);

			}

			for (String line : lines) {
				Pattern pp = Pattern
						.compile("(/)" + m10.group(2) + "(/)" + m10.group(3)
								+ "(/)" + m10.group(4) + "(/)" + m10.group(5)
								+ "(/)" + m10.group(6) + "(/)" + m10.group(7)
								+ "(/)" + m10.group(8) + "(/)" + m10.group(9)
								+ "(/)" + m10.group(10) + "(/)" + m10.group(11)
								+ "(/)" + m10.group(12) + "	(.*:)( .*)");
				Matcher mp = pp.matcher(line);
				if (mp.matches()) {
					if (counter == 1) {
						row1[0] = mp.group(12);
						row1[1] = mp.group(13);
					}
					if (counter == 2) {
						row2[0] = mp.group(12);
						row2[1] = mp.group(13);
					}
					if (counter == 3) {
						row3[0] = mp.group(12);
						row3[1] = mp.group(13);
					}
					if (counter == 4) {
						row4[0] = mp.group(12);
						row4[1] = mp.group(13);
					}
					if (counter == 5) {
						row5[0] = mp.group(12);
						row5[1] = mp.group(13);
					}

					if (counter == 6) {
						row6[0] = mp.group(12);
						row6[1] = mp.group(13);
					}

					if (counter == 7) {
						row7[0] = mp.group(12);
						row7[1] = mp.group(13);
					}

					if (counter == 8) {
						row8[0] = mp.group(12);
						row8[1] = mp.group(13);
					}

					if (counter == 9) {
						row9[0] = mp.group(12);
						row9[1] = mp.group(13);
					}

					if (counter == 10) {
						row10[0] = mp.group(12);
						row10[1] = mp.group(13);
					}

					if (counter == 11) {
						row11[0] = mp.group(12);
						row11[1] = mp.group(13);
					}

					if (counter == 12) {
						row12[0] = mp.group(12);
						row12[1] = mp.group(13);
					}

					if (counter == 13) {
						row13[0] = mp.group(12);
						row13[1] = mp.group(13);
					}

					if (counter == 14) {
						row14[0] = mp.group(12);
						row14[1] = mp.group(13);
					}

					if (counter == 15) {
						row15[0] = mp.group(12);
						row15[1] = mp.group(13);
					}

					if (counter == 16) {
						row16[0] = mp.group(12);
						row16[1] = mp.group(13);
					}

					if (counter == 17) {
						row17[0] = mp.group(12);
						row17[1] = mp.group(13);
					}

					if (counter == 18) {
						row18[0] = mp.group(12);
						row18[1] = mp.group(13);
					}

					if (counter == 19) {
						row19[0] = mp.group(12);
						row19[1] = mp.group(13);
					}

					if (counter == 20) {
						row20[0] = mp.group(12);
						row20[1] = mp.group(13);
					}

					if (counter == 21) {
						row21[0] = mp.group(12);
						row21[1] = mp.group(13);
					}

					if (counter == 22) {
						row22[0] = mp.group(12);
						row22[1] = mp.group(13);
					}

					if (counter == 23) {
						row23[0] = mp.group(12);
						row23[1] = mp.group(13);
					}

					if (counter == 24) {
						row24[0] = mp.group(12);
						row24[1] = mp.group(13);
					}

					if (counter == 25) {
						row25[0] = mp.group(12);
						row25[1] = mp.group(13);
					}

					if (counter == 26) {
						row26[0] = mp.group(12);
						row26[1] = mp.group(13);
					}

					if (counter == 27) {
						row27[0] = mp.group(12);
						row27[1] = mp.group(13);
					}

					if (counter == 28) {
						row28[0] = mp.group(12);
						row28[1] = mp.group(13);
					}

					if (counter == 29) {
						row29[0] = mp.group(12);
						row29[1] = mp.group(13);
					}

					if (counter == 30) {
						row30[0] = mp.group(12);
						row30[1] = mp.group(13);
					}

					if (counter == 31) {
						row31[0] = mp.group(12);
						row31[1] = mp.group(13);
					}

					if (counter == 32) {
						row32[0] = mp.group(12);
						row32[1] = mp.group(13);
					}

					if (counter == 33) {
						row33[0] = mp.group(12);
						row33[1] = mp.group(13);
					}

					if (counter == 34) {
						row34[0] = mp.group(12);
						row34[1] = mp.group(13);
					}

					if (counter == 35) {
						row35[0] = mp.group(12);
						row35[1] = mp.group(13);
					}

					if (counter == 36) {
						row36[0] = mp.group(12);
						row36[1] = mp.group(13);
					}

					if (counter == 37) {
						row37[0] = mp.group(12);
						row37[1] = mp.group(13);
					}

					if (counter == 38) {
						row38[0] = mp.group(12);
						row38[1] = mp.group(13);
					}

					if (counter == 39) {
						row39[0] = mp.group(12);
						row39[1] = mp.group(13);
					}
					counter++;
				}
			}
		}

		if (row[0] != null && row[1] != null) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row }, new String[] { "Property",
									"Value" }) {
						private static final long serialVersionUID = 1L;
						@SuppressWarnings("rawtypes")
						Class[] types = new Class[] { java.lang.String.class,
								java.lang.String.class };

						public Class<?> getColumnClass(int columnIndex) {
							return types[columnIndex];
						}
					});

		}

		if ((row[0] != null && row[1] != null)
				&& (row1[0] != null && row1[1] != null)) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row, row1 }, new String[] {
									"Property", "Value" }) {
						private static final long serialVersionUID = 1L;
						@SuppressWarnings("rawtypes")
						Class[] types = new Class[] { java.lang.String.class,
								java.lang.String.class };

						public Class<?> getColumnClass(int columnIndex) {
							return types[columnIndex];
						}
					});

		}

		if ((row[0] != null && row[1] != null)
				&& (row1[0] != null && row1[1] != null)
				&& (row2[0] != null && row2[1] != null)) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row, row1, row2 }, new String[] {
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

		if ((row[0] != null && row[1] != null)
				&& (row1[0] != null && row1[1] != null)
				&& (row2[0] != null && row2[1] != null)
				&& (row3[0] != null && row3[1] != null)) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row, row1, row2, row3 },
							new String[] { "Property", "Value" }) {
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

		if ((row[0] != null && row[1] != null)
				&& (row1[0] != null && row1[1] != null)
				&& (row2[0] != null && row2[1] != null)
				&& (row3[0] != null && row3[1] != null)
				&& (row4[0] != null && row4[1] != null)) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row, row1, row2, row3, row4 },
							new String[] { "Property", "Value" }) {
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

		if ((row[0] != null && row[1] != null)
				&& (row1[0] != null && row1[1] != null)
				&& (row2[0] != null && row2[1] != null)
				&& (row3[0] != null && row3[1] != null)
				&& (row4[0] != null && row4[1] != null)
				&& (row5[0] != null && row5[1] != null)) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row, row1, row2, row3, row4, row5 },
							new String[] { "Property", "Value" }) {
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

		if ((row[0] != null && row[1] != null)
				&& (row1[0] != null && row1[1] != null)
				&& (row2[0] != null && row2[1] != null)
				&& (row3[0] != null && row3[1] != null)
				&& (row4[0] != null && row4[1] != null)
				&& (row5[0] != null && row5[1] != null)
				&& (row6[0] != null && row6[1] != null)) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row, row1, row2, row3, row4, row5,
									row6 },
							new String[] { "Property", "Value" }) {
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

		if ((row[0] != null && row[1] != null)
				&& (row1[0] != null && row1[1] != null)
				&& (row2[0] != null && row2[1] != null)
				&& (row3[0] != null && row3[1] != null)
				&& (row4[0] != null && row4[1] != null)
				&& (row5[0] != null && row5[1] != null)
				&& (row6[0] != null && row6[1] != null)
				&& (row7[0] != null && row7[1] != null)) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row, row1, row2, row3, row4, row5,
									row6, row7 }, new String[] { "Property",
									"Value" }) {
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

		if ((row[0] != null && row[1] != null)
				&& (row1[0] != null && row1[1] != null)
				&& (row2[0] != null && row2[1] != null)
				&& (row3[0] != null && row3[1] != null)
				&& (row4[0] != null && row4[1] != null)
				&& (row5[0] != null && row5[1] != null)
				&& (row6[0] != null && row6[1] != null)
				&& (row7[0] != null && row7[1] != null)
				&& (row8[0] != null && row8[1] != null)) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row, row1, row2, row3, row4, row5,
									row6, row7, row8 }, new String[] {
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

		if ((row[0] != null && row[1] != null)
				&& (row1[0] != null && row1[1] != null)
				&& (row2[0] != null && row2[1] != null)
				&& (row3[0] != null && row3[1] != null)
				&& (row4[0] != null && row4[1] != null)
				&& (row5[0] != null && row5[1] != null)
				&& (row6[0] != null && row6[1] != null)
				&& (row7[0] != null && row7[1] != null)
				&& (row8[0] != null && row8[1] != null)
				&& (row9[0] != null && row9[1] != null)) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row, row1, row2, row3, row4, row5,
									row6, row7, row8, row9 }, new String[] {
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

		if ((row[0] != null && row[1] != null)
				&& (row1[0] != null && row1[1] != null)
				&& (row2[0] != null && row2[1] != null)
				&& (row3[0] != null && row3[1] != null)
				&& (row4[0] != null && row4[1] != null)
				&& (row5[0] != null && row5[1] != null)
				&& (row6[0] != null && row6[1] != null)
				&& (row7[0] != null && row7[1] != null)
				&& (row8[0] != null && row8[1] != null)
				&& (row9[0] != null && row9[1] != null)
				&& (row10[0] != null && row10[1] != null)) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row, row1, row2, row3, row4, row5,
									row6, row7, row8, row9, row10 },
							new String[] { "Property", "Value" }) {
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

		if ((row[0] != null && row[1] != null)
				&& (row1[0] != null && row1[1] != null)
				&& (row2[0] != null && row2[1] != null)
				&& (row3[0] != null && row3[1] != null)
				&& (row4[0] != null && row4[1] != null)
				&& (row5[0] != null && row5[1] != null)
				&& (row6[0] != null && row6[1] != null)
				&& (row7[0] != null && row7[1] != null)
				&& (row8[0] != null && row8[1] != null)
				&& (row9[0] != null && row9[1] != null)
				&& (row10[0] != null && row10[1] != null)
				&& (row11[0] != null && row11[1] != null)) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row, row1, row2, row3, row4, row5,
									row6, row7, row8, row9, row10, row11 },
							new String[] { "Property", "Value" }) {
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

		if ((row[0] != null && row[1] != null)
				&& (row1[0] != null && row1[1] != null)
				&& (row2[0] != null && row2[1] != null)
				&& (row3[0] != null && row3[1] != null)
				&& (row4[0] != null && row4[1] != null)
				&& (row5[0] != null && row5[1] != null)
				&& (row6[0] != null && row6[1] != null)
				&& (row7[0] != null && row7[1] != null)
				&& (row8[0] != null && row8[1] != null)
				&& (row9[0] != null && row9[1] != null)
				&& (row10[0] != null && row10[1] != null)
				&& (row11[0] != null && row11[1] != null)
				&& (row12[0] != null && row12[1] != null)) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row, row1, row2, row3, row4, row5,
									row6, row7, row8, row9, row10, row11, row12 },
							new String[] { "Property", "Value" }) {
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

		if ((row[0] != null && row[1] != null)
				&& (row1[0] != null && row1[1] != null)
				&& (row2[0] != null && row2[1] != null)
				&& (row3[0] != null && row3[1] != null)
				&& (row4[0] != null && row4[1] != null)
				&& (row5[0] != null && row5[1] != null)
				&& (row6[0] != null && row6[1] != null)
				&& (row7[0] != null && row7[1] != null)
				&& (row8[0] != null && row8[1] != null)
				&& (row9[0] != null && row9[1] != null)
				&& (row10[0] != null && row10[1] != null)
				&& (row11[0] != null && row11[1] != null)
				&& (row12[0] != null && row12[1] != null)
				&& (row13[0] != null && row13[1] != null)) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row, row1, row2, row3, row4, row5,
									row6, row7, row8, row9, row10, row11,
									row12, row13 }, new String[] { "Property",
									"Value" }) {
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

		if ((row[0] != null && row[1] != null)
				&& (row1[0] != null && row1[1] != null)
				&& (row2[0] != null && row2[1] != null)
				&& (row3[0] != null && row3[1] != null)
				&& (row4[0] != null && row4[1] != null)
				&& (row5[0] != null && row5[1] != null)
				&& (row6[0] != null && row6[1] != null)
				&& (row7[0] != null && row7[1] != null)
				&& (row8[0] != null && row8[1] != null)
				&& (row9[0] != null && row9[1] != null)
				&& (row10[0] != null && row10[1] != null)
				&& (row11[0] != null && row11[1] != null)
				&& (row12[0] != null && row12[1] != null)
				&& (row13[0] != null && row13[1] != null)
				&& (row14[0] != null && row14[1] != null)) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row, row1, row2, row3, row4, row5,
									row6, row7, row8, row9, row10, row11,
									row12, row13, row14 }, new String[] {
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

		if ((row[0] != null && row[1] != null)
				&& (row1[0] != null && row1[1] != null)
				&& (row2[0] != null && row2[1] != null)
				&& (row3[0] != null && row3[1] != null)
				&& (row4[0] != null && row4[1] != null)
				&& (row5[0] != null && row5[1] != null)
				&& (row6[0] != null && row6[1] != null)
				&& (row7[0] != null && row7[1] != null)
				&& (row8[0] != null && row8[1] != null)
				&& (row9[0] != null && row9[1] != null)
				&& (row10[0] != null && row10[1] != null)
				&& (row11[0] != null && row11[1] != null)
				&& (row12[0] != null && row12[1] != null)
				&& (row13[0] != null && row13[1] != null)
				&& (row14[0] != null && row14[1] != null)
				&& (row15[0] != null && row15[1] != null)) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row, row1, row2, row3, row4, row5,
									row6, row7, row8, row9, row10, row11,
									row12, row13, row14, row15 }, new String[] {
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

		if ((row[0] != null && row[1] != null)
				&& (row1[0] != null && row1[1] != null)
				&& (row2[0] != null && row2[1] != null)
				&& (row3[0] != null && row3[1] != null)
				&& (row4[0] != null && row4[1] != null)
				&& (row5[0] != null && row5[1] != null)
				&& (row6[0] != null && row6[1] != null)
				&& (row7[0] != null && row7[1] != null)
				&& (row8[0] != null && row8[1] != null)
				&& (row9[0] != null && row9[1] != null)
				&& (row10[0] != null && row10[1] != null)
				&& (row11[0] != null && row11[1] != null)
				&& (row12[0] != null && row12[1] != null)
				&& (row13[0] != null && row13[1] != null)
				&& (row14[0] != null && row14[1] != null)
				&& (row15[0] != null && row15[1] != null)
				&& (row16[0] != null && row16[1] != null)) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row, row1, row2, row3, row4, row5,
									row6, row7, row8, row9, row10, row11,
									row12, row13, row14, row15, row16 },
							new String[] { "Property", "Value" }) {
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

		if ((row[0] != null && row[1] != null)
				&& (row1[0] != null && row1[1] != null)
				&& (row2[0] != null && row2[1] != null)
				&& (row3[0] != null && row3[1] != null)
				&& (row4[0] != null && row4[1] != null)
				&& (row5[0] != null && row5[1] != null)
				&& (row6[0] != null && row6[1] != null)
				&& (row7[0] != null && row7[1] != null)
				&& (row8[0] != null && row8[1] != null)
				&& (row9[0] != null && row9[1] != null)
				&& (row10[0] != null && row10[1] != null)
				&& (row11[0] != null && row11[1] != null)
				&& (row12[0] != null && row12[1] != null)
				&& (row13[0] != null && row13[1] != null)
				&& (row14[0] != null && row14[1] != null)
				&& (row15[0] != null && row15[1] != null)
				&& (row16[0] != null && row16[1] != null)
				&& (row17[0] != null && row17[1] != null)) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row, row1, row2, row3, row4, row5,
									row6, row7, row8, row9, row10, row11,
									row12, row13, row14, row15, row16, row17 },
							new String[] { "Property", "Value" }) {
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

		if ((row[0] != null && row[1] != null)
				&& (row1[0] != null && row1[1] != null)
				&& (row2[0] != null && row2[1] != null)
				&& (row3[0] != null && row3[1] != null)
				&& (row4[0] != null && row4[1] != null)
				&& (row5[0] != null && row5[1] != null)
				&& (row6[0] != null && row6[1] != null)
				&& (row7[0] != null && row7[1] != null)
				&& (row8[0] != null && row8[1] != null)
				&& (row9[0] != null && row9[1] != null)
				&& (row10[0] != null && row10[1] != null)
				&& (row11[0] != null && row11[1] != null)
				&& (row12[0] != null && row12[1] != null)
				&& (row13[0] != null && row13[1] != null)
				&& (row14[0] != null && row14[1] != null)
				&& (row15[0] != null && row15[1] != null)
				&& (row16[0] != null && row16[1] != null)
				&& (row17[0] != null && row17[1] != null)
				&& (row18[0] != null && row18[1] != null)) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row, row1, row2, row3, row4, row5,
									row6, row7, row8, row9, row10, row11,
									row12, row13, row14, row15, row16, row17,
									row18 },
							new String[] { "Property", "Value" }) {
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

		if ((row[0] != null && row[1] != null)
				&& (row1[0] != null && row1[1] != null)
				&& (row2[0] != null && row2[1] != null)
				&& (row3[0] != null && row3[1] != null)
				&& (row4[0] != null && row4[1] != null)
				&& (row5[0] != null && row5[1] != null)
				&& (row6[0] != null && row6[1] != null)
				&& (row7[0] != null && row7[1] != null)
				&& (row8[0] != null && row8[1] != null)
				&& (row9[0] != null && row9[1] != null)
				&& (row10[0] != null && row10[1] != null)
				&& (row11[0] != null && row11[1] != null)
				&& (row12[0] != null && row12[1] != null)
				&& (row13[0] != null && row13[1] != null)
				&& (row14[0] != null && row14[1] != null)
				&& (row15[0] != null && row15[1] != null)
				&& (row16[0] != null && row16[1] != null)
				&& (row17[0] != null && row17[1] != null)
				&& (row18[0] != null && row18[1] != null)
				&& (row19[0] != null && row19[1] != null)) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row, row1, row2, row3, row4, row5,
									row6, row7, row8, row9, row10, row11,
									row12, row13, row14, row15, row16, row17,
									row18, row19 }, new String[] { "Property",
									"Value" }) {
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

		if ((row[0] != null && row[1] != null)
				&& (row1[0] != null && row1[1] != null)
				&& (row2[0] != null && row2[1] != null)
				&& (row3[0] != null && row3[1] != null)
				&& (row4[0] != null && row4[1] != null)
				&& (row5[0] != null && row5[1] != null)
				&& (row6[0] != null && row6[1] != null)
				&& (row7[0] != null && row7[1] != null)
				&& (row8[0] != null && row8[1] != null)
				&& (row9[0] != null && row9[1] != null)
				&& (row10[0] != null && row10[1] != null)
				&& (row11[0] != null && row11[1] != null)
				&& (row12[0] != null && row12[1] != null)
				&& (row13[0] != null && row13[1] != null)
				&& (row14[0] != null && row14[1] != null)
				&& (row15[0] != null && row15[1] != null)
				&& (row16[0] != null && row16[1] != null)
				&& (row17[0] != null && row17[1] != null)
				&& (row18[0] != null && row18[1] != null)
				&& (row19[0] != null && row19[1] != null)
				&& (row20[0] != null && row20[1] != null)) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row, row1, row2, row3, row4, row5,
									row6, row7, row8, row9, row10, row11,
									row12, row13, row14, row15, row16, row17,
									row18, row19, row20 }, new String[] {
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

		if ((row[0] != null && row[1] != null)
				&& (row1[0] != null && row1[1] != null)
				&& (row2[0] != null && row2[1] != null)
				&& (row3[0] != null && row3[1] != null)
				&& (row4[0] != null && row4[1] != null)
				&& (row5[0] != null && row5[1] != null)
				&& (row6[0] != null && row6[1] != null)
				&& (row7[0] != null && row7[1] != null)
				&& (row8[0] != null && row8[1] != null)
				&& (row9[0] != null && row9[1] != null)
				&& (row10[0] != null && row10[1] != null)
				&& (row11[0] != null && row11[1] != null)
				&& (row12[0] != null && row12[1] != null)
				&& (row13[0] != null && row13[1] != null)
				&& (row14[0] != null && row14[1] != null)
				&& (row15[0] != null && row15[1] != null)
				&& (row16[0] != null && row16[1] != null)
				&& (row17[0] != null && row17[1] != null)
				&& (row18[0] != null && row18[1] != null)
				&& (row19[0] != null && row19[1] != null)
				&& (row20[0] != null && row20[1] != null)
				&& (row21[0] != null && row21[1] != null)) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row, row1, row2, row3, row4, row5,
									row6, row7, row8, row9, row10, row11,
									row12, row13, row14, row15, row16, row17,
									row18, row19, row20, row21 }, new String[] {
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

		if ((row[0] != null && row[1] != null)
				&& (row1[0] != null && row1[1] != null)
				&& (row2[0] != null && row2[1] != null)
				&& (row3[0] != null && row3[1] != null)
				&& (row4[0] != null && row4[1] != null)
				&& (row5[0] != null && row5[1] != null)
				&& (row6[0] != null && row6[1] != null)
				&& (row7[0] != null && row7[1] != null)
				&& (row8[0] != null && row8[1] != null)
				&& (row9[0] != null && row9[1] != null)
				&& (row10[0] != null && row10[1] != null)
				&& (row11[0] != null && row11[1] != null)
				&& (row12[0] != null && row12[1] != null)
				&& (row13[0] != null && row13[1] != null)
				&& (row14[0] != null && row14[1] != null)
				&& (row15[0] != null && row15[1] != null)
				&& (row16[0] != null && row16[1] != null)
				&& (row17[0] != null && row17[1] != null)
				&& (row18[0] != null && row18[1] != null)
				&& (row19[0] != null && row19[1] != null)
				&& (row20[0] != null && row20[1] != null)
				&& (row21[0] != null && row21[1] != null)
				&& (row22[0] != null && row22[1] != null)) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row, row1, row2, row3, row4, row5,
									row6, row7, row8, row9, row10, row11,
									row12, row13, row14, row15, row16, row17,
									row18, row19, row20, row21, row22 },
							new String[] { "Property", "Value" }) {
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

		if ((row[0] != null && row[1] != null)
				&& (row1[0] != null && row1[1] != null)
				&& (row2[0] != null && row2[1] != null)
				&& (row3[0] != null && row3[1] != null)
				&& (row4[0] != null && row4[1] != null)
				&& (row5[0] != null && row5[1] != null)
				&& (row6[0] != null && row6[1] != null)
				&& (row7[0] != null && row7[1] != null)
				&& (row8[0] != null && row8[1] != null)
				&& (row9[0] != null && row9[1] != null)
				&& (row10[0] != null && row10[1] != null)
				&& (row11[0] != null && row11[1] != null)
				&& (row12[0] != null && row12[1] != null)
				&& (row13[0] != null && row13[1] != null)
				&& (row14[0] != null && row14[1] != null)
				&& (row15[0] != null && row15[1] != null)
				&& (row16[0] != null && row16[1] != null)
				&& (row17[0] != null && row17[1] != null)
				&& (row18[0] != null && row18[1] != null)
				&& (row19[0] != null && row19[1] != null)
				&& (row20[0] != null && row20[1] != null)
				&& (row21[0] != null && row21[1] != null)
				&& (row22[0] != null && row22[1] != null)
				&& (row23[0] != null && row23[1] != null)) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row, row1, row2, row3, row4, row5,
									row6, row7, row8, row9, row10, row11,
									row12, row13, row14, row15, row16, row17,
									row18, row19, row20, row21, row22, row23 },
							new String[] { "Property", "Value" }) {
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

		if ((row[0] != null && row[1] != null)
				&& (row1[0] != null && row1[1] != null)
				&& (row2[0] != null && row2[1] != null)
				&& (row3[0] != null && row3[1] != null)
				&& (row4[0] != null && row4[1] != null)
				&& (row5[0] != null && row5[1] != null)
				&& (row6[0] != null && row6[1] != null)
				&& (row7[0] != null && row7[1] != null)
				&& (row8[0] != null && row8[1] != null)
				&& (row9[0] != null && row9[1] != null)
				&& (row10[0] != null && row10[1] != null)
				&& (row11[0] != null && row11[1] != null)
				&& (row12[0] != null && row12[1] != null)
				&& (row13[0] != null && row13[1] != null)
				&& (row14[0] != null && row14[1] != null)
				&& (row15[0] != null && row15[1] != null)
				&& (row16[0] != null && row16[1] != null)
				&& (row17[0] != null && row17[1] != null)
				&& (row18[0] != null && row18[1] != null)
				&& (row19[0] != null && row19[1] != null)
				&& (row20[0] != null && row20[1] != null)
				&& (row21[0] != null && row21[1] != null)
				&& (row22[0] != null && row22[1] != null)
				&& (row23[0] != null && row23[1] != null)
				&& (row24[0] != null && row24[1] != null)) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row, row1, row2, row3, row4, row5,
									row6, row7, row8, row9, row10, row11,
									row12, row13, row14, row15, row16, row17,
									row18, row19, row20, row21, row22, row23,
									row24 },
							new String[] { "Property", "Value" }) {
						/**
                 *
                 */
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

		if ((row[0] != null && row[1] != null)
				&& (row1[0] != null && row1[1] != null)
				&& (row2[0] != null && row2[1] != null)
				&& (row3[0] != null && row3[1] != null)
				&& (row4[0] != null && row4[1] != null)
				&& (row5[0] != null && row5[1] != null)
				&& (row6[0] != null && row6[1] != null)
				&& (row7[0] != null && row7[1] != null)
				&& (row8[0] != null && row8[1] != null)
				&& (row9[0] != null && row9[1] != null)
				&& (row10[0] != null && row10[1] != null)
				&& (row11[0] != null && row11[1] != null)
				&& (row12[0] != null && row12[1] != null)
				&& (row13[0] != null && row13[1] != null)
				&& (row14[0] != null && row14[1] != null)
				&& (row15[0] != null && row15[1] != null)
				&& (row16[0] != null && row16[1] != null)
				&& (row17[0] != null && row17[1] != null)
				&& (row18[0] != null && row18[1] != null)
				&& (row19[0] != null && row19[1] != null)
				&& (row20[0] != null && row20[1] != null)
				&& (row21[0] != null && row21[1] != null)
				&& (row22[0] != null && row22[1] != null)
				&& (row23[0] != null && row23[1] != null)
				&& (row24[0] != null && row24[1] != null)
				&& (row25[0] != null && row25[1] != null)) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row, row1, row2, row3, row4, row5,
									row6, row7, row8, row9, row10, row11,
									row12, row13, row14, row15, row16, row17,
									row18, row19, row20, row21, row22, row23,
									row24, row25 }, new String[] { "Property",
									"Value" }) {
						/**
                 *
                 */
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

		if ((row[0] != null && row[1] != null)
				&& (row1[0] != null && row1[1] != null)
				&& (row2[0] != null && row2[1] != null)
				&& (row3[0] != null && row3[1] != null)
				&& (row4[0] != null && row4[1] != null)
				&& (row5[0] != null && row5[1] != null)
				&& (row6[0] != null && row6[1] != null)
				&& (row7[0] != null && row7[1] != null)
				&& (row8[0] != null && row8[1] != null)
				&& (row9[0] != null && row9[1] != null)
				&& (row10[0] != null && row10[1] != null)
				&& (row11[0] != null && row11[1] != null)
				&& (row12[0] != null && row12[1] != null)
				&& (row13[0] != null && row13[1] != null)
				&& (row14[0] != null && row14[1] != null)
				&& (row15[0] != null && row15[1] != null)
				&& (row16[0] != null && row16[1] != null)
				&& (row17[0] != null && row17[1] != null)
				&& (row18[0] != null && row18[1] != null)
				&& (row19[0] != null && row19[1] != null)
				&& (row20[0] != null && row20[1] != null)
				&& (row21[0] != null && row21[1] != null)
				&& (row22[0] != null && row22[1] != null)
				&& (row23[0] != null && row23[1] != null)
				&& (row24[0] != null && row24[1] != null)
				&& (row25[0] != null && row25[1] != null)
				&& (row26[0] != null && row26[1] != null)) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row, row1, row2, row3, row4, row5,
									row6, row7, row8, row9, row10, row11,
									row12, row13, row14, row15, row16, row17,
									row18, row19, row20, row21, row22, row23,
									row24, row25, row26 }, new String[] {
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

		if ((row[0] != null && row[1] != null)
				&& (row1[0] != null && row1[1] != null)
				&& (row2[0] != null && row2[1] != null)
				&& (row3[0] != null && row3[1] != null)
				&& (row4[0] != null && row4[1] != null)
				&& (row5[0] != null && row5[1] != null)
				&& (row6[0] != null && row6[1] != null)
				&& (row7[0] != null && row7[1] != null)
				&& (row8[0] != null && row8[1] != null)
				&& (row9[0] != null && row9[1] != null)
				&& (row10[0] != null && row10[1] != null)
				&& (row11[0] != null && row11[1] != null)
				&& (row12[0] != null && row12[1] != null)
				&& (row13[0] != null && row13[1] != null)
				&& (row14[0] != null && row14[1] != null)
				&& (row15[0] != null && row15[1] != null)
				&& (row16[0] != null && row16[1] != null)
				&& (row17[0] != null && row17[1] != null)
				&& (row18[0] != null && row18[1] != null)
				&& (row19[0] != null && row19[1] != null)
				&& (row20[0] != null && row20[1] != null)
				&& (row21[0] != null && row21[1] != null)
				&& (row22[0] != null && row22[1] != null)
				&& (row23[0] != null && row23[1] != null)
				&& (row24[0] != null && row24[1] != null)
				&& (row25[0] != null && row25[1] != null)
				&& (row26[0] != null && row26[1] != null)
				&& (row27[0] != null && row27[1] != null)) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row, row1, row2, row3, row4, row5,
									row6, row7, row8, row9, row10, row11,
									row12, row13, row14, row15, row16, row17,
									row18, row19, row20, row21, row22, row23,
									row24, row25, row26, row27 }, new String[] {
									"Property", "Value" }) {
						/**
                 *
                 */
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

		if ((row[0] != null && row[1] != null)
				&& (row1[0] != null && row1[1] != null)
				&& (row2[0] != null && row2[1] != null)
				&& (row3[0] != null && row3[1] != null)
				&& (row4[0] != null && row4[1] != null)
				&& (row5[0] != null && row5[1] != null)
				&& (row6[0] != null && row6[1] != null)
				&& (row7[0] != null && row7[1] != null)
				&& (row8[0] != null && row8[1] != null)
				&& (row9[0] != null && row9[1] != null)
				&& (row10[0] != null && row10[1] != null)
				&& (row11[0] != null && row11[1] != null)
				&& (row12[0] != null && row12[1] != null)
				&& (row13[0] != null && row13[1] != null)
				&& (row14[0] != null && row14[1] != null)
				&& (row15[0] != null && row15[1] != null)
				&& (row16[0] != null && row16[1] != null)
				&& (row17[0] != null && row17[1] != null)
				&& (row18[0] != null && row18[1] != null)
				&& (row19[0] != null && row19[1] != null)
				&& (row20[0] != null && row20[1] != null)
				&& (row21[0] != null && row21[1] != null)
				&& (row22[0] != null && row22[1] != null)
				&& (row23[0] != null && row23[1] != null)
				&& (row24[0] != null && row24[1] != null)
				&& (row25[0] != null && row25[1] != null)
				&& (row26[0] != null && row26[1] != null)
				&& (row27[0] != null && row27[1] != null)
				&& (row28[0] != null && row28[1] != null)) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row, row1, row2, row3, row4, row5,
									row6, row7, row8, row9, row10, row11,
									row12, row13, row14, row15, row16, row17,
									row18, row19, row20, row21, row22, row23,
									row24, row25, row26, row27, row28 },
							new String[] { "Property", "Value" }) {
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

		if ((row[0] != null && row[1] != null)
				&& (row1[0] != null && row1[1] != null)
				&& (row2[0] != null && row2[1] != null)
				&& (row3[0] != null && row3[1] != null)
				&& (row4[0] != null && row4[1] != null)
				&& (row5[0] != null && row5[1] != null)
				&& (row6[0] != null && row6[1] != null)
				&& (row7[0] != null && row7[1] != null)
				&& (row8[0] != null && row8[1] != null)
				&& (row9[0] != null && row9[1] != null)
				&& (row10[0] != null && row10[1] != null)
				&& (row11[0] != null && row11[1] != null)
				&& (row12[0] != null && row12[1] != null)
				&& (row13[0] != null && row13[1] != null)
				&& (row14[0] != null && row14[1] != null)
				&& (row15[0] != null && row15[1] != null)
				&& (row16[0] != null && row16[1] != null)
				&& (row17[0] != null && row17[1] != null)
				&& (row18[0] != null && row18[1] != null)
				&& (row19[0] != null && row19[1] != null)
				&& (row20[0] != null && row20[1] != null)
				&& (row21[0] != null && row21[1] != null)
				&& (row22[0] != null && row22[1] != null)
				&& (row23[0] != null && row23[1] != null)
				&& (row24[0] != null && row24[1] != null)
				&& (row25[0] != null && row25[1] != null)
				&& (row26[0] != null && row26[1] != null)
				&& (row27[0] != null && row27[1] != null)
				&& (row28[0] != null && row28[1] != null)
				&& (row29[0] != null && row29[1] != null)) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row, row1, row2, row3, row4, row5,
									row6, row7, row8, row9, row10, row11,
									row12, row13, row14, row15, row16, row17,
									row18, row19, row20, row21, row22, row23,
									row24, row25, row26, row27, row28, row29 },
							new String[] { "Property", "Value" }) {
						/**
                 *
                 */
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

		if ((row[0] != null && row[1] != null)
				&& (row1[0] != null && row1[1] != null)
				&& (row2[0] != null && row2[1] != null)
				&& (row3[0] != null && row3[1] != null)
				&& (row4[0] != null && row4[1] != null)
				&& (row5[0] != null && row5[1] != null)
				&& (row6[0] != null && row6[1] != null)
				&& (row7[0] != null && row7[1] != null)
				&& (row8[0] != null && row8[1] != null)
				&& (row9[0] != null && row9[1] != null)
				&& (row10[0] != null && row10[1] != null)
				&& (row11[0] != null && row11[1] != null)
				&& (row12[0] != null && row12[1] != null)
				&& (row13[0] != null && row13[1] != null)
				&& (row14[0] != null && row14[1] != null)
				&& (row15[0] != null && row15[1] != null)
				&& (row16[0] != null && row16[1] != null)
				&& (row17[0] != null && row17[1] != null)
				&& (row18[0] != null && row18[1] != null)
				&& (row19[0] != null && row19[1] != null)
				&& (row20[0] != null && row20[1] != null)
				&& (row21[0] != null && row21[1] != null)
				&& (row22[0] != null && row22[1] != null)
				&& (row23[0] != null && row23[1] != null)
				&& (row24[0] != null && row24[1] != null)
				&& (row25[0] != null && row25[1] != null)
				&& (row26[0] != null && row26[1] != null)
				&& (row27[0] != null && row27[1] != null)
				&& (row28[0] != null && row28[1] != null)
				&& (row29[0] != null && row29[1] != null)
				&& (row30[0] != null && row30[1] != null)) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row, row1, row2, row3, row4, row5,
									row6, row7, row8, row9, row10, row11,
									row12, row13, row14, row15, row16, row17,
									row18, row19, row20, row21, row22, row23,
									row24, row25, row26, row27, row28, row29,
									row30 },
							new String[] { "Property", "Value" }) {
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

		if ((row[0] != null && row[1] != null)
				&& (row1[0] != null && row1[1] != null)
				&& (row2[0] != null && row2[1] != null)
				&& (row3[0] != null && row3[1] != null)
				&& (row4[0] != null && row4[1] != null)
				&& (row5[0] != null && row5[1] != null)
				&& (row6[0] != null && row6[1] != null)
				&& (row7[0] != null && row7[1] != null)
				&& (row8[0] != null && row8[1] != null)
				&& (row9[0] != null && row9[1] != null)
				&& (row10[0] != null && row10[1] != null)
				&& (row11[0] != null && row11[1] != null)
				&& (row12[0] != null && row12[1] != null)
				&& (row13[0] != null && row13[1] != null)
				&& (row14[0] != null && row14[1] != null)
				&& (row15[0] != null && row15[1] != null)
				&& (row16[0] != null && row16[1] != null)
				&& (row17[0] != null && row17[1] != null)
				&& (row18[0] != null && row18[1] != null)
				&& (row19[0] != null && row19[1] != null)
				&& (row20[0] != null && row20[1] != null)
				&& (row21[0] != null && row21[1] != null)
				&& (row22[0] != null && row22[1] != null)
				&& (row23[0] != null && row23[1] != null)
				&& (row24[0] != null && row24[1] != null)
				&& (row25[0] != null && row25[1] != null)
				&& (row26[0] != null && row26[1] != null)
				&& (row27[0] != null && row27[1] != null)
				&& (row28[0] != null && row28[1] != null)
				&& (row29[0] != null && row29[1] != null)
				&& (row30[0] != null && row30[1] != null)
				&& (row31[0] != null && row31[1] != null)) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row, row1, row2, row3, row4, row5,
									row6, row7, row8, row9, row10, row11,
									row12, row13, row14, row15, row16, row17,
									row18, row19, row20, row21, row22, row23,
									row24, row25, row26, row27, row28, row29,
									row30, row31 }, new String[] { "Property",
									"Value" }) {
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

		if ((row[0] != null && row[1] != null)
				&& (row1[0] != null && row1[1] != null)
				&& (row2[0] != null && row2[1] != null)
				&& (row3[0] != null && row3[1] != null)
				&& (row4[0] != null && row4[1] != null)
				&& (row5[0] != null && row5[1] != null)
				&& (row6[0] != null && row6[1] != null)
				&& (row7[0] != null && row7[1] != null)
				&& (row8[0] != null && row8[1] != null)
				&& (row9[0] != null && row9[1] != null)
				&& (row10[0] != null && row10[1] != null)
				&& (row11[0] != null && row11[1] != null)
				&& (row12[0] != null && row12[1] != null)
				&& (row13[0] != null && row13[1] != null)
				&& (row14[0] != null && row14[1] != null)
				&& (row15[0] != null && row15[1] != null)
				&& (row16[0] != null && row16[1] != null)
				&& (row17[0] != null && row17[1] != null)
				&& (row18[0] != null && row18[1] != null)
				&& (row19[0] != null && row19[1] != null)
				&& (row20[0] != null && row20[1] != null)
				&& (row21[0] != null && row21[1] != null)
				&& (row22[0] != null && row22[1] != null)
				&& (row23[0] != null && row23[1] != null)
				&& (row24[0] != null && row24[1] != null)
				&& (row25[0] != null && row25[1] != null)
				&& (row26[0] != null && row26[1] != null)
				&& (row27[0] != null && row27[1] != null)
				&& (row28[0] != null && row28[1] != null)
				&& (row29[0] != null && row29[1] != null)
				&& (row30[0] != null && row30[1] != null)
				&& (row31[0] != null && row31[1] != null)
				&& (row32[0] != null && row32[1] != null)) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row, row1, row2, row3, row4, row5,
									row6, row7, row8, row9, row10, row11,
									row12, row13, row14, row15, row16, row17,
									row18, row19, row20, row21, row22, row23,
									row24, row25, row26, row27, row28, row29,
									row30, row31, row32 }, new String[] {
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

		if ((row[0] != null && row[1] != null)
				&& (row1[0] != null && row1[1] != null)
				&& (row2[0] != null && row2[1] != null)
				&& (row3[0] != null && row3[1] != null)
				&& (row4[0] != null && row4[1] != null)
				&& (row5[0] != null && row5[1] != null)
				&& (row6[0] != null && row6[1] != null)
				&& (row7[0] != null && row7[1] != null)
				&& (row8[0] != null && row8[1] != null)
				&& (row9[0] != null && row9[1] != null)
				&& (row10[0] != null && row10[1] != null)
				&& (row11[0] != null && row11[1] != null)
				&& (row12[0] != null && row12[1] != null)
				&& (row13[0] != null && row13[1] != null)
				&& (row14[0] != null && row14[1] != null)
				&& (row15[0] != null && row15[1] != null)
				&& (row16[0] != null && row16[1] != null)
				&& (row17[0] != null && row17[1] != null)
				&& (row18[0] != null && row18[1] != null)
				&& (row19[0] != null && row19[1] != null)
				&& (row20[0] != null && row20[1] != null)
				&& (row21[0] != null && row21[1] != null)
				&& (row22[0] != null && row22[1] != null)
				&& (row23[0] != null && row23[1] != null)
				&& (row24[0] != null && row24[1] != null)
				&& (row25[0] != null && row25[1] != null)
				&& (row26[0] != null && row26[1] != null)
				&& (row27[0] != null && row27[1] != null)
				&& (row28[0] != null && row28[1] != null)
				&& (row29[0] != null && row29[1] != null)
				&& (row30[0] != null && row30[1] != null)
				&& (row31[0] != null && row31[1] != null)
				&& (row32[0] != null && row32[1] != null)
				&& (row33[0] != null && row33[1] != null)) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row, row1, row2, row3, row4, row5,
									row6, row7, row8, row9, row10, row11,
									row12, row13, row14, row15, row16, row17,
									row18, row19, row20, row21, row22, row23,
									row24, row25, row26, row27, row28, row29,
									row30, row31, row32, row33 }, new String[] {
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

		if ((row[0] != null && row[1] != null)
				&& (row1[0] != null && row1[1] != null)
				&& (row2[0] != null && row2[1] != null)
				&& (row3[0] != null && row3[1] != null)
				&& (row4[0] != null && row4[1] != null)
				&& (row5[0] != null && row5[1] != null)
				&& (row6[0] != null && row6[1] != null)
				&& (row7[0] != null && row7[1] != null)
				&& (row8[0] != null && row8[1] != null)
				&& (row9[0] != null && row9[1] != null)
				&& (row10[0] != null && row10[1] != null)
				&& (row11[0] != null && row11[1] != null)
				&& (row12[0] != null && row12[1] != null)
				&& (row13[0] != null && row13[1] != null)
				&& (row14[0] != null && row14[1] != null)
				&& (row15[0] != null && row15[1] != null)
				&& (row16[0] != null && row16[1] != null)
				&& (row17[0] != null && row17[1] != null)
				&& (row18[0] != null && row18[1] != null)
				&& (row19[0] != null && row19[1] != null)
				&& (row20[0] != null && row20[1] != null)
				&& (row21[0] != null && row21[1] != null)
				&& (row22[0] != null && row22[1] != null)
				&& (row23[0] != null && row23[1] != null)
				&& (row24[0] != null && row24[1] != null)
				&& (row25[0] != null && row25[1] != null)
				&& (row26[0] != null && row26[1] != null)
				&& (row27[0] != null && row27[1] != null)
				&& (row28[0] != null && row28[1] != null)
				&& (row29[0] != null && row29[1] != null)
				&& (row30[0] != null && row30[1] != null)
				&& (row31[0] != null && row31[1] != null)
				&& (row32[0] != null && row32[1] != null)
				&& (row33[0] != null && row33[1] != null)
				&& (row34[0] != null && row34[1] != null)) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row, row1, row2, row3, row4, row5,
									row6, row7, row8, row9, row10, row11,
									row12, row13, row14, row15, row16, row17,
									row18, row19, row20, row21, row22, row23,
									row24, row25, row26, row27, row28, row29,
									row30, row31, row32, row33, row34 },
							new String[] { "Property", "Value" }) {
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

		if ((row[0] != null && row[1] != null)
				&& (row1[0] != null && row1[1] != null)
				&& (row2[0] != null && row2[1] != null)
				&& (row3[0] != null && row3[1] != null)
				&& (row4[0] != null && row4[1] != null)
				&& (row5[0] != null && row5[1] != null)
				&& (row6[0] != null && row6[1] != null)
				&& (row7[0] != null && row7[1] != null)
				&& (row8[0] != null && row8[1] != null)
				&& (row9[0] != null && row9[1] != null)
				&& (row10[0] != null && row10[1] != null)
				&& (row11[0] != null && row11[1] != null)
				&& (row12[0] != null && row12[1] != null)
				&& (row13[0] != null && row13[1] != null)
				&& (row14[0] != null && row14[1] != null)
				&& (row15[0] != null && row15[1] != null)
				&& (row16[0] != null && row16[1] != null)
				&& (row17[0] != null && row17[1] != null)
				&& (row18[0] != null && row18[1] != null)
				&& (row19[0] != null && row19[1] != null)
				&& (row20[0] != null && row20[1] != null)
				&& (row21[0] != null && row21[1] != null)
				&& (row22[0] != null && row22[1] != null)
				&& (row23[0] != null && row23[1] != null)
				&& (row24[0] != null && row24[1] != null)
				&& (row25[0] != null && row25[1] != null)
				&& (row26[0] != null && row26[1] != null)
				&& (row27[0] != null && row27[1] != null)
				&& (row28[0] != null && row28[1] != null)
				&& (row29[0] != null && row29[1] != null)
				&& (row30[0] != null && row30[1] != null)
				&& (row31[0] != null && row31[1] != null)
				&& (row32[0] != null && row32[1] != null)
				&& (row33[0] != null && row33[1] != null)
				&& (row34[0] != null && row34[1] != null)
				&& (row35[0] != null && row35[1] != null)) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row, row1, row2, row3, row4, row5,
									row6, row7, row8, row9, row10, row11,
									row12, row13, row14, row15, row16, row17,
									row18, row19, row20, row21, row22, row23,
									row24, row25, row26, row27, row28, row29,
									row30, row31, row32, row33, row34, row35 },
							new String[] { "Property", "Value" }) {
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

		if ((row[0] != null && row[1] != null)
				&& (row1[0] != null && row1[1] != null)
				&& (row2[0] != null && row2[1] != null)
				&& (row3[0] != null && row3[1] != null)
				&& (row4[0] != null && row4[1] != null)
				&& (row5[0] != null && row5[1] != null)
				&& (row6[0] != null && row6[1] != null)
				&& (row7[0] != null && row7[1] != null)
				&& (row8[0] != null && row8[1] != null)
				&& (row9[0] != null && row9[1] != null)
				&& (row10[0] != null && row10[1] != null)
				&& (row11[0] != null && row11[1] != null)
				&& (row12[0] != null && row12[1] != null)
				&& (row13[0] != null && row13[1] != null)
				&& (row14[0] != null && row14[1] != null)
				&& (row15[0] != null && row15[1] != null)
				&& (row16[0] != null && row16[1] != null)
				&& (row17[0] != null && row17[1] != null)
				&& (row18[0] != null && row18[1] != null)
				&& (row19[0] != null && row19[1] != null)
				&& (row20[0] != null && row20[1] != null)
				&& (row21[0] != null && row21[1] != null)
				&& (row22[0] != null && row22[1] != null)
				&& (row23[0] != null && row23[1] != null)
				&& (row24[0] != null && row24[1] != null)
				&& (row25[0] != null && row25[1] != null)
				&& (row26[0] != null && row26[1] != null)
				&& (row27[0] != null && row27[1] != null)
				&& (row28[0] != null && row28[1] != null)
				&& (row29[0] != null && row29[1] != null)
				&& (row30[0] != null && row30[1] != null)
				&& (row31[0] != null && row31[1] != null)
				&& (row32[0] != null && row32[1] != null)
				&& (row33[0] != null && row33[1] != null)
				&& (row34[0] != null && row34[1] != null)
				&& (row35[0] != null && row35[1] != null)
				&& (row36[0] != null && row36[1] != null)) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row, row1, row2, row3, row4, row5,
									row6, row7, row8, row9, row10, row11,
									row12, row13, row14, row15, row16, row17,
									row18, row19, row20, row21, row22, row23,
									row24, row25, row26, row27, row28, row29,
									row30, row31, row32, row33, row34, row35,
									row36 },
							new String[] { "Property", "Value" }) {
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

		if ((row[0] != null && row[1] != null)
				&& (row1[0] != null && row1[1] != null)
				&& (row2[0] != null && row2[1] != null)
				&& (row3[0] != null && row3[1] != null)
				&& (row4[0] != null && row4[1] != null)
				&& (row5[0] != null && row5[1] != null)
				&& (row6[0] != null && row6[1] != null)
				&& (row7[0] != null && row7[1] != null)
				&& (row8[0] != null && row8[1] != null)
				&& (row9[0] != null && row9[1] != null)
				&& (row10[0] != null && row10[1] != null)
				&& (row11[0] != null && row11[1] != null)
				&& (row12[0] != null && row12[1] != null)
				&& (row13[0] != null && row13[1] != null)
				&& (row14[0] != null && row14[1] != null)
				&& (row15[0] != null && row15[1] != null)
				&& (row16[0] != null && row16[1] != null)
				&& (row17[0] != null && row17[1] != null)
				&& (row18[0] != null && row18[1] != null)
				&& (row19[0] != null && row19[1] != null)
				&& (row20[0] != null && row20[1] != null)
				&& (row21[0] != null && row21[1] != null)
				&& (row22[0] != null && row22[1] != null)
				&& (row23[0] != null && row23[1] != null)
				&& (row24[0] != null && row24[1] != null)
				&& (row25[0] != null && row25[1] != null)
				&& (row26[0] != null && row26[1] != null)
				&& (row27[0] != null && row27[1] != null)
				&& (row28[0] != null && row28[1] != null)
				&& (row29[0] != null && row29[1] != null)
				&& (row30[0] != null && row30[1] != null)
				&& (row31[0] != null && row31[1] != null)
				&& (row32[0] != null && row32[1] != null)
				&& (row33[0] != null && row33[1] != null)
				&& (row34[0] != null && row34[1] != null)
				&& (row35[0] != null && row35[1] != null)
				&& (row36[0] != null && row36[1] != null)
				&& (row37[0] != null && row37[1] != null)) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row, row1, row2, row3, row4, row5,
									row6, row7, row8, row9, row10, row11,
									row12, row13, row14, row15, row16, row17,
									row18, row19, row20, row21, row22, row23,
									row24, row25, row26, row27, row28, row29,
									row30, row31, row32, row33, row34, row35,
									row36, row37 }, new String[] { "Property",
									"Value" }) {
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

		if ((row[0] != null && row[1] != null)
				&& (row1[0] != null && row1[1] != null)
				&& (row2[0] != null && row2[1] != null)
				&& (row3[0] != null && row3[1] != null)
				&& (row4[0] != null && row4[1] != null)
				&& (row5[0] != null && row5[1] != null)
				&& (row6[0] != null && row6[1] != null)
				&& (row7[0] != null && row7[1] != null)
				&& (row8[0] != null && row8[1] != null)
				&& (row9[0] != null && row9[1] != null)
				&& (row10[0] != null && row10[1] != null)
				&& (row11[0] != null && row11[1] != null)
				&& (row12[0] != null && row12[1] != null)
				&& (row13[0] != null && row13[1] != null)
				&& (row14[0] != null && row14[1] != null)
				&& (row15[0] != null && row15[1] != null)
				&& (row16[0] != null && row16[1] != null)
				&& (row17[0] != null && row17[1] != null)
				&& (row18[0] != null && row18[1] != null)
				&& (row19[0] != null && row19[1] != null)
				&& (row20[0] != null && row20[1] != null)
				&& (row21[0] != null && row21[1] != null)
				&& (row22[0] != null && row22[1] != null)
				&& (row23[0] != null && row23[1] != null)
				&& (row24[0] != null && row24[1] != null)
				&& (row25[0] != null && row25[1] != null)
				&& (row26[0] != null && row26[1] != null)
				&& (row27[0] != null && row27[1] != null)
				&& (row28[0] != null && row28[1] != null)
				&& (row29[0] != null && row29[1] != null)
				&& (row30[0] != null && row30[1] != null)
				&& (row31[0] != null && row31[1] != null)
				&& (row32[0] != null && row32[1] != null)
				&& (row33[0] != null && row33[1] != null)
				&& (row34[0] != null && row34[1] != null)
				&& (row35[0] != null && row35[1] != null)
				&& (row36[0] != null && row36[1] != null)
				&& (row37[0] != null && row37[1] != null)
				&& (row38[0] != null && row38[1] != null)) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row, row1, row2, row3, row4, row5,
									row6, row7, row8, row9, row10, row11,
									row12, row13, row14, row15, row16, row17,
									row18, row19, row20, row21, row22, row23,
									row24, row25, row26, row27, row28, row29,
									row30, row31, row32, row33, row34, row35,
									row36, row37, row38 }, new String[] {
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

		if ((row[0] != null && row[1] != null)
				&& (row1[0] != null && row1[1] != null)
				&& (row2[0] != null && row2[1] != null)
				&& (row3[0] != null && row3[1] != null)
				&& (row4[0] != null && row4[1] != null)
				&& (row5[0] != null && row5[1] != null)
				&& (row6[0] != null && row6[1] != null)
				&& (row7[0] != null && row7[1] != null)
				&& (row8[0] != null && row8[1] != null)
				&& (row9[0] != null && row9[1] != null)
				&& (row10[0] != null && row10[1] != null)
				&& (row11[0] != null && row11[1] != null)
				&& (row12[0] != null && row12[1] != null)
				&& (row13[0] != null && row13[1] != null)
				&& (row14[0] != null && row14[1] != null)
				&& (row15[0] != null && row15[1] != null)
				&& (row16[0] != null && row16[1] != null)
				&& (row17[0] != null && row17[1] != null)
				&& (row18[0] != null && row18[1] != null)
				&& (row19[0] != null && row19[1] != null)
				&& (row20[0] != null && row20[1] != null)
				&& (row21[0] != null && row21[1] != null)
				&& (row22[0] != null && row22[1] != null)
				&& (row23[0] != null && row23[1] != null)
				&& (row24[0] != null && row24[1] != null)
				&& (row25[0] != null && row25[1] != null)
				&& (row26[0] != null && row26[1] != null)
				&& (row27[0] != null && row27[1] != null)
				&& (row28[0] != null && row28[1] != null)
				&& (row29[0] != null && row29[1] != null)
				&& (row30[0] != null && row30[1] != null)
				&& (row31[0] != null && row31[1] != null)
				&& (row32[0] != null && row32[1] != null)
				&& (row33[0] != null && row33[1] != null)
				&& (row34[0] != null && row34[1] != null)
				&& (row35[0] != null && row35[1] != null)
				&& (row36[0] != null && row36[1] != null)
				&& (row37[0] != null && row37[1] != null)
				&& (row38[0] != null && row38[1] != null)
				&& (row39[0] != null && row39[1] != null)) {
			Main.propertiesTable
					.setModel(new javax.swing.table.DefaultTableModel(
							new Object[][] { row, row1, row2, row3, row4, row5,
									row6, row7, row8, row9, row10, row11,
									row12, row13, row14, row15, row16, row17,
									row18, row19, row20, row21, row22, row23,
									row24, row25, row26, row27, row28, row29,
									row30, row31, row32, row33, row34, row35,
									row36, row37, row38, row39 }, new String[] {
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

	}

}
