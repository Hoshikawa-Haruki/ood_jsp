/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package deu.se.ood.Repository;

import deu.se.ood.Model.Addrbook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Haruki
 */
@Repository
public interface AddrbookRepository extends JpaRepository<Addrbook, String> {
    // 기본 CRUD 메서드는 자동으로 제공됨 (save, findAll 등)
}
