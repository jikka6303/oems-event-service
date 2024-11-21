package com.bits.oems.payment.controllers;

import com.bits.oems.commons.model.EventDTO;
import com.bits.oems.payment.services.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/v1/api/events")
@Validated
@RequiredArgsConstructor
public class EventsController {


    private final EventService eventService;

    @GetMapping("/{eventId}")
    public EventDTO getEvent(@PathVariable("eventId") String eventId) {
        return eventService.getEvent(eventId);
    }

    @PutMapping
    public EventDTO updateEvent(@RequestBody EventDTO eventDTO) {
        return eventService.updateEvent(eventDTO);
    }

    @GetMapping
    List<EventDTO> getEvents(@RequestParam("eventIds") Set<String> eventIds) {
        return eventService.getEvents(eventIds);
    }


}
