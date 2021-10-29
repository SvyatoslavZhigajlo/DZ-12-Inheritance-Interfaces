public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        IStudentStringConverter converter = randomConverter();

        Student student = new Student("Svyatoslav", "Zhigajlo", 32,
                "A51");
        String result = converter.convert(student);
        System.out.println(result);

        doTaskPrinter();
    }

    public void doTaskPrinter(){
        IStudentPrinter[] printers = new IStudentPrinter[]{
            new ConsolePrinter(new StudentJsonConverter()),
            new ConsolePrinter(new StudentKeyValue()),
            new ConsolePrinter(new StudentXmlConverter()),
            new PrintNowhere()
        };

        IStudentPrinter printer = new DelegatingStudentPrinter(printers);
        printer.print(new Student("Yana", "Zhigajlo", 32,
                "F44"));

    }


    public IStudentStringConverter randomConverter(){
        double random = Math.random();

        if (random>0.66){
            return new StudentJsonConverter();
        }else if (random > 0.33){
            return new StudentXmlConverter();
        }else {
            return new StudentKeyValue();
        }

    }
}
