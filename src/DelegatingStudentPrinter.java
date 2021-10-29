public class DelegatingStudentPrinter implements IStudentPrinter{

    public IStudentPrinter[] printers;

    public DelegatingStudentPrinter(IStudentPrinter[] printers) {
        this.printers = printers;
    }

    @Override
    public void print(Student student) {
        for (IStudentPrinter printer: printers) {
            printer.print(student);
        }
    }
}
