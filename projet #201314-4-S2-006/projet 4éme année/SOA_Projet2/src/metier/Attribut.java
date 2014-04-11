package metier;

public class Attribut {

	private  int id_attribut ;
	private  String att_name ; 
   	private Element_child ref_id_child;
	 //private XML_file ref_id_file;
	public int getId_attribut() {
		return id_attribut;
	}
	public void setId_attribut(int id_attribut) {
		this.id_attribut = id_attribut;
	}
	public String getAtt_name() {
		return att_name;
	}
	public void setAtt_name(String att_name) {
		this.att_name = att_name;
	}
	public Element_child getRef_id_child() {
		return ref_id_child;
	}
	public void setRef_id_child(Element_child ref_id_child) {
		this.ref_id_child = ref_id_child;
	}
	@Override
	public String toString() {
		return "Attribut [id_attribut=" + id_attribut + ", att_name="
				+ att_name + ", ref_id_child=" + ref_id_child + "]";
	}
	public Attribut(String att_name, Element_child ref_id_child) {
		super();
		this.att_name = att_name;
		this.ref_id_child = ref_id_child;
	}
	public Attribut() {
		super();
	}
	
	
   	
	
}
