import java.io.*;

public class Streams {

	public static void main(String[] args) {			
		System.out.println("Writing random numbers to file01.txt");
        writeToFile("src/file01.txt");
        
        System.out.println("Reading random numbers from file01.txt");
        readFromFile("src/file01.txt");	
	}
	
	public static void writeToFile(String fileName) {
		try {
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for(int i=0; i<10; i++) {
            	int random = (int) (Math.random()*100 + 1);
            	bufferedWriter.write(random + "");
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println("Error writing to file '" + fileName + "'");
        }
	}
	
	public static void readFromFile(String fileName) {
		String line;
		
		try {
			
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   
            
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException e) {
            System.out.println("Error reading file '" + fileName + "'"); 
        }
	}
}
