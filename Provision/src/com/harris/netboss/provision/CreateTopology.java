package com.harris.netboss.provision;

import static com.harris.netboss.provision.Main.topologyTree;

import java.awt.Component;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

public class CreateTopology {

	public static final StringBuilder topology = new StringBuilder();
	public static final StringBuilder properties = new StringBuilder();

	public Map<String, String> map = new HashMap<>();

	public ImageIcon iconProvision = new ImageIcon();
	public ImageIcon iconEclipseIcon = new ImageIcon();
	public ImageIcon iconODU = new ImageIcon();
	public ImageIcon iconCard = new ImageIcon();
	public ImageIcon iconNetworkElement = new ImageIcon();
	public ImageIcon iconBTS = new ImageIcon();
	public ImageIcon iconPort = new ImageIcon();

	public IconNode[] nodes;

	protected static Image getImageProvision() {
		java.net.URL imgURL;
		imgURL = CreateTopology.class.getResource("res\\provision.gif");
		if (imgURL != null) {
			return new ImageIcon(imgURL).getImage();
		} else {
			return null;
		}
	}

	protected static Image getImageEclipseIcon() {
		java.net.URL imgURL;
		imgURL = CreateTopology.class.getResource("res\\EclipseIcon.gif");
		if (imgURL != null) {
			return new ImageIcon(imgURL).getImage();
		} else {
			return null;
		}
	}

	protected static Image getImageODU() {
		java.net.URL imgURL;
		imgURL = CreateTopology.class.getResource("res\\ODU.gif");
		if (imgURL != null) {
			return new ImageIcon(imgURL).getImage();
		} else {
			return null;
		}
	}

	protected static Image getImageCard() {
		java.net.URL imgURL;
		imgURL = CreateTopology.class.getResource("res\\card.gif");
		if (imgURL != null) {
			return new ImageIcon(imgURL).getImage();
		} else {
			return null;
		}
	}

	protected static Image getImagePort() {
		java.net.URL imgURL;
		imgURL = CreateTopology.class.getResource("res\\port.gif");
		if (imgURL != null) {
			return new ImageIcon(imgURL).getImage();
		} else {
			return null;
		}
	}

	protected static Image getImageNetworkElement() {
		java.net.URL imgURL;
		imgURL = CreateTopology.class.getResource("res\\networkElement.gif");
		if (imgURL != null) {
			return new ImageIcon(imgURL).getImage();
		} else {
			return null;
		}
	}

	protected static Image getImageBTS() {
		java.net.URL imgURL;
		imgURL = CreateTopology.class.getResource("res\\BTS.gif");
		if (imgURL != null) {
			return new ImageIcon(imgURL).getImage();
		} else {
			return null;
		}
	}

