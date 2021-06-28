package com.luxoft.alfabank.side.project.client.server.util.mapper;

import com.luxoft.alfabank.side.project.client.api.endpoint.dto.ClientDto;
import com.luxoft.alfabank.side.project.client.server.domain.ClientEntity;

public class ClientMapper {
    public static ClientDto entityToDto(ClientEntity source) {
        ClientDto clientDto = new ClientDto();

        clientDto.setId(source.getId());
        clientDto.setName(source.getName());
        clientDto.setPassword(source.getPassword());

        return clientDto;
    }

    public static ClientEntity dtoToEntity(ClientDto source) {
        ClientEntity entity = new ClientEntity();

        entity.setId(source.getId());
        entity.setName(source.getName());
        entity.setPassword(source.getPassword());

        return entity;
    }
}
