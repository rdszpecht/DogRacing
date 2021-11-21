package dogRacing.utils;

public enum Message {
    WELCOME("Welcome to the first Dog Race"),
    NAME_SELECT("Input a name for your pet: "),
    BREED_SELECT("Input the breed of your dog: "),
    GOODBYE("Thanks for participating!!"),
    FASTEST_DOG("is the fastest dog"),
    DRAW("Both dogs are equally as fast"),
    RECOGNITION("As a recognition for "),
    WINNER(", winner of the race, he can chose a special price"),
    SPEED_OF(" has a speed of: "),
    LOSER_PRICE(" also wins a special signature bowl for his great performance!"),
    WINNER_PRICE(" as a reward for him winning, also a special signature bowl!"),
    OBTAINED(" has obtained ");

    private String message;

    Message(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
