package com.harris.netboss.provision;

public class ProvisionConstants {

	public static final String TOPOLOGY = " topology";
	public static final String PROVISION = "res\\provision.gif";
	public static final String ECLIPSE = "res\\EclipseIcon.gif";
	public static final String ODU = "res\\ODU.gif";
	public static final String CARD = "res\\card.gif";
	public static final String PORT = "res\\port.gif";
	public static final String NETWORKELEMENT = "res\\networkElement.gif";
	public static final String BTS = "res\\BTS.gif";
	public static final String CLASS = "(<object class=\")(.*)(\">)";
	public static final String NAME = "(<physical_path>|<obj type=\"ref\">)(.*)(</physical_path>|</obj>)";
	public static final String PHYSICALPATH = "physical_path";
	public static final String STR = "<(.*)>(.*)<(.*)>";
	public static final String TYPE = "obj type=\"ref\"";

	public static final StringBuilder topology = new StringBuilder();
	public static final StringBuilder properties = new StringBuilder();

}
