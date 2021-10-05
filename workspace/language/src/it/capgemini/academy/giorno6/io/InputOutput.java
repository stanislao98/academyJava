package it.capgemini.academy.giorno6.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class InputOutput {

	private static final String PATH = "C:\\Users\\stani\\OneDrive\\Desktop\\academyJava\\file.txt";
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		File file = new File(PATH);

//		creaFile(file);
//		analisiFile(file);
		//scritturaFile(file);
//		analisiFile(file);
		//System.out.println(letturaFile(file));
		letturaFilePerRiga(file);
	}

	public static void creaFile(File file) {

		boolean controlloCreazione = false;

		if (file.exists())
			System.out.println("esiste già");
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
		System.out.println("è un file " + file.isFile());
		System.out.println("è una cartella: " + file.isDirectory());
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
			System.out.println("inserisci una stringa");
			String s = scanner.nextLine();
			buffWriter.write("\n" + s);
			buffWriter.write("\nbuff");
			System.out.println("file scritto");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (buffWriter != null)
					buffWriter.close();
				if (writer != null)
					writer.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}

	private static String letturaFile(File file) {
		FileReader reader = null;
		BufferedReader buffReader = null;
		char[] arr = new char[100];
		String res = null;
		try {
			reader = new FileReader(file);
			buffReader = new BufferedReader(reader);
			buffReader.read(arr);
			System.out.println("file letto");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if (buffReader != null)
					buffReader.close();
					if(reader!=null)
						reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		}
		
		res = new String(arr);
		return res;

	}
	
	private static void letturaFilePerRiga(File file) {
		//Con questa sintassi le risorse vengono aperte e chiuse automaticamente
		try(FileReader reader = new FileReader(file);
			BufferedReader buffReader = new BufferedReader(reader)) {
			String riga = null;
			
			do {
				riga = buffReader.readLine();
				System.out.println(riga);

			} while (riga != null);
			while(riga != null);
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO: handle exception
		}
	

	}
}
