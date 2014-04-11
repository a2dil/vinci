package metier;



public class XML_file {

	private  int id_file;
	private  String  file;
	private Utilisateur ref_id_user;
	private String description ;
	private Format ref_id_format;
	
	public int getId_file() {
		return id_file;
	}
	public void setId_file(int id_file) {
		this.id_file = id_file;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public Utilisateur getRef_id_user() {
		return ref_id_user;
	}
	public void setRef_id_user(Utilisateur ref_id_user) {
		this.ref_id_user = ref_id_user;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Format getRef_id_format() {
		return ref_id_format;
	}
	public void setRef_id_format(Format ref_id_format) {
		this.ref_id_format = ref_id_format;
	}
	@Override
	public String toString() {
		return "XML_file [id_file=" + id_file + ", file=" + file
				+ ", ref_id_user=" + ref_id_user + ", description="
				+ description + ", ref_id_format=" + ref_id_format + "]";
	}
	public XML_file(String file, Utilisateur ref_id_user,
			String description, Format ref_id_format) {
		super();
		
		this.file = file;
		this.ref_id_user = ref_id_user;
		this.description = description;
		this.ref_id_format = ref_id_format;
	}

	
	public XML_file() {
		super();
		
	}
	

     
	
}
