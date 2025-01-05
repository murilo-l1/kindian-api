package com.server.kindian.domain.jpa;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Getter
@Entity
@Table(name = ProcessingHistoryJpa.TABLE_NAME)
@NoArgsConstructor
public class ProcessingHistoryJpa {

    protected static final String TABLE_NAME = "kd_processing_history";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "books_count")
    private Integer booksCount;

    @Column(name = "notes_count")
    private Integer notesCount;

    @Column(name = "processed_at")
    private Instant processedAt;


}