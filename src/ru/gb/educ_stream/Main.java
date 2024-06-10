package ru.gb.educ_stream;

import ru.gb.educ_stream.model.services.Service;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        service.addStudent("Alex", 20);
        service.addStudent("Masha", 19);
        service.addStudent("Alina", 22);
        service.addStudent("Maxim", 21);

        System.out.println(service.getStudentListInfo());
        service.sortByName();
        System.out.println(service.getStudentListInfo());
        service.sortByAge();
        System.out.println(service.getStudentListInfo());
    }
}