import java.sql.*;
import java.util.Scanner;

class MainApp {
    public static void adaugare(Connection connection, String nume, int varsta){
        String sql = "insert into persoane(nume,varsta) values(?,?)";
        try(PreparedStatement ps=connection.prepareStatement(sql)){
            ps.setString(1, nume);
            ps.setInt(2, varsta);
            int nr_randuri=ps.executeUpdate();
            System.out.println("\nNumar randuri afectate de adaugare="+nr_randuri);
        }catch (SQLException e){
            System.out.println(sql);
            e.printStackTrace();
        }
    }
    public static void adaugare_excursii(Connection connection, int id_persoana, String destinatia, String anul){
        String sql = "insert into excursii(id_persoana,destinatia,data) values(?,?,?)";
        try(PreparedStatement ps=connection.prepareStatement(sql)){
            ps.setString(1, String.valueOf(id_persoana));
            ps.setString(2, String.valueOf(destinatia));
            ps.setInt(3, Integer.parseInt(anul));
            int nr_randuri=ps.executeUpdate();
            System.out.println("\nNumar randuri afectate de adaugare="+nr_randuri);
        }catch (SQLException e){
            System.out.println(sql);
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/lab8";
        String sql ="select * from persoane";
        String sql_excursii = "select * from excursii";
        Connection connection= DriverManager.getConnection(url, "root", "root");
        Statement statement = connection.createStatement();
        Statement statementE = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        ResultSet rse = statementE.executeQuery(sql_excursii);
        Scanner scanner = new Scanner(System.in);
        //  --1--
        System.out.println("Dati numele si varsta persoanei:");
        System.out.println("Nume: ");
        String nume = scanner.nextLine();
        System.out.println("Vartsta: ");
        int varsta = Integer.parseInt(scanner.nextLine());
        adaugare(connection, nume, varsta);
        //  --2--
        System.out.println("Adaugare excursie");
        System.out.println("Dati id_persoanei:");
        int id_persoana = Integer.parseInt(scanner.nextLine());
        System.out.println("Dati destinatia excrusiei: ");
        String destinatie = scanner.nextLine();
        System.out.println("Dati anul excursiei: ");
        String anul = scanner.nextLine();
        adaugare_excursii(connection, id_persoana, destinatie, anul);
        while(rse.next())
            System.out.println("id excursie:" + rse.getInt("id_excursii")+", id persoana:"
                    +rse.getInt(2)+", destinatia: "+rse.getString(3)+", anul: "+rse.getString(4));

        while (rs.next())
            System.out.println("id=" + rs.getInt("id") + ", nume= "
                    + rs.getString("nume") + ",varsta=" + rs.getInt("varsta"));
        connection.close();
        statement.close();
        rs.close();
        rse.close();
    }
}