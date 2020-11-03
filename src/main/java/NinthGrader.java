public class NinthGrader extends Student {
    //Instance Vars Inherited

    //Constructors
    public NinthGrader() {
        
    }

    public NinthGrader(String a, String b) {
        super(a, b, 2024);
    }

    public void doSomething() {
        System.out.println("I'm preparing for a Harkness Discussion!");
    }

    @Override
    public String toString() {
        String x = this.getFirstName() + " " + this.getLastName() + ", " + this.getClassYear() + " (Ninth Grader)";
        return x;
    }
}