package com.anderson.testeapachepoi.testes;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class TesteApachePOI {

	public static void main(String[] args) throws IOException {

		String file = "../teste-apache-poi/createdocument.docx";

		XWPFDocument doc = openDocument(file);
		createParagraph(doc);
		saveFile(doc, file);

	}

	private static XWPFDocument openDocument(String filePath) {

		XWPFDocument document = null;
		try {
			File file = new File(filePath);
			FileInputStream fis = new FileInputStream(file);
			document = new XWPFDocument(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return document;
	}

	private static void createParagraph(XWPFDocument document) {
		XWPFParagraph paragraph = document.createParagraph();
		XWPFRun run = paragraph.createRun();
		run.setText("At tutorialspoint.com, we strive hard to " + "provide quality tutorials for self-learning "
				+ "purpose in the domains of Academics, Information "
				+ "Technology, Management and Computer Programming Languages.");
	}

	private static void saveFile(XWPFDocument document, String file) {
		try (FileOutputStream fos = new FileOutputStream(file)) {
			document.write(fos);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * private static void replaceText(XWPFDocument document, String fileText,
	 * String replace) { XWPFParagraph paragraph = document.getLastParagraph();
	 * CharacterRun cr = paragraph.getRun(r);
	 * 
	 * return doc; }
	 */

}
