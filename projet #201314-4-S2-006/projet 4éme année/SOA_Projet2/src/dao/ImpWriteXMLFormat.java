package dao;

import java.util.Scanner;

import metier.Attribut;
import metier.Element_child;
import metier.Element_root;
import metier.XML_file;
import metier.XML_file_attribut;
import metier.XML_file_zone;
import metier.Zone_text;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ImpWriteXMLFormat implements WriteXMLFormat {

	@Override
	public void writing() {
		 
		
		
		Configuration conf =  new Configuration();
		conf =  conf.configure("hibernate.cfg.xml");
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession(); 
		org.hibernate.Transaction tx = session.beginTransaction();
		
		
		//***************************************************

		//**********format*********
	
		Scanner sn = new Scanner(System.in);
		Scanner sl = new Scanner(System.in);
		
		
		System.out.println("entrer une nouvelle format");
		String format = sl.nextLine();
		
	             
		metier.Format  fr =  new metier.Format();
		
	
		fr.setNom_format(format);

		session.save(fr);
	
		
		//*******creation de fichier xml
		
		System.out.println("entrer un nouveau nom de votre fichier xml(exemple: nom.xml)");
		
		String nom = sl.nextLine();
		System.out.println("entrer une description");
		String desc = sl.nextLine();
		
		XML_file xml = new XML_file();
	      xml.setRef_id_user(null); 
		xml.setDescription(desc);
		xml.setFile(nom);
		xml.setRef_id_format(fr);
		xml.setRef_id_user(null);
		session.save(xml);
		
		
		
		//***********root***********
		
		System.out.println("entrer un nouveau element root de votre fichier");
		
		String nom_root = sl.nextLine();
		
		Element_root ro = new Element_root();
		
		ro.setName_root(nom_root);
		ro.setRef_id_format(fr);
		
		session.save(ro);
		
	
		//*******child**********
	
		
		System.out.println("entrer un nouveau child de votre fichier xml");
		
		String nchild = sl.nextLine();
		
		Element_child child = new Element_child();
		
		child.setName_child(nchild);
		child.setRef_id_root(ro);
		
		session.save(child);
		
		
		//***********attribut*************
		System.out.println("entrer le nombre d'attribut  ");
		
		int nb= sn.nextInt();
		
		Attribut at = new Attribut();	
		for(int i = 0;i<nb ; i++){
		
	    System.out.println("entrer un nouveau nom d'attribut");
		
		String nom_att = sl.nextLine();
		
		at.setAtt_name(nom_att);
		
		at.setRef_id_child(child);
		
		}
		session.save(at);
		//*******zone_name
		System.out.println("entrer le nombre des zones   ");
		 int nbr  = sn.nextInt();
		 Zone_text zn = new Zone_text();
		for (int i=0;i<nbr;i++){
		
		System.out.println("entrer un nouveau nom de zone");
		
		String zone_name = sl.nextLine();
		
		
		
		zn.setZone_name(zone_name);
		zn.setRef_id_child(child);
	
		}
		session.save(zn);	
		//stockage
		//********xml_f_att
		XML_file_attribut x_att = new XML_file_attribut();
		
		x_att.setRef_id_file(xml);
		x_att.setRef_id_root(ro);
		x_att.setRef_id_child(child);
		x_att.setRef_id_attribut(at);
		x_att.setAtt_value(null);
		
		session.save(x_att);
		
		//********xml_f_zone
		
		XML_file_zone x_zone = new XML_file_zone();
		
		x_zone.setRef_id_file(xml);
		x_zone.setRef_id_root(ro);
		x_zone.setRef_id_child(child);
		x_zone.setRef_id_zone(zn);
		x_zone.setZone_value(null);
		
		session.save(x_zone);
		
		
		session.close();
	}

}
