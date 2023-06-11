package mainPackage.textTrianglePackage;

public class textTriangleTask {
    public static void main(String[] args) {

        //SPLITTING ARROWS

        for (int i = 0; i < 30; i++) {
            System.out.print(">");
        }

        System.out.println("");

        //CYCLE

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i==9 || j==0 || i+j==9 && i>4 || j==i && j>4)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }

            System.out.println();
        }

        //SPLITTING ARROWS

        for (int i = 0; i < 30; i++) {
            System.out.print(">");
        }
        System.out.println("");

        //CYCLE

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                if (i==9 || j==9 || i+j==9 && j>4 || j==i && j>4)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }

            System.out.println();
        }

        //SPLITTING ARROWS

        for (int i = 0; i < 30; i++) {
            System.out.print(">");
        }
        System.out.println("");

        //CYCLE

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                if (i==0 || j==9 || i+j==9 && i<=4 || j==i && j<=4)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }

            System.out.println();
        }

        //SPLITTING ARROWS

        for (int i = 0; i < 30; i++) {
            System.out.print(">");
        }
        System.out.println("");

        //CYCLE

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                if (i==0 || j==0 || i+j==9 && i>4 || j==i && j<=4)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }

            System.out.println();
        }



    }

}
