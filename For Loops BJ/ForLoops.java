public class ForLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            System.out.println("i is equal to " + i);
        }
        for (int j = 10; j != 0; j = j + (-2)) {
            System.out.println("j is equal to " + j);
        }
        for (int k = 10; k != 0; k -= 3) { //This loop will never = 0, so it doesnt stop
            System.out.println("k is equal to " + k);
        }
    }
}