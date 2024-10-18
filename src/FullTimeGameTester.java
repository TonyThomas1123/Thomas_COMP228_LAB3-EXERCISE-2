class FullTimeGameTester extends GameTester {
    private final double BASE_SALARY = 3000;

    // The Constructor//
    public FullTimeGameTester(String name) {
        super(name, true); // Full-time is always true for this class
    }

    // Implement abstract method to determine salary//
    @Override
    public double determineSalary() {
        return BASE_SALARY;
    }
}
