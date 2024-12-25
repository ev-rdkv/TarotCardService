package TarotBot.TarotCardService.rest.internal;

import TarotBot.TarotCardService.model.Card;
import TarotBot.TarotCardService.service.ArcanaCalcService;
import TarotBot.TarotCardService.service.CardService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@NoArgsConstructor(force = true)
@RequestMapping("/tarot")
public class CardController {
    private final CardService cardService;
    private final ArcanaCalcService arcanaCalcService;

    @GetMapping("/card")
    public ResponseEntity<Card> getRandomCard() {
        Card myCard = cardService.getRandomCard();
        return new ResponseEntity<>(myCard, HttpStatus.OK);
    }
}
