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
public class ItemCardResponse {
    private String title;
    private String attractions;
    private Date date;
    private String location;
    private String genre;
    private String image;

    public static ItemCardResponse fromEntity(Item item) {
        return new ItemCardResponse(
                item.getTitle(),
                item.getAttraction(),
                item.getDate(),
                item.getLocation(),
                item.getGenre(),
                item.getGenre()
        );
    }
}
