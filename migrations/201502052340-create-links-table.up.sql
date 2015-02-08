CREATE TABLE links (
  id          serial PRIMARY KEY,
  hash        varchar(255) UNIQUE NOT NULL,
  url         varchar(255) NOT NULL,
  created_at  timestamp DEFAULT current_timestamp,
  updated_at  timestamp DEFAULT current_timestamp 
);
