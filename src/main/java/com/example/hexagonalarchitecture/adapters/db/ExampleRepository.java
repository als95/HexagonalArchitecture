package com.example.hexagonalarchitecture.adapters.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExampleRepository extends JpaRepository<Example, String> {
}
