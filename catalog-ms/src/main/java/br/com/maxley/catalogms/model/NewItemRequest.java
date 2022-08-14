package br.com.maxley.catalogms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NewItemRequest {
    private String title;
    private String attractions;
    private Timestamp date;
    private String location;
    private String genre;
    private String image;
    private String description;

}
