package com.portfolio.rohith.contact;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class ContactService {

    private final ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public Iterable<Contact> getDetails() {
        return this.contactRepository.findAll();
    }

    public Optional<Contact> updateDetails(Integer id, Contact contact) {
        Optional<Contact> optionalContactToUpdate = this.contactRepository.findById(id);

         if(optionalContactToUpdate.isPresent()) {
             Contact contactToUpdate = optionalContactToUpdate.get();

             contactToUpdate.setMobileNumber(contact.getEmailId());
             contactToUpdate.setMobileNumber(contact.getMobileNumber());

             this.contactRepository.save(contactToUpdate);

             return this.contactRepository.findById(id);
         } else {
             throw new ResponseStatusException(HttpStatus.NOT_FOUND, "The id seems to be incorrect");
         }
    }

}
