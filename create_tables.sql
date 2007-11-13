-- Create tables for use by Hibernate

-- Game
CREATE TABLE ch_game (
	id INT NOT NULL DEFAULT 0 PRIMARY KEY,
	checkmate TINYINT(1) NOT NULL DEFAULT 1,
    startDate BIGINT(20),
    endDate BIGINT(20), 
    tagline VARCHAR(255),
    winner INT,
    toMove INT,
    black INT NOT NULL FOREIGN KEY,
    white INT NOT NULL FOREIGN KEY,
    firstMove INT FOREIGN KEY,
    lastMove INT FOREIGN KEY
);

-- Move
CREATE TABLE ch_move (
	id INT NOT NULL DEFAULT 0,
	startX INT,
    startY INT,
    endX INT,
    endY,
    date BIGINT(20) NOT NULL DEFAULT 0,
    comment TEXT,
    color INT,
    game INT NOT NULL FOREIGN KEY,
    previous INT FOREIGN KEY,
    next INT FOREIGN KEY
);

-- Player
CREATE TABLE ch_player (
	id INT NOT NULL DEFAULT 0,
    username VARCHAR(32);
    email VARCHAR(255);
    fullName VARCHAR(255);
    password VARCHAR(32);
    enabled TINYINT(1) NOT NULL DEFAULT 1;
    dateCreated BIGINT(20) NOT NULL DEFAULT 0
);

-- Unit
CREATE TABLE ch_unit (
	id INT NOT NULL DEFAULT 0,
    inPlay TINYINT(1) NOT NULL DEFAULT 1;
    promoted TINYINT(1) NOT NULL DEFAULT 0;
    x INT;
    y INT;
    color TINYINT(4) NOT NULL;
    game INT NOT NULL FOREIGN KEY;
    type TINYINT(4) NOT NULL;
);