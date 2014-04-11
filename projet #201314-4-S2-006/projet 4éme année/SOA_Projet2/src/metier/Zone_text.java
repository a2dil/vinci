package metier;

public class Zone_text {

	
	private int id_zone ;
	private Element_child ref_id_child ;
	private String zone_name;

	public int getId_zone() {
		return id_zone;
	}
	public void setId_zone(int id_zone) {
		this.id_zone = id_zone;
	}
	public Element_child getRef_id_child() {
		return ref_id_child;
	}
	public void setRef_id_child(Element_child ref_id_child) {
		this.ref_id_child = ref_id_child;
	}
	public String getZone_name() {
		return zone_name;
	}
	public void setZone_name(String zone_name) {
		this.zone_name = zone_name;
	}
	@Override
	public String toString() {
		return "Zone_text [id_zone=" + id_zone + ", ref_id_child="
				+ ref_id_child + ", zone_name=" + zone_name + "]";
	}
	public Zone_text(Element_child ref_id_child, String zone_name) {
		super();
		this.ref_id_child = ref_id_child;
		this.zone_name = zone_name;
	}
	public Zone_text() {
		super();
	}
	
	
	



}
