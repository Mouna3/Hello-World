import java.io.*;

public class ReadFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String fileName = "C:/MyProjects/bin/Documents/Parts.xml";
        String stringLine = null;
        try {
            FileReader fileReader=new FileReader(fileName);
            BufferedReader bufferedReader=new BufferedReader(fileReader);

            while((stringLine = bufferedReader.readLine()) != null) {
                System.out.println(stringLine);
            }    
            bufferedReader.close();            
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println("Error reading file '"+ fileName + "'");                   
        }
    }
}