package TarotBot.TarotCardService.service;

import TarotBot.TarotCardService.model.Card;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public interface CardService {
    Card getRandomCard();
    String getAdvice(String cardName);
    Long calculateArcana(LocalDate birthDate);
}
