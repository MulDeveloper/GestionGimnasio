
package Modelo;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import Vista.Inicio;

public class DocXml {
    public boolean crearDoc() {

	  try {
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

		// elementos raiz
		Document doc = docBuilder.newDocument();
		Element rootElement = doc.createElement("facturacion");
		doc.appendChild(rootElement);

		// entradas y salidas
		Element entradas = doc.createElement("entradas");
		rootElement.appendChild(entradas);
                
                Element salidas = doc.createElement("salidas");
		rootElement.appendChild(salidas);

		// total entrada
		Element cantidad = doc.createElement("cantidadEntrada");
		cantidad.appendChild(doc.createTextNode(Inicio.totalEntrada.toString()));
		entradas.appendChild(cantidad);

		// total salida
		Element cantidad2 = doc.createElement("cantidadSalida");
		cantidad2.appendChild(doc.createTextNode(Inicio.totalSalida.toString()));
		salidas.appendChild(cantidad2);

		// write the content into xml file
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File("C:\\Users\\Acer\\Desktop\\mes.xml"));

		transformer.transform(source, result);

                return true;
	  }
          catch (ParserConfigurationException pce) {
		pce.printStackTrace();
                return false;
	  } catch (TransformerException tfe) {
		tfe.printStackTrace();
                return false;
	  }
	}
}
