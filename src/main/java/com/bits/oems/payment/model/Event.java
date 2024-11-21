package com.bits.oems.payment.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Data
@Document(collection = "events")
public class Event {

    @Id
    private String eventId;

    private String name;

    private String description;

    private String startDate;

    private Long durationInSeconds;

    private String location;

    private Set<String> participants;

}
