import java.sql.Connection;

public class SaveToDB {
        Config config = new Config();

        String insertToDB(int foundNum){
            try {
                String sql = "INSERT INTO dataresults (foundNumber) VALUES ('"+foundNum+"')";
                java.sql.Connection conn=(Connection)config.configDB();
                java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                pst.execute();
                return "Success";

            } catch (Exception e) {
                System.err.println("Got an exception!");
                System.err.println(e.getMessage());
            }
            return "Failed";
        }
}
