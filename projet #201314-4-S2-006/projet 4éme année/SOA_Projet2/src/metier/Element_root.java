package metier;

public class Element_root {

	private  int id_root;
	private  String name_root;
	private Format ref_id_format;
	
	//private XML_file ref_id_file;
	
	
	
	

	public Element_root() {
		super();
		
	}




	public Element_root(String name_root, Format ref_id_format) {
		super();
		this.name_root = name_root;
		this.ref_id_format = ref_id_format;
	}



	@Override
	public String toString() {
		return "Element_root [id_root=" + id_root + ", name_root=" + name_root
				+ ", ref_id_format=" + ref_id_format + "]";
	}





	public int getId_root() {
		return id_root;
	}





	public void setId_root(int id_root) {
		this.id_root = id_root;
	}





	public String getName_root() {
		return name_root;
	}





	public void setName_root(String name_root) {
		this.name_root = name_root;
	}





	public Format getRef_id_format() {
		return ref_id_format;
	}





	public void setRef_id_format(Format ref_id_format) {
		this.ref_id_format = ref_id_format;
	}
	
	
	
}
