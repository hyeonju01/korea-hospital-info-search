package controller;

import dao.HospitalDao;
import domain.Hospital;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hospitalapi/v1")
public class HospitalController {
    private final HospitalDao hospitaldao;

    public HospitalController(HospitalDao hospitaldao) {
        this.hospitaldao = hospitaldao;
    }

    @GetMapping(value = "/nation_wide_hospitals/{id}")
    public ResponseEntity<Hospital> get(@PathVariable String id) {
        return ResponseEntity
                .ok()
                .body(hospitaldao.findById(id));
    }

}
