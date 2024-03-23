package prom.it.repository;

import org.springframework.core.io.Resource;
import org.springframework.stereotype.Repository;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.nio.file.Files;

@Repository
public class ImageRepository {

    public byte[] getImageByName(String name) throws IOException {
        Resource resource = new ClassPathResource("images/" + name);
        return Files.readAllBytes(resource.getFile().toPath());
    }
}
