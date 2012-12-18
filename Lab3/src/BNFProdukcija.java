import java.util.ArrayList;
import java.util.LinkedList;

public class BNFProdukcija {
	private String LijevaStrana;
	private LinkedList<ArrayList<String> > DesneStrane;
	
	public BNFProdukcija(String Lijeva, String Desna){
		LijevaStrana = Lijeva;
		
		DesneStrane = new LinkedList<ArrayList<String> >();
		
		String s[] = Desna.substring(4).split("|");
		
		for(int i = 0; i < s.length; i++){
			String t[] = s[i].split(" ");
			ArrayList<String> arr = new ArrayList<String>();
			for(int j = 0; j < t.length; j++){
				arr.add(t[j].trim());
			}
			DesneStrane.add(arr);
		}
	}
}
