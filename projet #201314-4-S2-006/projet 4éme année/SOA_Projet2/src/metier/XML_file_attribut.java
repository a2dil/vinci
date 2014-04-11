package metier;

public class XML_file_attribut {

	private int id_file_att;
	private String att_value;
	
	private XML_file ref_id_file ;
	private Element_root ref_id_root;
	private Element_child ref_id_child;
	private Attribut ref_id_attribut;
	
	
	public int getId_file_att() {
		return id_file_att;
	}
	public void setId_file_att(int id_file_att) {
		this.id_file_att = id_file_att;
	}
	public String getAtt_value() {
		return att_value;
	}
	public void setAtt_value(String att_value) {
		this.att_value = att_value;
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
	public Attribut getRef_id_attribut() {
		return ref_id_attribut;
	}
	public void setRef_id_attribut(Attribut ref_id_attribut) {
		this.ref_id_attribut = ref_id_attribut;
	}
	@Override
	public String toString() {
		return "XML_file_attribut [id_file_att=" + id_file_att + ", att_value="
				+ att_value + ", ref_id_file=" + ref_id_file + ", ref_id_root="
				+ ref_id_root + ", ref_id_child=" + ref_id_child
				+ ", ref_id_attribut=" + ref_id_attribut + "]";
	}
	public XML_file_attribut(String att_value, XML_file ref_id_file,
			Element_root ref_id_root, Element_child ref_id_child,
			Attribut ref_id_attribut) {
		super();
		this.att_value = att_value;
		this.ref_id_file = ref_id_file;
		this.ref_id_root = ref_id_root;
		this.ref_id_child = ref_id_child;
		this.ref_id_attribut = ref_id_attribut;
	}
	public XML_file_attribut() {
		super();
	}
	
	
	
	
	
	
}
