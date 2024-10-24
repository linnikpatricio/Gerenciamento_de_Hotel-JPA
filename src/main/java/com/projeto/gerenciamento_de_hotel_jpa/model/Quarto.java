package com.projeto.gerenciamento_de_hotel_jpa.model;

import com.projeto.gerenciamento_de_hotel_jpa.model.enums.StatusDoQuarto;
import com.projeto.gerenciamento_de_hotel_jpa.model.enums.TipoDeQuarto;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "tb_quartos")
public class Quarto implements Serializable {
    private static final long serialVerisonUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private StatusDoQuarto statusDoQuarto;
    private TipoDeQuarto tipoDeQuarto;
    private Double price;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


}