	public void create() throws IOException {
		BufferedReader topologyReaderForProperties = new BufferedReader(
				new FileReader(Main.getDir()));
		BufferedReader topologyReader = new BufferedReader(new FileReader(
				Main.getDir()));
		ArrayList<String> listProperties = new ArrayList<>();
		LinkedHashSet<String> listResult = new LinkedHashSet<>();

		listProperties.clear();
		listResult.clear();

		iconProvision.setImage(getImageProvision());
		iconEclipseIcon.setImage(getImageEclipseIcon());
		iconODU.setImage(getImageODU());
		iconCard.setImage(getImageCard());
		iconNetworkElement.setImage(getImageNetworkElement());
		iconBTS.setImage(getImageBTS());
		iconPort.setImage(getImagePort());

		BufferedReader topologyReaderForMap = new BufferedReader(
				new FileReader(Main.getDir()));
		String lineMap = null;
		String className = null;

		while ((lineMap = topologyReaderForMap.readLine()) != null) {
			String r = "";

			Pattern pClass = Pattern.compile("(<object class=\")(.*)(\">)");
			Matcher mClass = pClass.matcher(lineMap);
			if (mClass.matches()) {

				className = mClass.group(2);

			}

			Pattern pName = Pattern
					.compile("(<physical_path>|<obj type=\"ref\">)(.*)(</physical_path>|</obj>)");
			Matcher mName = pName.matcher(lineMap.replace("(", r).replace(")",
					r));

			if (mName.matches()) {

				Pattern pName1 = Pattern
						.compile("/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])");
				Matcher mName1 = pName1.matcher(mName.group(2).replace("(", r)
						.replace(")", r));
				Pattern pName2 = Pattern
						.compile("/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])");
				Matcher mName2 = pName2.matcher(mName.group(2).replace("(", r)
						.replace(")", r));
				Pattern pName3 = Pattern
						.compile("/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])");
				Matcher mName3 = pName3.matcher(mName.group(2).replace("(", r)
						.replace(")", r));
				Pattern pName4 = Pattern
						.compile("/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])");
				Matcher mName4 = pName4.matcher(mName.group(2).replace("(", r)
						.replace(")", r));
				Pattern pName5 = Pattern
						.compile("/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])");
				Matcher mName5 = pName5.matcher(mName.group(2).replace("(", r)
						.replace(")", r));
				Pattern pName6 = Pattern
						.compile("/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])");
				Matcher mName6 = pName6.matcher(mName.group(2).replace("(", r)
						.replace(")", r));
				Pattern pName7 = Pattern
						.compile("/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])");
				Matcher mName7 = pName7.matcher(mName.group(2).replace("(", r)
						.replace(")", r));
				Pattern pName8 = Pattern
						.compile("/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])");
				Matcher mName8 = pName8.matcher(mName.group(2).replace("(", r)
						.replace(")", r));
				Pattern pName9 = Pattern
						.compile("/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])");
				Matcher mName9 = pName9.matcher(mName.group(2).replace("(", r)
						.replace(")", r));
				Pattern pName10 = Pattern
						.compile("/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])");
				Matcher mName10 = pName10.matcher(mName.group(2)
						.replace("(", r).replace(")", r));

				if (mName1.matches() && !mName2.matches() && !mName3.matches()
						&& !mName4.matches() && !mName5.matches()
						&& !mName6.matches() && !mName7.matches()
						&& !mName8.matches() && !mName9.matches()
						&& !mName10.matches()) {

					map.put(mName1.group(1), className);

				}

				if (mName2.matches() && !mName3.matches() && !mName4.matches()
						&& !mName5.matches() && !mName6.matches()
						&& !mName7.matches() && !mName8.matches()
						&& !mName9.matches() && !mName10.matches()) {

					map.put(mName2.group(2), className);

				}

				if (mName3.matches() && !mName4.matches() && !mName5.matches()
						&& !mName6.matches() && !mName7.matches()
						&& !mName8.matches() && !mName9.matches()
						&& !mName10.matches()) {
					map.put(mName3.group(3), className);
				}

				if (mName4.matches() && !mName5.matches() && !mName6.matches()
						&& !mName7.matches() && !mName8.matches()
						&& !mName9.matches() && !mName10.matches()) {
					map.put(mName4.group(4), className);
				}

				if (mName5.matches() && !mName6.matches() && !mName7.matches()
						&& !mName8.matches() && !mName9.matches()
						&& !mName10.matches()) {
					map.put(mName5.group(5), className);
				}

				if (mName6.matches() && !mName7.matches() && !mName8.matches()
						&& !mName9.matches() && !mName10.matches()) {
					map.put(mName6.group(6), className);
				}

				if (mName7.matches() && !mName8.matches() && !mName9.matches()
						&& !mName10.matches()) {
					map.put(mName7.group(7), className);
				}

				if (mName8.matches() && !mName9.matches() && !mName10.matches()) {
					map.put(mName8.group(8), className);
				}

				if (mName9.matches() && !mName10.matches()) {
					map.put(mName9.group(9), className);
				}

				if (mName10.matches()) {
					map.put(mName10.group(10), className);
				}
			}

		}

		topologyReaderForMap.close();

		String topologyLine;
		topologyLine = null;
		String path = null;
		while ((topologyLine = topologyReaderForProperties.readLine()) != null) {

			Pattern p = Pattern.compile("<(.*)>(.*)<(.*)>");
			Matcher m = p.matcher(topologyLine);
			if (m.matches()) {
				if (m.group(1).contentEquals("physical_path")
						|| m.group(1).contentEquals("obj type=\"ref\"")) {
					path = m.group(2);
				}

				if (!m.group(1).contentEquals("name")) {

					listProperties.add(path + "	" + m.group(1) + ": "
							+ m.group(2));
				}

			}
		}

		topologyReaderForProperties.close();

		for (String word : listProperties) {
			String r = "";
			properties.append(word.replace("(", r).replace(")", r))
					.append("\n");
		}

		while ((topologyLine = topologyReader.readLine()) != null) {
			Pattern p = Pattern
					.compile("(<physical_path>|<obj type=\"ref\">)(.*)(</physical_path>|</obj>)");
			Matcher m = p.matcher(topologyLine);

			if (m.matches()) {
				String r = "";
				Pattern p1 = Pattern
						.compile("/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])");
				Matcher m1 = p1.matcher(m.group(2).replace("(", r)
						.replace(")", r));
				Pattern p2 = Pattern
						.compile("/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])");
				Matcher m2 = p2.matcher(m.group(2).replace("(", r)
						.replace(")", r));
				Pattern p3 = Pattern
						.compile("/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])");
				Matcher m3 = p3.matcher(m.group(2).replace("(", r)
						.replace(")", r));
				Pattern p4 = Pattern
						.compile("/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])");
				Matcher m4 = p4.matcher(m.group(2).replace("(", r)
						.replace(")", r));
				Pattern p5 = Pattern
						.compile("/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])");
				Matcher m5 = p5.matcher(m.group(2).replace("(", r)
						.replace(")", r));
				Pattern p6 = Pattern
						.compile("/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])");
				Matcher m6 = p6.matcher(m.group(2).replace("(", r)
						.replace(")", r));
				Pattern p7 = Pattern
						.compile("/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])");
				Matcher m7 = p7.matcher(m.group(2).replace("(", r)
						.replace(")", r));
				Pattern p8 = Pattern
						.compile("/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])");
				Matcher m8 = p8.matcher(m.group(2).replace("(", r)
						.replace(")", r));
				Pattern p9 = Pattern
						.compile("/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])");
				Matcher m9 = p9.matcher(m.group(2).replace("(", r)
						.replace(")", r));
				Pattern p10 = Pattern
						.compile("/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])/([a-z||A-Z||0-9].*[a-z||A-Z||0-9])");
				Matcher m10 = p10.matcher(m.group(2).replace("(", r)
						.replace(")", r));

				if (m1.matches() && !m2.matches() && !m3.matches()
						&& !m4.matches() && !m5.matches() && !m6.matches()
						&& !m7.matches() && !m8.matches() && !m9.matches()
						&& !m10.matches()) {

					listResult.add(m1.group(1));

				}

				if (m2.matches() && !m3.matches() && !m4.matches()
						&& !m5.matches() && !m6.matches() && !m7.matches()
						&& !m8.matches() && !m9.matches() && !m10.matches()) {

					listResult.add(m2.group(1));
					listResult.add("	" + "/" + m2.group(1) + "/" + m2.group(2));
				}

				if (m3.matches() && !m4.matches() && !m5.matches()
						&& !m6.matches() && !m7.matches() && !m8.matches()
						&& !m9.matches() && !m10.matches()) {
					listResult.add(m3.group(1));
					listResult.add("	" + "/" + m3.group(1) + "/" + m3.group(2));
					listResult.add("		" + "/" + m3.group(1) + "/" + m3.group(2)
							+ "/" + m3.group(3));
				}

				if (m4.matches() && !m5.matches() && !m6.matches()
						&& !m7.matches() && !m8.matches() && !m9.matches()
						&& !m10.matches()) {
					listResult.add(m4.group(1));
					listResult.add("	" + "/" + m4.group(1) + "/" + m4.group(2));
					listResult.add("		" + "/" + m4.group(1) + "/" + m4.group(2)
							+ "/" + m4.group(3));
					listResult.add("			" + "/" + m4.group(1) + "/"
							+ m4.group(2) + "/" + m4.group(3) + "/"
							+ m4.group(4));
				}

				if (m5.matches() && !m6.matches() && !m7.matches()
						&& !m8.matches() && !m9.matches() && !m10.matches()) {
					listResult.add(m5.group(1));
					listResult.add("	" + "/" + m5.group(1) + "/" + m5.group(2));
					listResult.add("		" + "/" + m5.group(1) + "/" + m5.group(2)
							+ "/" + m5.group(3));
					listResult.add("			" + "/" + m5.group(1) + "/"
							+ m5.group(2) + "/" + m5.group(3) + "/"
							+ m5.group(4));
					listResult.add("				" + "/" + m5.group(1) + "/"
							+ m5.group(2) + "/" + m5.group(3) + "/"
							+ m5.group(4) + "/" + m5.group(5));
				}

				if (m6.matches() && !m7.matches() && !m8.matches()
						&& !m9.matches() && !m10.matches()) {
					listResult.add(m6.group(1));
					listResult.add("	" + "/" + m6.group(1) + "/" + m6.group(2));
					listResult.add("		" + "/" + m6.group(1) + "/" + m6.group(2)
							+ "/" + m6.group(3));
					listResult.add("			" + "/" + m6.group(1) + "/"
							+ m6.group(2) + "/" + m6.group(3) + "/"
							+ m6.group(4));
					listResult.add("				" + "/" + m6.group(1) + "/"
							+ m6.group(2) + "/" + m6.group(3) + "/"
							+ m6.group(4) + "/" + m6.group(5));
					listResult.add("					" + "/" + m6.group(1) + "/"
							+ m6.group(2) + "/" + m6.group(3) + "/"
							+ m6.group(4) + "/" + m6.group(5) + "/"
							+ m6.group(6));
				}

				if (m7.matches() && !m8.matches() && !m9.matches()
						&& !m10.matches()) {
					listResult.add(m7.group(1));
					listResult.add("	" + "/" + m7.group(1) + "/" + m7.group(2));
					listResult.add("		" + "/" + m7.group(1) + "/" + m7.group(2)
							+ "/" + m7.group(3));
					listResult.add("			" + "/" + m7.group(1) + "/"
							+ m7.group(2) + "/" + m7.group(3) + "/"
							+ m7.group(4));
					listResult.add("				" + "/" + m7.group(1) + "/"
							+ m7.group(2) + "/" + m7.group(3) + "/"
							+ m7.group(4) + "/" + m7.group(5));
					listResult.add("					" + "/" + m7.group(1) + "/"
							+ m7.group(2) + "/" + m7.group(3) + "/"
							+ m7.group(4) + "/" + m7.group(5) + "/"
							+ m7.group(6));
					listResult.add("						" + "/" + m7.group(1) + "/"
							+ m7.group(2) + "/" + m7.group(3) + "/"
							+ m7.group(4) + "/" + m7.group(5) + "/"
							+ m7.group(6) + "/" + m7.group(7));
				}

				if (m8.matches() && !m9.matches() && !m10.matches()) {
					listResult.add(m8.group(1));
					listResult.add("	" + "/" + m8.group(1) + "/" + m8.group(2));
					listResult.add("		" + "/" + m8.group(1) + "/" + m8.group(2)
							+ "/" + m8.group(3));
					listResult.add("			" + "/" + m8.group(1) + "/"
							+ m8.group(2) + "/" + m8.group(3) + "/"
							+ m8.group(4));
					listResult.add("				" + "/" + m8.group(1) + "/"
							+ m8.group(2) + "/" + m8.group(3) + "/"
							+ m8.group(4) + "/" + m8.group(5));
					listResult.add("					" + "/" + m8.group(1) + "/"
							+ m8.group(2) + "/" + m8.group(3) + "/"
							+ m8.group(4) + "/" + m8.group(5) + "/"
							+ m8.group(6));
					listResult.add("						" + "/" + m8.group(1) + "/"
							+ m8.group(2) + "/" + m8.group(3) + "/"
							+ m8.group(4) + "/" + m8.group(5) + "/"
							+ m8.group(6) + "/" + m8.group(7));
					listResult.add("							" + "/" + m8.group(1) + "/"
							+ m8.group(2) + "/" + m8.group(3) + "/"
							+ m8.group(4) + "/" + m8.group(5) + "/"
							+ m8.group(6) + "/" + m8.group(7) + "/"
							+ m8.group(8));
				}

				if (m9.matches() && !m10.matches()) {
					listResult.add(m9.group(1));
					listResult.add("	" + "/" + m9.group(1) + "/" + m9.group(2));
					listResult.add("		" + "/" + m9.group(1) + "/" + m9.group(2)
							+ "/" + m9.group(3));
					listResult.add("			" + "/" + m9.group(1) + "/"
							+ m9.group(2) + "/" + m9.group(3) + "/"
							+ m9.group(4));
					listResult.add("				" + "/" + m9.group(1) + "/"
							+ m9.group(2) + "/" + m9.group(3) + "/"
							+ m9.group(4) + "/" + m9.group(5));
					listResult.add("					" + "/" + m9.group(1) + "/"
							+ m9.group(2) + "/" + m9.group(3) + "/"
							+ m9.group(4) + "/" + m9.group(5) + "/"
							+ m9.group(6));
					listResult.add("						" + "/" + m9.group(1) + "/"
							+ m9.group(2) + "/" + m9.group(3) + "/"
							+ m9.group(4) + "/" + m9.group(5) + "/"
							+ m9.group(6) + "/" + m9.group(7));
					listResult.add("							" + "/" + m9.group(1) + "/"
							+ m9.group(2) + "/" + m9.group(3) + "/"
							+ m9.group(4) + "/" + m9.group(5) + "/"
							+ m9.group(6) + "/" + m9.group(7) + "/"
							+ m9.group(8));
					listResult.add("								" + "/" + m9.group(1) + "/"
							+ m9.group(2) + "/" + m9.group(3) + "/"
							+ m9.group(4) + "/" + m9.group(5) + "/"
							+ m9.group(6) + "/" + m9.group(7) + "/"
							+ m9.group(8) + "/" + m9.group(9));
				}

				if (m10.matches()) {
					listResult.add(m10.group(1));
					listResult.add("	" + "/" + m10.group(1) + "/"
							+ m10.group(2));
					listResult.add("		" + "/" + m10.group(1) + "/"
							+ m10.group(2) + "/" + m10.group(3));
					listResult.add("			" + "/" + m10.group(1) + "/"
							+ m10.group(2) + "/" + m10.group(3) + "/"
							+ m10.group(4));
					listResult.add("				" + "/" + m10.group(1) + "/"
							+ m10.group(2) + "/" + m10.group(3) + "/"
							+ m10.group(4) + "/" + m10.group(5));
					listResult.add("					" + "/" + m10.group(1) + "/"
							+ m10.group(2) + "/" + m10.group(3) + "/"
							+ m10.group(4) + "/" + m10.group(5) + "/"
							+ m10.group(6));
					listResult.add("						" + "/" + m10.group(1) + "/"
							+ m10.group(2) + "/" + m10.group(3) + "/"
							+ m10.group(4) + "/" + m10.group(5) + "/"
							+ m10.group(6) + "/" + m10.group(7));
					listResult.add("							" + "/" + m10.group(1) + "/"
							+ m10.group(2) + "/" + m10.group(3) + "/"
							+ m10.group(4) + "/" + m10.group(5) + "/"
							+ m10.group(6) + "/" + m10.group(7) + "/"
							+ m10.group(8));
					listResult.add("								" + "/" + m10.group(1) + "/"
							+ m10.group(2) + "/" + m10.group(3) + "/"
							+ m10.group(4) + "/" + m10.group(5) + "/"
							+ m10.group(6) + "/" + m10.group(7) + "/"
							+ m10.group(8) + "/" + m10.group(9));
					listResult.add("									" + "/" + m10.group(1) + "/"
							+ m10.group(2) + "/" + m10.group(3) + "/"
							+ m10.group(4) + "/" + m10.group(5) + "/"
							+ m10.group(6) + "/" + m10.group(7) + "/"
							+ m10.group(8) + "/" + m10.group(9) + "/"
							+ m10.group(10));
				}
			}
		}

		topologyReader.close();

		for (Iterator<String> i = listResult.iterator(); i.hasNext();) {

			String r = "";
			final String content = i.next();
			topology.append(content.replace("(", r).replace(")", r)).append(
					"\n");
		}

		String[] lines = topology.toString().split("\n");

		int count = 0;

		for (@SuppressWarnings("unused")
		String line : lines) {
			count++;
		}

		nodes = new IconNode[count];

		nodes[0] = new IconNode("topology");
		int nodeCount = 0;
		int level0 = 0;
		int level1 = 1;
		int level2 = 0;
		int level3 = 0;
		int level4 = 0;
		int level5 = 0;
		int level6 = 0;
		int level7 = 0;
		int level8 = 0;
		int level9 = 0;
		int level10 = 0;
		int level11 = 0;

		for (String line : lines) {
			Pattern p = Pattern.compile("[a-z||A-Z||0-9].*[a-z||A-Z||0-9]");
			Matcher m = p.matcher(line);
			Pattern p1 = Pattern
					.compile("(	/.*/)([a-z||A-Z||0-9].*[a-z||A-Z||0-9])");
			Matcher m1 = p1.matcher(line);
			Pattern p2 = Pattern
					.compile("(		/.*/.*/)([a-z||A-Z||0-9].*[a-z||A-Z||0-9])");
			Matcher m2 = p2.matcher(line);
			Pattern p3 = Pattern
					.compile("(			/.*/.*/.*/)([a-z||A-Z||0-9].*[a-z||A-Z||0-9])");
			Matcher m3 = p3.matcher(line);
			Pattern p4 = Pattern
					.compile("(				/.*/.*/.*/.*/)([a-z||A-Z||0-9].*[a-z||A-Z||0-9])");
			Matcher m4 = p4.matcher(line);
			Pattern p5 = Pattern
					.compile("(					/.*/.*/.*/.*/.*/)([a-z||A-Z||0-9].*[a-z||A-Z||0-9])");
			Matcher m5 = p5.matcher(line);
			Pattern p6 = Pattern
					.compile("(						/.*/.*/.*/.*/.*/.*/)([a-z||A-Z||0-9].*[a-z||A-Z||0-9])");
			Matcher m6 = p6.matcher(line);
			Pattern p7 = Pattern
					.compile("(							/.*/.*/.*/.*/.*/.*/.*/.*/)([a-z||A-Z||0-9].*[a-z||A-Z||0-9])");
			Matcher m7 = p7.matcher(line);
			Pattern p8 = Pattern
					.compile("(								/.*/.*/.*/.*/.*/.*/.*/.*/.*/)([a-z||A-Z||0-9].*[a-z||A-Z||0-9])");
			Matcher m8 = p8.matcher(line);
			Pattern p9 = Pattern
					.compile("(									/.*/.*/.*/.*/.*/.*/.*/.*/.*/.*/)([a-z||A-Z||0-9].*[a-z||A-Z||0-9])");
			Matcher m9 = p9.matcher(line);
			Pattern p10 = Pattern
					.compile("(										/.*/.*/.*/.*/.*/.*/.*/.*/.*/.*/.*/)([a-z||A-Z||0-9].*[a-z||A-Z||0-9])");
			Matcher m10 = p10.matcher(line);

			if (m.matches() && !m1.matches() && !m2.matches() && !m3.matches()
					&& !m4.matches() && !m5.matches() && !m6.matches()
					&& !m7.matches() && !m8.matches() && !m9.matches()
					&& !m10.matches()) {

				nodeCount++;

				nodes[level1] = new IconNode(m.group());
				nodes[level0].add(nodes[level1]);
				nodes[level0].setIcon(iconBTS);

				setNodeIcon(m.group(), level1);

			}

			if (m1.matches() && !m2.matches() && !m3.matches() && !m4.matches()
					&& !m5.matches() && !m6.matches() && !m7.matches()
					&& !m8.matches() && !m9.matches() && !m10.matches()) {

				nodeCount++;
				level2 = nodeCount;
				nodes[level2] = new IconNode(m1.group(2));
				nodes[level1].add(nodes[level2]);

				setNodeIcon(m1.group(2), level2);

			}

			if (m2.matches() && !m3.matches() && !m4.matches() && !m5.matches()
					&& !m6.matches() && !m7.matches() && !m8.matches()
					&& !m9.matches() && !m10.matches()) {

				nodeCount++;
				level3 = nodeCount;
				nodes[level3] = new IconNode(m2.group(2));
				nodes[level2].add(nodes[level3]);

				setNodeIcon(m2.group(2), level3);

			}

			if (m3.matches() && !m4.matches() && !m5.matches() && !m6.matches()
					&& !m7.matches() && !m8.matches() && !m9.matches()
					&& !m10.matches()) {

				nodeCount++;
				level4 = nodeCount;
				nodes[level4] = new IconNode(m3.group(2));
				nodes[level3].add(nodes[level4]);

				setNodeIcon(m3.group(2), level4);

			}

			if (m4.matches() && !m5.matches() && !m6.matches() && !m7.matches()
					&& !m8.matches() && !m9.matches() && !m10.matches()) {

				nodeCount++;
				level5 = nodeCount;
				nodes[level5] = new IconNode(m4.group(2));
				nodes[level4].add(nodes[level5]);

				setNodeIcon(m4.group(2), level5);

			}

			if (m5.matches() && !m6.matches() && !m7.matches() && !m8.matches()
					&& !m9.matches() && !m10.matches()) {

				nodeCount++;
				level6 = nodeCount;
				nodes[level6] = new IconNode(m5.group(2));
				nodes[level5].add(nodes[level6]);

				setNodeIcon(m5.group(2), level6);

			}

			if (m6.matches() && !m7.matches() && !m8.matches() && !m9.matches()
					&& !m10.matches()) {

				nodeCount++;
				level7 = nodeCount;
				nodes[level7] = new IconNode(m6.group(2));
				nodes[level6].add(nodes[level7]);

				setNodeIcon(m6.group(2), level7);

			}

			if (m7.matches() && !m8.matches() && !m9.matches()
					&& !m10.matches()) {

				nodeCount++;
				level8 = nodeCount;
				nodes[level8] = new IconNode(m7.group(2));
				nodes[level7].add(nodes[level8]);

				setNodeIcon(m7.group(2), level8);

			}

			if (m8.matches() && !m9.matches() && !m10.matches()) {

				nodeCount++;
				level9 = nodeCount;
				nodes[level9] = new IconNode(m8.group(2));
				nodes[level8].add(nodes[level9]);

				setNodeIcon(m8.group(2), level9);

			}

			if (m9.matches() && !m10.matches()) {

				nodeCount++;
				level10 = nodeCount;
				nodes[level10] = new IconNode(m9.group(2));
				nodes[level9].add(nodes[level10]);

				setNodeIcon(m9.group(2), level10);

			}

			if (m10.matches()) {

				nodeCount++;
				level11 = nodeCount;
				nodes[level11] = new IconNode(m10.group(2));
				nodes[level10].add(nodes[level11]);

				setNodeIcon(m10.group(2), level11);

			}

		}

		topologyTree.setModel(new javax.swing.tree.DefaultTreeModel(nodes[0]));
		topologyTree.setCellRenderer(new IconNodeRenderer());

	}

