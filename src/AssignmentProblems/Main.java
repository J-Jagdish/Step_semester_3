package AssignmentProblems;

public class Main {
    public static void main(String[] args) {
        // P1 Test
        System.out.println("--- P1: Voting Eligibility ---");
        VotingEligibility p1 = new VotingEligibility();
        p1.checkVotingEligibility(20);
        p1.checkVotingEligibility(16);

        // P2 Test
        System.out.println("\n--- P2: Number Classifier ---");
        NumberClassifier p2 = new NumberClassifier();
        p2.classifyNumber(15);
        p2.classifyNumber(-4);
        p2.classifyNumber(0);

        // P3 Test
        System.out.println("\n--- P3: Print Numbers ---");
        PrintNumbers p3 = new PrintNumbers();
        p3.printNumbersUpToN(5);

        // P4 Test
        System.out.println("\n--- P4: Sum of Numbers ---");
        SumOfNumbers p4 = new SumOfNumbers();
        p4.sumOfNaturalNumbers(5);

        // P5 Test
        System.out.println("\n--- P5: Day Name ---");
        DayName p5 = new DayName();
        p5.printDayName(3);
        p5.printDayName(9);
    }
}
