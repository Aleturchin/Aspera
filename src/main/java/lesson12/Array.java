package lesson12;

public class Array {
    private int i;
    private int j;

    public Array(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public void checkSize() {
        String arrey[][];
        arrey = new String[i][j];
        if (i > 4 || j > 4)
            throw new MyArraySizeException();
        else {
            System.out.println("Введен массив 4 на 4");
        }
    }

    public void checkFormat() {
        String[][] arrey = new String[][]{{"1", "2", "10", "5"},
                {"4", "10", "3", "29"}, {"q", "15", "5", "6"}, {"6", "7", "9", "17"}};
        int arrey2[][] = new int[4][4];
        for (int i1 = 0; i1 < arrey.length; i1++) {
            for (int j1 = 0; j1 < arrey[i1].length; j1++) {
                try {
                    arrey2[i1][j1] = Integer.parseInt(arrey[i1][j1]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException();
                }
            }
        }
            int sum = 0;
            for (int i1 = 0; i1 < arrey2.length; i1++) {
                for (int j1 = 0; j1 < arrey2[i1].length; j1++) {
                    sum = sum + arrey2[i1][j1];
                }
            }
            System.out.println("Сумма всех элементов массива равна " + sum);
        }
    }

