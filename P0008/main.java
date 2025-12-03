package P0008;

public class main {

    public static void main(String[] args) {
        Utility util = new Utility();
        // Step 1: Prompt user for input
        String content = util.getData();
        // Step 2: Analyze the content
        util.analyze(content);
        // Step 3: Display the results
        util.display();
    }
}
