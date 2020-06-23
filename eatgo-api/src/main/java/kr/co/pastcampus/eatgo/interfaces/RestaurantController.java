package kr.co.pastcampus.eatgo.interfaces;

import kr.co.pastcampus.eatgo.domain.Restaurant;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

public class RestaurantController {

    @GetMapping("/restaurants")
    public List<Restaurant> list(){
        List<Restaurant> restaurants = new ArrayList<>();
        return restaurants;
    }
}