	class IconNodeRenderer extends DefaultTreeCellRenderer {

		private static final long serialVersionUID = 1L;

		public Component getTreeCellRendererComponent(JTree tree, Object value,
				boolean sel, boolean expanded, boolean leaf, int row,
				boolean hasFocus) {

			super.getTreeCellRendererComponent(tree, value, sel, expanded,
					leaf, row, hasFocus);

			if (value instanceof IconNode) {
				Icon icon = ((IconNode) value).getIcon();

				if (icon == null) {
					Hashtable<?, ?> icons = (Hashtable<?, ?>) tree
							.getClientProperty("JTree.icons");
					String name = ((IconNode) value).getIconName();
					if ((icons != null) && (name != null)) {
						icon = (Icon) icons.get(name);
						if (icon != null) {
							setIcon(icon);
						}
					}
				} else {
					setIcon(icon);
				}
			}
			return this;
		}
	}

	class IconNode extends DefaultMutableTreeNode {

		private static final long serialVersionUID = 1L;

		protected Icon icon;

		protected String iconName;

		public IconNode() {
			this(null);
		}

		public IconNode(Object userObject) {
			this(userObject, true, null);
		}

		public IconNode(Object userObject, boolean allowsChildren, Icon icon) {
			super(userObject, allowsChildren);
			this.icon = icon;
		}

