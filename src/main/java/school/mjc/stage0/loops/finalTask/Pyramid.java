package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int length = cathetusLength + (cathetusLength - 1);
        int mainNum = 1;
        int indexNum = length / 2;

        for (int i = 0; i < cathetusLength; i++) {
            for (int j = 0; j < length; j++) {
                if (j == indexNum) {
                    System.out.print(mainNum);
                } else if (j - 1 == indexNum) {
                    int temp = i + j;
                    for (int k = 1; j < temp; j++, k++) {
                        System.out.print(mainNum + k);
                    }
                    break;
                } else if (i + j == indexNum) {
                    for (;j < indexNum; j++) {
                        System.out.print(cathetusLength - j);
                    }
                    j--;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
