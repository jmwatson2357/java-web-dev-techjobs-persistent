## Part 1: Test it with SQL
    DESCRIBE job;
## Part 2: Test it with SQL
    SELECT name FROM employers WHERE location="St. Louis City";
## Part 3: Test it with SQL
    DROP TABLE techjobs.job;
## Part 4: Test it with SQL
    SELECT skill.name, skill.description
    FROM skill
    LEFT JOIN job_skills on skill.id = job_skills.skills_id
    WHERE job_skills.skills_id IS NOT NULL;