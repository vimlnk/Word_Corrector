package app;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Corrector corrector = new Corrector();
        DataProvider dataProvider = new DataProvider();
        getOutput(corrector.handleData(dataProvider.getData()));
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}