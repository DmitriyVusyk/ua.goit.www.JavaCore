package module3.hw1;

/**
 * Created by dmytrovusyk on 14.02.17.
 */
class Main {
    public static void main(String[] args) {

        Bird bird = new Bird();
        String phrase[] = {"walking", "flying", "singing", "Bird"};

        bird.sing(phrase);
        bird.sing("walking");
        bird.sing("flying");
        bird.sing("singing");
        bird.sing("Bird");
    }
}
