public class RotateString {
    public static void main(String[] args) {
        String s = "Iamthulasi", goal = "thulasiIam";
        boolean isRotated = false;

        for (int i = 1; i <= s.length(); i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            if (rotated.equals(goal)) {
                isRotated = true;
                break; // No need to continue looping
            }
        }

        if (isRotated) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}