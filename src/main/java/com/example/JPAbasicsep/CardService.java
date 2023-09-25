package com.example.JPAbasicsep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {
    @Autowired LibraryCardRepository libraryCardRepository;
    public void addCard(LibraryCard card)
    {
        libraryCardRepository.save(card);

    }

}
