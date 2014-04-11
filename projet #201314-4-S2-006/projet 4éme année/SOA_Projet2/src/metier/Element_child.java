package metier;

public class Element_child {

private  int id_child ; 
private  String name_child;
private Element_root ref_id_root;
//private XML_file ref_id_file;




public Element_child() {
	super();
	
}




public Element_child(String name_child, Element_root ref_id_root) {
	super();
	this.name_child = name_child;
	this.ref_id_root = ref_id_root;
}




@Override
public String toString() {
	return "Element_child [id_child=" + id_child + ", name_child=" + name_child
			+ ", ref_id_root=" + ref_id_root + "]";
}




public int getId_child() {
	return id_child;
}




public void setId_child(int id_child) {
	this.id_child = id_child;
}




public String getName_child() {
	return name_child;
}




public void setName_child(String name_child) {
	this.name_child = name_child;
}




public Element_root getRef_id_root() {
	return ref_id_root;
}




public void setRef_id_root(Element_root ref_id_root) {
	this.ref_id_root = ref_id_root;
}

}
