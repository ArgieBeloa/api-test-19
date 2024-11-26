package com.example.mary.qandaPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/qanda")
public class QandAModelController {

    @Autowired
    private QandAService qandAService;

    // Create or Update a QandAModel
    @PostMapping("/add")
    public ResponseEntity<QandAModel> createOrUpdateQandA(@RequestBody QandAModel model) {
        QandAModel savedModel = qandAService.createOrUpdateQandA(model);
        return ResponseEntity.ok(savedModel);
    }
    // Update QandAModel by subjectId
    @PutMapping("/update/{subjectId}")
    public ResponseEntity<QandAModel> updateQandABySubjectId(@PathVariable String subjectId, @RequestBody QandAModel model) {
        Optional<QandAModel> existingQandA = qandAService.getQandABySubjectId(subjectId);

        if (existingQandA.isPresent()) {
            QandAModel updatedQandA = existingQandA.get();

            // Add new questions to the existing list
            updatedQandA.getQuestions().addAll(model.getQuestions());

            // Save the updated QandAModel
            qandAService.createOrUpdateQandA(updatedQandA);

            return ResponseEntity.ok(updatedQandA);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build(); // Return 404 if not found
        }
    }

    // Get QandAModel by ID
    @GetMapping("/{id}")
    public ResponseEntity<QandAModel> getQandAById(@PathVariable String id) {
        Optional<QandAModel> model = qandAService.getQandAById(id);
        return model.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Get QandAModel by subjectId
    @GetMapping("/get/{subjectId}")
    public ResponseEntity<QandAModel> getQandABySubjectId(@PathVariable String subjectId) {
        Optional<QandAModel> model = qandAService.getQandABySubjectId(subjectId);
        return model.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Get all QandAModels
    @GetMapping("/all")
    public List<QandAModel> getAllQandAs() {
        return qandAService.getAllQandAs();
    }

    // Delete QandAModel by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteQandAById(@PathVariable String id) {
        qandAService.deleteQandAById(id);
        return ResponseEntity.noContent().build();
    }
}
