import java.util.Scanner;
class P1{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int p, c, b, m, co;
            float per;
            System.out.println("Enter marks of Physics: ");
            p = sc.nextInt();
            System.out.println("Enter marks of Chemistry: ");
            c = sc.nextInt();
            System.out.println("Enter marks of Biology: ");
            b = sc.nextInt();
            System.out.println("Enter marks of Mathematics: ");
            m = sc.nextInt();
            System.out.println("Enter marks of Computer: ");
            co = sc.nextInt();
            per = (p + c + b + m + co) / 5.0f
            * 100;
            System.out.println("Percentage: " + per);
            if (per >= 90) {
                System.out.println("Grade: A");
            } else if (per >= 80) {
                System.out.println("Grade: B");
            } else if (per >= 70) {
                System.out.println("Grade: C");
            } else if (per >= 60) {
                System.out.println("Grade: D");
            } else if (per >= 40) {
                System.out.println("Grade: E");
            } else {
                System.out.println("Grade: F");
            }
        }

    }