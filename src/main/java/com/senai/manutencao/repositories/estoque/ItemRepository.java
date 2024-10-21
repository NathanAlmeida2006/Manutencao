package com.senai.manutencao.repositories.estoque;

import com.senai.manutencao.models.estoque.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
