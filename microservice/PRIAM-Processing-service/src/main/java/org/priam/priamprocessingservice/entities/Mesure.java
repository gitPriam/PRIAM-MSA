package org.priam.priamprocessingservice.entities;

import org.priam.priamprocessingservice.enums.CategoryMesure;
import org.priam.priamprocessingservice.enums.TypeMesure;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "gdpr_mesure")
public class Mesure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mesureID;
    private String description;
    private TypeMesure type;
    private CategoryMesure category;
}
