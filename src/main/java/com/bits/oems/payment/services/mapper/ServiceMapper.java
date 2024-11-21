package com.bits.oems.payment.services.mapper;

import com.bits.oems.commons.model.EventDTO;
import com.bits.oems.payment.model.Event;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ServiceMapper {

    EventDTO mapEventToEventDTO(Event event);

    default Event setNonNullFields(Event event, EventDTO eventDTO) {
        if (eventDTO.getName() != null) {
            event.setName(eventDTO.getName());
        }
        if (eventDTO.getDescription() != null) {
            event.setDescription(eventDTO.getDescription());
        }
        if (eventDTO.getStartDate() != null) {
            event.setStartDate(eventDTO.getStartDate());
        }
        if (eventDTO.getParticipants() != null) {
            event.getParticipants().addAll(eventDTO.getParticipants());
        }
        if (eventDTO.getDurationInSeconds() != null) {
            event.setDurationInSeconds(eventDTO.getDurationInSeconds());
        }
        if (eventDTO.getLocation() != null) {
            event.setLocation(eventDTO.getLocation());
        }
        return event;
    }

    List<EventDTO> mapEventsToEventDTOs(Iterable<Event> events);
}

