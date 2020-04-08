public class ClassForExceptions {

    public static void main(String[] args) {
        String s = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";

        try {
            String[][] arrayString = stringToArrayString(s);
            float result = convert(arrayString);
            System.out.println(result);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            throw new FormatException("neverniy format dlya preobrazovaniya v int");
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            throw new IndexException("razmer matritsi ololo");
        }
    }


    private static float convert(String[][] a) throws NumberFormatException {
        int summ = 0;
        int number;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                number = Integer.parseInt(a[i][j]);
                summ += number;
            }
        }

        return (summ / 2f);
    }

    private static String[][] stringToArrayString(String s) throws IndexOutOfBoundsException {
        String[] elements1 = s.split("\n");
        String[][] tempArray = new String[4][4];

        for (int i = 0; i < tempArray.length; i++) {
            String[] t = elements1[i].split(" ");
            for (int j = 0; j < tempArray.length; j++) {
                tempArray[i][j] = t[j];
            }
        }

        return tempArray;
    }
}
