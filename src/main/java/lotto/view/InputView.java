package lotto.view;

import lotto.domain.BonusBall;;
import lotto.domain.Ticket;
import lotto.domain.WinningNumber;
import lotto.exception.TicketNumberOutOfBoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static Scanner scanner = new Scanner(System.in);

    public static int inputMoney() {
        System.out.println("구입금액을 입력해 주세요.");
        int money = Integer.parseInt(scanner.nextLine());
        return money;
    }

    public static WinningNumber inputWinningNumber() throws TicketNumberOutOfBoundException {
        System.out.println("지난주 당첨 번호를 입력해 주세요.");
        Ticket winningNumber = Ticket.fromString(scanner.nextLine());

        System.out.println("보너스 볼을 입력해 주세요.");
        return WinningNumber.of(winningNumber, BonusBall.from(scanner.nextLine()));
    }

    public static List<Ticket> inputManualTickets() {
        List<Ticket> manualTickets = new ArrayList<>();

        System.out.println("수동으로 구매할 로또 수를 입력해 주세요.");
        int numberOfManualTickets = Integer.parseInt(scanner.nextLine());

        System.out.println("수동으로 구매할 번호를 입력해 주세요.");
        for (int i = 0; i < numberOfManualTickets; i++) {
            manualTickets.add(Ticket.fromString(scanner.nextLine()));
        }

        return manualTickets;
    }
}
