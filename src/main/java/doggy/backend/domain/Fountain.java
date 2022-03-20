package doggy.backend.domain;

public class Fountain {
	
	private double cordx;
	private double cordy;
	private double longitude;
	private double latitude;
	private String address;
	private String addressComplement;
	private String district;
	
	public Fountain(double cordx, double cordy, double longitude, double latitude, String address, String addressComplement,
			String district) {
		this.cordx = cordx;
		this.cordy = cordy;
		this.longitude = longitude;
		this.latitude = latitude;
		this.address = address;
		this.addressComplement = addressComplement;
		this.district = district;
	}

	public double getCordx() {
		return cordx;
	}

	public void setCordx(double cordx) {
		this.cordx = cordx;
	}

	public double getCordy() {
		return cordy;
	}

	public void setCordy(double cordy) {
		this.cordy = cordy;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressComplement() {
		return addressComplement;
	}

	public void setAddressComplement(String addressComplement) {
		this.addressComplement = addressComplement;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}
	
	
	
	

}
