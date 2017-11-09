/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 *
 * @author user
 */
public class controllerDocs {

    public void generateDoc(Object[] data) {
        controllerCategorias cats = new controllerCategorias();
        Date today = new Date();
        today.setHours(0);
        SimpleDateFormat Fecha = new SimpleDateFormat("dd/MM/yyyy");
        String placeDate = "San Gil " + Fecha.format(today);
        String names = data[2].toString() + " " + data[3].toString();
        String document = "";
        if (data[1].toString().equals("0")) {
            document = "T.I. ";
        } else if (data[1].toString().equals("1")) {
            document = "C.C. ";
        }
        document = document + data[0].toString();
        String born = "";
        
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
            Date d = format.parse(data[4].toString());
            born = Fecha.format(d);
        } catch (Exception e) {
        }
        born = data[5].toString() + " " + born;
        String journey = "";
        if (data[7].toString().equals("1")) {
            journey = "Mañana";
        }else if(data[7].toString().equals("2")){
            journey = "Tarde";
        }else if(data[7].toString().equals("3")){
            journey = "Noche";
        }
        String category = cats.getCategoria(data[4].toString());
        try {
            XWPFDocument doc = new XWPFDocument(OPCPackage.open("docs/base.docx"));
            for (XWPFParagraph p : doc.getParagraphs()) {
                List<XWPFRun> runs = p.getRuns();
                if (runs != null) {
                    for (XWPFRun r : runs) {
                        String text = r.getText(0);
                        if (text != null && text.contains("city")) {
                            text = text.replace("city", placeDate);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("name")) {
                            text = text.replace("name", names);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("doc")) {
                            text = text.replace("doc", document);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("born")) {
                            text = text.replace("born", born);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("blood")) {
                            text = text.replace("blood", data[8].toString());
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("eps")) {
                            text = text.replace("eps", data[9].toString());
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("SCHOOL")) {
                            text = text.replace("SCHOOL", data[6].toString());
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("journ")) {
                            System.out.println("Is journey");
                            text = text.replace("journ", journey);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("DRC")) {
                            System.out.println("Is resicence");
                            text = text.replace("DRC", data[10].toString());
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("phone")) {
                            text = text.replace("phone", data[12].toString());
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("correo")) {
                            text = text.replace("correo", data[11].toString());
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("modality")) {
                            text = text.replace("modality", data[15].toString());
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("category")) {
                            text = text.replace("category", category);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("fatherName")) {
                            text = text.replace("fatherName", data[14].toString());
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("motherName")) {
                            text = text.replace("motherName", data[13].toString());
                            r.setText(text, 0);
                        }
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Documento Creado Correctamente");
            doc.write(new FileOutputStream(names + ".docx"));
        } catch (Exception e) {
            System.out.println("Error al generar documento");
            System.out.println(e.getMessage());
        }

    }
}
