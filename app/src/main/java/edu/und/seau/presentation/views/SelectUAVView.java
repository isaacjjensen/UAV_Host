package edu.und.seau.presentation.views;

import java.util.ArrayList;

public interface SelectUAVView extends ControllerView {

    void onUAVSelected();
    void setListViewItems(ArrayList<String> items);
}
