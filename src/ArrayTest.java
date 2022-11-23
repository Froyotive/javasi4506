import Xixixixi.Customer;

public class ArrayTest {
    public static void main(String[] args) {
        int[] intData = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] doubleData = {1.0, 2.0, 3.0};
        Customer[] customers = {new Customer(), new Customer(), new Customer()};

        int[][] intData2 = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {4, 5, 6, 11, 12, 13, 15, 16, 17, 20}, {7, 8, 9, 10, 41, 42, 43, 44, 45, 65}};
        int[][][] intData3 = {{{1, 2}, {3, 4}, {5, 6}, {7, 8}}};

        int[] intData4 = new int[10];
        int[][] intData5 = new int[3][10];
/*
        for (int i = 0; i < 11; i++) {
            try {
                intData4[i] = i;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Maaf Data berlebihan ");
            }
        }
    }
}
        */

        System.out.println("Copy data from intData to intData4");
        for(int i = 0; i < intData.length; i++){
            intData4[i] = intData [i];
        }
        System.out.println("Print data in intData4");
        for(int i = 0; i < intData4.length; i++){
            System.out.print(intData4[i] +"");
        }
        System.out.println("");
        System.out.println("Print data pake for lain");
        for(int i : intData4){
            System.out.print(i + "");
        }
        System.out.println();

        System.out.println("Copy data array 2 dimensi intData2 ke intData5");
        for (int i = 0; i < intData2.length;i++) {
            for(int j = 0; j < intData2[i].length; j++){
                intData5[i][j] = intData2[i][j];
            }
        }

        System.out.println("Tampilkan data-data di intData5");
        for(int i = 0; i < intData5.length; i++){
            System.out.println("Baris Pertama berisi data berikut : ");
            for(int j=0; j< intData5[i].length; j++){
                System.out.print(intData5[i][j] +"  ");
            }
            System.out.println();
        }
        }

        }


