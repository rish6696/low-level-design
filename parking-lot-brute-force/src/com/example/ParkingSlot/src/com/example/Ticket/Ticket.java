package com.example.Ticket;

import com.example.Gate.EntryGate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Ticket {

    private UUID ticketId;
    private EntryGate entryGate;
    private LocalDateTime entryTime;

    public Ticket(EntryGate entryGate, LocalDateTime entryTime) {
        this.ticketId = UUID.randomUUID();
        this.entryGate = entryGate;
        this.entryTime = entryTime;
    }

    public UUID getTicketId() {
        return ticketId;
    }

    public EntryGate getEntryGate() {
        return entryGate;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }
}

//  Ticket <--  vehicle <---- Slot 

