package app.controller;

import app.model.AppModel;
import app.view.AppView;

public class AppController {

    private final AppModel model = new AppModel();
    private final AppView view = new AppView();

    public void runApp(){
        for (int i = 0; i < 5; i++){
            view.getOutput(
                    model.getUpdates(getTemperature())
            );
        }
    }

    private int getTemperature(){
        return ((int) (Math.random() * 50)) - 25;
    }

}
