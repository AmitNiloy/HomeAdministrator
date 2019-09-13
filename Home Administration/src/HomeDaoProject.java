import java.util.ArrayList;
import java.util.List;

public class HomeDaoProject {
	public static void main(String[] args) {
        HomeDaoImplement hdi = new HomeDaoImplement();
        List<Houseinfo> house = new ArrayList<Houseinfo>();
        house = hdi.selectAll();
        for(Houseinfo htu:house) {
            System.out.println(htu.getDate()+" "+htu.getElectric_Bill()+" "+htu.getWater_Bill()+" "+htu.getGas_Bill()+" "+htu.getTax()+" "+htu.getWages()+" "+htu.getAdditional_Usage()+" "+htu.getBank_Storage());
     
        }
	}
}
