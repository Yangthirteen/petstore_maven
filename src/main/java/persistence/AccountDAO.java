package persistence;

import domain.Account;

public interface AccountDAO {

    public Account selectAccountByUsernameAndPassword(Account account);
}
