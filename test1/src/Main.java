//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


                int n = 5; // height of the upper half

                // Upper part
                for (int i = 1; i <= n; i++) {
                    // leading spaces
                    for (int j = i; j < n; j++) {
                        System.out.print(" ");
                    }
                    // stars with spacing
                    if (i == 1) {
                        System.out.println("*");
                    } else {
                        System.out.print("*");
                        for (int j = 1; j <= (i - 1) * 2 - 1; j++) {
                            System.out.print(" ");
                        }
                        System.out.println("*");
                    }
                }

                // Lower part
                for (int i = n - 1; i >= 1; i--) {
                    // leading spaces
                    for (int j = i; j < n; j++) {
                        System.out.print(" ");
                    }
                    // stars with spacing
                    if (i == 1) {
                        System.out.println("*");
                    } else {
                        System.out.print("*");
                        for (int j = 1; j <= (i - 1) * 2 - 1; j++) {
                            System.out.print(" ");
                        }
                        System.out.println("*");
                    }
                }
            }

}