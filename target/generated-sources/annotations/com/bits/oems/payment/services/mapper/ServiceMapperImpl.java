package com.bits.oems.payment.services.mapper;

import com.bits.oems.commons.model.EventDTO;
import com.bits.oems.payment.model.Event;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-20T22:51:37+0530",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.11 (Amazon.com Inc.)"
)
@Component
public class ServiceMapperImpl implements ServiceMapper {

    @Override
    public EventDTO mapEventToEventDTO(Event event) {
        if ( event == null ) {
            return null;
        }

        EventDTO eventDTO = new EventDTO();

        eventDTO.setEventId( event.getEventId() );
        eventDTO.setName( event.getName() );
        eventDTO.setDescription( event.getDescription() );
        eventDTO.setStartDate( event.getStartDate() );
        eventDTO.setDurationInSeconds( event.getDurationInSeconds() );
        eventDTO.setLocation( event.getLocation() );
        Set<String> set = event.getParticipants();
        if ( set != null ) {
            eventDTO.setParticipants( new LinkedHashSet<String>( set ) );
        }

        return eventDTO;
    }

    @Override
    public List<EventDTO> mapEventsToEventDTOs(Iterable<Event> events) {
        if ( events == null ) {
            return null;
        }

        List<EventDTO> list = new ArrayList<EventDTO>();
        for ( Event event : events ) {
            list.add( mapEventToEventDTO( event ) );
        }

        return list;
    }
}
