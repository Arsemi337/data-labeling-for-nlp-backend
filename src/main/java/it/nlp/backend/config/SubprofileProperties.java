package it.nlp.backend.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("subprofile")
@Getter
@Setter
public class SubprofileProperties {
    private Boolean securityTurnedOn;
}
