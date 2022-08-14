package br.com.maxley.catalogms.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Item {
    @Id
    @GenericGenerator(
            name = "item_id_seq",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "item_id_seq"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "item_id_seq")
    private Long id;

    @NotBlank
    private String title;

    @NotBlank
    private String attraction;

    @NotNull
    private Timestamp date;

    @NotBlank
    private String location;

    private String genre;

    private String image;

    private String description;

    public static Item fromNewItemRequest(NewItemRequest newItemRequest) {
        Item item = new Item();

        item.title = newItemRequest.getTitle();
        item.attraction = newItemRequest.getAttractions();
        item.date = newItemRequest.getDate();
        item.location = newItemRequest.getLocation();
        item.genre = newItemRequest.getGenre();
        item.image = newItemRequest.getImage();
        item.description = newItemRequest.getDescription();

        return item;
    }
}
