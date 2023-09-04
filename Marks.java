class Marks {
    public static void main(String[] args) {
        int marks = 80;
        System.out.println("Your marks is " + marks);
        if ((marks >= 80) && (marks <= 100)) {
            System.out.println("Passed with Distinction");
        } else if ((marks >= 60) && (marks <= 79)) {
            System.out.println("passed with first class");
        } else if ((marks >= 50) && (marks <= 59)) {
            System.out.println("passed with Second class");
        } else if ((marks >= 35) && (marks <= 49)) {
            System.out.println("You have passed");
        } else if ((marks >= 0) && (marks <= 34)) {
            System.out.println("You have failed");
        } else {
            System.out.println("Invaild Marks");
        }
    }
}