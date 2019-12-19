package cl.yet.system.dto;

import java.util.ArrayList;

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
public class Movie {
	
	private int id;
	private int page;
	private ArrayList<DetailMovie> results;
	private int total_pages;
	private int total_results;

}
