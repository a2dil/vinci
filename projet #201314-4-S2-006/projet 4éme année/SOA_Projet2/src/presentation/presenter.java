package presentation;
import java.io.File;

import javassist.bytecode.Descriptor.Iterator;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.ws.Endpoint;

import metier.Attribut;
import metier.Element_child;
import metier.Element_root;
import metier.Zone_text;


import org.apache.commons.collections.iterators.ArrayListIterator;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.Where;
import org.hibernate.cfg.Configuration;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;



import dao.ImpReadXmlFile;
import dao.ImpWriteXMLFormat;
import dao.ReadXMLFile;
import dao.WriteXMLFormat;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class presenter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
       
		System.out.println("choisissez un service )");
		System.out.println("service loading    ******** 1");
		System.out.println("service writing    ******** 2");	
		System.out.println("service converting ******** 3");
		int choix = 0 ;
		Scanner sn = new Scanner(System.in);
		choix = sn.nextInt();
		
		switch (choix) {
		case 1:
			System.out.println("donner le path du fichier xml (exemple:/home/fichier.xml)");
			
			Scanner sc = new Scanner(System.in);
			
			String path = sc.nextLine();
			
		    ReadXMLFile d = new ImpReadXmlFile();
		
		    d.read(path);
			
			break;

         case 2:
        	 WriteXMLFormat rx = new ImpWriteXMLFormat();
      	   rx.writing();
			break;
			
		}
		
		  }
	}