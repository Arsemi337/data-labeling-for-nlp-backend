package it.nlp.backend.emotionAnalysis.dto;

import lombok.Builder;

@Builder
public record ModelOutput(
        String modelName,
        String path
) {
}
