public class StudentJsonConverter implements IStudentStringConverter{
    @Override
    public String convert(Student student) {
        System.out.println("Converter Json");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{").append('\n');
        stringBuilder.append("\n");
        stringBuilder.append("\t").append("\"name\":").append("\"").append(student.firstName)
                .append("\",").append("\n");
        stringBuilder.append("\t").append("\"name\":").append("\"").append(student.lastName)
                .append("\",").append("\n");
        stringBuilder.append("\t").append("\"name\":").append("\"").append(student.age)
                .append("\",").append("\n");
        stringBuilder.append("\t").append("\"name\":").append("\"").append(student.group)
                .append("\"").append("\n");
        stringBuilder.append("\n");
        stringBuilder.append("}");


        return stringBuilder.toString();
    }
}
