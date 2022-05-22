package some.som;

public class SomeMain {

    public static void main(String[] args) {

        int nElems = 12;

        int[] intArrays = new int[100];
        intArrays[0] = 0;
        intArrays[1] = 33;
        intArrays[2] = 44;
        intArrays[3] = 55;
        intArrays[4] = 66;
        intArrays[5] = 77;
        intArrays[6] = 88;
        intArrays[7] = 22;
        intArrays[8] = 11;
        intArrays[9] = 99;

        for (int i = 0; i < nElems; i++) {
            System.out.print(intArrays[i] + " ");
        }

        System.out.println("");
        int j;
        long searchKey = 66;
        long searchKey2 = 77;
        for (j = 0; j < nElems; j++) {
            if (intArrays[j] == searchKey) {
                break;
            }
            else if (intArrays[j] == searchKey2) {
                break;
            }
        }
        if (j == nElems)
            System.out.println("Can't find " + searchKey);
        else
            System.out.println("Found " + searchKey);
        System.out.println("Found " + searchKey2);
//        else
//            System.out.println("Found" + searchKey2);
//
//        System.out.println(intArrays.length);
    }
}
