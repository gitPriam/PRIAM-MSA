package org.priam.priamprocessingservice.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@lombok.Data
public class Data {
    private int id;
    private String attribute;
    private boolean isPersonal;
    private String Category;
    private String source;
    private int data_type_id;
    private String data_type_name;
    private String primary_key_name;
}