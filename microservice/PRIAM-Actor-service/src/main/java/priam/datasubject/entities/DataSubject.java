package priam.datasubject.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@lombok.Data
@Table(name = "data_subject")
public class DataSubject {

    @Id
    private int id;
    private String idRef;
    private String username;
    private String password;
    private int age;

    @JsonBackReference
    @ManyToOne
    private DSCategory dsCategory;
}
