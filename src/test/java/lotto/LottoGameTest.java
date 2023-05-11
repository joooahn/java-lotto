package lotto;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LottoGameTest {
    @Test
    @DisplayName("전체 티켓 중 3개, 4개, 5개, 6개 일치한 티켓이 몇개인지")
    public void numberOfMatchingNumber() {
        List<Ticket> tickets = new ArrayList<>();
        tickets.add(Ticket.from(List.of(8, 21, 23, 41, 42, 43)));
        tickets.add(Ticket.from(List.of(3, 5, 11, 16, 32, 38)));
        tickets.add(Ticket.from(List.of(7, 11, 16, 35, 36, 44)));
        tickets.add(Ticket.from(List.of(1, 8, 11, 31, 41, 42)));
        tickets.add(Ticket.from(List.of(13, 14, 16, 38, 42, 45)));
        tickets.add(Ticket.from(List.of(7, 11, 30, 40, 42, 43)));
        tickets.add(Ticket.from(List.of(2, 13, 22, 32, 38, 45)));
        tickets.add(Ticket.from(List.of(23, 25, 33, 36, 39, 41)));
        tickets.add(Ticket.from(List.of(1, 3, 5, 14, 22, 45)));
        tickets.add(Ticket.from(List.of(5, 9, 38, 41, 43, 44)));
        tickets.add(Ticket.from(List.of(2, 8, 9, 18, 19, 21)));
        tickets.add(Ticket.from(List.of(13, 14, 18, 21, 23, 35)));
        tickets.add(Ticket.from(List.of(17, 21, 29, 37, 42, 45)));
        tickets.add(Ticket.from(List.of(3, 8, 27, 30, 35, 44)));
        LottoTickets lottoTickets = new LottoTickets(tickets);

        List<Integer> winningNumber = List.of(1, 2, 3, 4, 5, 6);

        LottoGame lottoGame = new LottoGame(lottoTickets, winningNumber);
        assertThat(lottoGame.getCountOfMatchingNumber(3)).isEqualTo(1);
        assertThat(lottoGame.getCountOfMatchingNumber(4)).isEqualTo(0);
        assertThat(lottoGame.getCountOfMatchingNumber(5)).isEqualTo(0);
        assertThat(lottoGame.getCountOfMatchingNumber(6)).isEqualTo(0);
    }
}
