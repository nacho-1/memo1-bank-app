package com.aninfo.service;

import com.aninfo.model.Transaction;
import com.aninfo.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction createTransaction(Transaction transaction)
    {
        return transactionRepository.save(transaction);
    }

    public Collection<Transaction> getTransactionsByCbu(Long cbu)
    {
        List<Transaction> cbuTransactions = new LinkedList<Transaction>();
        List<Transaction> allTransactions = transactionRepository.findAll();

        for (Transaction t: allTransactions) {
            if (t.getCbu().equals(cbu))
                cbuTransactions.add(t);
        }
        return cbuTransactions;
    }

    public Optional<Transaction> findById(Long id)
    {
        return transactionRepository.findById(id);
    }

    public void deleteById(Long id)
    {
        transactionRepository.deleteById(id);
    }
}