		public void setIcon(Icon icon) {
			this.icon = icon;
		}

		public Icon getIcon() {
			return icon;
		}

		public String getIconName() {
			if (iconName != null) {
				return iconName;
			} else {
				String str = userObject.toString();
				int index = str.lastIndexOf(".");
				if (index != -1) {
					return str.substring(++index);
				} else {
					return null;
				}
			}
		}
	}

	public void setNodeIcon(String value, int level) {

		for (Map.Entry<String, String> entry : map.entrySet()) {
			if (entry.getKey().contentEquals(value)) {

				if (entry.getValue().contentEquals("customizable_container")
						|| entry.getValue().contentEquals("region")
						|| entry.getValue().contentEquals("rack")
						|| entry.getValue().contentEquals("site")) {
					nodes[level].setIcon(iconBTS);
				}
				if (entry.getValue().contentEquals("unity_idu_controller")
						|| entry.getValue().contentEquals("unity_idu_radio")
						|| entry.getValue().contentEquals("unity_idu_radio10")
						|| entry.getValue()
								.contentEquals("unity_idu_radio_spe")
						|| entry.getValue().contentEquals("unity_idu_data")
						|| entry.getValue().contentEquals("unity_idu_aux")
						|| entry.getValue().contentEquals("unity_idu_fan")
						|| entry.getValue().contentEquals("unity_idu_ethernet")
						|| entry.getValue().contentEquals(
								"unity_idu_ethernet_spe")
						|| entry.getValue().contentEquals(
								"unity_idu_ge_ethernet")
						|| entry.getValue().contentEquals("unity_idup")
						|| entry.getValue()
								.contentEquals("unity_idu_odu_spe_b")
						|| entry.getValue()
								.contentEquals("unity_idu_odu_spe_a")
						|| entry.getValue().contentEquals("unity_idu_odu10")
						|| entry.getValue().contentEquals("unity_odu10")
						|| entry.getValue().contentEquals("unity_idu_odu")
						|| entry.getValue().contentEquals("unity_odu")
						|| entry.getValue().contentEquals("unity_idu")) {
					nodes[level].setIcon(iconODU);
				}
				if (entry.getValue().contentEquals("wtm_6000")
						|| entry.getValue().contentEquals("wl1000")
						|| entry.getValue()
								.contentEquals("wimax_bs_subscriber")
						|| entry.getValue().contentEquals("wimax_subscriber")
						|| entry.getValue().contentEquals("wimax_bs_6400")
						|| entry.getValue().contentEquals("wimax_bs")
						|| entry.getValue()
								.contentEquals("wimax_asn_protected")
						|| entry.getValue().contentEquals("wimax_asn")
						|| entry.getValue().contentEquals(
								"protected_xp248x_remote_mgmt")
						|| entry.getValue()
								.contentEquals("protected_xp4_2x_4x")
						|| entry.getValue().contentEquals("xp248x_remote_mgmt")
						|| entry.getValue().contentEquals("xp4_2x_4x")
						|| entry.getValue().contentEquals("protected_xp4_e3")
						|| entry.getValue().contentEquals(
								"protected_xpe3ds3_remote_mgmt")
						|| entry.getValue().contentEquals(
								"xp16xe3ds3_remote_mgmt")
						|| entry.getValue().contentEquals("xp4_e3")
						|| entry.getValue().contentEquals("velox")
						|| entry.getValue().contentEquals("truepoint_6500_dt")
						|| entry.getValue().contentEquals("truepoint_6500")
						|| entry.getValue().contentEquals("truepoint_6400")
						|| entry.getValue().contentEquals(
								"truepoint_4040_v2entry")
						|| entry.getValue().contentEquals("truepoint_4040")
						|| entry.getValue().contentEquals("truepoint_4000")
						|| entry.getValue().contentEquals(
								"truepoint_5000_2plus0")
						|| entry.getValue().contentEquals("truepoint_5000")
						|| entry.getValue().contentEquals("sagemlink")
						|| entry.getValue().contentEquals("spII_snmp")
						|| entry.getValue().contentEquals(
								"protected_spectrum_II")
						|| entry.getValue().contentEquals("spectrum_II")
						|| entry.getValue().contentEquals("spectrum_I")
						|| entry.getValue().contentEquals("protected_quantum")
						|| entry.getValue().contentEquals("quantum")
						|| entry.getValue().contentEquals("tnet_proxy")
						|| entry.getValue().contentEquals("protected_wseries")
						|| entry.getValue().contentEquals("wseries")
						|| entry.getValue().contentEquals("protected_mseries")
						|| entry.getValue().contentEquals("mseries")
						|| entry.getValue().contentEquals("mf")
						|| entry.getValue()
								.contentEquals("protected_lc_series")
						|| entry.getValue().contentEquals("lc_series")
						|| entry.getValue().contentEquals("spII_snmp")
						|| entry.getValue().contentEquals("smartcore")
						|| entry.getValue().contentEquals("sma")
						|| entry.getValue().contentEquals("rw2000")
						|| entry.getValue().contentEquals("microstar_III")
						|| entry.getValue().contentEquals("microstar_II")
						|| entry.getValue().contentEquals(
								"protected_microstar_I")
						|| entry.getValue().contentEquals("microstar_I")
						|| entry.getValue().contentEquals("m7i")
						|| entry.getValue().contentEquals("m10i")
						|| entry.getValue().contentEquals("megastar_spu")
						|| entry.getValue().contentEquals("megastar_mn")
						|| entry.getValue().contentEquals("megastar")
						|| entry.getValue().contentEquals("le3200")
						|| entry.getValue().contentEquals("le3000")
						|| entry.getValue().contentEquals("generic_switch")
						|| entry.getValue().contentEquals("generic_snmp")
						|| entry.getValue().contentEquals("generic_router")
						|| entry.getValue().contentEquals("generic_radio")
						|| entry.getValue().contentEquals(
								"generic_power_supply")
						|| entry.getValue().contentEquals("generic_mux")
						|| entry.getValue().contentEquals("generic_bts")
						|| entry.getValue().contentEquals("generic_alarm_unit")
						|| entry.getValue().contentEquals("eLink1000EXR")
						|| entry.getValue().contentEquals("dxr200")
						|| entry.getValue().contentEquals("dxr100p")
						|| entry.getValue().contentEquals("dxr100np")
						|| entry.getValue().contentEquals("dvm_XT")
						|| entry.getValue().contentEquals("dvm45_repeater")
						|| entry.getValue().contentEquals("dvm45_terminal")
						|| entry.getValue().contentEquals("dva")
						|| entry.getValue().contentEquals("dart_remote_mgmt")
						|| entry.getValue().contentEquals("dart")
						|| entry.getValue().contentEquals("constellation")
						|| entry.getValue().contentEquals("cx_u")
						|| entry.getValue().contentEquals("cisco_ME3600X")
						|| entry.getValue().contentEquals("cau")
						|| entry.getValue().contentEquals("classic_II")
						|| entry.getValue().contentEquals("aurora")
						|| entry.getValue().contentEquals("altiumMX_2plus0")
						|| entry.getValue().contentEquals("altiumMX")
						|| entry.getValue().contentEquals("altium")
						|| entry.getValue().contentEquals("adr2500")
						|| entry.getValue().contentEquals("dxr700p")
						|| entry.getValue().contentEquals("adr")
						|| entry.getValue().contentEquals("ethernet_port")
						|| entry.getValue().contentEquals("generalCard")
						|| entry.getValue().contentEquals(
								"wtm_6000_protected_path")
						|| entry.getValue().contentEquals("wtm_6000_sv")
						|| entry.getValue()
								.contentEquals("truepoint_6500_mstu")
						|| entry.getValue().contentEquals("truepoint_6500_tcu")
						|| entry.getValue()
								.contentEquals("truepoint_6500_path")
						|| entry.getValue().contentEquals("truepoint_6500_hk")
						|| entry.getValue().contentEquals("truepoint_6500_sv")
						|| entry.getValue().contentEquals(
								"truepoint_6500_protected_path")
						|| entry.getValue().contentEquals("cisco_ME3600X")
						|| entry.getValue().contentEquals("unity_inu")
						|| entry.getValue().contentEquals("unity_inue")) {
					nodes[level].setIcon(iconEclipseIcon);
				}
				if (entry.getValue().contentEquals("unity_rac10")
						|| entry.getValue().contentEquals("unity_rac40")
						|| entry.getValue().contentEquals("unity_rac4x")
						|| entry.getValue().contentEquals("unity_dac155oM")
						|| entry.getValue().contentEquals("unity_aux")
						|| entry.getValue().contentEquals("unity_dacge3")
						|| entry.getValue().contentEquals("unity_daces")
						|| entry.getValue().contentEquals("unity_fan")
						|| entry.getValue().contentEquals("unity_fan_2u")
						|| entry.getValue().contentEquals("unity_rac")
						|| entry.getValue().contentEquals("unity_dacge")
						|| entry.getValue().contentEquals("unity_dac")
						|| entry.getValue().contentEquals("unity_ncc")
						|| entry.getValue().contentEquals("unity_npc")) {
					nodes[level].setIcon(iconCard);
				}
				if (entry.getValue().contentEquals("generic_switch")) {
					nodes[level].setIcon(iconNetworkElement);
				}
				if (entry.getValue().contentEquals("link")
						|| entry.getValue().contentEquals("unity_ring_path")
						|| entry.getValue().contentEquals("unity_unexpected")
						|| entry.getValue().contentEquals(
								"unity_protected_path")
						|| entry.getValue().contentEquals("unity_path")) {
					nodes[level].setIcon(iconPort);
				}

			}

		}

	}
}
