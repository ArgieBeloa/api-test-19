package com.example.mary.qandaPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QandAService {

    @Autowired
    private QandARepository qandARepository ;

    // Get all qanda
    public List<QandAModel> getAllQandA() {
        return qandARepository.findAll();
    }

    // Create a new qanda
    public QandAModel createQandA(QandAModel QandA) {
        return qandARepository.save(QandA);
    }

    // Get QandA by subjectID
    public QandAModel getQandAByID(String id) {
        return qandARepository.findById(id).orElse(null);
    }

    // Update a q and a
    public QandAModel updateQandAByID(String id, QandAModel qandAModelDetails) {
        QandAModel qandAModel = qandARepository.findById(id).orElse(null);
        if (qandAModel != null) {
            qandAModel.setSubjectId(qandAModelDetails.getSubjectId());
            qandAModel.setQuestion(qandAModelDetails.getQuestion());
            qandAModel.setAnswer(qandAModelDetails.getAnswer());
            return qandARepository.save(qandAModel);
        }
        return null;
    }

    // Delete a customer
    public void deleteQandAById(String id) {
     qandARepository.deleteById(id);
    }

}
