package TarotBot.TarotCardService.service;

import TarotBot.TarotCardService.model.Card;
import TarotBot.TarotCardService.repository.CardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {
    private final CardRepository cardRepository;

    @Override
    public Card getRandomCard() {
        List<Card> cards = cardRepository.findAll();
        return cards.get(new Random().nextInt(cards.size()));
    }

    @Override
    public String getAdvice(String cardName) {
        return null;
    }

    @Override
    public Long calculateArcana(LocalDate birthDate) {
        return null;
    }
}
