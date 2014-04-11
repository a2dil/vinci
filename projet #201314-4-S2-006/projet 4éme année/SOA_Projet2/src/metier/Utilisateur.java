package metier;

public class Utilisateur {
	
 private  int id_user;
 private  String  nom;
 private  String prenom;
 private  String login;
 private  String password;
 
 
public Utilisateur(String nom, String prenom, String login, String password) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.login = login;
	this.password = password;
}
@Override
public String toString() {
	return "Utilisateur [id_user=" + id_user + ", nom=" + nom + ", prenom="
			+ prenom + ", login=" + login + ", password=" + password + "]";
}
public int getId_user() {
	return id_user;
}
public void setId_user(int id_user) {
	this.id_user = id_user;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

 
 public Utilisateur() {
	super();	
	}
}
