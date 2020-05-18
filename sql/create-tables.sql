create table "Tournament" (
    id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
    name       varchar(50),
    date       varchar(30),
    pointsWin  int,
    pointsDraw int,
    CONSTRAINT pk_TournamentId PRIMARY KEY (id)
);

create table "Phase" (
    id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
    "ORDER" int,
    CONSTRAINT pk_PhaseId PRIMARY KEY (id),
    CONSTRAINT fk_TournamentId FOREIGN KEY (id) REFERENCES "Tournament" (id)
);

create table "Match" (
     id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
     team1_id int,
     team2_id int,
     description varchar(150),
     CONSTRAINT pk_MatchId PRIMARY KEY (id)
);

create table "Team" (
    id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
    pointsOverall int,
    name varchar(50),
    CONSTRAINT pk_TeamId PRIMARY KEY (id)
);
