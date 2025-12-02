package Microservicio.Ventas.repository;

import Microservicio.Ventas.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> { }
