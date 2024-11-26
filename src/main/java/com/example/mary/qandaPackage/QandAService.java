package com.example.mary.qandaPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QandAService {

    @Autowired
    private QandARepository qandARepository;

    // Create or Update a QandAModel
    public QandAModel createOrUpdateQandA(QandAModel model) {
        return qandARepository.save(model);
    }

    // Get QandAModel by ID
    public Optional<QandAModel> getQandAById(String id) {
        return qandARepository.findById(id);
    }

    // Get QandAModel by subjectId
    public Optional<QandAModel> getQandABySubjectId(String subjectId) {
        return qandARepository.findBySubjectId(subjectId);
    }

    // Get all QandAModels
    public List<QandAModel> getAllQandAs() {
        return qandARepository.findAll();
    }

    // Delete QandAModel by ID
    public void deleteQandAById(String id) {
        qandARepository.deleteById(id);
    }

}
