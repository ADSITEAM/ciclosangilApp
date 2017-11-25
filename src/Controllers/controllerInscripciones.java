/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Views.formMessage;
import java.io.FileOutputStream;
import java.util.List;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

/**
 *
 * @author user
 */
public class controllerInscripciones {
    formMessage modal = new formMessage();
    String txt = "";
    boolean error = true;
    public void generarInscripcion(String[] raceData, String[][] racers) {
        try {
            XWPFDocument doc = new XWPFDocument(OPCPackage.open("docs/planilla2.docx"));
            for (XWPFParagraph p : doc.getParagraphs()) {
                List<XWPFRun> runs = p.getRuns();
                if (runs != null) {
                    for (XWPFRun r : runs) {
                        String text = r.getText(0);
                        if (text != null && text.contains("RaceName")) {
                            text = text.replace("RaceName", raceData[0]);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("delegado")) {
                            text = text.replace("delegado", raceData[1]);
                            r.setText(text, 0);
                        }
                         if (text != null && text.contains("telDel")) {
                            text = text.replace("telDel", raceData[2]);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("DT")) {
                            text = text.replace("DT", raceData[3]);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("telDir")) {
                            text = text.replace("telDir", raceData[4]);
                            r.setText(text, 0);
                        }
                       
                        if (text != null && text.contains("DiligencedName")) {
                            text = text.replace("DiligencedName", "Nicolás Mateo Arias");
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("DateSended")) {
                            text = text.replace("DateSended", "16/03/2017");
                            r.setText(text, 0);
                        }
                    }
                }
            }
            XWPFTableRow row;
            for (XWPFTable tbl : doc.getTables()) {
                for (int i = 0; i < racers.length; i++) {
                    row = tbl.createRow();
                    row.getCell(0).setText("" + (i + 1));
                    row.getCell(1).setText(racers[i][1]);
                    row.getCell(2).setText(racers[i][0]);
                    row.getCell(3).setText(racers[i][2]);
                    row.getCell(4).setText(racers[i][4]);
                    row.getCell(5).setText("Ciclo San Gil");
                    row.getCell(7).setText(racers[i][3]);
                }
            }
            error = false;
            txt = "Documento creado correctamente.";
            doc.write(new FileOutputStream("docs/inscripciones/"+raceData[0]+".docx"));
        } catch (Exception e) {
            txt = "Error inesperado al crear documento";
            System.out.println("Error al generar documento");
            System.out.println(e.getMessage());
        }
        modal.showModal(error, txt);
    }
}
