import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;


public class Main {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		System.out.println("Enter data: ");
		String data = br.readLine();
				
		FileWriter writer = new FileWriter("F:\\youssef lap\\ITI\\7 Java\\test.txt");
		BufferedWriter buffer = new BufferedWriter(writer);
		
		
		while(!data.equals("stop")) {
			buffer.write(data + "\n");
			System.out.println("data: " + data);
			System.out.println("Enter data: ");
			data = br.readLine();
		}
		
		buffer.close();

	}

}
