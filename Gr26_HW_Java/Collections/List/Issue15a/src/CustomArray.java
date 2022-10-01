import java.util.Arrays;
import java.util.Iterator;

public class CustomArray implements Iterable<Account> {

    private Account[] accounts;

    public CustomArray(Account[] accounts) {
        this.accounts = accounts;
    }

    public Account[] add(Account account) {
        Account[] newAr = new Account[accounts.length + 1];
        for (int i = 0; i < accounts.length; i++) {
            newAr[i] = accounts[i];
            newAr[accounts.length] = account;
        }
        return newAr;
    }

    public Account[] remove(Account account) {
        Account[] newAr = new Account[accounts.length-1]; //
        for (int i = 0, j = 0; i < accounts.length; i++) {
            if (accounts[i] == account) {
                continue;
            }
            if (accounts[i] != (account)) {
                newAr[j++] = accounts[i];
            }
        }
        return newAr;
    }

    @Override
    public String toString() {
        return "CustomArray{" +
                "accounts=" + Arrays.toString(accounts) + '}';
    }

    @Override
    public Iterator<Account> iterator() {
        return new AccountIterator();
    }

    class AccountIterator implements Iterator<Account> {

        private int index=0;

        @Override
        public boolean hasNext() {
            return index < accounts.length;
        }

        @Override
        public Account next() {
            return accounts[index++];
        }
    }

}