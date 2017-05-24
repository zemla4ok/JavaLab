package by.belstu.poit.dimakot.main;

import by.belstu.poit.dimakot.parsers.DOM;
import by.belstu.poit.dimakot.parsers.SAX;
import by.belstu.poit.dimakot.parsers.ValidatorXSD;
import by.belstu.poit.dimakot.student.Student;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.*;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.apache.log4j.xml.DOMConfigurator;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.awt.*;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.*;
import java.util.*;
import java.util.List;

import com.google.gson.Gson;

public class Main {
    static {
        new DOMConfigurator().doConfigure("log/log4j.xml",
                LogManager.getLoggerRepository());
    }

    private static final Logger LOG = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        //validator
        ValidatorXSD val = new ValidatorXSD();
        val.valid();

        try {
            //SAX
            System.out.println("SAX");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            SAX sax = new SAX();
            parser.parse(new File("files/XML.xml"), sax);
            Student dimka = sax.getResult();
            System.out.println(dimka.getName() + "   " + dimka.getSurname());


            //DOM
            System.out.println("DOM");
            DOM dom = new DOM();
            dom.startParser("files/XML.xml");
            System.out.println(dom.students.get(0).getName());


            //XMLtoHTML
            TransformerFactory xstf = TransformerFactory.newInstance();
            Transformer transformer = null;
            transformer=xstf.newTransformer(new StreamSource("files/XSL.xsl"));
            transformer.transform(new StreamSource("files/XMLtoHTML.xml"), new StreamResult("files/info.html"));


            //serialization
            FileOutputStream out = new FileOutputStream("files/serializ.xml");
            XMLEncoder xmlEncoder = new XMLEncoder(out);
            xmlEncoder.writeObject(dimka);
            xmlEncoder.close();


            //DEserialization
            System.out.println("DeSerializ");
            FileInputStream in = new FileInputStream("files/serializ.xml");
            XMLDecoder xmlDecoder = new XMLDecoder(in);
            Student dimas = (Student) xmlDecoder.readObject();
            xmlDecoder.close();
            System.out.println(dimas.getName() + " " + dimas.getCourse());


            //json
            FileWriter out_JSON = new FileWriter("files/toJSON.json");

            Collection collection = new ArrayList<Student>();
            collection.add(dimas);
            collection.add(dimas);
            Gson gson = new Gson();
            gson.toJson(collection, out_JSON);

            out_JSON.close();

            FileReader in_JSON = new FileReader("files/toJSON.json");
            Student dmitry = gson.fromJson(in_JSON, Student.class);
            in_JSON.close();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}