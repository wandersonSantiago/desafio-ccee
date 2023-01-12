package com.ccee.api.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ccee.api.dtos.AgenteDTO;
import com.ccee.domain.model.Agente;
import com.ccee.domain.service.AgenteService;

@RestController
@RequestMapping("/agentes")
public class AgenteResource {
	
	@Autowired
	private AgenteService service;
	@Autowired
	private ModelMapper mapper;
		
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public AgenteDTO agentesPost(@RequestBody AgenteDTO agenteDTO) {
                     
            final var agente = mapper.map(agenteDTO, Agente.class);
            
            service.save(agente);
            
            return agenteDTO;
   
    }
    
    @GetMapping("/regiao/{regiao}")
    public List<AgenteDTO> agentesPost(@PathVariable String regiao) {
    		return service.findByRegiao(regiao).stream().map(o -> mapper.map(o, AgenteDTO.class)).collect(Collectors.toList());   
    }

}
