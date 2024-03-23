package prom.it.service;

import org.springframework.stereotype.Service;

import java.io.IOException;

public interface ImageService {

    byte[] getImageByName(String name) throws IOException;

}
