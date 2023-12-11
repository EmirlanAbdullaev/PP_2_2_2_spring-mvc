package web.servise;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiseImpl implements CarServise {

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "bmw", 21));
        cars.add(new Car(2, "mers", 21));
        cars.add(new Car(3, "toyota", 3));
        cars.add(new Car(4, "lxs", 5));
        cars.add(new Car(5, "e3", 360));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).toList();
    }

}
