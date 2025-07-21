CREATE TABLE pets
(
    id           SERIAL PRIMARY KEY,
    owner_id     INTEGER,
    in_zone      BOOLEAN,
    pet_type     VARCHAR(20),
    tracker_type VARCHAR(20),
    lost_tracker BOOLEAN
);
