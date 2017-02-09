package be.stijn.gamescatalog.consoles.model;

public class Console {

	private String manufacturer;
	private String name;
	private int year;
	
	private Console(String manufacturer, String name, int year) {
		super();
		this.manufacturer = manufacturer;
		this.name = name;
		this.year = year;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public static class ConsoleBuilder {
		private String nestedManufacturer;
		private String nestedName;
		private int nestedYear;
		
		public ConsoleBuilder() {
		}
		
		public ConsoleBuilder manufacturer(String manufacturer) {
			this.nestedManufacturer = manufacturer;
			return this;
		}
		
		public ConsoleBuilder name(String name) {
			this.nestedName = name;
			return this;
		}
		
		public ConsoleBuilder year(int year) {
			this.nestedYear = year;
			return this;
		}
		
		public Console build() {
			return new Console(nestedManufacturer, nestedName, nestedYear);
		}
	}
	
	
	
}
