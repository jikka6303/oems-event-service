package com.bits.oems.payment.services;

import com.bits.oems.commons.model.EventDTO;
import com.bits.oems.payment.model.Event;
import com.bits.oems.payment.repository.EventRepository;
import com.bits.oems.payment.services.mapper.ServiceMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class EventService {

    private final ServiceMapper serviceMapper;
    private final EventRepository eventRepository;

    public EventDTO getEvent(String eventId) {

        Event event = eventRepository.findById(eventId)
                .orElseThrow(() -> new RuntimeException("Event not found"));

        return serviceMapper.mapEventToEventDTO(event);
    }

    public EventDTO updateEvent(EventDTO eventDTO) {

        Event event = eventRepository.findById(eventDTO.getEventId())
                .orElseThrow(() -> new RuntimeException("Event not found"));

        Event toSave = serviceMapper.setNonNullFields(event, eventDTO);
        Event saved = eventRepository.save(toSave);

        return serviceMapper.mapEventToEventDTO(saved);
    }

    public List<EventDTO> getEvents(Set<String> eventIds) {

        var events = eventRepository.findAllById(eventIds);

        return serviceMapper.mapEventsToEventDTOs(events);
    }
}
