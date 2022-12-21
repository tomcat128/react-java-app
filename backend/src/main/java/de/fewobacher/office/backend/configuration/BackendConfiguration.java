package de.fewobacher.office.backend.configuration;/*
 * Kunde:   BMI Köln (bmik)
 * Projekt: Reaction
 * Autor:   tfehrenbacher
 * Datum:   21.12.22
 */

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import de.fewobacher.office.backend.properties.BackendProperties;

@Configuration
@EnableConfigurationProperties(BackendProperties.class)
public class BackendConfiguration
{

}
