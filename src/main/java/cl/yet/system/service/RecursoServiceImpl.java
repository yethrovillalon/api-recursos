package cl.yet.system.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

import cl.yet.system.dto.Movie;
import cl.yet.system.dto.Recurso;

@Service
public class RecursoServiceImpl implements IRecursoService {

	private static final String Uri = "https://api.themoviedb.org/3/movie/501/lists?api_key=56e939e241f41144583bdc39b99f1c32&page=1";
	
	@Override
	public List<Recurso> getRecursoAll(){
		
		List<Recurso> recursoLista = new ArrayList<Recurso>();
		
		try {
			RestTemplate clientM = new RestTemplate();
	        final HttpHeaders headers = new HttpHeaders();
	        
	        final HttpEntity<String> entity = new HttpEntity<String>(headers);
	        ResponseEntity<String> response = clientM.exchange(Uri, HttpMethod.GET, entity, String.class);
	        
	        String output = response.getBody();
	        
	        Gson gson=new Gson();
	        Movie movieHolders = gson.fromJson(output,Movie.class);
	        
	        for (int i = 0; i < movieHolders.getResults().size(); i++) {
				Recurso recurso = Recurso.builder().build();
	        	recurso.setId(movieHolders.getResults().get(i).getId());
	        	recurso.setNombre(movieHolders.getResults().get(i).getName());
	        	recurso.setTipo(movieHolders.getResults().get(i).getList_type());
	        	recurso.setDescripcion(movieHolders.getResults().get(i).getDescription());
	        	recursoLista.add(recurso);
			}
		} catch (Exception e) {
			System.out.println("Error Exception: "+ e.getMessage());
		}
		
        
        return recursoLista;
	}
}
