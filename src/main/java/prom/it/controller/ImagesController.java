package prom.it.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import prom.it.service.ImageService;
import org.springframework.http.ResponseEntity;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class ImagesController {

    private final ImageService imageService;

    public ImagesController(ImageService imageService) {
        this.imageService = imageService;
    }


    @GetMapping("/{imageName}")
    public ResponseEntity<byte[]> getImage(@PathVariable String imageName) throws IOException {
        byte[] image = imageService.getImageByName(imageName);
        return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(image);
    }

}
