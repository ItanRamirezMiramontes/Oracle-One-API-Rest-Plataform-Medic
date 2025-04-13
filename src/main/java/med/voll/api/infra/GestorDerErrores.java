package med.voll.api.infra;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GestorDerErrores {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity getionarError404() {
        return ResponseEntity.notFound().build();
    }
}
