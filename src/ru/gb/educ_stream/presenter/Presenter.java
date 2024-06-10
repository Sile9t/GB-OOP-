package ru.gb.educ_stream.presenter;

import ru.gb.educ_stream.model.services.Service;
import ru.gb.educ_stream.view.View;

public class Presenter {
    private View view;
    private Service service;
    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }
    public void addStudent(String name, int age) {
        service.addStudent(name, age);
        getStudentsListInfo();
    }
    public void getStudentsListInfo() {
        String answer = service.getStudentListInfo();
        view.printAnswer(answer);
    }
    public void sortByName() {
        service.sortByName();
        getStudentsListInfo();
    }
}
