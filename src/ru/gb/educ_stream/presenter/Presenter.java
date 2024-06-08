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
}
