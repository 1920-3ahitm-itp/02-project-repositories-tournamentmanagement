create table "Tournament" (
    id         int NOT NULL,
    name       varchar(50),
    date       varchar(30),
    pointsWin  int,
    pointsDraw int,
    CONSTRAINT pk_TournamentId PRIMARY KEY (id)
);

create table "Phase" (
    id int NOT NULL,
    "ORDER" int,
    CONSTRAINT pk_PhaseId PRIMARY KEY (id),
    CONSTRAINT fk_TournamentId FOREIGN KEY (id) REFERENCES "Tournament" (id)
);

create table "Match" (
     id int NOT NULL,
     team1 varchar(50),
     team2 varchar(50),
     description varchar(150),
     CONSTRAINT pk_MatchId PRIMARY KEY (id)
);

create table "Team" (
    id int NOT NULL,
    pointsOverall int,
    name varchar(50),
    CONSTRAINT pk_TeamId PRIMARY KEY (id)
);
