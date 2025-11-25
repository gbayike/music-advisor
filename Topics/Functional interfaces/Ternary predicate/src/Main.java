class Predicate {
    public static final TernaryIntPredicate ALL_DIFFERENT = (op1, op2, op3) -> op1 != op2 && op1 != op3 && op2 != op3;

    @FunctionalInterface
    public interface TernaryIntPredicate {
        // Write a method here
        boolean test(int operand1, int operand2, int operand3);
    }
}