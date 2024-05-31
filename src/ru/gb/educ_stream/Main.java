package ru.gb.educ_stream;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        service.addStudent("Alex", 20);
        service.addStudent("Masha", 19);
        service.addStudent("Alina", 22);
        service.addStudent("Maxim", 21);

        System.out.println(service.getStudentListInfo());
    }
}
