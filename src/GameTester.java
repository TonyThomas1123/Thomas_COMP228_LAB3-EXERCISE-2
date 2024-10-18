abstract class GameTester {
    protected String name;
    protected boolean isFullTime;

    //This is the Constructor//
    public GameTester(String name, boolean isFullTime) {
        this.name = name;
        this.isFullTime = isFullTime;
    }

    // calculate salary by Abstract method //
    public abstract double determineSalary();

    // To display the details of game tester//
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Full-time: " + (isFullTime ? "Yes" : "No"));
        System.out.println("Salary: $" + determineSalary());
    }
}
