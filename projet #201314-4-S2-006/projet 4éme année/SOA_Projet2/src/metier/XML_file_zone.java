package metier;

public class XML_file_zone {
	
	
	private int id_file_zone ;
	private String zone_value;
	
	private XML_file ref_id_file;
	private Element_root ref_id_root;
	private Element_child ref_id_child;
	private Zone_text ref_id_zone;
	@Override
	public String toString() {
		return "XML_file_zone [id_file_zone=" + id_file_zone + ", zone_value="
				+ zone_value + ", ref_id_file=" + ref_id_file
				+ ", ref_id_root=" + ref_id_root + ", ref_id_child="
				+ ref_id_child + ", ref_id_zone=" + ref_id_zone + "]";
	}
	public int getId_file_zone() {
		return id_file_zone;
	}
	public void setId_file_zone(int id_file_zone) {
		this.id_file_zone = id_file_zone;
	}
	public String getZone_value() {
		return zone_value;
	}
	public void setZone_value(String zone_value) {
		this.zone_value = zone_value;
	}
	public XML_file getRef_id_file() {
		return ref_id_file;
	}
	public void setRef_id_file(XML_file ref_id_file) {
		this.ref_id_file = ref_id_file;
	}
	public Element_root getRef_id_root() {
		return ref_id_root;
	}
	public void setRef_id_root(Element_root ref_id_root) {
		this.ref_id_root = ref_id_root;
	}
	public Element_child getRef_id_child() {
		return ref_id_child;
	}
	public void setRef_id_child(Element_child ref_id_child) {
		this.ref_id_child = ref_id_child;
	}
	public Zone_text getRef_id_zone() {
		return ref_id_zone;
	}
	public void setRef_id_zone(Zone_text ref_id_zone) {
		this.ref_id_zone = ref_id_zone;
	}
	public XML_file_zone(String zone_value, XML_file ref_id_file,
			Element_root ref_id_root, Element_child ref_id_child,
			Zone_text ref_id_zone) {
		super();
		this.zone_value = zone_value;
		this.ref_id_file = ref_id_file;
		this.ref_id_root = ref_id_root;
		this.ref_id_child = ref_id_child;
		this.ref_id_zone = ref_id_zone;
	}
	public XML_file_zone() {
		super();
	}
	
	
	
	

}
