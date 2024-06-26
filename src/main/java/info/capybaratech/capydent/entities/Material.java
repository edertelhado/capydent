package info.capybaratech.capydent.entities;

import com.github.f4b6a3.ulid.Ulid;
import com.github.f4b6a3.ulid.UlidCreator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Material {
    private Ulid id = UlidCreator.getUlid();
    private String description;
    private MaterialType materialType;
    private Double amount = 0d;
    private Double minimumQuantity = 0d;
    private Double cost = 0d;
    private boolean ignoreStock = false;
    private boolean enabled = true;
    private OffsetDateTime createdAt = OffsetDateTime.now();
    private OffsetDateTime updatedAt = OffsetDateTime.now();
}
