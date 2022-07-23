package br.com.maxley.catalogms.controller;

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
}
