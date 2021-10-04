package it.capgemini.academy.giorno6.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class InputOutput {

	private static final String PATH = "C:\\Users\\stani\\OneDrive\\Desktop\\academyJava\\file.txt";
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		File file = new File(PATH);

		creaFile(file);
		analisiFile(file);
		scritturaFile(file);
		analisiFile(file);
	}

	private static void creaFile(File file) {

		boolean controlloCreazione = false;

		if (file.exists())
			System.out.println("esiste gi�");
		else
			try {
				controlloCreazione = file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		if (controlloCreazione)
			System.out.println("creato il file " + file.getName());
		else
			System.out.println("impossibile creare");

	}

	private static void analisiFile(File file) {
		System.out.println("nome file " + file.getAbsolutePath());
		System.out.println("� un file " + file.isFile());
		System.out.println("� una cartella: " + file.isDirectory());
		System.out.println("posso scrivere: " + file.canWrite());
		System.out.println("posso leggere: " + file.canRead());
		System.out.println("ultima modifica: " + new Date(file.lastModified()));

	}

	private static void scritturaFile(File file) {
		FileWriter writer = null;
		BufferedWriter buffWriter = null;

		try {
			writer = new FileWriter(file, true);
			buffWriter = new BufferedWriter(writer);
			System.out.println("inserisci una stringa" );
			String s = scanner.nextLine();
			buffWriter.write("\n" + s);
			buffWriter.write("buff");
			System.out.println("file scritto");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(buffWriter !=null)
					buffWriter.close();
				if(writer != null)
					writer.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}
}
