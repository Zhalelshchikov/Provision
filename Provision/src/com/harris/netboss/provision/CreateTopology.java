package com.harris.netboss.provision;

import static com.harris.netboss.provision.Main.topologyTree;
import java.awt.Component;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class CreateTopology {

	public static final StringBuilder topology = new StringBuilder();
	public static final StringBuilder properties = new StringBuilder();

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

	public Map<String, String> map = new HashMap<>();
	public IconNode[] nodes;

	public ImageIcon iconProvision = new ImageIcon();
	public ImageIcon iconEclipseIcon = new ImageIcon();
	public ImageIcon iconODU = new ImageIcon();
	public ImageIcon iconCard = new ImageIcon();
	public ImageIcon iconNetworkElement = new ImageIcon();
	public ImageIcon iconBTS = new ImageIcon();
	public ImageIcon iconPort = new ImageIcon();

	public void create() throws IOException, SAXException,
			ParserConfigurationException {

		iconProvision.setImage(getImageProvision());
		iconEclipseIcon.setImage(getImageEclipseIcon());
		iconODU.setImage(getImageODU());
		iconCard.setImage(getImageCard());
		iconNetworkElement.setImage(getImageNetworkElement());
		iconBTS.setImage(getImageBTS());
		iconPort.setImage(getImagePort());

		BufferedReader topologyReaderForProperties = new BufferedReader(
				new FileReader(Main.getDir()));
		ArrayList<String> listProperties = new ArrayList<>();

		BufferedReader topologyReaderForMap = new BufferedReader(
				new FileReader(Main.getDir()));
		String lineMap = null;
		String className = null;
		String r = "";
		int indexOfElement = 0;
		int indexOfSimbol = 0;
		int countOfSimbol = 0;
		int index = 0;

		while ((lineMap = topologyReaderForMap.readLine()) != null) {

			Pattern pClass = Pattern.compile("(<object class=\")(.*)(\">)");
			Matcher mClass = pClass.matcher(lineMap);
			if (mClass.matches()) {

				className = mClass.group(2);

			}

			Pattern pName = Pattern
					.compile("(<physical_path>|<obj type=\"ref\">)(.*)(</physical_path>|</obj>)");
			Matcher mName = pName.matcher(lineMap);

			if (mName.matches()) {

				while (indexOfSimbol < mName.group(2).length()) {
					if (mName.group(2).charAt(indexOfSimbol) == '/') {
						index = indexOfSimbol;
						countOfSimbol++;
					}
					indexOfSimbol++;
				}

				map.put(mName.group(2).substring(index + 1,
						mName.group(2).length()), className);

				index = 0;
				indexOfSimbol = 0;
				countOfSimbol = 0;

			}

		}

		topologyReaderForMap.close();

		File file = new File(Main.getDir().getPath());
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(file);
		Element root = document.getDocumentElement();
		int countOfElements = root.getElementsByTagName("physical_path")
				.getLength();

		nodes = new IconNode[countOfElements];
		nodes[0] = new IconNode(" topology");

		while (indexOfElement < countOfElements) {

			Element message = (Element) root.getElementsByTagName(
					"physical_path").item(indexOfElement);
			String textContent = message.getTextContent();
			int textContentLength = textContent.length();

			while (indexOfSimbol < textContentLength) {
				if (textContent.charAt(indexOfSimbol) == '/') {
					index = indexOfSimbol;
					countOfSimbol++;
				}
				indexOfSimbol++;
			}

			nodes[countOfSimbol] = new IconNode(textContent
					.substring(index + 1, textContentLength).replace("(", r)
					.replace(")", r));
			nodes[countOfSimbol - 1].add(nodes[countOfSimbol]);
			nodes[0].setIcon(iconBTS);

			setNodeIcon(textContent.substring(index + 1, textContentLength),
					countOfSimbol);

			indexOfElement++;
			index = 0;
			indexOfSimbol = 0;
			countOfSimbol = 0;
		}

		topologyTree.setModel(new javax.swing.tree.DefaultTreeModel(nodes[0]));
		topologyTree.setCellRenderer(new IconNodeRenderer());

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

			properties.append(word.replace("(", r).replace(")", r))
					.append("\n");
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

	class IconNodeRenderer extends DefaultTreeCellRenderer {

		/**
	 * 
	 */
		private static final long serialVersionUID = 1L;

		@Override
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

		/**
	 * 
	 */
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
				String str = (String) userObject.toString();
				if (str != null) {
					int index = str.lastIndexOf(".");
					if (index != -1) {
						return str.substring(++index);
					} else {
						return null;
					}
				}
			}
			return null;
		}
	}
}
