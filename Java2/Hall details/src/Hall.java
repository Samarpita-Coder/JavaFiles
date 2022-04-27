import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Hall {
	private String name;
    private String contact;
    private Double costPerDay;
    private String owner;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Double getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(Double costPerDay) {
		this.costPerDay = costPerDay;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public Hall(String name, String contact, Double costPerDay, String owner) {
		super();
		this.name = name;
		this.contact = contact;
		this.costPerDay = costPerDay;
		this.owner = owner;
	}
	public static void writeHallDetails(List<Hall> halls) throws IOException{
		FileWriter fi = new FileWriter("hall.csv");
		try {
			for(int i=0; i<halls.size(); i++) {
				String str = halls.get(i).getName()+","+halls.get(i).getContact()+","+halls.get(i).getCostPerDay()+","+halls.get(i).getOwner()+"\n";
				fi.write(str);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		fi.close();
	}
}
