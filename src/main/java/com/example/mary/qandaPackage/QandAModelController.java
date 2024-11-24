package com.example.mary.qandaPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/qanda")
public class QandAModelController {

    @Autowired
    private QandAService qandAService;

    // Get all customers
    @GetMapping
    public List<QandAModel> getAllQandA() {
        return qandAService.getAllQandA();
    }

    // Create a new customer
    @PostMapping
    public QandAModel createQandA(@RequestBody QandAModel qandAModel) {
        return qandAService.createQandA(qandAModel);
    }

    // Get a customer by ID
    @GetMapping("/{id}")
    public QandAModel getCustomerById(@PathVariable String id) {
        return qandAService.getQandAByID(id);
    }

    // Update a customer
    @PutMapping("/{id}")
    public QandAModel updateQandAById(@PathVariable String id, @RequestBody QandAModel qandaDetails) {
        return qandAService.updateQandAByID(id, qandaDetails);
    }

    // Delete a customer
    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable String id) {
        qandAService.deleteQandAById(id);
    }
}
