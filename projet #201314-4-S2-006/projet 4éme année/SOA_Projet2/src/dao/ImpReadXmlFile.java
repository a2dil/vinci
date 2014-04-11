package dao;

import java.io.File;
import java.util.Iterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import metier.Attribut;
import metier.Element_child;
import metier.Element_root;
import metier.Format;
import metier.XML_file;
import metier.XML_file_attribut;
import metier.XML_file_zone;
import metier.Zone_text;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ImpReadXmlFile implements ReadXMLFile {

	

	
	public void read(String path) {
		try {
		
		Configuration conf =  new Configuration();
		conf =  conf.configure("hibernate.cfg.xml");
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession(); 
		org.hibernate.Transaction tx = session.beginTransaction();
		
		
			 
			File fXmlFile = new File(path);
			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
		 
	     	doc.getDocumentElement().normalize();
		 
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		 String root = doc.getDocumentElement().getNodeName();
			
			
		 
		String hql = "from Element_root  where name_root =:code ";
		
			Query query = session.createQuery(hql);
			
			query.setParameter("code", root);
			 
			 java.util.Iterator<Element_root> li = query.list().iterator();
			
			 Element_root rt =null ;
			
			 while (li.hasNext()) {
				
				 rt = li.next();
				
		//System.out.println(rt.getId_root());
			
			 }
	
			 
		 //*********xml file_att  ******
			 
			String hql_xml_file_att = "from XML_file_attribut where ref_id_root=:code_root"; 
			
			Query q_x_f_att = session.createQuery(hql_xml_file_att);
			
			Element_root rtt2 = new Element_root();
			rtt2.setId_root(rt.getId_root());
			
		
			q_x_f_att.setParameter("code_root",rtt2);
			
			Iterator<XML_file_attribut> li_x_at  = q_x_f_att.list().iterator();
			
		XML_file_attribut xf_at = new XML_file_attribut();
  			
			while (li_x_at.hasNext()){
				xf_at = li_x_at.next();
				
			
			//*********xml file_zone  ******
			 
			String hql_xml_file_zone = "from XML_file_zone where ref_id_root=:code_root "; 
			
			Query q_x_f_zone = session.createQuery(hql_xml_file_zone);
			
			q_x_f_zone.setParameter("code_root",rtt2);
			
			Iterator<XML_file_zone> li_x_zn  = q_x_f_zone.list().iterator();
			
	         XML_file_zone x_zone = new XML_file_zone();
		
  			
			while (li_x_zn.hasNext()){
			x_zone = li_x_zn.next();
				
				
			NodeList nList = doc.getElementsByTagName(x_zone.getRef_id_child().getName_child());
		 
			System.out.println("----------------------------");
		 
			for (int temp = 0; temp < nList.getLength(); temp++) {
		 
				Node nNode = nList.item(temp);
		 
				System.out.println("\nCurrent Element :" + nNode.getNodeName());
		 
				
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
		 
					Element eElement = (Element) nNode;
		 
					System.out.println(xf_at.getRef_id_child().getName_child()+ "  "+ xf_at.getRef_id_attribut().getAtt_name()+" : "+ eElement.getAttribute(xf_at.getRef_id_attribut().getAtt_name()));
					System.out.println(x_zone.getRef_id_zone().getZone_name()+ ":"  + eElement.getElementsByTagName(x_zone.getRef_id_zone().getZone_name()).item(0).getTextContent());
					
		}
			}
		   
		   }
		
		 
			}
		
			 session.close();
				
				sf.close();
		}
		
		   catch (Exception e) {
			e.printStackTrace();
		   
		   }
		    
		     
		    
		
		
	

	}

}
