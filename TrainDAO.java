package TrainTicketBookingSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TrainDAO {
	
	static final String Driver_Name="com.mysql.cj.jdbc.Driver" ;
	static final String DB_URL="jdbc:mysql://localhost:3306/train?autoreconnect=true&useSSL=false";
	static final String USERNAME="root";
	static final String PASSWORD="tiger";
	Train findTrain(int trainNo)
	{
		Train train = null;
		
	try {
		//step-1 load the Driver class
		Class.forName(Driver_Name);
		System.out.println("Class Found");
		
		//step-2 Get the Connection
		Connection con = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
		System.out.println("Connected");
		
		PreparedStatement ps = con.prepareStatement("Select * from train where_no=?");
		ps.setInt(1, trainNo);
		
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			train=new Train(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5));
			
		}
	}
	catch(Exception e){
		
		System.out.println(e);
		
	}
	return train;

}
}
