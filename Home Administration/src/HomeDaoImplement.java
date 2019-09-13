import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class HomeDaoImplement implements HomeDao{
public void insert(Houseinfo house) {
        
        Connection connection = null;
	PreparedStatement preparedStatement = null;

		try {
			connection = ConnectionConfiguration.getConnection();
			preparedStatement = connection.prepareStatement("INSERT INTO household_management(Date,Electric_Bill,Water_Bill,Gas_Bill,Tax,Wages,Additional_Usage,Bank_Storage)" +
					"VALUES (?,?,?,?,?,?,?,?)");
                        preparedStatement.setString(1, house.getDate());
			preparedStatement.setDouble(2, house.getElectric_Bill());
			preparedStatement.setDouble(3, house.getWater_Bill());
                        preparedStatement.setDouble(4, house.getGas_Bill());
                        preparedStatement.setDouble(5, house.getTax());
                        preparedStatement.setDouble(6, house.getWages());
                        preparedStatement.setDouble(7, house.getAdditional_Usage());
                        preparedStatement.setDouble(8, house.getBank_Storage());
                        
			preparedStatement.executeUpdate();
			System.out.println("");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (preparedStatement != null) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	
    }

    public Houseinfo selectBydate(String Date) {
         Houseinfo house = new Houseinfo();
	 Connection connection = null;
	 PreparedStatement preparedStatement = null;
	 ResultSet resultSet = null;

	try {
			
            connection = ConnectionConfiguration.getConnection();
	    preparedStatement = connection.prepareStatement("SELECT * FROM household_management WHERE Date = ?");
	    preparedStatement.setString(1, Date);
	    resultSet = preparedStatement.executeQuery();

	    while (resultSet.next()) {
				
                        house.setDate(resultSet.getString("Date"));
                        house.setElectric_Bill(resultSet.getDouble("Electric_Bill"));
                        house.setWater_Bill(resultSet.getDouble("Water_Bill"));
                        house.setGas_Bill(resultSet.getDouble("Gas_Bill"));
                        house.setTax(resultSet.getDouble("Tax"));
                        house.setWages(resultSet.getDouble("Wages"));
                        house.setAdditional_Usage(resultSet.getDouble("Additional_Usage"));
                        house.setBank_Storage(resultSet.getDouble("Bank_Storage"));
 }

	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		if (resultSet != null) {
		    try {
			resultSet.close();
		    } catch (SQLException e) {
			e.printStackTrace();
		    }
	        }
		if (preparedStatement != null) {
		    try {
			    preparedStatement.close();
		    } catch (SQLException e) {
			   e.printStackTrace();
		    }
		}
		if (connection != null) {
		    try {
			connection.close();
		    } catch (SQLException e) {
			e.printStackTrace();
		    }
		}
	}

		return house;
	
    }

    
    public List<Houseinfo> selectAll() {
        
    List<Houseinfo> horse = new ArrayList<Houseinfo>();
	Connection connection = null;
	Statement statement = null;
        ResultSet resultSet = null;

        try {
                connection = ConnectionConfiguration.getConnection();
                statement = connection.createStatement();
                resultSet = statement.executeQuery("SELECT * FROM household_management");

                while (resultSet.next()) {
                        Houseinfo houses = new Houseinfo();
                        houses.setDate(resultSet.getString("Date"));
                        houses.setElectric_Bill(resultSet.getDouble("Electric_Bill"));
                        houses.setWater_Bill(resultSet.getDouble("Water_Bill"));
                        houses.setGas_Bill(resultSet.getDouble("Gas_Bill"));
                        houses.setTax(resultSet.getDouble("Tax"));
                        houses.setWages(resultSet.getDouble("Wages"));
                        houses.setAdditional_Usage(resultSet.getDouble("Additional_Usage"));
                        houses.setBank_Storage(resultSet.getDouble("Bank_Storage"));

                        horse.add(houses);
                }

        } catch (Exception e) {
                e.printStackTrace();
        } finally {
                if (resultSet != null) {
                        try {
                                resultSet.close();
                        } catch (SQLException e) {
                                e.printStackTrace();
                        }
                }
                if (statement != null) {
                        try {
                                statement.close();
                        } catch (SQLException e) {
                                e.printStackTrace();
                        }
                }
                if (connection != null) {
                        try {
                                connection.close();
                        } catch (SQLException e) {
                                e.printStackTrace();
                        }
                }
        }

        return horse; //To change body of generated methods, choose Tools | Templates.
    }

   /* 
    public void delete(int id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
                connection = ConnectionConfiguration.getConnection();
                preparedStatement = connection.prepareStatement("DELETE FROM student WHERE id = ?");
                preparedStatement.setInt(1, id);
                preparedStatement.executeUpdate();

                System.out.println("");

        } catch (Exception e) {
                e.printStackTrace();
        } finally {
                if (preparedStatement != null) {
                        try {
                                preparedStatement.close();
                        } catch (SQLException e) {
                                e.printStackTrace();
                        }
                }
                if (connection != null) {
                        try {
                                connection.close();
                        } catch (SQLException e) {
                                e.printStackTrace();
                        }
                }
        } //To change body of generated methods, choose Tools | Templates.
    }

    
    public void update(Student student, int id) {
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
                connection = ConnectionConfiguration.getConnection();
                preparedStatement = connection.prepareStatement("UPDATE student SET " +
                                "firstname = ?, lastname = ? WHERE id = ?");

                preparedStatement.setString(1, student.getFirstName());
                preparedStatement.setString(2, student.getLastName());
                preparedStatement.setInt(3, id);
                preparedStatement.executeUpdate();

                System.out.println("UPDATE student SET " +
                                "firstname = ?, lastname = ? WHERE id = ?");

        } catch (Exception e) {
                e.printStackTrace();
        } finally {
                if (preparedStatement != null) {
                        try {
                                preparedStatement.close();
                        } catch (SQLException e) {
                                e.printStackTrace();
                        }
                }
                if (connection != null) {
                        try {
                                connection.close();
                        } catch (SQLException e) {
                                e.printStackTrace();
                        }
                }
        }
}

    
    
    
    
    
    
    
    @Override
    public void insert(Houseinfo house) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Houseinfo selectBydate(String Date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */

}
