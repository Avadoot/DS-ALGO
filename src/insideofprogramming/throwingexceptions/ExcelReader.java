package insideofprogramming.throwingexceptions;

public class ExcelReader {

    /**
     * Custom Exception class example.
     *
     * @throws ServerException
     */
    public void readFromExcel() throws ServerException {
        int returnCode = -1;

        if (returnCode != 0) {
            throw new ServerException("Could not connect to Excel Server! Dang!");
        }
    }
}
