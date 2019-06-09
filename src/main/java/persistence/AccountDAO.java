package persistence;

import domain.Account;

public interface AccountDAO {

    public Account selectAccountByUsernameAndPassword(Account account);

    public Account getAccountByUsername(String username);

    public void insertAccount(Account account);

    public void insertProfile(Account account);

    public void insertSignon(Account account);

    public void updateAccount(Account account);

    public void updateProfile(Account account);

    public void updateSignon(Account account);
}
