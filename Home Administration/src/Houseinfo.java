
public class Houseinfo {
	  private String Date;
	    private double Electric_Bill;
	    private double Water_Bill;
	    private double Gas_Bill;
	    private double Tax;
	    private double Wages;
	    private double Additional_Usage;
	    private double Bank_Storage;

	    public Houseinfo(String Date, double Electric_Bill, double Water_Bill, double Gas_Bill, double Tax, double Wages, double Additional_Usage, double Bank_Storage) {
	        this.Date = Date;
	        this.Electric_Bill = Electric_Bill;
	        this.Water_Bill = Water_Bill;
	        this.Gas_Bill = Gas_Bill;
	        this.Tax = Tax;
	        this.Wages = Wages;
	        this.Additional_Usage = Additional_Usage;
	        this.Bank_Storage = Bank_Storage;
	    }
	public Houseinfo(){
	    
	}
	    public String getDate() {
	        return Date;
	    }

	    public void setDate(String Date) {
	        this.Date = Date;
	    }

	    public double getElectric_Bill() {
	        return Electric_Bill;
	    }

	    public void setElectric_Bill(double Electric_Bill) {
	        this.Electric_Bill = Electric_Bill;
	    }

	    public double getWater_Bill() {
	        return Water_Bill;
	    }

	    public void setWater_Bill(double Water_Bill) {
	        this.Water_Bill = Water_Bill;
	    }

	    public double getGas_Bill() {
	        return Gas_Bill;
	    }

	    public void setGas_Bill(double Gas_Bill) {
	        this.Gas_Bill = Gas_Bill;
	    }

	    public double getTax() {
	        return Tax;
	    }

	    public void setTax(double Tax) {
	        this.Tax = Tax;
	    }

	    public double getWages() {
	        return Wages;
	    }

	    public void setWages(double Wages) {
	        this.Wages = Wages;
	    }

	    public double getAdditional_Usage() {
	        return Additional_Usage;
	    }

	    public void setAdditional_Usage(double Additional_Usage) {
	        this.Additional_Usage = Additional_Usage;
	    }

	    public double getBank_Storage() {
	        return Bank_Storage;
	    }

	    public void setBank_Storage(double Bank_Storage) {
	        this.Bank_Storage = Bank_Storage;
	    }
}
