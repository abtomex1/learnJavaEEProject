package dom.dima.autopark.entities;

import lombok.Data;

import java.lang.annotation.Inherited;
import java.util.UUID;

@Data
public abstract class AbstractEntity {
    private String id = UUID.randomUUID().toString();
}
