package prom.it.service.impl;

import org.springframework.stereotype.Service;
import prom.it.repository.ImageRepository;
import prom.it.service.ImageService;

import java.io.IOException;

@Service
public class ImageServiceImpl implements ImageService {

    private final ImageRepository imageRepository;

    public ImageServiceImpl(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    @Override
    public byte[] getImageByName(String name) throws IOException {
        return imageRepository.getImageByName(name);
    }
}
