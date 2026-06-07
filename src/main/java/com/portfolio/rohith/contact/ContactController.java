package com.portfolio.rohith.contact;

import java.util.Optional;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contact")
@CrossOrigin(origins = { "https://rnair.tech/", /*"http://localhost:8000"*/ })
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/")
    public Iterable<Contact> getContactService() {
        return this.contactService.getDetails();
    }

    @PutMapping("/update/{id}")
    public Optional<Contact> updateContactDetails(
            @RequestBody Contact contact,
            @PathVariable Integer id
    ) {
            Optional<Contact> updatedContact = this.contactService.updateDetails(id, contact);
            return updatedContact;
    }
}
