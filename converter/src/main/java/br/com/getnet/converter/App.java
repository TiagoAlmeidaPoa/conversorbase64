package br.com.getnet.converter;

import java.io.File;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;

public class App 
{
    public static void main( String[] args )
    {
//    	 aqui vai as informações do front 
    	final String arquivo = "C:\\Users\\tiago\\Área de Trabalho\\GETNET\\SCRIPTS\\ONB-CONTRATOS\\imagem UCM\\11423992\\front.jpeg";
    	byte[] fileContent;
		try {
			File inputFile = new File(arquivo);
			fileContent = FileUtils.readFileToByteArray(inputFile);
			String encodedString = Base64.getEncoder().encodeToString(fileContent);
			
			File outputFile = new File(inputFile
			          .getParentFile()
			          .getAbsolutePath() + "\\frontSaida.txt");

	        FileUtils.writeStringToFile(outputFile, encodedString, "UTF-8");

		} catch (IOException e) {

			
			e.printStackTrace();
		}
		// aqui vai as informações do back
		
		final String arquivoBack = "C:\\Users\\tiago\\Área de Trabalho\\GETNET\\SCRIPTS\\ONB-CONTRATOS\\imagem UCM\\11423992\\back.jpeg";
    	byte[] fileContentBack;
		try {
			File inputFileBack = new File(arquivoBack);
			fileContentBack = FileUtils.readFileToByteArray(inputFileBack);
			String encodedStringBack = Base64.getEncoder().encodeToString(fileContentBack);
			
			File outputFileBack = new File(inputFileBack
			          .getParentFile()
			          .getAbsolutePath() + "\\backSaida.txt");

	        FileUtils.writeStringToFile(outputFileBack, encodedStringBack, "UTF-8");
	        

		} catch (IOException e) {

			e.printStackTrace();
		}
		
		// aqui vai as informações da selfie
//				final String arquivoSelfie = "C:\\Users\\tiago\\Área de Trabalho\\GETNET\\SCRIPTS\\ONB-CONTRATOS\\imagem UCM\\11254903\\selfie.JPEG";
//		    	byte[] fileContentSelfie;
//				try {
//					File inputFileSelfie = new File(arquivoSelfie);
//					fileContentSelfie = FileUtils.readFileToByteArray(inputFileSelfie);
//					String encodedStringSelfie = Base64.getEncoder().encodeToString(fileContentSelfie);
//					
//					File outputFileSelfie = new File(inputFileSelfie
//					          .getParentFile()
//					          .getAbsolutePath() + "\\selfieSaida.txt");
//
//			        FileUtils.writeStringToFile(outputFileSelfie, encodedStringSelfie, "UTF-8");
//
//				} catch (IOException e) {
//
//					e.printStackTrace();
//				}
    	
    }
}
