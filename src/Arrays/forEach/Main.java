package Arrays.forEach;

public class Main {

    public static void main(String[] args) {

        String[] vect = new String[]{"Beto", "Julia", "Alberto"};

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }

        for (String obj : vect
        ) {
            System.out.println(obj);
        }

    }
}
