package insper.store.account;

public class AccountParser {

    public static Account to(AccountIn in) {
        return Account.builder()
            .email(in.email())
            .name(in.name())
            .password(in.password())
            .build();
    }

    public static AccountOut to(Account account) {
        return AccountOut.builder()
            .id(account.id())
            .email(account.email())
            .name(account.name())
            .build();
    }
    
}
