package com.luxoft.alfabank.side.project.client.server.dao;

import com.luxoft.alfabank.side.project.client.api.endpoint.dto.ClientDto;
import com.luxoft.alfabank.side.project.client.server.domain.ClientEntity;
import com.luxoft.alfabank.side.project.client.server.util.mapper.ClientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientDao {
    private ClientRepository clientRepository;

    @Autowired
    public void setClientRepository(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public ClientDto getClient(Long id) {
        ClientEntity byId = clientRepository.getById(id);

        return ClientMapper.entityToDto(byId);
    }

    public Long removeClient(Long id) {
        clientRepository.deleteById(id);
        return id;
    }

    public Long addClient(ClientEntity client) {
        ClientEntity save = clientRepository.save(client);
        return save.getId();
    }

    public boolean updateClient(Long id, String name) {
        boolean exist = clientRepository.existsById(id);
        if (exist) {
            ClientEntity entity = new ClientEntity();
            entity.setId(id);
            entity.setName(name);

            clientRepository.save(entity);
        }

        return exist;
    }

    public List<ClientDto> getAll() {
        return clientRepository.findAll().stream()
                    .map(ClientMapper::entityToDto)
                    .collect(Collectors.toList());
    }
}
