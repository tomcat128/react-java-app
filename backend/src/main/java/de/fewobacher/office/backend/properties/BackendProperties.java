package de.fewobacher.office.backend.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

/*
 * Kunde:   BMI Köln (bmik)
 * Projekt: Reaction
 * Autor:   tfehrenbacher
 * Datum:   21.12.22
 */

@Data
@ConfigurationProperties(prefix = "backend")
@Validated
public class BackendProperties
{
}
