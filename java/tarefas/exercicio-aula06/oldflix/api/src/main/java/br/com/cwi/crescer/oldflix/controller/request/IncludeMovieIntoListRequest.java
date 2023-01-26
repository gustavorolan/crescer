package br.com.cwi.crescer.oldflix.controller.request;

import br.com.cwi.crescer.oldflix.model.Category;
import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class IncludeMovieIntoListRequest  {
    @NotBlank
    private String title;
    @NotBlank
    private String description;
    @NotNull
    private Category category;
    @NotBlank
    private String imageUrl;
}
