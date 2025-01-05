CREATE TABLE kd_processing_history(
    id BIGSERIAL PRIMARY KEY,
    file_name TEXT,
    books_count INTEGER,
    notes_count INTEGER,
    processed_at TIMESTAMP
);

INSERT INTO kd_processing_history(id, file_name, books_count, notes_count, processed_at) VALUES
       (100, 'my_notes', 10, 150, NOW());