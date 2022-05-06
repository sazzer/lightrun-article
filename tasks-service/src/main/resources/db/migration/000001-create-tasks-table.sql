CREATE TABLE tasks (
    post_id VARCHAR(36) PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    created_at DATETIME NOT NULL,
    created_by VARCHAR(36) NOT NULL,
    assigned_to VARCHAR(36) NULL,
    status VARCHAR(20) NOT NULL
);
