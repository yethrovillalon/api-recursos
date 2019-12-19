package cl.yet.system.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DetailMovie {
	
	private String description;
	private int favorite_count;
	private int id;
	private int item_count;
	private String iso_639_1;
	private String list_type;
	private String name;
	private String poster_path;

}
