import java.util.List;
public interface HomeDao {
	void insert(Houseinfo house);

    Houseinfo selectBydate(String Date);
    List<Houseinfo> selectAll();

    /*void delete(int id);

    void update(Houseinfo student,int id);
 */
}
