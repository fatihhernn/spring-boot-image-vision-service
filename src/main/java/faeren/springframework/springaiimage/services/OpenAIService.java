package faeren.springframework.springaiimage.services;


import faeren.springframework.springaiimage.model.Question;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


public interface OpenAIService {

    byte[] getImage(Question question);

    String getDescription(MultipartFile file) throws IOException;
}
