class PartTimeGameTester extends GameTester {
    private final double HOURLY_RATE = 20;
    private int hoursWorked;

    // The Constructor//
    public PartTimeGameTester(String name, int hoursWorked) {
        super(name, false); // Part-time is always false for this class
        this.hoursWorked = hoursWorked;
    }

    // Implement abstract method to determine salary//
    @Override
    public double determineSalary() {
        return hoursWorked * HOURLY_RATE;
    }
}

