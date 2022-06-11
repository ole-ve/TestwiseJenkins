package de.tum.in.ase;

import java.util.Date;
import java.util.List;

public class DummyClass implements SortStrategy {
    public void doNothing(int number) {
        if (number == 0){
            return;
        }
        int y = 18;
        return;
    }

    @Override
    public void performSort(List<Date> input) {

    }
}
