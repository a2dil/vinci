package presentation;

import java.io.FileOutputStream;
import java.util.Scanner;

import javax.servlet.http.HttpServlet;
import javax.transaction.Transaction;

import metier.Attribut;
import metier.Element_child;
import metier.Element_root;
import metier.XML_file;
import metier.Zone_text;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class view  extends HttpServlet{


	
     
	public static void main(String[] args) {
		
		
		Configuration conf =  new Configuration();
		conf =  conf.configure("hibernate.cfg.xml");
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession(); 
		org.hibernate.Transaction tx = session.beginTransaction();
		
		
		//************root**************/\
		
		
		
		/*
		
		Element_root root = new Element_root();
		root.setName_root("personnes");
		root.setRef_id_file(null);
		root.setId_root(1);
		
		
		Element racine = new Element(root.getName_root());
		 
	session.save(root);
		
	//**********child***********/
       //On crée un nouveau Document JDOM basé sur la racine que l'on vient de créer
/*        
		Document document = new Document(racine);
		
		Element_child etudiant =  new Element_child();
		
		etudiant.setName_child("etudiant");
		
		etudiant.setRef_id_file(null);
		etudiant.setRef_id_root(null);
		etudiant.setId_child(1);
		
		Element etu = new Element(etudiant.getName_child());
	
		racine.addContent(etu);
		session.save(etudiant);
		
		//On crée un nouvel Attribut classe et on l'ajoute à etudiant
	     //grâce à la méthode setAttribute
	    //  Attribute classe = new Attribute("classe","P2");/////****probleme
	     
		Attribut att = new Attribut();
		
	att.setAtt_value("P2");
	att.setName_attribut("classe");
	att.setId_attribut(1);
	att.setRef_id_child(null);
	att.setRef_id_file(null);
	
	Attribute clas = new Attribute(att.getName_attribut(),att.getAtt_value());
		
        etu.setAttribute(clas);
        
        session.save(att);
        */
	//*******************zone
     /*   
        Zone_text zone = new Zone_text();
        
        zone.setZone_text("testzone");
        zone.setZone_name("nom");
        zone.setId_zone(1);
        zone.setRef_id_attribut(null);
        zone.setRef_id_file(null);
        
        
        Element nom = new Element(zone.getZone_name());
         
                nom.setText(zone.getZone_text());
                 etu.addContent(nom);
        
                 session.save(zone);
                 
          */
       
              //   String req = "from ";
                 
                 
		
    
	
		//*******************************************
		
	/////afficher
             /*
              try
                 {
                    //On utilise ici un affichage classique avec getPrettyFormat()
                    XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
                    sortie.output(document, System.out);
                 }
                 catch (java.io.IOException e){}
              
		
		
                 try
                 {
                	 String fi = "vinci.xml";
                	 
                	 XML_file xml = new XML_file();
                	 
                	 xml.setDescription("iuvuerurnus");
                	 xml.setId_file(1);
                	 xml.setRef_id_user(null);
                	 xml.setFile(fi);
                	 
                    //On utilise ici un affichage classique avec getPrettyFormat()
                    XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
                    //Remarquez qu'il suffit simplement de créer une instance de FileOutputStream
                    //avec en argument le nom du fichier pour effectuer la sérialisation.
               
                    sortie.output(document, new FileOutputStream(fi));
                    
                   
                    session.save(xml);
                    
                 }
                 catch (java.io.IOException e){}
*/
	      
	      
                 tx.commit();
             	session.close();
             	sf.close();
		
	}

}
