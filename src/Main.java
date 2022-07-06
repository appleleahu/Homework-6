public class Main {
    public static void main(String[] args) {

        // Task 1
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;

        double[] weight2 = {1.57, 7.654, 9.986};

        boolean[] weight3 = {false, true, false};

        // Task 2
        System.out.println("Task 2:");
        for (int i = 0; i < weight.length; i++) {
            if (i < weight.length - 1)
                System.out.print(weight[i] + ",");
            else
                System.out.print(weight[i]);
        }
        System.out.println();
        for (int i = 0; i < weight.length; i++) {
            if (i < weight2.length - 1)
                System.out.print(weight2[i] + ",");
            else
                System.out.print(weight2[i]);
        }
        System.out.println();
        for (int i = 0; i < weight.length; i++) {
            if (i < weight3.length - 1)
                System.out.print(weight3[i] + ",");
            else
                System.out.print(weight3[i]);
        }
        System.out.println();
        // Task 3
        System.out.println("Task 3:");
        for (int i = weight.length - 1; i >= 0; i--) {
            if (i > 0)
                System.out.print(weight[i] + ",");
            else if (i == 0)
                System.out.println(weight[i]);
        }
        for (int i = weight2.length - 1; i >= 0; i--) {
            if (i > 0)
                System.out.print(weight2[i] + ",");
            else if (i == 0)
                System.out.println(weight2[i]);
        }
        for (int i = weight3.length - 1; i >= 0; i--) {
            if (i > 0)
                System.out.print(weight3[i] + ",");
            else if (i == 0)
                System.out.println(weight3[i]);

        }

        // Task 4
        System.out.println("Task 4:");
        for (int i = 0; i < weight.length; i++) {
            if (weight[i] % 2 != 0) {
                weight[i] = weight [i] + 1;
            }
            System.out.print(weight[i] + " ");

        }
    }
}