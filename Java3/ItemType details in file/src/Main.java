import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception{
		try {
			FileReader fr = new FileReader("C:\\Users\\samarpita.mahadani\\eclipse-workspace\\ItemType details in file\\src\\input.txt");
			BufferedReader br = new BufferedReader(fr);
			ItemTypeBO it = new ItemTypeBO();
			List<ItemType> itemType=it.readFromFile(br);
			List<ItemType> IT = it.depositList(itemType);
			it.display(IT);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
