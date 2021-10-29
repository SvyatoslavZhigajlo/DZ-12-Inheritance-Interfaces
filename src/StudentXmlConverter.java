public class StudentXmlConverter implements IStudentStringConverter{

    @Override
    public String convert(Student student) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<").append("student").append(">").append("\n");
        stringBuilder.append("\t").append("<").append("name").append(">").append(student.firstName)
                .append("<").append("/").append("name").append(">").append("\n");
        stringBuilder.append("\t").append("<").append("lastname").append(">").append(student.lastName)
                .append("<").append("/").append("lastname").append(">").append("\n");
        stringBuilder.append("\t").append("<").append("age").append(">").append(student.age)
                .append("<").append("/").append("age").append(">").append("\n");
        stringBuilder.append("\t").append("<").append("group").append(">").append(student.group)
                .append("<").append("/").append("group").append(">").append("\n");
        stringBuilder.append("<").append("/").append("student").append(">");
        return stringBuilder.toString();
    }
}
