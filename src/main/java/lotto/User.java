package lotto;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class User {
    private int cash = 0;

    public User() {

    }

    public void buyLotto() {

        this.cash = Integer.valueOf(Console.readLine());
    }
}
