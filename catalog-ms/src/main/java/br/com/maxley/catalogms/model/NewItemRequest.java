package br.com.maxley.catalogms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NewItemRequest {
    private String title;
    private String attractions;
    private Date date;
    private String location;
    private String genre;
    private String image;

    private String description;

    public Item toEntity() {
        return new Item(
                this.title,
                this.attractions,
                this.date,
                this.location,
                this.genre,
                this.image,
                this.description
        );
    }
}
