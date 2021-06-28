package com.luxoft.alfabank.side.project.client.server.dao;

import com.luxoft.alfabank.side.project.client.server.domain.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, Long> {
}
