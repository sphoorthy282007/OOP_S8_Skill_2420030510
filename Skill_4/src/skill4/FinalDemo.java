public class FinalDemo {
    private final int BLANK_FINAL_VAR;

    public FinalDemo(int value) {
        BLANK_FINAL_VAR = value;
    }

    // Final method
    public final void displayFinalMethod() {
        System.out.println("This is a final method. It cannot be overridden.");
    }

    public void showBlankFinal() {
        System.out.println("Blank final variable value: " + BLANK_FINAL_VAR);
    }

    public static void main(String[] args) {
        FinalDemo obj = new FinalDemo(42);
        obj.showBlankFinal();

        obj.displayFinalMethod();
        final StringBuilder sb = new StringBuilder("Hello");
        
        sb.append(" World!");
        System.out.println("Modified content: " + sb);

    }
}