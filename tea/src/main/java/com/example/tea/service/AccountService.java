package com.example.tea.service;

import com.example.tea.model.Account;
import com.example.tea.repository.AccountRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private final AccountRepository accountRepository;
    private final PasswordEncoder passwordEncoder;

    public AccountService(AccountRepository accountRepository, PasswordEncoder passwordEncoder) {
        this.accountRepository = accountRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void saveAccount(Account account){
        String encryptedPassword = passwordEncoder.encode(account.getPassword());
        account.setPassword(encryptedPassword);
        accountRepository.save(account);
    }

    public Account loadAccountByEmail(String email){
        return accountRepository.findByEmail(email);
    }

    public boolean verifyPassword(String passwordReceived, String encryptedPassword) {
        return passwordEncoder.matches(passwordReceived, encryptedPassword);
    }
}
