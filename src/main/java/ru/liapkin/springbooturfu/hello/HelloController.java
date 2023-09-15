package ru.liapkin.springbooturfu.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HelloController {
    private List<String> list = null;
    private Map<String, String> map = null;

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/update-array")
    public String updateArrayList(@RequestParam(value = "s", defaultValue = "") String s) {

        if (list == null) {
            list = new ArrayList<>();
        }

        list.add(s);

        return String.format("Добыавлено значение: %s", s);
    }

    @GetMapping("/show-array")
    public String showArrayList() {

        if (list == null) {
            return "ArrayList не создан.";
        }

        return list.toString();
    }

    @GetMapping("/update-map")
    public String updateHashMap(@RequestParam(value = "k", defaultValue = "") String k,
                                @RequestParam(value = "v", defaultValue = "") String v) {

        if (map == null) {
            map = new HashMap<>();
        }

        map.put(k, v);

        return String.format("Добыавлено значение: key - %s, value - %s", k, v);
    }

    @GetMapping("/show-map")
    public String showHashMap() {

        if (map == null) {
            return "HashMap не создан.";
        }

        return map.toString();
    }

    @GetMapping("/show-all-length")
    public String showAllLength() {

        int arrayLen = 0;
        if (list != null) {
            arrayLen = list.size();
        }

        int mapLen = 0;
        if (map != null) {
            mapLen = map.size();
        }

        return String.format("Array содержит %d записей, Map содержит %d записей.", arrayLen, mapLen);
    }

}

