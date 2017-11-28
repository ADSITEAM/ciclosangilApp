/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.modelCiclistas;
import Views.formMessage;
import java.io.FileOutputStream;
import java.sql.ResultSet;
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
 modelCiclistas model = new modelCiclistas();
    formMessage dialog = new formMessage();
    boolean error = true;
    String text = "";
    public void generateDoc(String id) {
       
        ResultSet data = model.selectDoc(id);
        Date today = new Date();
        today.setHours(0);
        SimpleDateFormat Fecha = new SimpleDateFormat("dd/MM/yyyy");
        String placeDate = "San Gil " + Fecha.format(today);
        controllerCategorias cats = new controllerCategorias();
        String names = "";
        String document = "";
        String born = "";
        String journey = "";
        String category = "";
        String blood = "", eps = "", school="", dir="", tel="", mail="",modal="",fn="",mn="";

        try {
            while (data.next()) {
                names = data.getString("nombres") + " " + data.getString("apellidos");
                if (data.getInt("tipo_documento") == 0) {
                    document = "T.I. ";
                } else if (data.getInt("tipo_documento") == 1) {
                    document = "C.C. ";
                }
                document = document + data.getString("n_documento");
                SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
                Date d = format.parse(data.getString("fecha_nacimiento"));
                born = Fecha.format(d);
                born = data.getString("lugar_nacimiento") + " " + born;
                switch (data.getInt("jornada")){
                    case 1:
                        journey = "Mañana";
                        break;
                    case 2:
                        journey = "Tarde";
                        break;
                    case 3:
                        journey = "Noche";
                        break;
                }
                category = cats.getCategoria(data.getString("fecha_nacimiento"));
                blood = data.getString("nombreRH");                
                eps = data.getString("nombreEPS");
                school = data.getString("colegio");
                dir = data.getString("direccion");
                tel = data.getString("telefono");
                modal = data.getString("modalidad");
                mail = data.getString("email");
                fn = data.getString("nombre_padre");                
                mn = data.getString("nombre_madre");

            }
        } catch (Exception e) {
            System.out.println("Error en controller Doc, recorriendo resulSet");
            System.out.println(e.getMessage());
        }

        
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
                            text = text.replace("blood", blood);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("eps")) {
                            text = text.replace("eps", eps);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("SCHOOL")) {
                            text = text.replace("SCHOOL", school);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("journ")) {
                            text = text.replace("journ", journey);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("DRC")) {
                            text = text.replace("DRC", dir);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("phone")) {
                            text = text.replace("phone", tel);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("correo")) {
                            text = text.replace("correo", mail);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("modality")) {
                            text = text.replace("modality", modal);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("category")) {
                            text = text.replace("category", category);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("fatherName")) {
                            text = text.replace("fatherName", fn);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("motherName")) {
                            text = text.replace("motherName", mn);
                            r.setText(text, 0);
                        }
                    }
                }
            }
            error = false;
            text = "Documento Creado Correctamente";
            doc.write(new FileOutputStream("docs/ligaDocs/"+names+ ".docx"));
        } catch (Exception e) {
            text = "Error inesperado al crear documento";
            System.out.println(e.getMessage());
        }
        dialog.showModal(error, text);
    }
}
