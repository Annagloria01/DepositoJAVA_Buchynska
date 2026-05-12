package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    public void sendConfirmation (String orderId){
        System.out.println("Conferma inviata per ordine: " + orderId);
    }
}
