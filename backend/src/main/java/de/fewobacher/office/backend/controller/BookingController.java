package de.fewobacher.office.backend.controller;

/*
 * Kunde:   BMI Köln (bmik)
 * Projekt: Reaction
 * Autor:   tfehrenbacher
 * Datum:   21.12.22
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class BookingController
{
  public BookingController()
  {
    System.out.println("1 + 2");
    int i = 234;
  }

  @CrossOrigin(origins = "http://localhost")
  @RequestMapping("/bookings/list")
  public ResponseEntity<List<Booking>> getBookings()
  {
    HttpHeaders httpHeaders = new HttpHeaders();
    httpHeaders.setContentType(MediaType.APPLICATION_JSON);

    ArrayList<Booking> bookings = new ArrayList<>();

    bookings.add(new Booking(UUID.randomUUID().toString()));
    bookings.add(new Booking(UUID.randomUUID().toString()));
    bookings.add(new Booking(UUID.randomUUID().toString()));
    bookings.add(new Booking(UUID.randomUUID().toString()));
    bookings.add(new Booking(UUID.randomUUID().toString()));

    return ResponseEntity.status(HttpStatus.OK).body(bookings);
  }

  @Data
  @AllArgsConstructor
  class Booking
  {
    String referenz;
  }
}
