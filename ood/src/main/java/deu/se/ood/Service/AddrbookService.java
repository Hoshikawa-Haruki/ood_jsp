/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.se.ood.Service;

import deu.se.ood.Model.Addrbook;
import deu.se.ood.Repository.AddrbookRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Haruki
 */
@Service
public class AddrbookService {
    
    @Autowired
    private AddrbookRepository addrbookRepo;

    public void addEntry(String name, String email, String phone) {
        Addrbook entry = new Addrbook();
        entry.setEmail(email);
        entry.setName(name);
        entry.setPhone(phone);
        addrbookRepo.save(entry);
    }

    public List<Addrbook> getAll() {
        return addrbookRepo.findAll();
    }
}

