package insideofprogramming.throwingexceptions;

import java.io.IOException;

public class App {

    public static void main(String[] args) {
        DatabaseReader dbReader = new DatabaseReader();

        try {
            dbReader.readFromDB();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        ExcelReader excelReader = new ExcelReader();
        try {
            excelReader.readFromExcel();
        } catch (ServerException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
