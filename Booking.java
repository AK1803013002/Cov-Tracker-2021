//Don't change the code
public class Booking {

	private int bookingId;
	private String name;
	private String address;
	private String projectCategory;
	private int totalCost;
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getProjectCategory() {
		return projectCategory;
	}
	public void setProjectCategory(String projectCategory) {
		this.projectCategory = projectCategory;
	}
	public int getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}
	public Booking(int bookingId, String name, String address, String projectCategory, int totalCost) {
		super();
		this.bookingId = bookingId;
		this.name = name;
		this.address = address;
		this.projectCategory = projectCategory;
		this.totalCost = totalCost;
	}
	
}
