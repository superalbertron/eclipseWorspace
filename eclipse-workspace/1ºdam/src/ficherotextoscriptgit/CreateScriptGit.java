package ficherotextoscriptgit;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class CreateScriptGit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter script=new FileWriter("c:/prueba/creategit.sh");
			BufferedWriter bs=new BufferedWriter(script);
			bs.write("git checkout -b spock\n");
			bs.write("git add creategit.sh\n");
			bs.write("git commit -m 'subido fichero'\n");
			bs.write("git push origin spock\n");
			System.out.println("script creado\n");
			bs.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
