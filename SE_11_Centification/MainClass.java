package SE_11_Centification;

class FirstClass {

    // Question : 1
    void firstQuestion() {
        int x = 0, y = 6;
        for( ; x < y; x++, y--) {
            if(x%2 == 0) {
                continue;
            }
            System.out.println(x + "-" +y);
        }
    }

    // Question : 2
    
}

public class MainClass {

    // Main method to execute the program.
    public static void main(String[] args) {
        FirstClass firstClass = new FirstClass();
        firstClass.firstQuestion();
    }
}
