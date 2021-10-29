public class StudentKeyValue implements IStudentStringConverter{

    @Override
    public String convert(Student student) {
        System.out.println("Converter key-value");
        System.out.println("");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: ").append(student.firstName).append('\n').
                append("Last name: ").append(student.lastName).append('\n').
                append("Age: ").append(student.age).append('\n').
                append("Group: ").append(student.group);
        return stringBuilder.toString();
    }
}
