package com.luxoft.alfabank.side.project.client.api.endpoint;

import com.luxoft.alfabank.side.project.client.api.endpoint.dto.ClientDto;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@RequestMapping("/client")
public interface ClientApi {
    @GetMapping("{id}")
    ClientDto getClient(@PathVariable Long id);

    @DeleteMapping("{id}")
    Long removeClient(@PathVariable Long id);

    @PostMapping("{id}")
    boolean updateClient(@PathVariable Long id, @RequestParam String name);

    @PostMapping
    Long addClient(@RequestParam String name);

    @GetMapping("/get")
    List<ClientDto> getAll();
}
