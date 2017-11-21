/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import javax.swing.JOptionPane;
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

    public static void main(String[] args) throws Exception {

        //Blank Document
        XWPFDocument document = new XWPFDocument();

        try {
            XWPFDocument doc = new XWPFDocument(OPCPackage.open("docs/planilla.docx"));
            for (XWPFParagraph p : doc.getParagraphs()) {
                List<XWPFRun> runs = p.getRuns();
                if (runs != null) {
                    for (XWPFRun r : runs) {
                        String text = r.getText(0);
                        if (text != null && text.contains("delegado")) {
                            text = text.replace("delegado", "Omar Galvis");
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("DT")) {
                            text = text.replace("DT", "Wilson Zambrano Larrota");
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("telDir")) {
                            text = text.replace("telDir", "3187094963");
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("telDEL")) {
                            text = text.replace("telDir", "3187094969");
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
                        if (text != null && text.contains("table")) {
                            text = text.replace("table", "");
                            XWPFTable table = doc.createTable();

                            XWPFTableRow tableRowOne = table.getRow(0);
                            tableRowOne.getCell(0).setText("N°");
                            tableRowOne.addNewTableCell().setText("col two, row one");
                            tableRowOne.addNewTableCell().setText("col three, row one");
                            //create second row
                            XWPFTableRow tableRowTwo = table.createRow();
                            tableRowTwo.getCell(0).setText("col one, row two");
                            tableRowTwo.getCell(1).setText("col two, row two");
                            tableRowTwo.getCell(2).setText("col three, row two");

                            //create third row
                            XWPFTableRow tableRowThree = table.createRow();
                            tableRowThree.getCell(0).setText("col one, row three");
                            tableRowThree.getCell(1).setText("col two, row three");
                            tableRowThree.getCell(2).setText("col three, row three");
                            r.setText(text, 0);
                        }
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Documento Creado Correctamente");
            doc.write(new FileOutputStream("docs/inscripciones/carrera.docx"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error inesperado al crear documento");
            System.out.println("Error al generar documento");
            System.out.println(e.getMessage());
        }
        System.out.println("create_table.docx written successully");
    }
}
