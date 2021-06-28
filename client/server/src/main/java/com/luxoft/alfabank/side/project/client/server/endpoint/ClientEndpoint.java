package com.luxoft.alfabank.side.project.client.server.endpoint;

import com.luxoft.alfabank.side.project.client.api.endpoint.ClientApi;
import com.luxoft.alfabank.side.project.client.api.endpoint.dto.ClientDto;
import com.luxoft.alfabank.side.project.client.server.dao.ClientDao;
import com.luxoft.alfabank.side.project.client.server.domain.ClientEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientEndpoint implements ClientApi {
    private ClientDao clientDao;

    @Autowired
    public void setClientDao(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    @Override
    public ClientDto getClient(Long id) {
        return clientDao.getClient(id);
    }

    @Override
    public Long removeClient(Long id) {
        return clientDao.removeClient(id);
    }

    @Override
    public boolean updateClient(Long id, String name) {
        return clientDao.updateClient(id, name);
    }

    @Override
    public Long addClient(String name) {
        ClientEntity entity = new ClientEntity();

        entity.setName(name);

        return clientDao.addClient(entity);
    }

    @Override
    public List<ClientDto> getAll() {
        return clientDao.getAll();
    }
}
